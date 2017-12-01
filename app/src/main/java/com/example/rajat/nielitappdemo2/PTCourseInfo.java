package com.example.rajat.nielitappdemo2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Rajat on 8/23/2016.
 */
public class PTCourseInfo extends Fragment {

    Button register;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    TextView tvname,tvdur,tvfee,tvele,tvmod;
    CourseListDemo courseListDemo;
    int p;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.course_info, null);
        register=(Button)view.findViewById(R.id.register);
        tvname=(TextView)view.findViewById(R.id.tvname);
        tvfee=(TextView)view.findViewById(R.id.tvfee);
        tvdur=(TextView)view.findViewById(R.id.tvdur);
        tvele=(TextView)view.findViewById(R.id.tvele);
        tvmod=(TextView)view.findViewById(R.id.tvmod);
        return view;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /*p=getArguments().getInt("position");
        CourseDetail courseDetail = ShortTerm.courseDetailList.get(p);
        tv.setText(courseDetail.getTitle());
        */
        courseListDemo=ProjectTraining.courseListDemo;
        tvname.setText(courseListDemo.getName());
        tvfee.setText(courseListDemo.getFees());
        tvdur.setText(courseListDemo.getDuration());
        tvele.setText(courseListDemo.getEligibility());
        tvmod.setText(courseListDemo.getModule());
        mFragmentManager = getActivity().getSupportFragmentManager();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerView,new PTRegister()).commit();
            }
        });
    }
}
