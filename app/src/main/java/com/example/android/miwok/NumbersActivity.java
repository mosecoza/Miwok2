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
            MiwokAdapter itemsAdapter = new MiwokAdapter(NumbersActivity.this, words);
            listView.setAdapter(itemsAdapter);
        }

    }


    public Boolean hasAddedValues(){
        words.add(0, new MiwokWord("one", "lutti"));
        words.add(1, new MiwokWord("two", "ottiko"));
        words.add(2, new MiwokWord("three", "tolookosu"));
        words.add(3, new MiwokWord("four", "oyisa"));
        words.add(4, new MiwokWord("five", "massokka"));
        words.add(5, new MiwokWord("six", "temmokka"));
        words.add(6, new MiwokWord("seven", "tenekaku"));
        words.add(7, new MiwokWord("eight", "kawinta"));
        words.add(8, new MiwokWord("nine", "wo'e"));
        words.add(9, new MiwokWord("ten", "na'aacha"));

        if(words.isEmpty()){
            return false;
        } else {
            return true;
        }

    }

}
