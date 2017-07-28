package com.perez.mateo.petsfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class loginpetActivity extends AppCompatActivity {

    private Button button_facebook;
    private TextView textview_title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpetactivity);



        button_facebook = (Button) findViewById(R.id.button_loginpetactivity_loginfb);
        textview_title = (TextView) findViewById(R.id.textView_loginpetactivity_title);


        buttonintent();
        setfonts();


    }


    private void buttonintent()
    {
        button_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginpetActivity.this,menuActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setfonts()
    {
        button_facebook.setTypeface(EasyFonts.caviarDreamsBold(this));
        textview_title.setTypeface(EasyFonts.caviarDreamsBoldItalic(this));
    }
}
