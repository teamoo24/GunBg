package com.android.mini;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
/**
 * Created by USER on 2017/04/30.
 */

public class logoinit {
    public logoinit m_instance;
    public logoinit (){
        m_instance = this;
    }
    public void logodraw (Context context,int width,int height) {
        Bitmap logo2 = BitmapFactory.decodeResource(context.getResources(), R.raw._logo);
        MyGameView.m_instance.logo = Bitmap.createScaledBitmap(logo2, width, height, false);
    }
    public void logorecycle (Context context) {
        MyGameView.m_instance.logo.recycle();
    }
    //学校のイメージ
}
