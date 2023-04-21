package com.george.androidgittest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ZHWActivity extends AppCompatActivity {

    private Button zhw_button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhw_activity);

        zhw_button = (Button) findViewById(R.id.zhw_button);

        zhw_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ZHWActivity.this, "TEST", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
