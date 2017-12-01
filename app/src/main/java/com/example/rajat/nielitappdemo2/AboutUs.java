package com.example.rajat.nielitappdemo2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rajat on 10/2/2016.
 */
public class AboutUs extends Fragment {
    TextView tv1,tvh1,tv2,tvh2,tv3,tvh3,tv4,tvh4,tv5,tvh5,tv6,tvh6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us, null);
        tv1=(TextView)view.findViewById(R.id.tv1);
        tvh1=(TextView)view.findViewById(R.id.tvh1);
        tv2=(TextView)view.findViewById(R.id.tv2);
        tvh2=(TextView)view.findViewById(R.id.tvh2);
        tv3=(TextView)view.findViewById(R.id.tv3);
        tvh3=(TextView)view.findViewById(R.id.tvh3);
        tv4=(TextView)view.findViewById(R.id.tv4);
        tvh4=(TextView)view.findViewById(R.id.tvh4);
        tv5=(TextView)view.findViewById(R.id.tv5);
        tvh5=(TextView)view.findViewById(R.id.tvh5);
        tv6=(TextView)view.findViewById(R.id.tv6);
        tvh6=(TextView)view.findViewById(R.id.tvh6);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv1.setVisibility(View.GONE);
        tv2.setVisibility(View.GONE);
        tv3.setVisibility(View.GONE);
        tv4.setVisibility(View.GONE);
        tv5.setVisibility(View.GONE);
        tv6.setVisibility(View.GONE);
        tvh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setVisibility(tv1.isShown()
                        ? View.GONE
                        : View.VISIBLE);
            }
        });

        tvh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setVisibility( tv2.isShown()
                        ? View.GONE
                        : View.VISIBLE );
            }
        });

        tvh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv3.setVisibility( tv3.isShown()
                        ? View.GONE
                        : View.VISIBLE );
            }
        });

        tvh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv4.setVisibility( tv4.isShown()
                        ? View.GONE
                        : View.VISIBLE );
            }
        });

        tvh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv5.setVisibility( tv5.isShown()
                        ? View.GONE
                        : View.VISIBLE );
            }
        });

        tvh6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv6.setVisibility( tv6.isShown()
                        ? View.GONE
                        : View.VISIBLE );
            }
        });

    }


}
