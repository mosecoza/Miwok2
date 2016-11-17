package com.example.android.miwok;

/**
 * Created by Admin on 2016-11-03.
 */

public class MiwokWord {
    /**the miwok translation for the word*/
    private String mMiwokTransalation;
    /**the default translation for the word*/
    private String mDefaultTranslation;
    //Audio resource ID for the word
    private int mAudioResourceId;
    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = 0;

    /**constructor for the class*/
    public MiwokWord(String miwokTransalation, String defaultTranslation, int audioResourceId ){
        mMiwokTransalation = miwokTransalation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public MiwokWord(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTransalation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    /**this method get the miwok translation for the number*/
    public String getMiwokTransalation() {
        return mMiwokTransalation;
    }
    /**this method get the default translation for the number*/
    public String getEnglishTranslation() {
        return mDefaultTranslation;
    }
    // Create a new word object
    public int getImageResourceId() { return mImageResourceId; }

    // Returns whether or not there is an image for this word.
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    // Return the audio resource ID of the word
    public int getAudioResourceId(){ return mAudioResourceId; }
}
