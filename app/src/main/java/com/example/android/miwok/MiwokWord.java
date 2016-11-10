package com.example.android.miwok;

/**
 * Created by Admin on 2016-11-03.
 */

public class MiwokWord {
    /**the miwok translation for the word*/
    private static String mMiwokTransalation;
    /**the default translation for the word*/
    private static String mDefaultTranslation;

    /**constructor for the class*/
    public MiwokWord(String miwokTransalation, String defaultTranslation){
        mMiwokTransalation = miwokTransalation;
        mDefaultTranslation = defaultTranslation;
    }
    /**this method get the miwok translation for the number*/
    public String getMiwokTransalation() {
        return mMiwokTransalation;
    }
    /**this method get the default translation for the number*/
    public String getEnglishTranslation() {
        return mDefaultTranslation;
    }
}
