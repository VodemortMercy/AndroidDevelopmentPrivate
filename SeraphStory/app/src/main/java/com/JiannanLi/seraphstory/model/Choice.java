package com.JiannanLi.seraphstory.model;

/**
 * Created by Harry on 2015/8/3.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}

