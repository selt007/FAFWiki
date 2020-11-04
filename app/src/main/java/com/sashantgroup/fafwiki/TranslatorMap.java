package com.sashantgroup.fafwiki;

import java.util.HashMap;
import java.util.Map;

public class TranslatorMap {
    public Map<String, String> getUS() {
        Map<String, String> map = new HashMap<>();

        map.put("about", "Thank you for downloading the app!\n\n" +
                "Creators named in the FAF:\n" +
                "SAG clan \"SashAntGroup\"\n\n" +
                "[SAG] SaSH\n" +
                "[SAG] pavanvo\n\n" +
                "If you find flaws in the app, you can write to the mail:\n" +
                "all1992ex@gmail.com\n\n" +
                "If there is a desire to financially support the project, then here is the resource " +
                "through which this can be done:");
        map.put("aboutSpec", "If you wish, you can specify a nickname, we will add you " +
                "to the list of sponsors and display you in this window.\nThanks! =)\n\n" +
                "See you in the game, good luck!");
        map.put("action_language", "Language");
        map.put("action_about", "About");

        map.put("perSec", " \\s");
        map.put("sec", " s");
        map.put("sonar", "Sonar: ");
        map.put("vision", "Vision: ");
        map.put("radar", "Radar: ");
        map.put("mass", "Mass: ");

        map.put("buildCost", "BUILD COSTS");
        map.put("yield", "YIELD / DRAIN");
        map.put("storage", "STORAGE");
        map.put("abilities", "ABILITIES");
        map.put("physics", "PHYSICS");
        map.put("wreckage", "WRECKAGE");
        map.put("blueprints", "BLUEPRINTS");
        map.put("veterancy", "VETERANCY");
        map.put("support", "SUPPORT");
        map.put("weapons", "WEAPONS");
        map.put("enhancements", "ENHANCEMENTS");

        map.put("turnRate", "Turn rate: ");
        map.put("maxSpeed", "Max speed: ");
        map.put("fuelRefillRate", "Fuel refill rate: ");
        map.put("fuelUseTime", "Fuel use time: ");
        map.put("landSpeedMultiplier", "Land speed multiplier: ");
        map.put("turnSpeed", "Turn speed: ");
        map.put("maxAirSpeed", "Max air speed: ");
        map.put("engageDistance", "Engage Distance: ");
        map.put("minAirSpeed", "Min air speed: ");
        map.put("combatTurnSpeed", "Combat turn speed: ");

        return map;
    }

    public Map<String, String> getRU() {
        Map<String, String> map = new HashMap<>();

        map.put("about", "Спасибо что скачали приложение!\n\n" +
                "Создатели именнуемые в FAF:\n" +
                "Клан SAG \"SashAntGroup\"\n\n" +
                "[SAG] SaSH\n" +
                "[SAG] pavanvo\n\n" +
                "При нахождении недочетов в приложении можете написать на почту:\n" +
                "all1992ex@gmail.com\n\n" +
                "Если есть желание финансово поддержать проект, то вот ресурс через который это можно сделать:");
        map.put("aboutSpec", "При желании можете указать ник, мы вас добавим в " +
                "список спонсоров и отобразим в этом окне.\nСпасибо! =)\n\n" +
                "Увидимся в игре, удачи!");
        map.put("action_language", "Язык");
        map.put("action_about", "О нас");

        map.put("perSec", " \\сек");
        map.put("sec", " сек");
        map.put("sonar", "Сонар: ");
        map.put("vision", "Обзор: ");
        map.put("radar", "Радар: ");
        map.put("mass", "Масса: ");

        map.put("buildCost", "СТОИМОСТЬ ПОСТРОЙКИ");
        map.put("yield", "ДОХОД / ПОТРЕБЛЕНИЕ");
        map.put("storage", "ХРАНИЛИЩЕ");
        map.put("abilities", "СПОСОБНОСТИ");
        map.put("physics", "ФИЗИКА");
        map.put("wreckage", "ОБЛОМКИ");
        map.put("blueprints", "ЧЕРТЕЖИ");
        map.put("veterancy", "ВЕТЕРАНСТВО");
        map.put("support", "ДОПОЛНИТЕЛЬНО");
        map.put("weapons", "ОРУЖИЯ");
        map.put("enhancements", "УЛУЧШЕНИЯ");

        map.put("turnRate", "Показатель поворота: ");
        map.put("maxSpeed", "Макс. скорость: ");
        map.put("fuelRefillRate", "Скорость заправки топливом: ");
        map.put("fuelUseTime", "Время использования топлива: ");
        map.put("landSpeedMultiplier", "Множитель наземной скорости: ");
        map.put("turnSpeed", "Скорость поворота: ");
        map.put("maxAirSpeed", "Макс. скорость в воздухе: ");
        map.put("engageDistance", "Расстояние взаимодействия: ");
        map.put("minAirSpeed", "Мин. скорость в воздухе: ");
        map.put("combatTurnSpeed", "Боевая скорость поворота: ");

        return map;
    }
}
