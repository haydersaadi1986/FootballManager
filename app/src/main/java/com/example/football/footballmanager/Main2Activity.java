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

    int[] x_pos = new int[22];
    int[] y_pos = new int[22];

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
            if(plan.contentEquals("4:3:3")){
                x_pos[0] = 200;
                x_pos[1] = 430;
                x_pos[2] = 430;
                x_pos[3] = 430;
                x_pos[4] = 430;
                x_pos[5] = 750;
                x_pos[6] = 750;
                x_pos[7] = 750;
                x_pos[8] = 1100;
                x_pos[9] = 1100;
                x_pos[10] = 1100;
                y_pos[0] = 650;
                y_pos[1] = 200;
                y_pos[2] = 500;
                y_pos[3] = 800;
                y_pos[4] = 1100;
                y_pos[5] = 350;
                y_pos[6] = 650;
                y_pos[7] = 950;
                y_pos[8] = 350;
                y_pos[9] = 650;
                y_pos[10] = 950;
                x_pos[11] = 2330;
                x_pos[12] = 2130;
                x_pos[13] = 2130;
                x_pos[14] = 2130;
                x_pos[15] = 2130;
                x_pos[16] = 1750;
                x_pos[17] = 1750;
                x_pos[18] = 1750;
                x_pos[19] = 1400;
                x_pos[20] = 1400;
                x_pos[21] = 1400;
                y_pos[11] = 650;
                y_pos[12] = 200;
                y_pos[13] = 500;
                y_pos[14] = 800;
                y_pos[15] = 1100;
                y_pos[16] = 350;
                y_pos[17] = 650;
                y_pos[18] = 950;
                y_pos[19] = 350;
                y_pos[20] = 650;
                y_pos[21] = 950;
            }
            RelativeLayout.LayoutParams layoutParam[] = new RelativeLayout.LayoutParams[22];
            ImageView imageView[] = new ImageView[22];
            for(int i = 0; i < 11; i++){
                layoutParam[i] = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParam[i].topMargin = y_pos[i];
                layoutParam[i].leftMargin = x_pos[i];
                imageView[i] = new ImageView(this);
                imageView[i].setImageResource(R.drawable.red_box);
                imageView[i].setLayoutParams(layoutParam[i]);
                relativeLayout.addView(imageView[i], layoutParam[i]);
            }
            for(int i = 11; i < 22; i++){
                layoutParam[i] = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParam[i].topMargin = y_pos[i];
                layoutParam[i].leftMargin = x_pos[i];
                imageView[i] = new ImageView(this);
                imageView[i].setImageResource(R.drawable.blue_box);
                imageView[i].setLayoutParams(layoutParam[i]);
                relativeLayout.addView(imageView[i], layoutParam[i]);
            }


        }else if(field.contentEquals("Half Field")){
            relativeLayout.setBackgroundResource(R.drawable.football_half);
        }else{
            relativeLayout.setBackgroundResource(R.drawable.football_third);
        }

        //Toast.makeText(getApplicationContext(), Integer.toString(), Toast.LENGTH_LONG).show();














    }
}
