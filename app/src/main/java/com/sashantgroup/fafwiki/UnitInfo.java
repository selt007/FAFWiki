package com.sashantgroup.fafwiki;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sashantgroup.fafwiki.units.AdvancedEngineering;
import com.sashantgroup.fafwiki.units.Defense;
import com.sashantgroup.fafwiki.units.Economy;
import com.sashantgroup.fafwiki.units.Enhancements;
import com.sashantgroup.fafwiki.units.Intel;
import com.sashantgroup.fafwiki.units.Physics;
import com.sashantgroup.fafwiki.units.Shield;
import com.sashantgroup.fafwiki.units.UnitAir;
import com.sashantgroup.fafwiki.units.Unit;
import com.sashantgroup.fafwiki.units.Weapon;
import com.sashantgroup.fafwiki.units.Wreckage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class UnitInfo extends AppCompatActivity {
    Unit info = UnitsDraw.unitInfo;
    UnitsDraw unitsDraw = new UnitsDraw();
    LinearLayout linearLayout3;
    LinearLayout.LayoutParams layoutParamsBut;
    LinearLayout.LayoutParams layoutParamsHeader;
    LinearLayout.LayoutParams layoutParamsWrap;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_unit);

        linearLayout3 = findViewById(R.id.linearLayout3);
        layoutParamsBut = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,110);
        layoutParamsBut.weight = 1;
        layoutParamsHeader = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,60);
        layoutParamsWrap = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
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
            view.setImageBitmap(overlayBitmapToCenter(bmBG, bmUnit));
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
        displayUnitlistUnit(textMainInfo);
        displayUnitEconomy();
        displayUnitAbilities();
        displayUnitPhysics();
        displayUnitSupport();
        displayUnitWreckage();
        displayUnitlistArmies();
        //displayVeterancy();
        displayWeaponList();
        displayEnchancements();
    }

    private void displayEnchancements() {
        if (info.getEnhancements() != null) {
            Enhancements enchancements = info.getEnhancements();
            TextView header = setParamsText("ENHANCEMENTS");
            linearLayout3.addView(header, layoutParamsHeader);
            LinearLayout linLayEco = new LinearLayout(this);
            String strEnchancements = null;

            String icoPath = "enhancements/";
            switch (info.getGeneral().getFactionName().toValue().toLowerCase()) {
                case "aeon":
                    icoPath += "Aeon/";
                    break;
                case "uef":
                    icoPath += "Cybran/";
                    break;
                case "cybran":
                    icoPath += "Nomads/";
                    break;
                case "seraphim":
                    icoPath += "Seraphim/";
                    break;
                case "nomads":
                    icoPath += "UEF/";
                    break;
            }
            if (enchancements.getAdvancedEngineering() != null) {
                AdvancedEngineering advancedEngineering = enchancements.getAdvancedEngineering();
                strEnchancements += MainActivity.translator.Attempt(advancedEngineering.getName()) + "\n";
                strEnchancements += "Mass:" + advancedEngineering.getBuildCostMass() + "\n";
                strEnchancements += "Energy:" + advancedEngineering.getBuildCostEnergy() + "\n";
                strEnchancements += "Time:" + advancedEngineering.getBuildTime() + "\n";
                strEnchancements += advancedEngineering.getNewBuildRate() != null ? "Build rate: " + advancedEngineering.getNewBuildRate() + "\n" : "";
                strEnchancements += advancedEngineering.getNewDamageRadiusMod() != null ? "Damage Radius: " + advancedEngineering.getNewDamageRadiusMod() + "\n" : "";
                strEnchancements += advancedEngineering.getNewHealth() != null ? "New Health: " + advancedEngineering.getNewHealth() + "\n" : "";
                strEnchancements += advancedEngineering.getNewRateOfFire() != null ? "Rate Of Fire: " + advancedEngineering.getNewRateOfFire() + "\n" : "";
                strEnchancements += advancedEngineering.getNewRegenRate() != null ? "Regen Rate:" + advancedEngineering.getNewRegenRate() + "\n" : "";
                strEnchancements += advancedEngineering.getNewVisionRadius() != null ? "Vision Radius: " + advancedEngineering.getNewVisionRadius() + "\n" : "";
            }
        }
    }

    private void displayWeaponList() {
        Weapon[] weapons = info.getWeapon();
        if(weapons != null) {
            StringBuilder strInfoBuilder = new StringBuilder("");
            strInfoBuilder.append("\nWEAPONS\n");
            for (Weapon weapon : weapons) {
                if (weapon != null) {
                    if(weapon.getDisplayName() != null ) strInfoBuilder.append("Weapon Name: " + weapon.getDisplayName() + "\n");
                    if(weapon.getWeaponCategory() != null) strInfoBuilder.append("Weapon category: " + weapon.getWeaponCategory().toValue() + "\n");
                    if(weapon.getDamageType() != null) strInfoBuilder.append("Damage type: " + weapon.getDamageType().toValue() + "\n");
                    if(Optional.ofNullable(weapon.getDamage()).orElse(0d) != 0) strInfoBuilder.append("Damage: " + weapon.getDamage() + "\n");
                    if(Optional.ofNullable(weapon.getRateOfFire()).orElse(0d) != 0) strInfoBuilder.append("Firerate p/s: " + weapon.getRateOfFire() + "\n");
                    if(Optional.ofNullable(weapon.getDamageRadius()).orElse(0d) != 0) strInfoBuilder.append("Damage radius: " + weapon.getDamageRadius() + "\n");
                    if(Optional.ofNullable(weapon.getEffectiveRadius()).orElse(0l) != 0) strInfoBuilder.append("Effective radius: " + weapon.getEffectiveRadius() + "\n");
                    //if(weapon.getEnergyRequired() != null) strInfoBuilder.append("Energy required: " + weapon.getEnergyRequired() + "\n");
                    if(Optional.ofNullable(weapon.getEnergyDrainPerSecond()).orElse(0l) != 0) strInfoBuilder.append("Energy drain p/s: " + weapon.getEnergyDrainPerSecond() + "\n");

                    strInfoBuilder.append("\r\n");
                }
            }
        }
    }

    private String displayVeterancy(String strInfo) {
        Defense defense = info.getDefense();
        String strInfoVeterancy = "";
        if (defense.getHealth() != 0 || defense.getRegenRate() != null) {
            try {
                String id = info.getID().toUpperCase();
                strInfoVeterancy += "\nVETERANCY\n";

                if (id.equals("UAL0001") || id.equals("UAL0301") ||
                        id.equals("UEL0001") || id.equals("UEL0301") ||
                        id.equals("URL0001") || id.equals("URL0301") ||
                        id.equals("XS0001") || id.equals("XSL0301")) {
                    strInfoVeterancy += "T2\n";
                }
                for (int i = 0; i < 5; i++) {
                    strInfoVeterancy += (info.getEconomy().getBuildCostMass() != 0 ? (i + 1) + " lvl: " +
                            (i + 1) * (info.getEconomy().getBuildCostMass()) + "\t\t" +
                            ((defense.getHealth()) + Math.round((defense.getHealth()) *
                                    (0.1 * (i + 1)))) + "HP + " + ((defense.getRegenRate()) + 3 * (i + 1)) + "/s\t\t\n" : "");
                }
            }
            catch (Exception e) { strInfoVeterancy = ""; }
        }
        return strInfo + strInfoVeterancy;
    }

    private void displayUnitlistArmies() {
        if (info.getEconomy().getBuildableCategory() != null) {
            ArrayList<Unit> buildable = new ArrayList<>();
            for (Unit unit : MainActivity.dataUnits) {
                for (String buildCat : info.getEconomy().getBuildableCategory()) {
                    String[] buildReq = buildCat.split(" ");
                    boolean canBuild = true;
                    for (String req : buildReq) {
                        List<String> list = Arrays.asList(unit.getCategories());
                        if (!list.contains(req) && req.toUpperCase() != unit.getID().toUpperCase()) {
                            canBuild = false;
                        }
                    }
                    if (canBuild) {
                        buildable.add(unit);
                    }
                }
            }
            buildable = new ArrayList<>(new HashSet<>(buildable));
            if (buildable.size() > 0) {
                TextView header = setParamsText("BLUEPRINTS");
                linearLayout3.addView(header, layoutParamsHeader);
                for (Unit buildUnit : buildable) {
                    String name = MainActivity.translator.Attempt(buildUnit.getID())
                            .replace("null", "");
                    if (!name.equals("")) {
                        Button butBlueprint = setParamsButton(name, "#4B4B4B",
                                "strategic/" + buildUnit.getStrategicIconName() + "_rest.png");
                        butBlueprint.setTextSize(14);
                        linearLayout3.addView(butBlueprint, layoutParamsWrap);
                    }
                }
            }
        }
    }

    private void displayUnitWreckage() {
        Wreckage wreckage = info.getWreckage();
        try {
            if (wreckage != null) {
                double hpMul = wreckage.getHealthMult();
                double massMul = wreckage.getMassMult();
                TextView header = setParamsText("WRECKAGE");
                linearLayout3.addView(header, layoutParamsHeader);
                String strWreckage = null;
                strWreckage += (wreckage.getHealthMult() != 0 ?
                        "HP: " + Math.round(info.getDefense().getHealth()
                                * hpMul) + " (" + hpMul * 100 + "%)\t\t" : "");
                strWreckage += (wreckage.getMassMult() != 0 ?
                        "Mass: " + Math.round(info.getEconomy().getBuildCostMass()
                                * hpMul * massMul) + " (" + massMul * hpMul * 100 + "%)\n" : "");
                TextView txtWreckage = setParamsText(strWreckage);
                txtWreckage.setTextSize(14);
                linearLayout3.addView(txtWreckage, layoutParamsWrap);
            }
        } catch (Exception ignored) { }
    }

    private void displayUnitSupport() {
        Intel intel = info.getIntel();
        if (intel != null) {
            TextView header = setParamsText("SUPPORT");
            linearLayout3.addView(header, layoutParamsHeader);
            LinearLayout linLayEco = new LinearLayout(this);
            if (intel.getVisionRadius() != null) {
                Button butVision = setParamsButton("Vision: " + intel.getVisionRadius(), "#631111", null);
                linLayEco.addView(butVision, layoutParamsBut);
            }
            if (intel.getRadarRadius() != null) {
                Button butRadar = setParamsButton("Radar: " + intel.getRadarRadius(), "#063A03", null);
                linLayEco.addView(butRadar, layoutParamsBut);
            }
            if (intel.getSonarRadius() != null) {
                Button butSonar = setParamsButton("Sonar: " + intel.getSonarRadius(), "#0C656E", null);
                linLayEco.addView(butSonar, layoutParamsBut);
            }
            linearLayout3.addView(linLayEco, layoutParamsBut);

            if (intel.getRadarStealth() != null || intel.getRadarStealthFieldRadius() != null ||
                    info.getDefense() != null || intel.getWaterVisionRadius() != null || intel.getOmniRadius() != null) {
                String strSupport = null;
                strSupport += (intel.getRadarStealth() != null
                        ? "Radar stealth: " + intel.getRadarStealthFieldRadius() + "\n" : "");
                strSupport += (intel.getSonarStealth() != null
                        ? "Radar stealth: " + intel.getSonarStealthFieldRadius() + "\n" : "");
                Shield shield = info.getDefense().getShield();
                strSupport += (shield != null
                        ? "Shield size: " + shield.getShieldSize() + "\n" +
                        "Regen assist mult: " + shield.getRegenAssistMult() + "\n" +
                        "Shield regen start time: " + shield.getShieldRegenStartTime() + "\n" : "");
                TextView txtSupport = setParamsText(strSupport);
                txtSupport.setTextSize(14);
                linearLayout3.addView(txtSupport, layoutParamsWrap);
            }
        }
    }

    private void displayUnitPhysics() {
        Physics physics = info.getPhysics();
        if (physics.getMaxSpeed() != null) {
            TextView header = setParamsText("PHYSICS");
            linearLayout3.addView(header, layoutParamsHeader);
            String strInfoPhysics = null;
            strInfoPhysics += (physics.getTurnRate() != null
                    ? physics.getTurnRate() != 0
                    ? "Turn rate: " + physics.getTurnRate() + " °/s\n" : "" : "");
            strInfoPhysics += (physics.getMaxSpeed() != null
                    ? "Max speed: " + physics.getMaxSpeed() + "\n" : "");
            strInfoPhysics += (physics.getFuelRechargeRate() != null
                    ? "Fuel refill rate: " + physics.getFuelRechargeRate() + "\n" : "");
            strInfoPhysics += (physics.getFuelUseTime() != null
                    ? "Fuel use time: " + physics.getFuelUseTime() + " s\n" : "");
            strInfoPhysics += (physics.getLandSpeedMultiplier() != null
                    ? physics.getLandSpeedMultiplier() != 1
                    ? "Land speed multiplier: " + physics.getLandSpeedMultiplier() * 100 + "%\n" : "" : "");

            UnitAir air = info.getAir();
            if (air != null) {
                strInfoPhysics += (air.getTurnSpeed() != null
                        ? "Turn speed: " + air.getTurnSpeed() + "\n" : "");
                strInfoPhysics += (air.getMaxAirspeed() != 0
                        ? "Max air speed: " + air.getMaxAirspeed() + "\n" : "");
                strInfoPhysics += (air.getEngageDistance() != null
                        ? "Engage Distance: " + air.getEngageDistance() + "\n" : "");
                strInfoPhysics += (air.getMinAirspeed() != null
                        ? "Min air speed: " + air.getMinAirspeed() + "\n" : "");
                strInfoPhysics += (air.getCombatTurnSpeed() != null
                        ? "Combat turn speed: " + air.getCombatTurnSpeed() + "\n" : "");
            }
            TextView txtInfoPhysics = setParamsText(strInfoPhysics);
            txtInfoPhysics.setTextSize(14);
            linearLayout3.addView(txtInfoPhysics, layoutParamsWrap);
        }
    }

    private void displayUnitAbilities() {
        if (info.getDisplay() != null) {
            String[] abilities = info.getDisplay().getAbilities();
            if (abilities != null) {
                TextView header = setParamsText("ABILITIES");
                linearLayout3.addView(header, layoutParamsHeader);
                String strAllAbility = null;
                for (String ability : abilities) {
                    strAllAbility += "[ " + MainActivity.translator.Attempt(ability) + " ]\t\t";
                }
                TextView textAbility = setParamsText(strAllAbility);
                textAbility.setTextSize(14);
                linearLayout3.addView(textAbility, layoutParamsWrap);
            }
        }
    }

    private void displayUnitEconomy() {
        Economy eco = info.getEconomy();
        if (eco.getBuildCostEnergy() != 0 || eco.getBuildCostMass() != 0 || eco.getBuildTime() != 0) {
            TextView header = setParamsText("BUILD COSTS");
            linearLayout3.addView(header, layoutParamsHeader);
            LinearLayout linLayEco = new LinearLayout(this);
            if (eco.getBuildCostEnergy() != 0) {
                Button butEnergy = setParamsButton(eco.getBuildCostEnergy()+"", "#705B27", "icons/energy.png");
                linLayEco.addView(butEnergy, layoutParamsBut);
            }
            if (eco.getBuildCostMass() != 0) {
                Button butMass = setParamsButton(eco.getBuildCostMass()+"", "#4D814A", "icons/mass.png");
                linLayEco.addView(butMass, layoutParamsBut);
            }
            if (eco.getBuildTime() != 0) {
                Button butTime = setParamsButton(eco.getBuildTime()+"", "#858585", "icons/time.png");
                linLayEco.addView(butTime, layoutParamsBut);
            }
            linearLayout3.addView(linLayEco, layoutParamsBut);
        }
        if (eco.getProductionPerSecondEnergy() != null || eco.getProductionPerSecondMass() != null || eco.getBuildRate() != null) {
            TextView header = setParamsText("YIELD / DRAIN");
            LinearLayout linLayEco = new LinearLayout(this);
            if (eco.getProductionPerSecondEnergy() != null) {
                Button butEnergy = setParamsButton(eco.getProductionPerSecondEnergy()+"", "#705B27", "icons/energy.png");
                linLayEco.addView(butEnergy, layoutParamsBut);
            }
            if (eco.getProductionPerSecondMass() != null) {
                Button butMass = setParamsButton(eco.getProductionPerSecondMass()+"", "#4D814A", "icons/mass.png");
                linLayEco.addView(butMass, layoutParamsBut);
            }
            if (eco.getBuildRate() != null) {
                Button butTime = setParamsButton(eco.getBuildRate()+"", "#858585", "icons/time.png");
                linLayEco.addView(butTime, layoutParamsBut);
            }
            linearLayout3.addView(header, layoutParamsHeader);
            linearLayout3.addView(linLayEco, layoutParamsBut);
        }
        if (eco.getStorageEnergy() != null || eco.getStorageMass() != null) {
            TextView header = setParamsText("STORAGE");
            LinearLayout linLayEco = new LinearLayout(this);
            if (eco.getStorageEnergy() != null) {
                Button butEnergy = setParamsButton(eco.getStorageEnergy()+"", "#705B27", "icons/energy.png");
                linLayEco.addView(butEnergy, layoutParamsBut);
            }
            if (eco.getStorageMass() != null) {
                Button butMass = setParamsButton(eco.getStorageMass()+"", "#4D814A", "icons/mass.png");
                linLayEco.addView(butMass, layoutParamsBut);
            }
            linearLayout3.addView(header, layoutParamsHeader);
            linearLayout3.addView(linLayEco, layoutParamsBut);
        }
    }

    @SuppressLint("SetTextI18n")
    private void displayUnitlistUnit(TextView mainInfo) {
        Defense def = info.getDefense();
        String id = info.getID().toUpperCase();
        String name = MainActivity.translator.Attempt(info.getID());
        if (id.equals("UAL0301") || id.equals("UEL0301") ||
                id.equals("URL0301") || id.equals("XSL0301")) {
            mainInfo.setText(name.replace(name.substring(0, name.lastIndexOf("\"") + 2),
                    ""));
        }
        else {
            mainInfo.setText(name);
        }
        if (def.getMaxHealth() != 0) {
            final Button butHP = setParamsButton(def.getMaxHealth() + (def.getRegenRate() != null ? " + " +
                    def.getRegenRate() + "/s" : ""), "#20711B", null);
            linearLayout3.addView(butHP, layoutParamsBut);
        }
        if (def.getShield() != null) {
            Button butShield = setParamsButton(def.getShield().getShieldMaxHealth() +
                    " + " + def.getShield().getShieldRegenRate() + "/s", "#3E677A", null);
            linearLayout3.addView(butShield, layoutParamsBut);
        }
    }

    private Button setParamsButton(String name, String color, String ico) {
        Button button = new Button(this);

        button.setText(name);
        button.setTextColor(Color.parseColor("#FFFFFF"));
        button.setClickable(false);
        button.setGravity(Gravity.CENTER_HORIZONTAL);
        button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color)));
        button.setTextSize(16);
        button.setLayoutParams(layoutParamsBut);

        if (ico != null) {
            unitsDraw.icoPath(this, button,ico);
        }
        return button;
    }

    @SuppressLint("SetTextI18n")
    private TextView setParamsText(String text) {
        TextView textView = new TextView(this);
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setText(text.replace("null","") + "\n");
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(18);
        return textView;
    }

    public static Bitmap overlayBitmapToCenter(Bitmap bitmap1, Bitmap bitmap2) {
        int bitmap1Width = bitmap1.getWidth();
        int bitmap1Height = bitmap1.getHeight();
        int bitmap2Width = bitmap2.getWidth();
        int bitmap2Height = bitmap2.getHeight();

        float marginLeft = (float) (bitmap1Width * 0.5 - bitmap2Width * 0.5);
        float marginTop = (float) (bitmap1Height * 0.5 - bitmap2Height * 0.5);

        Bitmap overlayBitmap = Bitmap.createBitmap(bitmap1Width, bitmap1Height, bitmap1.getConfig());
        Canvas canvas = new Canvas(overlayBitmap);
        canvas.drawBitmap(bitmap1, new Matrix(), null);
        canvas.drawBitmap(bitmap2, marginLeft, marginTop, null);

        return overlayBitmap;
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
}
