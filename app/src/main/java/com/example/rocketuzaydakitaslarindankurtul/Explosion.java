package com.example.rocketuzaydakitaslarindankurtul;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[] = new Bitmap[4];
    int explosionFrame = 0;
    int explosionX,explosionY;

    public Explosion(Context context){
        explosion[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.D);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.E);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.F);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(),R.drawable.B);
    }

    public Bitmap getExplosion(int explosionFrame){
        return  explosion[explosionFrame];
    }

}
