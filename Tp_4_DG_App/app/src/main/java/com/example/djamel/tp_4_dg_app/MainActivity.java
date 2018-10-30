package com.example.djamel.tp_4_dg_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this,"BOOM :o ",Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void my_brawser(View view) {

        Uri url = Uri.parse("http://www.google.com");
        Intent intentMybrwser = new Intent(Intent.ACTION_VIEW, url);
        startActivity(intentMybrwser);
        Toast.makeText(this,"My browser ",Toast.LENGTH_LONG).show();

    }
}
