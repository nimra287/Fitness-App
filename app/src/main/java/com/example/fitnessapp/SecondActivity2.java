package com.example.fitnessapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //All the id's that are used in activity_second.xml
        newArray = new int[]{
                R.id.bow_pose,R.id.bridge_pose,R.id.chair_pose,R.id.child_pose,R.id.cobbler_pose,R.id.cow_pose,
                R.id.play_pose,R.id.pause_pose,R.id.situp_pose, R.id.crunches_pose,R.id.rotation_pose,
                R.id.twist_pose,R.id.windmill_pose,R.id.legup_pose,R.id.plank_pose
        };
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
            return true;
        }
        if (id == R.id.id_term){
            return true;
        }
        if (id == R.id.id_rate){
            return true;
        }
        if (id == R.id.id_more){
            return true;
        }
        if (id == R.id.id_share){
            return true;
        }
        return true;
    }


    public void Imagebuttonclicked(View view) {
        for (int i=0;i<newArray.length;i++){
            if (view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }

    }
}