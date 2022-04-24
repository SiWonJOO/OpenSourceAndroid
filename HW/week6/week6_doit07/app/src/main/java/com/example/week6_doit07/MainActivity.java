package com.example.week6_doit07;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final int MENU_CODE_LOGIN = 10001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("DOIT07 2018038045 주시원");
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveActivity();
            }
        });
    }

    ActivityResultLauncher startActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {

        }
    });

    public void moveActivity(){
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivityResult.launch(intent);
    }

}