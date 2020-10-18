package com.sashantgroup.fafwiki;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.sashantgroup.fafwiki.lang.ConverterLang;
import com.sashantgroup.fafwiki.lang.Lang;
import com.sashantgroup.fafwiki.units.ConverterUnits;
import com.sashantgroup.fafwiki.units.Units;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    public static String fraction = null;
    private static String fileBP = "blueprints.json";
    private static String fileLang = "localization.json";
    public static Units[] dataUnits;
    public static Lang dataLang;
    public static int color, progress = 1;
    public static String lang;
    ProgressBar progressBar;
    TextView textInfo;
    SharedPreferences prefs;
    Toast toast;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefs = getSharedPreferences("config", Context.MODE_PRIVATE);
        progressBar = findViewById(R.id.progressBar);
        textInfo = findViewById(R.id.textInfo);

        if (prefs.getString(APP_OPS_SERVICE, "").equals("")) {
            lang = "US";
            onPause();
        }

        Thread threadUnit = new Thread(() -> {
            LoadDatabaseUnit();
            Thread threadLang = new Thread(() -> LoadDatabaseLang());
            threadLang.start();
            runOnUiThread(loadEndDB);
        });
        threadUnit.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id) {
            case R.id.action_us:
                lang = "US";
                textToast("Selected english language!");
                return true;
            case R.id.action_ru:
                lang = "RU";
                textToast("Выбран русский язык!");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void textToast(String str) {
        toast = Toast.makeText(this,
                str, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 10);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(APP_OPS_SERVICE, lang).apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (prefs.contains(APP_OPS_SERVICE)) {
            lang = prefs.getString(APP_OPS_SERVICE, "");
        }
    }

    private Runnable loadEndDB = new Runnable() {
        @Override
        public void run() {
            Button[] buttons = { findViewById(R.id.aeonBut),
                    findViewById(R.id.uefBut),
                    findViewById(R.id.cybranBut),
                    findViewById(R.id.seraphimBut) };

            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setVisibility(View.VISIBLE);
            }

            progressBar.setVisibility(View.INVISIBLE);
            textInfo.setVisibility(View.INVISIBLE);
        }
    };

    public void FractionButton(View view) {
        Button button = (Button)view;
        fraction = button.getText().toString();

        switch (fraction){
            case "Aeon":
                color = Color.parseColor("#388E3C");
                break;
            case "UEF":
                color = Color.parseColor("#1976D2");
                break;
            case "Cybran":
                color = Color.parseColor("#912626");
                break;
            case "Seraphim":
                color = Color.parseColor("#FFA000");
                break;
            case "Nomads":
                color = Color.parseColor("#E65C00");
                break;
            default:
                color = Color.WHITE;
                break;
        }

        Intent intent = new Intent(MainActivity.this, UnitsDraw.class);
        startActivity(intent);
    }

    private void LoadDatabaseUnit() {
        try {
            String file = fileBP;
            String jsonStr;

            InputStream inputStream = this.getAssets().open(file);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            jsonStr = new String(buffer, "UTF-8");

            HandleMsg(handlerTxtInfo,"Key", "Please wait! Loading data from JSON file...");
            if (jsonStr != null) dataUnits = ConverterUnits.fromJsonString(jsonStr);
            else throw new NullPointerException("Exception: Units JSON-string is null!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void LoadDatabaseLang() {
        try {
            String file = fileLang;
            String jsonStr;

            InputStream inputStream = this.getAssets().open(file);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            jsonStr = new String(buffer, "UTF-8");

            if (jsonStr != null) dataLang = ConverterLang.fromJsonString(jsonStr);
            else throw new NullPointerException("Exception: Lang JSON-string is null!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressLint("HandlerLeak")
    Handler handlerTxtInfo = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Bundle bundle = msg.getData();
            String data = bundle.getString("Key");
            TextView infoTextView = findViewById(R.id.textInfo);
            infoTextView.setText(data);
        }
    };

    private void HandleMsg(Handler handler, String key, String str) {
        Message msg = handler.obtainMessage();
        Bundle bundle = new Bundle();
        String info = str;
        bundle.putString(key, info);
        msg.setData(bundle);
        handler.sendMessage(msg);
    }
}