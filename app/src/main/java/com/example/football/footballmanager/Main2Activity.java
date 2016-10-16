package com.example.football.footballmanager;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    int[] x_pos = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100};
    int[] y_pos = {150, 500, 950, 1000, 200, 300, 500, 1100, 400, 100, 800};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        setContentView(relativeLayout, layoutParams);
        Intent intent = getIntent();
        String fieldandplan = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String field = fieldandplan.substring(0, fieldandplan.indexOf("+"));
        String plan = fieldandplan.substring(fieldandplan.indexOf("+")+1);
        if(field.contentEquals("Full Field")){
            relativeLayout.setBackgroundResource(R.drawable.football_full);

        }else if(field.contentEquals("Half Field")){
            relativeLayout.setBackgroundResource(R.drawable.football_half);
        }else{
            relativeLayout.setBackgroundResource(R.drawable.football_third);
        }
        if(plan.contentEquals("4:3:3")){
            x_pos[0] = 200;
            x_pos[1] = 400;
            x_pos[2] = 400;
            x_pos[3] = 400;
            x_pos[4] = 400;
            x_pos[5] = 600;
            x_pos[6] = 600;
            x_pos[7] = 600;
            x_pos[8] = 800;
            x_pos[9] = 800;
            x_pos[10] = 800;
            y_pos[0] = 500;
            y_pos[1] = 200;
            y_pos[2] = 400;
            y_pos[3] = 600;
            y_pos[4] = 800;
            y_pos[5] = 300;
            y_pos[6] = 500;
            y_pos[7] = 700;
            y_pos[8] = 300;
            y_pos[9] = 500;
            y_pos[10] = 700;
        }
        Toast.makeText(getApplicationContext(), field, Toast.LENGTH_LONG).show();

        RelativeLayout.LayoutParams layoutParam[] = new RelativeLayout.LayoutParams[11];
        ImageView imageView[] = new ImageView[11];
        for(int i = 0; i < 11; i++){
            layoutParam[i] = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParam[i].topMargin = y_pos[i];
            layoutParam[i].leftMargin = x_pos[i];
            imageView[i] = new ImageView(this);
            imageView[i].setImageResource(R.drawable.red_box);
            imageView[i].setLayoutParams(layoutParam[i]);
            relativeLayout.addView(imageView[i], layoutParam[i]);
        }












    }
}
