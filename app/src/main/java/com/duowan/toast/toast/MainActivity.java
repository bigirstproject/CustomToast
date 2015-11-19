package com.duowan.toast.toast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast();
        getStringResToast();
    }

    public void Toast() {
        Toast.makeText(MainActivity.this, "MainActivity", Toast.LENGTH_SHORT).show();
    }


    public void getStringResToast() {
        Toast.makeText(MainActivity.this, R.string.app_name, Toast.LENGTH_SHORT).show();
    }

}
