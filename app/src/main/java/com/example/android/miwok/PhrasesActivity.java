package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Words> num = new ArrayList<Words>();
        num.add(new Words("Where are you going?","Kaha ja rahe ho?"));
        num.add(new Words("What is your name?","kya naam hai tumhara?"));
        num.add(new Words("My name is..","Mera naam.."));
        num.add(new Words("How are you feeling today?","Kaisa lag raha hai aaj tumhe? "));
        num.add(new Words("I'm feeling good","Mujhe accha lag raha hai"));
        num.add(new Words("Are you coming?","Tum aa rahe ho?"));
        num.add(new Words("Yes,I'm coming","Haa,Mai aa raha hu"));
        num.add(new Words("I'm Coming","Mai aa raha hu"));
        num.add(new Words("Let's go","Aao chale"));
        num.add(new Words("Come here","Idhar aao"));

        WordAdapter w=new WordAdapter(this,num,R.color.category_phrases);


        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(w);

    }


}

