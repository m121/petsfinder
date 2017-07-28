package com.perez.mateo.petsfinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

import java.util.ArrayList;

/**
 * Created by pc on 28/07/2017.
 */

public class petsAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<Pet> arrayList_products;
    private ArrayList<String> arrayList_namepet;

    private TextView textView_name;
    private TextView textView_state;


    public petsAdapter(Context context, ArrayList<String> arrayList_namepet) {
        this.context = context;
        this.arrayList_namepet = arrayList_namepet;


    }

    @Override
    public Pet getItem(int position) {
        return arrayList_products.get(position);
    }


    @Override
    public int getCount() {
        return arrayList_namepet.size();
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {


        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_listpetsactivity, viewGroup, false);
        }

        textView_name = (TextView) view.findViewById(R.id.textView_listpetactivity_namepet);
        textView_state = (TextView) view.findViewById(R.id.textView_listpetactivity_statepet);


        setfonts();


        return view;
    }


    private void setfonts() {
        textView_name.setTypeface(EasyFonts.caviarDreamsBoldItalic(context));
        textView_name.setTypeface(EasyFonts.caviarDreams(context));
    }


}
