package com.benyominwalters.layoutandanimationspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView oneDollar = (ImageView) findViewById(R.id.oneDollar);

        oneDollar.animate()
                .scaleX(0.5f)
                .scaleY(0.5f)
                .setDuration(2000);

        //oneDollar.animate().rotation(360f).setDuration(2000);

        //oneDollar.animate().translationXBy(-1000f).setDuration(2000);

        /*
        ImageView fiveDollar = (ImageView) findViewById(R.id.fiveDollar);

        if(oneDollar.getAlpha() == 1f){

            Log.i("Info", String.valueOf(oneDollar.getAlpha()));
            oneDollar.animate().alpha(0f).setDuration(2000);
            fiveDollar.animate().alpha(1f).setDuration(2000);

        } else {

            Log.i("Info", String.valueOf(oneDollar.getAlpha()));
            oneDollar.animate().alpha(1f).setDuration(2000);
            fiveDollar.animate().alpha(0f).setDuration(2000);

        }
        */

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
