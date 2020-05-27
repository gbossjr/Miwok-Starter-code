package com.example.android.miwok;

public class Word {
    private String mDefaultTraslation;
    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTraslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmDefaultTraslation(){
        return mDefaultTraslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }




}
