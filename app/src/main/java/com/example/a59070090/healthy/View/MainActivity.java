package com.example.a59070090.healthy.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a59070090.healthy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.main_view, new LoginFragment()).commit();
        }


        //setContentView(R.layout.activity_main);
//        setContentView(R.layout.fregment_login);
//        setContentView(R.layout.fregment_register); //ตั้งค่าหน้าแรกของแอป
    }
}
