package com.sashantgroup.fafwiki;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.snackbar.Snackbar;
import com.sashantgroup.fafwiki.units.General;
import com.sashantgroup.fafwiki.units.Unit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class UnitsDrawActivity extends AppCompatActivity {
    public static Unit unitInfo;
    Unit[] data = MainActivity.dataUnits;
    LinearLayout linearLayout;
    private AdView mAdView;
    ArrayList<Button> arrayListUnit;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_units);
        EditText txtSearch = findViewById(R.id.search);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = MainActivity.adRequest;
        mAdView.loadAd(adRequest);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        MainActivity.translatorJson = new TranslatorJson(this);
        linearLayout = findViewById(R.id.linearLayout);
        arrayListUnit = new ArrayList<>();

        for (final Unit attr : data) {
            General general = attr.getGeneral();
            if (general.getFactionName().toValue().toLowerCase()
                    .contains(MainActivity.fraction)) {
                String name = "";
                final Button button = new Button(this);
                String id = attr.getID().toLowerCase();
                try {
                    name = MainActivity.translatorJson.Attempt(id);
                } catch (Exception e) { }
                button.setText(name);
                button.setBackgroundColor(MainActivity.color);
                button.setTextColor(Color.parseColor("#FFFFFF"));

                icoPath(this, button, "strategic/" + attr.getStrategicIconName() + "_rest.png");

                button.setOnTouchListener(new View.OnTouchListener() {
                    long lastAction = 0L;
                    @Override
                    public boolean onTouch(View v, MotionEvent e) {
                        long currTime = SystemClock.uptimeMillis();
                        switch (e.getActionMasked()) {
                            case MotionEvent.ACTION_DOWN:
                                lastAction = currTime;
                                break;
                            case MotionEvent.ACTION_UP:
                                if (currTime - lastAction >= 350L) {
                                    String id = attr.getID().toLowerCase();
                                    String tabName = MainActivity.translatorJson.Attempt(id);

                                    MainActivity.tabNameList.add(tabName);
                                    MainActivity.tabContentList.add(attr);
                                    unitInfo = attr;
                                    Snackbar.make((findViewById(R.id.mainLayout)),
                                            MainActivity.mapMain.get("addCompare"), Snackbar.LENGTH_SHORT).show();
                                }
                                else {
                                    unitInfo = attr;
                                    Intent intent = new Intent(UnitsDrawActivity.this, UnitInfoActivity.class);
                                    startActivity(intent);
                                }
                                break;
                        }
                        return true;
                    }
                });
                arrayListUnit.add(button);
            }
        }

        initUnit("");
        txtSearch.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {
                initUnit(txtSearch.getText().toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

    public void initUnit(String query) {
        linearLayout.removeAllViews();
        if (query.equals(""))
            for (Button but : arrayListUnit)
                linearLayout.addView(but, ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        else {
            for (Button but : arrayListUnit) {
                if (but.getText().toString().toLowerCase().contains(query) ||
                        but.getText().toString().contains(query) ||
                        but.getText().toString().toUpperCase().contains(query)) {
                    linearLayout.addView(but, ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);
                }
            }
        }
        TextView textView = new TextView(this);
        textView.setTextSize(14);
        textView.setText("\n\n");
        linearLayout.addView(textView, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void DrawImage(Context context, Button button, String icoName) throws IOException {
        InputStream inputStream = context.getAssets().open(icoName);
        Drawable img = Drawable.createFromStream(inputStream, null);
        img.setBounds(30, 0, 90, 60);
        button.setCompoundDrawables(img, null, null, null);
    }

    public String icoPath(Context context, Button button, String nameIco) {
        String icoName = nameIco;
        try {
            DrawImage(context, button, icoName);
        }
        catch(Exception ignored) {
            try {
                DrawImage(context, button, "icons/error.png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return icoName;
    }

    private void textToast(String str) {
        Toast toast;
        toast = Toast.makeText(this,
                str, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 40);
        toast.show();
    }
}
