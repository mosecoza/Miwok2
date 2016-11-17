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
        miwok_word.add(new MiwokWord("Where are you going?","minto wuksus", R.raw.phrase_where_are_you_going));
        miwok_word.add(new MiwokWord("What is your name?","tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        miwok_word.add(new MiwokWord("My name is...","oyaaset...", R.raw.phrase_my_name_is));
        miwok_word.add(new MiwokWord("How are you feeling?","michәksәs?", R.raw.phrase_how_are_you_feeling));
        miwok_word.add(new MiwokWord("I’m feeling good.","kuchi achit", R.raw.phrase_im_feeling_good));
        miwok_word.add(new MiwokWord("Are you coming?","әәnәs'aa?", R.raw.phrase_are_you_coming));
        miwok_word.add(new MiwokWord("Yes, I’m coming.","hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        miwok_word.add(new MiwokWord("I’m coming.","әәnәm", R.raw.phrase_im_coming));
        miwok_word.add(new MiwokWord("Let’s go.","yoowutis", R.raw.phrase_lets_go));
        miwok_word.add(new MiwokWord("Come here.","әnni'nem", R.raw.phrase_come_here));


        MiwokAdapter itemsAdapter = new MiwokAdapter(PhrasesActivity.this, miwok_word, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list_view_main);

        assert listView != null;
        listView.setAdapter(itemsAdapter);

    }
}
