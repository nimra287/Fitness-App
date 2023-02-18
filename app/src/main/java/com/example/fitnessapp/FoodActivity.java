package com.example.fitnessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //to remove-hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_food);

        String[] tstory = getResources().getStringArray(R.array.title_story);
        final String[] dstory = getResources().getStringArray(R.array.details_story);
        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row, R.id.rowtxt, tstory);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t = dstory[position];
                Intent intent = new Intent(FoodActivity.this, FoodActivityDetails.class);
                intent.putExtra("story", t);
                startActivity(intent);
            }
        });
    }
    //when we click on back arrow we redirect to mainactivity2
    public void foodgoback(View view) {
        Intent intent = new Intent(FoodActivity.this, MainActivity2.class);
        startActivity(intent);
        finish();
    }

    //called when the activity has detected the user's press of the back
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(FoodActivity.this, MainActivity2.class);
        startActivity(intent);
        finish();
    }
}