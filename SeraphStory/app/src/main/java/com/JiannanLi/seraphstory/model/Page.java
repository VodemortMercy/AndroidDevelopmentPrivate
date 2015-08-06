package com.JiannanLi.seraphstory.model;

/**
 * Created by Harry on 2015/8/3.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;


    Page (int imageId, String text, Choice choice1, Choice choice2){
        mText = text;
        mImageId = imageId;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }
    Page (int imageId,String text){
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;

    }

    public boolean getIsFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public int getImageId(){
        return mImageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public void setImageId(int imageId){
        mImageId = imageId;

    }

}
