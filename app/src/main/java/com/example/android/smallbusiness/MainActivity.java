package com.example.android.smallbusiness;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenAddressButton(View v) {
        Uri webpage = Uri.parse("https://www.google.com/maps/place/Huaguoyuan+Residential+District,+Nanming,+Guiyang,+Guizhou,+China,+550000/@26.5648073,106.6859322,15z/data=!3m1!4b1!4m5!3m4!1s0x36bf6793d2876eb1:0x46bde59b12b23fdc!8m2!3d26.564808!4d106.694687");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

