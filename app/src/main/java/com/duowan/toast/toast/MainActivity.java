package com.duowan.toast.toast;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast();
        getStringResToast();
    }

    public void Toast(){
        Toast.makeText(MainActivity.this,"MainActivity",Toast.LENGTH_SHORT).show();
    }


    public void getStringResToast(){
        Toast.makeText(MainActivity.this,R.string.action_settings,Toast.LENGTH_SHORT).show();
    }

}
