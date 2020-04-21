package com.example.recyclerview;

import android.content.Intent;
import android.widget.Toast;

public class ExampleItem {
    private int mImageResource;
    private String mText1,mText2;

    public ExampleItem(int imageResource,String text1,String text2){
        mImageResource=imageResource;
        mText1=text1;
        mText2=text2;
    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }

    }
