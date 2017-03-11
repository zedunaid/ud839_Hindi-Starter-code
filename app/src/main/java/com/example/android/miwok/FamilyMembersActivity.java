package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Words> num = new ArrayList<Words>();
        num.add(new Words("Father","Pitaji",R.drawable.family_father));
        num.add(new Words("Mother","Maataji",R.drawable.family_mother));
        num.add(new Words("Son","Beta",R.drawable.family_son));
        num.add(new Words("Daughter","Beti",R.drawable.family_daughter));
        num.add(new Words("Older Brother","Bada Bhai",R.drawable.family_older_brother));
        num.add(new Words("Younger Brother","Chota Bhai",R.drawable.family_younger_brother));
        num.add(new Words("Older Sister","Badi Behen",R.drawable.family_older_sister));
        num.add(new Words("Younger Sister","Choti Behen",R.drawable.family_younger_sister));
        num.add(new Words("Grandmother","Dadiji",R.drawable.family_grandmother));
        num.add(new Words("Grandfather","Dadaji",R.drawable.family_grandfather));

        WordAdapter w=new WordAdapter(this,num,R.color.category_family);


        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(w);

    }


}
