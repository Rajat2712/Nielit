package com.example.rajat.nielitappdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.*;

/**
 * Created by Rajat on 8/21/2016.
 */
public class CoursesActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    int pos;
    static int p=9;
    Toolbar mActiontool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_activity);
        Intent i=getIntent();
        pos=i.getExtras().getInt("pos");
        p=pos;

        mActiontool=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mActiontool);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        switch (pos){
            case 0:
                getSupportActionBar().setTitle("Short Term Courses");
                mFragmentTransaction.replace(R.id.containerView,new ShortTerm()).commit();
                break;
            case 1:
                getSupportActionBar().setTitle("Long Term Courses");
                mFragmentTransaction.replace(R.id.containerView,new LongTerm()).commit();
                break;
            case 2:
                getSupportActionBar().setTitle("Diploma Courses");
                mFragmentTransaction.replace(R.id.containerView,new DiplomaCourses()).commit();
                break;
            case 3:
                getSupportActionBar().setTitle("Project Training Courses");
                mFragmentTransaction.replace(R.id.containerView,new ProjectTraining()).commit();
                break;
            case 4:
                getSupportActionBar().setTitle("About Us");
                mFragmentTransaction.replace(R.id.containerView,new AboutUs()).commit();
                break;
            case 5:
                getSupportActionBar().setTitle("Contact Us");
                mFragmentTransaction.replace(R.id.containerView,new ContactUs()).commit();
                break;
            case 6:
                getSupportActionBar().setTitle("Visit Us");
                mFragmentTransaction.replace(R.id.containerView,new Web_View()).commit();
                break;

            default:break;
        }



        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if (menuItem.getItemId() == R.id.nav_item_home) {
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                           }


                if (menuItem.getItemId() == R.id.nav_item_sterm) {
                    if(p!=0) {
                        getSupportActionBar().setTitle("Short Term Courses");
                        mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.containerView, new ShortTerm()).commit();
                        p=0;
                    }
                }

                if (menuItem.getItemId() == R.id.nav_item_lterm) {
                    if(p!=1) {
                        getSupportActionBar().setTitle("Long Term Courses");
                        mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.containerView, new LongTerm()).commit();
                        p=1;
                    }
                                 }

                if (menuItem.getItemId() == R.id.nav_item_dipl) {
                    if(p!=2) {
                        getSupportActionBar().setTitle("Diploma Courses");
                        mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.containerView, new DiplomaCourses()).commit();
                        p=2;
                    }
                    }

                if (menuItem.getItemId() == R.id.nav_item_proj) {
                    if(p!=3) {
                        getSupportActionBar().setTitle("Project Training Courses");
                        mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.containerView, new ProjectTraining()).commit();
                        p=3;
                    }
                    }

                if (menuItem.getItemId() == R.id.aboutus) {
                    if(p!=4) {
                        getSupportActionBar().setTitle("About Us");
                        mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.containerView, new AboutUs()).commit();
                        p=4;
                    }
                }

                if (menuItem.getItemId() == R.id.contactus) {
                    if(p!=5) {
                        getSupportActionBar().setTitle("Contact Us");
                        mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.containerView, new ContactUs()).commit();
                        p=5;
                    }
                }

                if (menuItem.getItemId() == R.id.visitus) {

                    if(p!=6) {
                        getSupportActionBar().setTitle("Visit Us");
                        mFragmentTransaction = mFragmentManager.beginTransaction();
                        mFragmentTransaction.replace(R.id.containerView, new Web_View()).commit();
                        p=6;
                    }


                }


                return false;


            }

        });

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();


    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


}
