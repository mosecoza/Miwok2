package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 2016-11-03.
 */

public class MiwokAdapter extends BaseAdapter {

    private ArrayList<MiwokWord> miwok_dictionary;
    private Activity context;
    // Resource ID for the background color for this list of words
    private int mColorResourceId;

    public MiwokAdapter(Context context, ArrayList<MiwokWord> miwok_dictionary, int colorResourceId ){
        this.miwok_dictionary = miwok_dictionary;
        this.context = (Activity) context;
        mColorResourceId = colorResourceId;
    }

    @Override
    public int getCount() {
        return miwok_dictionary.size();
    }

    @Override
    public MiwokWord getItem(int position) {
        return miwok_dictionary.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_layout, parent, false);
        }
        TextView defaultTextView = (TextView) convertView.findViewById(R.id.english_tv);
        TextView miwoktTextView = (TextView) convertView.findViewById(R.id.miwok_tv);
        ImageView miwokImage = (ImageView) convertView.findViewById(R.id.image_identify);

        MiwokWord currentWord = getItem(position);
        defaultTextView.setText(currentWord.getEnglishTranslation());
        miwoktTextView.setText(currentWord.getMiwokTransalation());
        miwokImage.setImageResource(currentWord.getImageResourceId());

        // Check if an image is provided for this word or not

        if (currentWord.hasImage()) {

            // If an image is available, display the provided image based on the resource ID

            miwokImage.setImageResource(currentWord.getImageResourceId());

            // Make sure the view is visible

            miwokImage.setVisibility(View.VISIBLE);

        } else {

            // Otherwise hide the ImageView (set visibility to GONE)

            miwokImage.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);

        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(context.getApplication(), mColorResourceId);

        //set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.

        return convertView;
    }
}
