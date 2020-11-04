package com.sashantgroup.fafwiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView textAbout = findViewById(R.id.textAbout);
        TextView textAboutSpec = findViewById(R.id.textAboutSpec);
        TextView mLink = findViewById(R.id.textLink);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
        textAbout.setText(MainActivity.mapMain.get("about"));
        textAboutSpec.setText(MainActivity.mapMain.get("aboutSpec"));
    }
}