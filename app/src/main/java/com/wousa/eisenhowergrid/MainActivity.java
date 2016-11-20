package com.wousa.eisenhowergrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

//Keith Spaar and Chris Rickey


public class MainActivity extends AppCompatActivity {
    RecyclerView EventRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventRecyclerView = (RecyclerView) findViewById(R.id.EventRecyclerView);
    }
}