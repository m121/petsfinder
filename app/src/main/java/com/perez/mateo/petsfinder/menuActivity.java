package com.perez.mateo.petsfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity {


    private Button button_addpet;
    private Button button_checkmap;
    private Button button_listpets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);


        button_addpet = (Button) findViewById(R.id.button_menuactivity_addpet);
        button_checkmap = (Button) findViewById(R.id.button_menuactivity_checkmap);
        button_listpets = (Button) findViewById(R.id.button_menuactivity_lispets);

        buttonintents();


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
}
