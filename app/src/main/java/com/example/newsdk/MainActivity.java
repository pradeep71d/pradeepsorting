package com.example.newsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mynewlibrary.LibraryClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LibraryClass ref=new LibraryClass();
        ref.show();
    }
}
