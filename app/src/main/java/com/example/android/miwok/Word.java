package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mDefaultTranslation;
    private String mItalianTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word (String defaultTranslation, String italianTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mItalianTranslation = italianTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word (String defaultTranslation, String italianTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mItalianTranslation = italianTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getItalianTranslation() {
        return mItalianTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId() { return mAudioResourceId; }
}
