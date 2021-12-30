package com.example.apprendre;

public class Word {

    private String mDefaultTranslation;
    private String mFrenchTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String frenchTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String frenchTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getFrenchTranslation() {
        return mFrenchTranslation;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public int getAudioResourceId(){ return mAudioResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }

}
