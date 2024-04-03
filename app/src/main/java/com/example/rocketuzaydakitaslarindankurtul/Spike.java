package com.example.rocketuzaydakitaslarindankurtul;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Spike {
    Bitmap spike[] = new Bitmap[3];
    int spikeFrame = 0;
    int spikeX,spikeY,spikeVelocity;
    Random random;

    public Spike(Context context){
        spike[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.W);
        spike[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.Y);
        spike[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.T);
        random = new Random();
        resetPositions();
    }

    public Bitmap getSpike(int spikeFrame){
        return spike[spikeFrame];
    }

    public  int getSpikeWidth(){
        return spike[0].getWidth();
    }

    public int getSpikeHeight(){
        return spike[0].getHeight();
    }

    public void resetPositions() {
        spikeX =random.nextInt(GameView.dWidth - getSpikeWidth());
        spikeY =-200 + random.nextInt(600)* -1;
        spikeVelocity =30 + random.nextInt(16);
    }
}
