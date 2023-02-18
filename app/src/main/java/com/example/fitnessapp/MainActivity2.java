package com.example.fitnessapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button buttonbefore, buttonafter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonbefore = (Button) findViewById(R.id.startyogabefore);
        buttonafter = (Button) findViewById(R.id.startyogaafter);

        /*Toolbar toolbar = findViewById(R.id.toolbar);
        //setActionBar(toolbar);
        setSupportActionBar(toolbar);*/

        buttonbefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        buttonafter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SecondActivity2.class);
                startActivity(intent);
            }
        });
    }

    private void setActionBar(Toolbar toolbar) {
    }

    //use menu ":"
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        //use id's that we create in res->menu->main.xml file
        if (id == R.id.id_privacy){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://spotnimra.blogspot.com/2021/11/fitness-app-privacy-policy.html"));
            startActivity(intent);
            return true;
        }
        if (id == R.id.id_term){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://spotnimra.blogspot.com/2021/11/fitness-app-terms-conditions.html"));
            startActivity(intent);
            return true;
        }
        if (id == R.id.id_rate){
            try{
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));

            }catch (Exception ex){

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
            }
            return true;
        }
        if (id == R.id.id_more){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Leap+Fitness+Group"));
            startActivity(intent);
            return true;
        }
        if (id == R.id.id_share){
            Intent  myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = "This is the best app for yoga \n By this app you streach your body \n" +
                    "This is the free Download Now! \n" + "https://play.google.com/store/apps/details?id=com.example.fitnessapp&hl=en";
            String sharehub = "Fitness App";
            myIntent.putExtra(Intent.EXTRA_SUBJECT, sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT, sharebody);
            startActivity(Intent.createChooser(myIntent, "share using"));
            return true;
        }
        return true;
    }

    public void beforeage18(View view) {
        Intent intent = new Intent(MainActivity2.this, SecondActivity.class);
        startActivity(intent);
    }

    public void afterage18(View view) {
        Intent intent = new Intent(MainActivity2.this, SecondActivity2.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(MainActivity2.this, FoodActivity.class);
        startActivity(intent);
    }
}
