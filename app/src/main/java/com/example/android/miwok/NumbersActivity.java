/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private ArrayList<MiwokWord> words = new ArrayList<MiwokWord>();
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        listView = (ListView) findViewById(R.id.list_view_main);

        if(hasAddedValues()) {
            MiwokAdapter itemsAdapter = new MiwokAdapter(NumbersActivity.this, words, R.color.category_numbers);
            listView.setAdapter(itemsAdapter);
        }

    }


    public Boolean hasAddedValues(){
        words.add(new MiwokWord("one", "lutti", R.drawable.number_one));
        words.add(new MiwokWord("two", "ottiko", R.drawable.number_two));
        words.add( new MiwokWord("three", "tolookosu", R.drawable.number_three));
        words.add(new MiwokWord("four", "oyisa", R.drawable.number_four));
        words.add( new MiwokWord("five", "massokka", R.drawable.number_five));
        words.add( new MiwokWord("six", "temmokka", R.drawable.number_six));
        words.add( new MiwokWord("seven", "tenekaku", R.drawable.number_seven));
        words.add( new MiwokWord("eight", "kawinta", R.drawable.number_eight));
        words.add( new MiwokWord("nine", "wo`e", R.drawable.number_nine));
        words.add( new MiwokWord("ten", "na`aacha", R.drawable.number_ten));

        if(words.isEmpty()){
            return false;
        } else {
            return true;
        }}

}
