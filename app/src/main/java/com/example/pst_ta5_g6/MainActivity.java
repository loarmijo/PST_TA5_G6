package com.example.pst_ta5_g6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Esta funcion sirve para invocar la clase de Maps de Google
     *
     * @param view
     */
    public void goMaps(View view) {
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }


    public void video(View view) {
        Intent i = new Intent(this, Video.class);
        startActivity(i);
    }
}

