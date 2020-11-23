package com.example.androidappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.net.Uri;
import android.content.Intent;

public class StoryOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button buttonedim;
        Button buttonmyportal;
        Button Comstruc;


        // Button buttonrefresh;
        // Button buttonupdate;

        Comstruc = findViewById(R.id.comstruc);
        Comstruc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoryOverview.this,
                        ShowStory.class);
                startActivity(intent);

            }
        });


        buttonedim = findViewById(R.id.edim);
        buttonedim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri webpage = Uri.parse("https://edimension.sutd.edu.sg");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

                if (webIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(webIntent);
                }

            }
        });


        buttonmyportal = findViewById(R.id.myportal);
        buttonmyportal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri webpage = Uri.parse("https://myportal.sutd.edu.sg/psp/EPPRD/EMPLOYEE/EMPL/h/?tab=DEFAULT&cmd=login&errorCode=106&languageCd=ENG");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

                if (webIntent.resolveActivity(  getPackageManager()  ) != null){
                    startActivity(webIntent);
                }

            }
        });



        //buttonrefresh = findViewById(R.id.refresh);
        //buttonupdate = findViewById(R.id.update);






    }
}