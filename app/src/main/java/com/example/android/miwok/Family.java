package com.example.android.miwok;

public class Family {
    private String mDefaultTranslation;
    private String mMiwokTranslation;


    public Family(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmDefaultTraslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

}
