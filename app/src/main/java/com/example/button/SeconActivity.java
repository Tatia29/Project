package com.example.button;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SeconActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon);
        RecyclerView recyclerView = findViewById(R.id.rvvsimple);

        List list = new ArrayList();
        list.add("#19");
        list.add("#19");
        list.add("#19");
        list.add("#19");


        SampleAdapter2 adapter = new SampleAdapter2(list);
        recyclerView.setAdapter(adapter);


        mTextView = (TextView) findViewById(R.id.text);
    }

}