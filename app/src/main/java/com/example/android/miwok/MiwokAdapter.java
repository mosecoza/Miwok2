package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 2016-11-03.
 */

public class MiwokAdapter extends ArrayAdapter<MiwokWord> {
    private static final String LOG_TAG = MiwokAdapter.class.getSimpleName();
    private ArrayList<MiwokWord> miwok_dictionary;

    public MiwokAdapter(Activity context, ArrayList<MiwokWord> miwok_dictionary ){
        super(context, 0, miwok_dictionary);
        this.miwok_dictionary = miwok_dictionary;
    }
    @SuppressLint("NewApi")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout,parent,false);
        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_tv);
        TextView miwoktTextView = (TextView) listItemView.findViewById(R.id.miwok_tv);
        ImageView miwokImage = (ImageView) listItemView.findViewById(R.id.image_identify);

        MiwokWord currentNumber = getItem(position);
        assert currentNumber != null;
        defaultTextView.setText(currentNumber.getEnglishTranslation());
        miwoktTextView.setText(currentNumber.getMiwokTransalation());
        miwokImage.setBackgroundResource(R.mipmap.ic_launcher);
        return listItemView;
    }
}
