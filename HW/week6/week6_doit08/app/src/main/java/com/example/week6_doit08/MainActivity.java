package com.example.week6_doit08;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final int MENU_CODE_LOGIN = 10001;

    EditText edtId, edtPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DOIT08 2018038045 주시원");

        edtId = findViewById(R.id.edtId);
        edtPwd = findViewById(R.id.edtPwd);
        Button btnLogin = findViewById(R.id.btnLogin);

        Intent intent = getIntent();
        String prev = null;

        try {
            prev = intent.getExtras().getString("from");
            Toast.makeText(getApplicationContext(), prev + " -> Main", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){

        }
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtId.getText().toString().replace(" ", "").equals("") || edtPwd.getText().toString().replace(" ", "").equals("") ) {
                    Toast.makeText(getApplicationContext(), "회원 정보를 확인해주세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    moveActivity();
                }
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
        intent.putExtra("from", "Main");
        startActivityResult.launch(intent);
        finish();
    }
}