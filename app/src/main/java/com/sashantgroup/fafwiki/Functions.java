package com.sashantgroup.fafwiki;

import com.sashantgroup.fafwiki.lang.Lang;
import com.sashantgroup.fafwiki.units.AdditionalCapacitor;
import com.sashantgroup.fafwiki.units.AdvancedEngineering;
import com.sashantgroup.fafwiki.units.Defense;
import com.sashantgroup.fafwiki.units.Economy;
import com.sashantgroup.fafwiki.units.Enhancements;
import com.sashantgroup.fafwiki.units.Intel;
import com.sashantgroup.fafwiki.units.Physics;
import com.sashantgroup.fafwiki.units.Shield;
import com.sashantgroup.fafwiki.units.UnitAir;
import com.sashantgroup.fafwiki.units.Units;
import com.sashantgroup.fafwiki.units.Weapon;
import com.sashantgroup.fafwiki.units.Wreckage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.lang.String;

public class Functions {
    public static String strLoc;
    Units info = UnitsDraw.unitInfo;
    Double[] veterancy = new Double[] {  0.5, 1.0, 0.33333, 0.25, 0.3, 0.05 };

    public String displayUnitInfoFull(String strInfo) {
        strInfo = displayUnitlistUnit(strInfo).replace("null","");
        strInfo = displayUnitEconomy(strInfo);
        strInfo = displayUnitAbilities(strInfo);
        strInfo = displayUnitPhysics(strInfo);
        strInfo = displayUnitSupport(strInfo);
        strInfo = displayUnitWreckage(strInfo);
        strInfo = displayUnitlistArmies(strInfo);
        strInfo = displayVeterancy(strInfo);
        strInfo = displayWeaponList(strInfo);
        strInfo = displayEnchancements(strInfo);

        return strInfo;
    }

    private String displayEnchancements(String strInfo) {
        if (info.getEnhancements() != null) {
            Enhancements enchancements = info.getEnhancements();
            strInfo += "\nENHANCEMENTS\n";
            if (enchancements.getAdditionalCapacitor() != null) {
                AdditionalCapacitor additionalCapacitor = enchancements.getAdditionalCapacitor();
                strInfo += additionalCapacitor.getName() + "\n"
                        + "Mass:" + additionalCapacitor.getBuildCostMass() + "\n"
                        + "Energy:" + additionalCapacitor.getBuildCostEnergy() + "\n"
                        + "Time:" + additionalCapacitor.getBuildTime() + "\n";
            }
            if (enchancements.getAdvancedEngineering() != null) {
                AdvancedEngineering advancedEngineering = enchancements.getAdvancedEngineering();
                strInfo += attemptTranslations(advancedEngineering.getName()) + "\n";
                strInfo += "Mass:" + advancedEngineering.getBuildCostMass() + "\n";
                strInfo += "Energy:" + advancedEngineering.getBuildCostEnergy() + "\n";
                strInfo += "Time:" + advancedEngineering.getBuildTime() + "\n";
                strInfo += advancedEngineering.getNewBuildRate() != null ? "Build rate: " + advancedEngineering.getNewBuildRate() + "\n" : "";
                strInfo += advancedEngineering.getNewDamageRadius() != null ? "Damage Radius: " + advancedEngineering.getNewDamageRadius() + "\n" : "";
                strInfo += advancedEngineering.getNewHealth() != null ? "New Health: " + advancedEngineering.getNewHealth() + "\n" : "";
                strInfo += advancedEngineering.getNewRateOfFire() != null ? "Rate Of Fire: " + advancedEngineering.getNewRateOfFire() + "\n" : "";
                strInfo += advancedEngineering.getNewRegenRate() != null ? "Regen Rate:" + advancedEngineering.getNewRegenRate() + "\n" : "";
                strInfo += advancedEngineering.getNewVisionRadius() != null ? "Vision Radius: " + advancedEngineering.getNewVisionRadius() + "\n" : "";
            }
        }
        return strInfo;
    }

    private String displayVeterancy(String strInfo) {
        Defense defense = info.getDefense();
        String strInfoVeterancy = "";
        if (defense.getHealth() != null || defense.getRegenRate() != null) {
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
                    strInfoVeterancy += (info.getEconomy().getBuildCostMass() != null ? (i + 1) + " lvl: " +
                            (i + 1) * Integer.parseInt(info.getEconomy().getBuildCostMass()) + "\t\t" +
                            (Integer.parseInt(defense.getHealth()) + Math.round(Integer.parseInt(defense.getHealth()) *
                                    (0.1 * (i + 1)))) + "HP + " + (Integer.parseInt(defense.getRegenRate()) + 3 * (i + 1)) + "/s\t\t\n" : "");
                }
            }
            catch (Exception e) { strInfoVeterancy = ""; }
        }
        return strInfo + strInfoVeterancy;
    }

    private String displayWeaponList(String strInfo) {
        Weapon weapon = info.getWeapon();
        if (weapon != null) {
            strInfo += "\nWEAPONS\n";
            List<Method> methodsObj = Arrays.asList(Object.class.getMethods());
            Method[] methods = weapon.getClass().getMethods();
            StringBuilder strInfoBuilder = new StringBuilder(strInfo);
            for (Method method : methods) {
                try {
                    if (!methodsObj.contains(method)) {
                        if (method.getParameterTypes().length == 0) {
                            Object methodObj = method.invoke(weapon);
                            if (methodObj != null) {
                                Method[] underMethods = methodObj.getClass().getMethods();
                                for (Method underMethod : underMethods) {
                                    if (!methodsObj.contains(underMethod)) {
                                        if (underMethod.getParameterTypes().length == 0) {
                                            Object underMethodObj = underMethod.invoke(methodObj);
                                            if (underMethodObj != null) {
                                                strInfoBuilder.append((underMethod.getName() != null &&
                                                        underMethod.getName().equals("getDisplayName")) ?
                                                        "Weapon Name: " + underMethodObj.toString() + "\n" : "");
                                                strInfoBuilder.append((underMethod.getName() != null &&
                                                        underMethod.getName().equals("getDamage")) ?
                                                        underMethod.getName().replace("get", "")
                                                                + ": " + underMethodObj.toString() + "\n" : "");
                                                strInfoBuilder.append((underMethod.getName() != null &&
                                                        underMethod.getName().equals("getDamageRadius")) ?
                                                        underMethod.getName().replace("get", "")
                                                                + ": " + underMethodObj.toString() + "\n" : "");
                                                strInfoBuilder.append((underMethod.getName() != null &&
                                                        underMethod.getName().equals("getDamageType")) ?
                                                        underMethod.getName().replace("get", "")
                                                                + ": " + underMethodObj.toString() + "\n" : "");
                                                strInfoBuilder.append((underMethod.getName() != null &&
                                                        underMethod.getName().equals("getEffectiveRadius")) ?
                                                        underMethod.getName().replace("get", "")
                                                                + ": " + underMethodObj.toString() + "\n" : "");
                                                strInfoBuilder.append((underMethod.getName() != null &&
                                                        underMethod.getName().equals("getEnergyDrainPerSecond")) ?
                                                        underMethod.getName().replace("get", "")
                                                                + ": " + underMethodObj.toString() + "\n" : "");
                                                strInfoBuilder.append((underMethod.getName() != null &&
                                                        underMethod.getName().equals("getEnergyRequired")) ?
                                                        underMethod.getName().replace("get", "")
                                                                + ": " + underMethodObj.toString() + "\n" : "");
                                            }
                                        }
                                    }
                                }
                                strInfoBuilder.append("\r\n");
                            }
                        }
                    }
                }
                catch (IllegalAccessException | InvocationTargetException ex)
                { ex.printStackTrace(); }
            }
            strInfo = strInfoBuilder.toString();
        }
        return strInfo;
    }

    private String displayUnitlistArmies(String strInfo) {
        if (info.getEconomy().getBuildableCategory() != null) {
            ArrayList<Units> buildable = new ArrayList<>();
            for (Units unit : MainActivity.dataUnits) {
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
                strInfo += "\nBLUEPRINTS\n";
                for (Units buildUnit : buildable) {
                    String name = attemptTranslations(buildUnit.getID()).replace("null", "");
                    if (!name.equals("")) {
                        strInfo += "[ " + name + " ]\n";
                    }
                }
            }
        }
        return strInfo;
    }

    private String displayUnitWreckage(String strInfo) {
        Wreckage wreckage = info.getWreckage();
        try {
            if (wreckage != null) {
                double hpMul = Double.parseDouble(wreckage.getHealthMult());
                double massMul = Double.parseDouble(wreckage.getMassMult().toValue());
                strInfo += "\nWRECKAGE\n";
                strInfo += (wreckage.getHealthMult() != null ?
                        "HP: " + Math.round(Double.parseDouble(info.getDefense().getHealth())
                                * hpMul) + " (" + hpMul * 100 + "%)\t\t" : "");
                strInfo += (wreckage.getMassMult() != null ?
                        "Mass: " + Math.round(Double.parseDouble(info.getEconomy().getBuildCostMass())
                                * hpMul * massMul) + " (" + massMul * hpMul * 100 + "%)\n" : "");
            }
        } catch (Exception ignored) { }
        return strInfo;
    }

    private String displayUnitAbilities(String strInfo) {
        if (info.getDisplay() != null) {
            String[] abilities = info.getDisplay().getAbilities();
            if (abilities != null) {
                strInfo += "\nABILITIES\n";
                for (String ability : abilities) {
                    strInfo += "[ " + attemptTranslations(ability) + " ]\t\t";
                }
            }
        }
        return strInfo + "\n";
    }

    private String displayUnitEconomy(String strInfo) {
        Economy eco = info.getEconomy();
        if (eco.getBuildCostEnergy() != null || eco.getBuildCostMass() != null || eco.getBuildTime() != null) {
            strInfo += "\nBUILD COSTS\n";
            strInfo += (eco.getBuildCostEnergy() != null ? "Energy: " + eco.getBuildCostEnergy() + "\t\t" : "");
            strInfo += (eco.getBuildCostMass() != null ? "Mass: " + eco.getBuildCostMass() + "\t\t" : "");
            strInfo += (eco.getBuildTime() != null ? "Time: " + eco.getBuildTime() : "");
        }
        if (eco.getProductionPerSecondEnergy() != null || eco.getProductionPerSecondMass() != null || eco.getBuildRate() != null) {
            strInfo += "\nYIELD / DRAIN\n";
            strInfo += (eco.getProductionPerSecondEnergy() != null ? "Energy: " + eco.getProductionPerSecondEnergy() + "\t\t" : "");
            strInfo += (eco.getProductionPerSecondMass() != null ? "Mass: " + eco.getProductionPerSecondMass() + "\t\t" : "");
            strInfo += (eco.getBuildRate() != null ? "Time: " + eco.getBuildRate() : "");
        }
        if (eco.getStorageEnergy() != null || eco.getStorageMass() != null) {
            strInfo += "\nSTORAGE\n";
            strInfo += (eco.getStorageEnergy() != null ? "Energy: " + eco.getStorageEnergy() + "\t\t" : "");
            strInfo += (eco.getStorageMass() != null ? "Mass: " + eco.getStorageMass() : "");
        }

        return strInfo + "\n";
    }

    private String displayUnitSupport(String strInfo) {
        Intel intel = info.getIntel();
        if (intel != null) {
            strInfo += "\nSUPPORT\n";
            strInfo += (intel.getVisionRadius() != null
                    ? "Vision: " + intel.getVisionRadius() + "\n" : "");
            strInfo += (intel.getRadarRadius() != null
                    ? "Radar: " + intel.getRadarRadius() + "\n" : "");
            strInfo += (intel.getSonarRadius() != null
                    ? "Sonar: " + intel.getSonarRadius() + "\n" : "");

            if (intel.getRadarStealth() != null || intel.getRadarStealthFieldRadius() != null ||
                    info.getDefense() != null || intel.getWaterVisionRadius() != null || intel.getOmniRadius() != null) {
                strInfo += (intel.getRadarStealth() != null
                        ? "Radar stealth: " + intel.getRadarStealthFieldRadius() + "\n" : "");
                strInfo += (intel.getSonarStealth() != null
                        ? "Radar stealth: " + intel.getSonarStealthFieldRadius() + "\n" : "");
                Shield shield = info.getDefense().getShield();
                strInfo += (shield != null
                        ? "Shield size: " + shield.getShieldSize() + "\n" +
                        "Regen assist mult: " + shield.getRegenAssistMult() + "\n" +
                        "Shield regen start time: " + shield.getShieldRegenStartTime() + "\n" : "");
            }
        }
        return strInfo;
    }

    private String displayUnitlistUnit(String strInfo) {
        Defense def = info.getDefense();
        String id = info.getID().toUpperCase();
        String name = attemptTranslations(info.getID());
        if (id.equals("UAL0301") || id.equals("UEL0301") ||
                id.equals("URL0301") || id.equals("XSL0301")) {
            strInfo += name.replace(name.substring(0, name.lastIndexOf("\"") + 2),
                    "") + "\n";
        }
        else {
            strInfo += name + "\n";
        }
        strInfo += (def.getMaxHealth() != null ? "HP: " + def.getMaxHealth() + (def.getRegenRate() != null ? " + " +
                def.getRegenRate() + "/s" : "") + "\n" : "");
        strInfo += (def.getShield() != null ? "Shield: " + def.getShield().getShieldMaxHealth() +
                " + " + def.getShield().getShieldRegenRate() + "/s\n" : "");
        return strInfo;
    }

    private String displayUnitPhysics(String strInfo) {
        Physics physics = info.getPhysics();
        if (physics.getMaxSpeed() != null) {
            strInfo += "\nPHYSICS\n";

            strInfo += (physics.getTurnRate() != null
                    ? Integer.parseInt(physics.getTurnRate()) != 0
                    ? "Turn rate: " + physics.getTurnRate() + " °/s\n" : "" : "");
            strInfo += (physics.getMaxSpeed() != null
                    ? "Max speed: " + physics.getMaxSpeed() + "\n" : "");
            strInfo += (physics.getFuelRechargeRate() != null
                    ? "Fuel refill rate: " + physics.getFuelRechargeRate() + "\n" : "");
            strInfo += (physics.getFuelUseTime() != null
                    ? "Fuel use time: " + physics.getFuelUseTime() + " s\n" : "");
            strInfo += (physics.getLandSpeedMultiplier() != null
                    ? Integer.parseInt(physics.getLandSpeedMultiplier()) != 1
                    ? "Land speed multiplier: " + Integer.parseInt(physics.getLandSpeedMultiplier()) * 100 + "%\n" : "" : "");

            UnitAir air = info.getAir();
            if (air != null) {
                strInfo += (air.getTurnSpeed() != null
                        ? "Turn speed: " + air.getTurnSpeed() + "\n" : "");
                strInfo += (air.getMaxAirspeed() != null
                        ? "Max air speed: " + air.getMaxAirspeed() + "\n" : "");
                strInfo += (air.getEngageDistance() != null
                        ? "Engage Distance: " + air.getEngageDistance() + "\n" : "");
                strInfo += (air.getMinAirspeed() != null
                        ? "Min air speed: " + air.getMinAirspeed() + "\n" : "");
                strInfo += (air.getCombatTurnSpeed() != null
                        ? "Combat turn speed: " + air.getCombatTurnSpeed() + "\n" : "");
            }
        }
        return strInfo;
    }

    public static String attemptTranslations(String id) {
        String locStr = strLoc;
        String infoStr = "";
        String[] units = locStr.split("\\r?\",");
        for (String unit : units) {
            String replace = unit
                    .replace("<LOC ", "")
                    .replace(">", "")
                    .replace(id.toLowerCase(), "");
            if (unit.contains(id.toLowerCase()) && unit.contains("_desc=")) {
                infoStr += replace
                        .replace("_desc=", "")
                        .replace("\"", "") + " ";
            }
            if (unit.contains(id.toLowerCase()) && unit.contains("_name=")) {
                infoStr += replace
                        .replace("_name=", "")
                        .replace("\\\"", "") + "\"";
            }
            if (id.contains("<LOC ")) {
                String str = id.substring(id.indexOf("<LOC ") + "<LOC ".length(), id.indexOf(">"));
                if (unit.contains(str)) {
                    infoStr = replace.substring(replace.indexOf("\"") + 1);
                }
            }
        }
        return infoStr;
    }
}