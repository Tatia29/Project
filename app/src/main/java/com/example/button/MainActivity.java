package com.example.button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.rvSample);

        List list = new ArrayList();
        list.add("#22");
        list.add("#22");
        list.add("#22");


        SampleAdapter adapter = new SampleAdapter(list);

        recyclerView.setAdapter(adapter);


        Button button = findViewById(R.id.btnNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SeconActivity.class);
                startActivity(intent);
            }
        });
    }



    public void buttonClicked(View view){

    }


}