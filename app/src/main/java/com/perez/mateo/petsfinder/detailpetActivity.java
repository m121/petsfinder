package com.perez.mateo.petsfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class detailpetActivity extends AppCompatActivity {

    private TextView textView_tittlename;
    private TextView textView_tittlecharacteristics;
    private TextView textView_tittletype;
    private TextView textView_tittleresume;
    private TextView textView_name;
    private TextView textView_characteristics;
    private TextView textView_type;
    private TextView textView_resume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpetactivity);

        textView_tittlename = (TextView) findViewById(R.id.textView_detailpetactivity_titlename);
        textView_tittlecharacteristics = (TextView) findViewById(R.id.textView_detailpetactivity_titlecharacteristics);
        textView_tittletype = (TextView) findViewById(R.id.textView_detailpetactivity_titletype);
        textView_tittleresume = (TextView) findViewById(R.id.textView_detailpetactivity_titleresume);
        textView_name = (TextView) findViewById(R.id.textView_detailpetactivity_name);
        textView_characteristics = (TextView) findViewById(R.id.textView_detailpetactivity_Characteristics);
        textView_type = (TextView) findViewById(R.id.textView_detailpetactivity_type);
        textView_resume = (TextView) findViewById(R.id.textView_detailpetactivity_resume);

        setfonts();


    }

    private void setfonts()
    {
        textView_tittlename.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_tittlecharacteristics.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_tittletype.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_tittleresume.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_name.setTypeface(EasyFonts.caviarDreams(this));
        textView_characteristics.setTypeface(EasyFonts.caviarDreams(this));
        textView_type.setTypeface(EasyFonts.caviarDreams(this));
        textView_resume.setTypeface(EasyFonts.caviarDreams(this));

    }
}
