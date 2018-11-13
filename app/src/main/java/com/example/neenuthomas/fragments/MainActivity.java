package com.example.neenuthomas.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rgp;
    private RadioButton rtemple;
    private String radioButtonText;
    private Button btnshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgp = findViewById(R.id.rgp1);
        btnshow = findViewById(R.id.btn1);
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rgp.getCheckedRadioButtonId();
                rtemple = (RadioButton) findViewById(selectedId);
                radioButtonText = rtemple.getText().toString();
                Fragment fragment;
                switch (radioButtonText){
                    case "Temple":
                        // Toast.makeText(MainActivity.this, "this is" + radioButtonText, Toast.LENGTH_LONG).show();
                        fragment = new fragment1();

                        FragmentManager fm = getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fragment, fragment);
                        ft.commit();
                        break;
                    case "church":
                        fragment = new fragment2();

                        FragmentManager fm1 = getSupportFragmentManager();
                        FragmentTransaction ft1 = fm1.beginTransaction();
                        ft1.replace(R.id.fragment, fragment);
                        ft1.commit();
                        break;
                }
            }
        });
    }}
