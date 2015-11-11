package com.example.chi00050677.myapplicationgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables go here
    private Button btnFalse;
    private Button btnTrue;
    private TextView lblQuestion;
    private ImageView imgPicture;
   // private List<QuestionObject> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect variables to interface items

        btnFalse=(Button)findViewById(R.id.btnFalse);
        btnTrue=(Button)findViewById(R.id.btnTrue);
        lblQuestion=(TextView)findViewById(R.id.lblQuestion);
        imgPicture=(ImageView)FindViewById(R.id.imgPicture);

        //set questionnaire text
        lblQuestion.setText("Is my name Country");

        //set image picture
        imgPicture.setImageResource(R.drawable.country);

        //onclick listeners
        btnFalse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });


        btnTrue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

            generateQuestions();

    }//ends oncreate


         private void generateQuestions() {

         questions =new ArrayList<>();


        }//end generate questions

}// end activity

