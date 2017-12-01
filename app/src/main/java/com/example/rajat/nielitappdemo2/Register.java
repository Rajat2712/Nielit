package com.example.rajat.nielitappdemo2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;


public class Register extends Fragment {
    Button Cregister;
    TextView cname;
    EditText fname,lname,email,phone;
    String Fname,Lname,Email,Phone,Cname,Centre;
    String[] centre={"NORTH ZONE","NORTH-EAST ZONE","EAST ZONE","SOUTH ZONE","WEST ZONE"};
    String[] centre1={"CHANDIGARH","DELHI", "GORAKHPUR", "JAMMU CENTRE", "LEH CENTRE", "LUCKNOW BRANCH", "PATNA", "ROPAR", "SHIMLA", "SRINAGAR"};
    String[] centre2={"AGARTALA","AIZAWL","CHUCHUYIMLANG EXTENSION CENTRE", "CHURACHANDPUR EXTENSION CENTRE", "GANGTOK", "GUWAHATI", "IMPHAL", "ITANAGAR", "JORHAT EXTENSION CENTRE", "KOHIMA", "KOKRAJHAR EXTENSION CENTRE", "LUNGLELI EXTENSION CENTRE", "PASIGHAT EXTENSION CENTRE","SENAPATI EXTENSION CENTRE", "SHILLONG", "SILCHAR EXTENSION CENTRE", "TEZPUR CENTER", "TURA EXTENSION CENTRE"};
    String[] centre3={"KOLKATA","RANCHI"};
    String[] centre4={"CALICUT", "CHENNAI", "SRIKAKULAM"};
    String[] centre5={"AJMER", "AURANGABAD"};
    Spinner spinner,spinner1;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    private static final String REGISTER_URL = "http://datafornielitapp.16mb.com/register.php";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.register, null);
        Cregister=(Button)view.findViewById(R.id.Cregister);
        cname=(TextView)view.findViewById(R.id.course_name);
        fname=(EditText)view.findViewById(R.id.input_fname);
        lname=(EditText)view.findViewById(R.id.input_lname);
        phone=(EditText)view.findViewById(R.id.input_phone);
        email=(EditText)view.findViewById(R.id.input_email);
        spinner=(Spinner)view.findViewById(R.id.spin);
        spinner1=(Spinner)view.findViewById(R.id.spin2);
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
        cname.setText(ShortTerm.courseListDemo.getName());
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,centre);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner.setSelection(position);
                switch (position) {
                    case 0:
                        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, centre1);
                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner1.setAdapter(adapter1);
                        break;
                    case 1:
                        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, centre2);
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner1.setAdapter(adapter2);
                        break;
                    case 2:
                        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, centre3);
                        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner1.setAdapter(adapter3);
                        break;
                    case 3:
                        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, centre4);
                        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner1.setAdapter(adapter4);
                        break;
                    case 4:
                        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, centre5);
                        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner1.setAdapter(adapter5);
                        break;
                }


                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        spinner1.setSelection(position);
                        Centre = spinner1.getSelectedItem().toString();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Cregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                boolean r1, r2, r3, r4;
                Cname = cname.getText().toString().trim().toLowerCase();
                Fname = fname.getText().toString().trim().toLowerCase();
                Lname = lname.getText().toString().trim().toLowerCase();
                Phone = phone.getText().toString().trim().toLowerCase();
                Email = email.getText().toString().trim().toLowerCase();

                if ((Fname.length() == 0) || (!Fname.matches("[A-Za-z ]+"))) {
                    // etname.requestFocus();
                    fname.setError("Invalid First Name");
                    r1 = false;
                } else {
                    r1 = true;
                }


                if ((Lname.length() == 0) || (!Lname.matches("[A-Za-z ]+"))) {
                    // etname.requestFocus();
                    lname.setError("Invalid Last Name");
                    r2 = false;
                } else {
                    r2 = true;
                }


                if (Phone.length() == 0 || Phone.length() != 10) {
                    phone.setError("Invalid no");
                    r3 = false;
                } else {
                    r3 = true;
                }

                if (!isValidEmail(Email)) {
                    email.setError("Invalid Email");
                    r4 = false;
                }
                else {
                    r4=true;
                }


                if(r1==true&&r2==true&&r3==true&&r4==true){
                    new SendRequest().execute();

                }

                /*if (Cname != " " && Fname != " " && Lname != "" && Phone != ""&&Email!="") {
                    new SendRequest().execute();
                } else Toast.makeText(getActivity(),"Field cannot remain empty",Toast.LENGTH_LONG).show();*/
            }
        });
    }

    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }




    public class SendRequest extends AsyncTask<String, Void, String> {


        ProgressDialog loading;
        int flag=0;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            loading = ProgressDialog.show(getActivity(), "Please Wait...",null,true,false);
        }


        protected String doInBackground(String... arg0) {

            try{

                URL url = new URL("http://datafornielitapp.16mb.com/register.php");

                JSONObject postDataParams = new JSONObject();


                postDataParams.put("cname", Cname);
                postDataParams.put("fname", Fname);
                postDataParams.put("lname", Lname);
                postDataParams.put("email", Email);
                postDataParams.put("phone", Phone);
                postDataParams.put("center",Centre);
                postDataParams.put("type", "short");

                Log.e("params", postDataParams.toString());

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setReadTimeout(15000  /*milliseconds*/ );
                conn.setConnectTimeout(15000  /*milliseconds*/);
                conn.setRequestMethod("POST");
                conn.setDoInput(true);
                conn.setDoOutput(true);

                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(getPostDataString(postDataParams));

                writer.flush();
                writer.close();
                os.close();

                int responseCode=conn.getResponseCode();

                if (responseCode == HttpsURLConnection.HTTP_OK) {

                    BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    StringBuffer sb = new StringBuffer("");
                    String line="";

                    while((line = in.readLine()) != null) {

                        sb.append(line);
                        break;
                    }

                    in.close();
                    flag=1;
                    return sb.toString();

                }
                else {
                    return new String("false : "+responseCode);
                }
            }
            catch(Exception e){
                return new String("Exception: " + "Please check your internet connection and try again");
            }
        }

        @Override
        protected void onPostExecute(String result) {
            loading.dismiss();
            if(flag==1){
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);

            }

            Toast.makeText(getActivity(), result,
                    Toast.LENGTH_LONG).show();

        }
    }

    public String getPostDataString(JSONObject params) throws Exception {

        StringBuilder result = new StringBuilder();
        boolean first = true;

        Iterator<String> itr = params.keys();

        while(itr.hasNext()){

            String key= itr.next();
            Object value = params.get(key);

            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(key, "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(value.toString(), "UTF-8"));

        }
        return result.toString();
    }






}
