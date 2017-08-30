package com.example.lenovo.customview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lenovo on 03-Jul-17.
 */

public class customadaptar extends ArrayAdapter <String>{
    private String[] name;
    private String[] add;
    private Integer[] image;
    private Activity context;

    public customadaptar(Activity context, String[] name, String[] add, Integer[] image){
        super(context,R.layout.listitem,name);
        this.context = context;
        this.name = name;
        this.add = add;
        this.image = image;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listviewitem = inflater.inflate(R.layout.listitem,null,true);
        TextView textViewName = (TextView) listviewitem.findViewById(R.id.name);
        TextView textViewaddress = (TextView) listviewitem.findViewById(R.id.address);
        ImageView img = (ImageView) listviewitem.findViewById(R.id.imageview);

        textViewName.setText(name[position]);
        textViewaddress.setText(add[position]);
        img.setImageResource(image[position]);
        return listviewitem;

    }
}
