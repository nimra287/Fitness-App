package com.example.fitnessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FoodActivityDetails extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //to remove-hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_food_details);

        textView = findViewById(R.id.txt);
        //pass story (use as a  heading) that we use in foodActivity
        String dstory = getIntent().getStringExtra("story");
        textView.setText(dstory);
    }

    //when we click on back arrow we redirect to foodActivity
    public void goback(View view) {
        Intent intent = new Intent(FoodActivityDetails.this, FoodActivity.class);
        startActivity(intent);
        finish();
    }

    //called when the activity has detected the user's press of the back
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(FoodActivityDetails.this, FoodActivity.class);
        startActivity(intent);
        finish();
    }
}