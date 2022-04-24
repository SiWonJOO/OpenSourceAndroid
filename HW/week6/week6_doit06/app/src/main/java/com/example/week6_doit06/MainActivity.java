package com.example.week6_doit06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {
        SeekBar seekBar;
        ProgressBar progressBar;
        EditText editText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DOIT06 2018038045 주시원");

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        editText = (EditText) findViewById(R.id.editText);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean User) {
                progressBar.setProgress(progress);
                editText.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}