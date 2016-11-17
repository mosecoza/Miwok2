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

public class FamilyActivity extends AppCompatActivity {
    ArrayList<MiwokWord> words = new ArrayList<MiwokWord>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        if (hasAddedValues()){
        ListView listView = (ListView) findViewById(R.id.list_view_main);

        assert listView != null;
        listView.setAdapter(new MiwokAdapter(FamilyActivity.this, words, R.color.category_family));}

    }
    public Boolean hasAddedValues(){
        words.add(new MiwokWord("father", "epe", R.drawable.family_father));
        words.add(new MiwokWord("mother", "eta", R.drawable.family_mother));
        words.add(new MiwokWord("son", "angsi", R.drawable.family_son));
        words.add(new MiwokWord("daughter", "tune", R.drawable.family_daughter));
        words.add(new MiwokWord("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new MiwokWord("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new MiwokWord("older sister", "tete", R.drawable.family_older_sister));
        words.add(new MiwokWord("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new MiwokWord("grandmother", "ama", R.drawable.family_grandmother));
        words.add(new MiwokWord("grandfather", "paapa", R.drawable.family_grandfather));

        if(words.isEmpty()){
            return false;
        } else {
            return true;
        }

    }
}
