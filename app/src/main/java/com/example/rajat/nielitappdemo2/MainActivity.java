package com.example.rajat.nielitappdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;    Toolbar mActiontool;
    int p=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActiontool=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mActiontool);

        initCollapsingToolbar();
        //wv=(WebView)findViewById(R.id.wv);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new Courses()).commit();


        /*try {
            Glide.with(this).load(R.drawable.cover1).into((ImageView) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();



                if (menuItem.getItemId() == R.id.nav_item_home) {
                    if(p!=1) {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        p=1;
                    }
                    /*FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new Courses()).commit();*/

                }

                if (menuItem.getItemId() == R.id.nav_item_sterm) {
                    getSupportActionBar().setTitle("Short Term Courses");
                    Intent i=new Intent(getApplicationContext(),CoursesActivity.class);
                    i.putExtra("pos",0);
                    startActivity(i);
                }

                if (menuItem.getItemId() == R.id.nav_item_lterm) {

                    getSupportActionBar().setTitle("Long Term Courses");
                    Intent i=new Intent(getApplicationContext(),CoursesActivity.class);
                    i.putExtra("pos",1);
                    startActivity(i);
                    }

                if (menuItem.getItemId() == R.id.nav_item_dipl) {

                    getSupportActionBar().setTitle("Diploma Courses");
                    Intent i=new Intent(getApplicationContext(),CoursesActivity.class);
                    i.putExtra("pos",2);
                    startActivity(i);

                }

                if (menuItem.getItemId() == R.id.nav_item_proj) {

                    getSupportActionBar().setTitle("Project Training Courses");
                    Intent i=new Intent(getApplicationContext(),CoursesActivity.class);
                    i.putExtra("pos",3);
                    startActivity(i);

                }

                if (menuItem.getItemId() == R.id.aboutus) {
                    getSupportActionBar().setTitle("About Us");
                    Intent i=new Intent(getApplicationContext(),CoursesActivity.class);
                    i.putExtra("pos",4);
                    startActivity(i);

                }

                if (menuItem.getItemId() == R.id.contactus) {
                    getSupportActionBar().setTitle("Contact Us");
                    Intent i=new Intent(getApplicationContext(),CoursesActivity.class);
                    i.putExtra("pos",5);
                    startActivity(i);

                }

                if (menuItem.getItemId() == R.id.visitus) {

                    getSupportActionBar().setTitle("Visit Us");
                    Intent i=new Intent(getApplicationContext(),CoursesActivity.class);
                    i.putExtra("pos",6);
                    startActivity(i);




                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar1 = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,mDrawerLayout, toolbar1,R.string.app_name,
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


    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                    /*android.support.v7.widget.Toolbar toolbar1 = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
                    ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,mDrawerLayout, toolbar1,R.string.app_name,
                            R.string.app_name);

                    mDrawerLayout.setDrawerListener(mDrawerToggle);

                    mDrawerToggle.syncState();
*/
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

}
