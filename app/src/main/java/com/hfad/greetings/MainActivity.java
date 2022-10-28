package com.hfad.greetings;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 *  MainActivity.java - Greetings
 *  This program displays a greeting word in three different languages -
 *  English, Spanish, and French.
 *  This application possesses the ability to run on Android devices
 *  with an application programming interface (API) of at least 21.
 *
 *  @author Joseph Traglia
 *
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Main program that builds and displays the application on the device's screen.
     * @param savedInstanceState default parameter used to save the application's data
     *                           once the screen has been rotated to landscape mode.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}