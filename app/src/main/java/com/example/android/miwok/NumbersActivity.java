package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Words> num = new ArrayList<Words>();
        num.add(new Words("One","Ek",R.drawable.number_one));
        num.add(new Words("Two","Do",R.drawable.number_two));
        num.add(new Words("Three","Teen",R.drawable.number_three));
        num.add(new Words("Four","Char",R.drawable.number_four));
        num.add(new Words("Five","Paanch",R.drawable.number_five));
        num.add(new Words("Six","Che",R.drawable.number_six));
        num.add(new Words("Seven","Saat",R.drawable.number_seven));
        num.add(new Words("Eight","Aath",R.drawable.number_eight));
        num.add(new Words("Nine","Nau",R.drawable.number_nine));
        num.add(new Words("Ten","Das",R.drawable.number_ten));

 WordAdapter w=new WordAdapter(this,num,R.color.category_numbers);


        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(w);

    }


}
