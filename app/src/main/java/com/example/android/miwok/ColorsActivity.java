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

public class ColorsActivity extends AppCompatActivity {

    ArrayList<MiwokWord> words = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        MiwokAdapter itemsAdapter = new MiwokAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_view_main);

        if(addColors()){
        assert listView != null;
        listView.setAdapter(new MiwokAdapter(ColorsActivity.this, words, R.color.category_colors));}

    }

    protected boolean addColors(){
        words.add(new MiwokWord("red", "wetetti", R.drawable.color_red));
        words.add(new MiwokWord("mustard yellow", "chiwite", R.drawable.color_mustard_yellow ));
        words.add(new MiwokWord("dusty yellow", "topiise", R.drawable.color_dusty_yellow));
        words.add(new MiwokWord("green", "chokokki", R.drawable.color_green));
        words.add(new MiwokWord("brown", "takaakki", R.drawable.color_brown));
        words.add(new MiwokWord("gray", "topoppi", R.drawable.color_gray));
        words.add(new MiwokWord("black", "kululli", R.drawable.color_black));
        words.add(new MiwokWord("white", "kelelli", R.drawable.color_white));

        if(words.isEmpty()){
            return false;
        }
        else {
        return true;}
    }
}
