package com.perez.mateo.petsfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class addpetActivity extends AppCompatActivity {

    private Button button_save;
    private EditText editText_name;
    private EditText editText_characteristics;
    private EditText editText_resume;
    private TextView textView_titlepic;
    private TextView textView_titlename;
    private TextView textView_titlecharacteristics;
    private TextView textView_titletype;
    private TextView textView_titleresume;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpetactivity);


        button_save = (Button) findViewById(R.id.button_addpetactivity_savepet);
        editText_name = (EditText) findViewById(R.id.editText_addpetactivity_namepet);
        editText_characteristics = (EditText) findViewById(R.id.editText_addpetactivity_characteristicspet);
        editText_resume = (EditText) findViewById(R.id.editText_addpetactivity_resumepet);
        textView_titlepic = (TextView) findViewById(R.id.textView_addpetactivity_titlepicturepet);
        textView_titlename = (TextView) findViewById(R.id.textView_addpetactivity_titlenamepet);
        textView_titlecharacteristics = (TextView) findViewById(R.id.textView_addpetactivity_titlecharacteristicspet);
        textView_titletype = (TextView) findViewById(R.id.textView_addpetactivity_titletypepet);
        textView_titleresume = (TextView) findViewById(R.id.textView_addpetactivity_titleresumepet);

        setfonts();

    }


    private void setfonts()
    {
        button_save.setTypeface(EasyFonts.caviarDreamsBold(this));
        textView_titlepic.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titlename.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titletype.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titlecharacteristics.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titleresume.setTypeface(EasyFonts.caviarDreamsItalic(this));
        editText_name.setTypeface(EasyFonts.caviarDreams(this));
        editText_characteristics.setTypeface(EasyFonts.caviarDreams(this));
        editText_resume.setTypeface(EasyFonts.caviarDreams(this));

    }
}
