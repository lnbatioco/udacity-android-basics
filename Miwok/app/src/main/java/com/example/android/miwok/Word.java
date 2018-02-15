package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word
 * Contains default & Miwok translations for the word
 * Public class that can be accessed anywhere in the app
 * Public methods can be called anywhere in our program
 * note: don't need setter methods since state of translations will not change
 *       instead, we set translation values in constructor
 */

public class Word {
    // member variables (private)
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    // constructor for word object, w/ 2 inputs
    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // get default translation of word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    // get Miwok translation of word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
