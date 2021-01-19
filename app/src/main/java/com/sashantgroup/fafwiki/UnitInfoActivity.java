package com.sashantgroup.fafwiki;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.sashantgroup.fafwiki.units.Defense;
import com.sashantgroup.fafwiki.units.Economy;
import com.sashantgroup.fafwiki.units.Enhancements;
import com.sashantgroup.fafwiki.units.Intel;
import com.sashantgroup.fafwiki.units.Physics;
import com.sashantgroup.fafwiki.units.Shield;
import com.sashantgroup.fafwiki.units.Unit;
import com.sashantgroup.fafwiki.units.UnitAir;
import com.sashantgroup.fafwiki.units.Weapon;
import com.sashantgroup.fafwiki.units.Wreckage;

import org.xmlpull.v1.XmlPullParser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UnitInfoActivity extends AppCompatActivity {
    Unit info = UnitsDrawActivity.unitInfo;
    private AdView mAdView;
    String tabName;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_unit);
        info = UnitsDrawActivity.unitInfo;

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = MainActivity.adRequest;
        mAdView.loadAd(adRequest);

        LinearLayout linearLayout3 = findViewById(R.id.linearLayout3);
        ImageView view = findViewById(R.id.imageView3);
        TextView textMainInfo = findViewById(R.id.textMainInfo);
        InputStream inputStream;

        try {
            String imgBG = "preview_background/" + info.getGeneral().getIcon().name().toLowerCase() + "_up.png";
            String imgUnit = "preview/" + info.getID() + ".png";

            inputStream = getApplicationContext().getAssets().open(imgBG);
            Bitmap bmBG = BitmapFactory.decodeStream(inputStream);
            inputStream = getApplicationContext().getAssets().open(imgUnit);
            Bitmap bmUnit = BitmapFactory.decodeStream(inputStream);
            view.setImageBitmap(UnitDataView.overlayBitmapToCenter(bmBG, bmUnit));
        }
        catch(Exception ignored) {
            try {
                inputStream = getApplicationContext().getAssets().open("icons/error.png");
                Bitmap bmBG = BitmapFactory.decodeStream(inputStream);
                view.setImageBitmap(bmBG);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FloatingActionButton fab = findViewById(R.id.fabPlus);
        fab.setOnClickListener(v -> {
            String id = info.getID().toLowerCase();
            tabName = MainActivity.translatorJson.Attempt(id);

            MainActivity.tabNameList.add(tabName);
            MainActivity.tabContentList.add(info);
            //MainActivity.textToast(MainActivity.mapMain.get("addCompare"), this);
            Snackbar.make((findViewById(R.id.scrollView3)),
                    MainActivity.mapMain.get("addCompare"), Snackbar.LENGTH_SHORT).show();
        });

        UnitDataView udv = new UnitDataView(UnitsDrawActivity.unitInfo, this);
        udv.displayAllInfo(linearLayout3, textMainInfo);
    }
}
