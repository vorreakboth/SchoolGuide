package edu.ckcc.schoolguide.Activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import edu.ckcc.schoolguide.R;

public class UniversityActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);


        ///////////////////////////////
        if (Build.VERSION.SDK_INT>=21){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.statusBar));
        }

        //Set Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.university_toolbar);
        toolbar.setBackgroundColor(this.getResources().getColor(R.color.toolbar));
        setSupportActionBar(toolbar);
        getSupportActionBar();
        setTitle("University");

        //Show back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ///////////////////////////////////

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}