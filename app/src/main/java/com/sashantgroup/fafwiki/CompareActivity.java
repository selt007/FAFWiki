package com.sashantgroup.fafwiki;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CompareActivity extends TabActivity {
    public static ArrayList<TabHost.TabSpec> tabSpecList = new ArrayList<>();
    private AdView mAdView;
    public static TabHost tabHost;
    static boolean start = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        tabHost = getTabHost();
        drawTabs();

        FloatingActionButton fabMinus = findViewById(R.id.fabMinus);
        fabMinus.setOnClickListener(v -> {
            if (tabHost.getCurrentTab() > -1) {
                tabSpecList.remove(tabHost.getCurrentTab());
                tabHost.clearAllTabs();
                drawTabs();
                MainActivity.textToast(MainActivity.mapMain.get("delCompare"), this);
            }
            else
                MainActivity.textToast(MainActivity.mapMain.get("deletedCompare"), this);
        });

        FloatingActionButton fabBack = findViewById(R.id.fabBack);
        fabBack.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        if (!start) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            start = true;
        }
        else {
            fabMinus.setVisibility(View.VISIBLE);
            fabBack.setVisibility(View.VISIBLE);
            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = MainActivity.adRequest;
            mAdView.loadAd(adRequest);
        }
    }

    private void drawTabs() {
        if (tabSpecList != null) {
            for (TabHost.TabSpec tab : tabSpecList) {
                tabHost.addTab(tab);
            }
        }
    }
}