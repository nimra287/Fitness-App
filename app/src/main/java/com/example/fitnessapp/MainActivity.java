package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare animation(up,down) which i create in "res" "anim" file
    Animation up, down;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //to remove the title bar
        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

        //to remove-hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.appsplash);
        //set animation on image
        up = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.up);
        imageView.setAnimation(up);

        TextView textView = findViewById(R.id.appname);
        //set animation on text
        down = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.down);
        textView.setAnimation(down);

        //after some time(3500ms) open new activity(MainActivity2)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //redirect to Mainctivity2
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                finish();
            }
        }, 3500);

    }
}
