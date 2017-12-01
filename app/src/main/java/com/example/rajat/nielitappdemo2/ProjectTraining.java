package com.example.rajat.nielitappdemo2;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajat on 8/21/2016.
 */
public class ProjectTraining extends Fragment {

    List<CourseListDemo>courseListDemoList=new ArrayList<>();
    private RecyclerView recyclerView;
    private CourseAdapterDemo courseAdapterDemo;
    static CourseListDemo courseListDemo;
    HttpURLConnection connection;
    InputStream inputStream=null;
    public static DataBase dataBase;
    //String BASE_URL="http://datafornielitapp.16mb.com/important%20files/JSONDiploma.php",jsonStr=null;
    String BASE_URL="http://datafornielitapp.16mb.com/importantfiles/JSONprojectTraining.php",jsonStr=null;


    FragmentManager mFragmentManager;
    //FragmentTransaction mFragmentTransaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.project_training, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        return view;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mFragmentManager = getActivity().getSupportFragmentManager();
        dataBase=new DataBase(getActivity());

        //courseAdapterDemo = new CourseAdapterDemo(courseListDemoList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //recyclerView.setAdapter(courseAdapterDemo);

        recyclerView.addOnItemTouchListener(new Courses.RecyclerTouchListener(getActivity(), recyclerView, new Courses.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerView,new PTCourseInfo()).commit();
                CoursesActivity.p=9;

                courseListDemo=courseListDemoList.get(position);
                //Toast.makeText(getActivity(), courseListDemo.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareCourseData();

    }

    private void prepareCourseData() {


        class GetJson extends AsyncTask<String,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(getActivity(), "Please Wait...",null,true,false);
            }


            @Override
            protected String doInBackground(String... params) {

                String uri = params[0];
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                try {
                    connection = (HttpURLConnection) (new URL(uri)).openConnection();
                    connection.setRequestMethod("GET");
                    connection.setDoOutput(true);
                    connection.setDoInput(true);
                    connection.connect();

                    StringBuilder stringBuilder = new StringBuilder();
                    inputStream = connection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    String line = null;
                    while((line=bufferedReader.readLine())!=null){
                        stringBuilder.append(line);
                    }
                    inputStream.close();
                    connection.disconnect();
                    jsonStr= stringBuilder.toString();

                } catch (IOException e) {

                    e.printStackTrace();
                }

                if (jsonStr!=null){
                    try {
                        JSONArray wholeInfo = new JSONArray(jsonStr);

                        //coursename = new String[wholeInfo.length()];
                        dataBase.PTClearData();
                        for (int i=0; i< wholeInfo.length(); i++){
                            JSONObject object = wholeInfo.getJSONObject(i);
                            CourseListDemo courseListDemo=new CourseListDemo();
                            courseListDemo.setName(object.getString("cname"));
                            courseListDemo.setDuration(object.getString("cduration"));
                            courseListDemo.setFees(object.getString("cfees"));
                            courseListDemo.setEligibility(object.getString("celigibilty"));
                            courseListDemo.setModule(object.getString("cmodule"));
                            //courseListDemoList.add(courseListDemo);
                            dataBase.PaddCouse(courseListDemo);

                            //coursename[i] = object.getString("cname");

                        }

                    } catch (JSONException e)
                    {
                        e.printStackTrace();
                    }
                }

                return null;

            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                try{
                    courseListDemoList=dataBase.getAllPCourses();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                if(courseListDemoList!=null) {
                    courseAdapterDemo = new CourseAdapterDemo(courseListDemoList);
                    recyclerView.setAdapter(courseAdapterDemo);

                }else {
                    AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
                    builder.setTitle("Alert Dialog");

                    // Setting Dialog Message
                    builder.setMessage("Internet connection not available");

                    // Setting Icon to Dialog
                    //alertDialog.setIcon(R.drawable.tick);

                    builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent(getActivity(),MainActivity.class);
                            startActivity(i);
                        }
                    });

                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();


                }



            }


        }



        GetJson gj = new GetJson();
        gj.execute(BASE_URL);



    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private ShortTerm.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final ShortTerm.ClickListener clickListener) {
            this.clickListener = clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && clickListener != null) {
                        clickListener.onLongClick(child, recyclerView.getChildPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                clickListener.onClick(child, rv.getChildPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }

}
