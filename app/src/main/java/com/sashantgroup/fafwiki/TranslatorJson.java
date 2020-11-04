package com.sashantgroup.fafwiki;

import android.content.Context;

import com.sashantgroup.fafwiki.lang.ConverterLang;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.stream.Collectors;

public class TranslatorJson {
    Map<String, String> loc;
    String fileLang = "localization.json";

    public TranslatorJson(Context context) {
        try {
            getFileData(context);
        }
        catch (IOException e) { e.printStackTrace(); }
    }

    public String Attempt(String id)
    {
        String infoStr = "";
        if (id.contains("<LOC "))
        {
            String str = id.substring(id.indexOf("<LOC ") + "<LOC ".length(), id.indexOf(">"));
            String unitLoc = loc.entrySet().stream().filter(x -> x.getKey().startsWith(str)).findFirst().orElse(null).getValue();
            if (unitLoc != null) {
                infoStr = unitLoc.substring(unitLoc.indexOf("\"")).replace("\"", "");
            }
        }
        else
        {
            Map<String, String> unitLocs = loc.entrySet().stream().filter(x -> x.getKey().startsWith(id.toLowerCase()))
                    .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
            for(Map.Entry<String, String> unitLoc : unitLocs.entrySet())
            {
                if (unitLoc.getKey().contains("ual0301") || unitLoc.getKey().contains("uel0301") ||
                        unitLoc.getKey().contains("url0301") || unitLoc.getKey().contains("xsl0301")) {
                    if (unitLoc.getKey().contains("1_desc"))
                        infoStr = unitLoc.getValue().replace("\"", "");
                }
                else {
                    if (unitLoc.getKey().contains("_desc"))
                        infoStr = unitLoc.getValue().replace("\"", "") + " ";
                    if (unitLoc.getKey().contains("_name")) {
                        infoStr += unitLoc.getValue()
                                .replace("\\\"", "");
                    }
                }
            }
        }
        return infoStr;
    }

    private void getFileData(Context context) throws IOException {
        InputStream inputStream = context.getAssets().open(fileLang);
        int size = inputStream.available();
        byte[] buffer = new byte[size];
        inputStream.read(buffer);
        inputStream.close();
        String jsonLocalization = new String(buffer, "UTF-8");
        if (jsonLocalization != null) loc = selectLang(jsonLocalization);
    }

    private Map<String, String> selectLang(String localizeStr) throws IOException {
        Map<String, String> mapLoc;
        switch (MainActivity.lang) {
            case "RU":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getRu();
                break;
            case "CZ":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getCz();
                break;
            case "DE":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getDe();
                break;
            case "ES":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getEs();
                break;
            case "FR":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getFr();
                break;
            case "IT":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getIt();
                break;
            case "PL":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getPl();
                break;
            case "TZM":
                mapLoc = ConverterLang.fromJsonString(localizeStr).getTzm();
                break;
            default:
                mapLoc = ConverterLang.fromJsonString(localizeStr).getUs();
                break;
        }
        return mapLoc;
    }
}
