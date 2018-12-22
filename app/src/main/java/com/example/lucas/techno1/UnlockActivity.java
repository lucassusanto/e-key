package com.example.lucas.techno1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UnlockActivity extends AppCompatActivity {
    private EditText txPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock);

        txPassword = findViewById(R.id.txPassword);
    }

    public void bukaPintu(View view) {
        String pass = txPassword.getText().toString();

        if (pass.length() < 6) {
            Toast.makeText(this, "Panjang kata sandi minimal 6 karakter!", Toast.LENGTH_SHORT).show();
        } else {
            MainActivity.doorStatus[0] = 0;
            finish();
        }
    }

    public void kembali(View view) {
        finish();
    }
}
