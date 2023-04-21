package com.george.androidgittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.putExtra("second","secondActivity");
        startActivity(intent);
        System.out.println("这里是sunny第一次修改");
        Button bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("这里是sunny第二次修改");
            }
        });


        System.out.println("-------------------------zyy");

    }
}