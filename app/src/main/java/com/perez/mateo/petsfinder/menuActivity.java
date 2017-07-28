package com.perez.mateo.petsfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class menuActivity extends AppCompatActivity {


    private Button button_addpet;
    private Button button_checkmap;
    private Button button_listpets;
    private TextView textView_title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);








        button_addpet = (Button) findViewById(R.id.button_menuactivity_addpet);
        button_checkmap = (Button) findViewById(R.id.button_menuactivity_checkmap);
        button_listpets = (Button) findViewById(R.id.button_menuactivity_lispets);
        textView_title = (TextView) findViewById(R.id.textView_menuactivity_title);

        buttonintents();
        setfonts();


    }


    private void buttonintents() {
        button_addpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuActivity.this, addpetActivity.class);
                startActivity(intent);

            }
        });

        button_checkmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuActivity.this, mapActivity.class);
                startActivity(intent);


            }
        });

        button_listpets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuActivity.this, listpetsActivity.class);
                startActivity(intent);


            }
        });
    }

    private void setfonts()
    {
        button_addpet.setTypeface(EasyFonts.caviarDreamsBold(this));
        button_checkmap.setTypeface(EasyFonts.caviarDreamsBold(this));
        button_listpets.setTypeface(EasyFonts.caviarDreamsBold(this));
        textView_title.setTypeface(EasyFonts.caviarDreamsBoldItalic(this));

    }
}
