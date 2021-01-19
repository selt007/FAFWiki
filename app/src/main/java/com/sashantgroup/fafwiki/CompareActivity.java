package com.sashantgroup.fafwiki;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.sashantgroup.fafwiki.ui.main.SectionsPagerAdapter;

public class CompareActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        TabLayout tabs = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.view_pager);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fabDelete = findViewById(R.id.fabDelete);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = MainActivity.adRequest;
        mAdView.loadAd(adRequest);

        fabDelete.setOnClickListener(v -> {
            if (MainActivity.tabNameList.size() == 0)
                Snackbar.make((findViewById(R.id.linearLayout2)),
                        MainActivity.mapMain.get("deletedCompare"), Snackbar.LENGTH_SHORT).show();
                //MainActivity.textToast(MainActivity.mapMain.get("deletedCompare"), this);
            else {
                int selected = tabs.getSelectedTabPosition();
                MainActivity.tabNameList.remove(selected);
                MainActivity.tabContentList.remove(selected);
                viewPager.setAdapter(sectionsPagerAdapter);
                tabs.setupWithViewPager(viewPager);
                Snackbar.make((findViewById(R.id.linearLayout2)),
                        MainActivity.mapMain.get("delCompare"), Snackbar.LENGTH_SHORT).show();
                //MainActivity.textToast(MainActivity.mapMain.get("delCompare"), this);
            }
        });
    }
}