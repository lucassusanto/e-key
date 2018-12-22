package com.example.lucas.techno1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int[] doorStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doorStatus = new int[10];
        doorStatus[0] = 0;
    }

    public void pilihPintu(View view) {
        Intent intent = new Intent(this, ActionActivity.class);
        startActivity(intent);
    }

    public void refreshPintu(View view) {
        Toast.makeText(this, "1 pintu ditemukan", Toast.LENGTH_SHORT).show();
    }
}
