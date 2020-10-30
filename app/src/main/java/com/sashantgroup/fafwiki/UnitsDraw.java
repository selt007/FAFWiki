package com.sashantgroup.fafwiki;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.sashantgroup.fafwiki.lang.Lang;
import com.sashantgroup.fafwiki.units.General;
import com.sashantgroup.fafwiki.units.Unit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class UnitsDraw extends AppCompatActivity {
    public static Unit unitInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_units);
        EditText txtSearch = findViewById(R.id.search);
        txtSearch.setVisibility(View.INVISIBLE);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        MainActivity.translator = new Translator(this);

        Unit[] data = MainActivity.dataUnits;
        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        for (final Unit attr : data) {
            General general = attr.getGeneral();
            if (general.getFactionName().toValue().toLowerCase()
                    .contains(MainActivity.fraction.toLowerCase())) {
                String name = "";
                final Button button = new Button(this);
                String id = attr.getID().toUpperCase();
                try {
                    name = MainActivity.translator.Attempt(id);//attr.getDescription().substring(18);
                } catch (Exception e) { }

                if (name == "") {
                    name = attr.getDescription().substring(18);
                }
                button.setText(name);
                button.setBackgroundColor(MainActivity.color);
                button.setTextColor(Color.parseColor("#FFFFFF"));

                icoPath(this, button, "strategic/" + attr.getStrategicIconName() + "_rest.png");

                button.setOnClickListener(v -> {
                    unitInfo = attr;
                    Intent intent = new Intent(UnitsDraw.this, UnitInfo.class);
                    startActivity(intent);
                });
                linearLayout.addView(button, ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
            }

            final EditText editText = findViewById(R.id.search);
            editText.setEnabled(false);
        }
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
}
