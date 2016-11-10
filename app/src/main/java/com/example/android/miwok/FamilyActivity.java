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
        listView.setAdapter(new MiwokAdapter(this, words));}

    }
    public Boolean hasAddedValues(){
        words.add(new MiwokWord("father", "epe"));
        words.add(new MiwokWord("mother", "eta"));
        words.add(new MiwokWord("son", "angsi"));
        words.add(new MiwokWord("daughter", "tune"));
        words.add(new MiwokWord("older brother", "taachi"));
        words.add(new MiwokWord("younger brother", "chalitti"));
        words.add(new MiwokWord("older sister", "tete"));
        words.add(new MiwokWord("younger sister", "kolliti"));
        words.add(new MiwokWord("grandmother", "ama"));
        words.add(new MiwokWord("grandfather", "paapa"));

        if(words.isEmpty()){
            return false;
        } else {
            return true;
        }

    }
}
