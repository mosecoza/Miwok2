package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 2016-11-04.
 */

public class MiwokAdapter2 extends BaseAdapter {

    public Context mContext;
    public ArrayList<MiwokWord> list;
    LayoutInflater inflater;


    public MiwokAdapter2(Context context, ArrayList<MiwokWord> list){
        this.mContext = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(inflater == null){
            inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(listItemView == null){
            listItemView = inflater.inflate(R.layout.list_layout, parent, false);
        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_tv);
        TextView miwoktTextView = (TextView) listItemView.findViewById(R.id.miwok_tv);

        MiwokWord currentNumber = (MiwokWord) getItem(position);
        defaultTextView.setText(currentNumber.getEnglishTranslation());
        miwoktTextView.setText(currentNumber.getMiwokTransalation());

        System.out.println(currentNumber.getEnglishTranslation());


        return listItemView;
    }
}
