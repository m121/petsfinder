package com.perez.mateo.petsfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class foundpetActivity extends AppCompatActivity {

    private Button button_save;
    private EditText editText_name;
    private  EditText editText_characteristics;
    private EditText  editText_phone;
    private TextView  textView_titlepic;
    private TextView  textView_titlename;
    private TextView  textView_titlecharacteristics;
    private TextView  textView_titlenow;
    private TextView  textView_titlephone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foundpetactivity);


        button_save = (Button) findViewById(R.id.button_fountpetactivity_savepet);
        editText_name = (EditText) findViewById(R.id.editText_foundpetactivity_namepet);
        editText_characteristics = (EditText) findViewById(R.id.editText_foundpetactivity_characteristicspet);
        editText_phone = (EditText) findViewById(R.id.editText_foundpetactivity_phone);
        textView_titlepic = (TextView) findViewById(R.id.textView_foundpetactivity_titlepicturepet);
        textView_titlename = (TextView) findViewById(R.id.textView_foundpetactivity_titlenamepet);
        textView_titlecharacteristics = (TextView) findViewById(R.id.textView_foundpetactivity_titlecharacteristicspet);
        textView_titlenow = (TextView) findViewById(R.id.textView_foundpetactivity_titlenow);
        textView_titlephone = (TextView) findViewById(R.id.textView_foundpetactivity_titlephone);

        setfonts();





    }

    private void setfonts()
    {
        button_save.setTypeface(EasyFonts.caviarDreamsBold(this));
        textView_titlepic.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titlename.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titlecharacteristics.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titlenow.setTypeface(EasyFonts.caviarDreamsItalic(this));
        textView_titlephone.setTypeface(EasyFonts.caviarDreamsItalic(this));
        editText_name.setTypeface(EasyFonts.caviarDreams(this));
        editText_characteristics.setTypeface(EasyFonts.caviarDreams(this));
        editText_phone.setTypeface(EasyFonts.caviarDreams(this));
    }
}
