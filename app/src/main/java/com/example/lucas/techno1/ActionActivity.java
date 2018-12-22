package com.example.lucas.techno1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActionActivity extends AppCompatActivity {
    private int doorStatus;
    private ImageView imgStatus;
    private TextView txStatus;
    private Button btnAction;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        imgStatus = findViewById(R.id.imgStatus);
        txStatus = findViewById(R.id.txStatus);
        btnAction = findViewById(R.id.btnAction);
    }

    @Override
    protected void onResume() {
        super.onResume();
        doorStatus = MainActivity.doorStatus[0];

        if(doorStatus == 0) {
            setUnlocked();
        }
        else if(doorStatus == 1) {
            setLocked();
        }
    }

    public void toggleDoor(View view) {
        if(doorStatus == 0) {
            setLocked();
        }
        else if(doorStatus == 1) {
            Intent intent = new Intent(this, UnlockActivity.class);
            startActivity(intent);
        }
    }

    public void kembali(View view) {
        finish();
    }

    private void setUnlocked() {
        imgStatus.setImageResource(R.drawable.unlocked);
        txStatus.setText("TERBUKA");
        txStatus.setTextColor(Color.parseColor("#FC181E"));
        btnAction.setText("KUNCI");

        MainActivity.doorStatus[0] = 0;
        doorStatus = 0;
    }

    private void setLocked() {
        imgStatus.setImageResource(R.drawable.locked);
        txStatus.setText("TERKUNCI");
        txStatus.setTextColor(Color.parseColor("#B5E61D"));
        btnAction.setText("BUKA");

        MainActivity.doorStatus[0] = 1;
        doorStatus = 1;
    }
}
