package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Words> num = new ArrayList<Words>();
        num.add(new Words("Red","Laal",R.drawable.color_red));
        num.add(new Words("Green","Hara",R.drawable.color_green));
        num.add(new Words("Brown","Bhura",R.drawable.color_brown));
        num.add(new Words("Gray","Dhusar",R.drawable.color_gray));
        num.add(new Words("Yellow","Pila",R.drawable.color_mustard_yellow));
        num.add(new Words("White","Safed",R.drawable.color_white));
        num.add(new Words("Black","Kaala",R.drawable.color_black));
        num.add(new Words("Dusty Yellow","Gehra Pila",R.drawable.color_dusty_yellow));
        WordAdapter w=new WordAdapter(this,num,R.color.category_colors);


        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(w);

    }


}
