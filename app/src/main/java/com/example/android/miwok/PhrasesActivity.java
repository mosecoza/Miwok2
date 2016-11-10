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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<MiwokWord> miwok_word = new ArrayList<MiwokWord>();
        miwok_word.add(new MiwokWord("one", "lutti"));
        miwok_word.add(new MiwokWord("two", "ottiko"));
        miwok_word.add(new MiwokWord("three", "tolookosu"));
        miwok_word.add(new MiwokWord("four", "oyisa"));
        miwok_word.add(new MiwokWord("five", "massokka"));
        miwok_word.add(new MiwokWord("six", "temmokka"));
        miwok_word.add(new MiwokWord("seven", "tenekaku"));
        miwok_word.add(new MiwokWord("eight", "kawinta"));
        miwok_word.add(new MiwokWord("nine", "wo'e"));
        miwok_word.add(new MiwokWord("ten", "na'aacha"));


        MiwokAdapter itemsAdapter = new MiwokAdapter(this, miwok_word);

        ListView listView = (ListView) findViewById(R.id.list_view_main);

        assert listView != null;
        listView.setAdapter(itemsAdapter);

    }
}
