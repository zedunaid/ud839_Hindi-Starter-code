package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abc on 04/03/2017.
 */
public class WordAdapter extends ArrayAdapter<Words> {
     private int bColor;
    public WordAdapter(Activity context, ArrayList<Words> num,int color)
    {
        super(context,0,num);
        bColor=color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Words} object located at this position in the list
        Words currentWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miw = (TextView) listItemView.findViewById(R.id.miwok_tv);
        // Get the version name from the current Words object and
        // set this text on the name TextView
        miw.setText(currentWord.getHindiTranslation());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView eng = (TextView) listItemView.findViewById(R.id.default_tv);
        eng.setText(currentWord.getEnglishTranslation());

        ImageView img=(ImageView) listItemView.findViewById(R.id.image);

         if(currentWord.getHindiImage()!=0)
         {

        img.setImageResource(currentWord.getHindiImage());}

        else {
             img.setVisibility(View.GONE);
         }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), bColor);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
