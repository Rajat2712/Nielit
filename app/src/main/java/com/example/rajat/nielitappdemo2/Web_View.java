package com.example.rajat.nielitappdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by Rajat on 10/3/2016.
 */
public class Web_View extends Fragment {

    WebView wv;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.webview, null);
        wv = (WebView) view.findViewById(R.id.wv);
      Button  btn=(Button)view.findViewById(R.id.tv1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/chandigarh");
            }
        });


        Button  btn2=(Button)view.findViewById(R.id.tv2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/delhi");
            }
        });


        Button  btn3=(Button)view.findViewById(R.id.tv3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/gorakhpur");
            }
        });




        Button  btn4=(Button)view.findViewById(R.id.tv4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/jammu");
            }
        });




        Button  btn5=(Button)view.findViewById(R.id.tv5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/leh");
            }
        });




        Button  btn6=(Button)view.findViewById(R.id.tv6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/lucknow");
            }
        });




        Button  btn7=(Button)view.findViewById(R.id.tv7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/patna");
            }
        });




        Button  btn8=(Button)view.findViewById(R.id.tv8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/ropar");
            }
        });




        Button  btn9=(Button)view.findViewById(R.id.tv9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/shimla");
            }
        });




        Button  btn10=(Button)view.findViewById(R.id.tv10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/srinagar");
            }
        });




        Button  btn11=(Button)view.findViewById(R.id.tv11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/agartala");
            }
        });




        Button  btn12=(Button)view.findViewById(R.id.tv12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/aizawl");
            }
        });




        Button  btn13=(Button)view.findViewById(R.id.tv13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/chuchuyimlang");
            }
        });




        Button  btn14=(Button)view.findViewById(R.id.tv14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/churachandpur");
            }
        });




        Button  btn15=(Button)view.findViewById(R.id.tv15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/gangtok");
            }
        });




        Button  btn16=(Button)view.findViewById(R.id.tv16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/guwahati");
            }
        });




        Button  btn17=(Button)view.findViewById(R.id.tv17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/imphal");
            }
        });




        Button  btn18=(Button)view.findViewById(R.id.tv18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/itanagar");
            }
        });




        Button  btn19=(Button)view.findViewById(R.id.tv19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/jorhat");
            }
        });




        Button  btn20=(Button)view.findViewById(R.id.tv20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/kohima");
            }
        });




        Button  btn21=(Button)view.findViewById(R.id.tv21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/kokrajhar");
            }
        });




        Button  btn22=(Button)view.findViewById(R.id.tv22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/lunglei");
            }
        });




        Button  btn23=(Button)view.findViewById(R.id.tv23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/pasighat");
            }
        });




        Button  btn24=(Button)view.findViewById(R.id.tv24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/senapati");
            }
        });




        Button  btn25=(Button)view.findViewById(R.id.tv25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/shillong");
            }
        });




        Button  btn26=(Button)view.findViewById(R.id.tv26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/silchar");
            }
        });




        Button  btn27=(Button)view.findViewById(R.id.tv27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/tezpur");
            }
        });




        Button  btn28=(Button)view.findViewById(R.id.tv28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/tura");
            }
        });




        Button  btn29=(Button)view.findViewById(R.id.tv29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/kolkata");
            }
        });




        Button  btn30=(Button)view.findViewById(R.id.tv30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/ranchi");
            }
        });




        Button  btn31=(Button)view.findViewById(R.id.tv31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/calicut");
            }
        });




        Button  btn32=(Button)view.findViewById(R.id.tv32);
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/chennai");
            }
        });




        Button  btn33=(Button)view.findViewById(R.id.tv33);
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/srikakulam");
            }
        });




        Button  btn34=(Button)view.findViewById(R.id.tv34);
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/ajmer");
            }
        });




        Button  btn35=(Button)view.findViewById(R.id.tv35);
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl("http://nielit.gov.in/aurangabad");
            }
        });







        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

















    /*public void B1(View view) {
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }

    public void B2(View view) {
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }

    public void B3(View view) {
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }

    public void B4(View view) {
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }

    public void B5(View view) {

        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B6(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }

    public void B7(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }

    public void B8(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }

    public void B9(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B10(View view) {
        // wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B11(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B12(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B13(View view) {
        // wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B14(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B15(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B16(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B17(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B18(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B19(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B20(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B21(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B22(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B23(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B24(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B25(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B26(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B27(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B28(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B29(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B30(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B31(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B32(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B33(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B34(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }


    public void B35(View view) {
        //wv = (WebView) findViewById(R.id.wv);
        //wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl("http://nielit.gov.in/delhi");
    }
*/



}
