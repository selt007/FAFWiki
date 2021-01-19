package com.sashantgroup.fafwiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.sashantgroup.fafwiki.units.Converter;
import com.sashantgroup.fafwiki.units.Unit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    public static ArrayList<String> tabNameList;
    public static ArrayList<Unit> tabContentList;
    public static TranslatorMap translatorMap = new TranslatorMap();
    private static String fileBP = "blueprints.json";
    public static int color, progress = 1;
    public static Map<String, String> mapMain;
    public static String fraction;
    public static Unit[] dataUnits;
    public static TranslatorJson translatorJson;
    public static String lang;
    public static AdRequest adRequest;
    private static boolean start = false;
    FloatingActionButton fab;
    ProgressBar progressBar;
    TextView textInfo;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.fab);

        mAdView = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        prefs = getSharedPreferences("config", Context.MODE_PRIVATE);
        progressBar = findViewById(R.id.progressBar);
        textInfo = findViewById(R.id.textInfo);

        if (prefs.getString(APP_OPS_SERVICE, "").equals("")) {
            lang = "US";
            onPause();
        }

        if (!start) {
            tabNameList = new ArrayList<>();
            tabContentList = new ArrayList<>();
            start = true;
        }

        Thread threadUnit = new Thread(() -> {
            LoadDatabaseUnit();
            runOnUiThread(loadEndDB);
        });
        threadUnit.start();

        fab.setOnClickListener(v -> {
            Intent intent = new Intent(this, CompareActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        TranslatorJson translatorJson = new TranslatorJson(this);
        try {
            translatorJson.selectLang("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        menu.getItem(0).setTitle(mapMain.get("action_language"));
        menu.getItem(1).setTitle(mapMain.get("action_about"));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id) {
            case R.id.action_us:
                lang = "US";
                textToast("Selected english language!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Selected english language!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_ru:
                lang = "RU";
                //textToast("Выбран русский язык!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Выбран русский язык!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_cz:
                lang = "CZ";
                //textToast("Byl vybrán jazyk Chezh!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Byl vybrán jazyk Chezh!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_de:
                lang = "DE";
                //textToast("Deutsche Sprache ausgewählt!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Deutsche Sprache ausgewählt!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_es:
                lang = "ES";
                //textToast("Español seleccionado!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Español seleccionado!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_fr:
                lang = "FR";
                //textToast("Langue française sélectionnée!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Langue française sélectionnée!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_it:
                lang = "IT";
                //textToast("Lingua italiana selezionata!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Lingua italiana selezionata!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_pl:
                lang = "PL";
                //textToast("Wybrano język polski!",this);
                Snackbar.make((findViewById(R.id.aeonBut)),
                        "Wybrano język polski!", Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.action_about:
                FragmentManager manager = getSupportFragmentManager();
                DialogFragment dialogFragment = new DialogFragment();
                dialogFragment.show(manager, "dialog");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static void textToast(String str, Context context) {
        Toast toast;
        toast = Toast.makeText(context,
                str, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 140);
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
                    //findViewById(R.id.nomandsBut) };

            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setVisibility(View.VISIBLE);
            }
            fab.setVisibility(View.VISIBLE);

            progressBar.setVisibility(View.INVISIBLE);
            textInfo.setVisibility(View.INVISIBLE);
        }
    };

    public void FractionButton(View view) {
        Button button = (Button)view;
        fraction = button.getText().toString().toLowerCase();

        switch (fraction){
            case "aeon":
                color = Color.parseColor("#388E3C");
                break;
            case "uef":
                color = Color.parseColor("#1976D2");
                break;
            case "cybran":
                color = Color.parseColor("#912626");
                break;
            case "seraphim":
                color = Color.parseColor("#FFA000");
                break;
            case "nomads":
                color = Color.parseColor("#E65C00");
                break;
            default:
                color = Color.WHITE;
                break;
        }
        Intent intent = new Intent(this, UnitsDrawActivity.class);
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
            if (jsonStr != null) dataUnits = Converter.fromJsonString(jsonStr);
            else throw new NullPointerException("Exception: Units JSON-string is null!");
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