package com.sashantgroup.fafwiki.lang;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class Lang {
    private Map<String, String> us;
    private Map<String, String> cz;
    private Map<String, String> de;
    private Map<String, String> es;
    private Map<String, String> fr;
    private Map<String, String> it;
    private Map<String, String> pl;
    private Map<String, String> ru;
    private Map<String, String> tzm;

    @JsonProperty("US")
    public Map<String, String> getUs() { return us; }
    @JsonProperty("US")
    public void setUs(Map<String, String> value) { this.us = value; }

    @JsonProperty("CZ")
    public Map<String, String> getCz() { return cz; }
    @JsonProperty("CZ")
    public void setCz(Map<String, String> value) { this.cz = value; }

    @JsonProperty("DE")
    public Map<String, String> getDe() { return de; }
    @JsonProperty("DE")
    public void setDe(Map<String, String> value) { this.de = value; }

    @JsonProperty("ES")
    public Map<String, String> getEs() { return es; }
    @JsonProperty("ES")
    public void setEs(Map<String, String> value) { this.es = value; }

    @JsonProperty("FR")
    public Map<String, String> getFr() { return fr; }
    @JsonProperty("FR")
    public void setFr(Map<String, String> value) { this.fr = value; }

    @JsonProperty("IT")
    public Map<String, String> getIt() { return it; }
    @JsonProperty("IT")
    public void setIt(Map<String, String> value) { this.it = value; }

    @JsonProperty("PL")
    public Map<String, String> getPl() { return pl; }
    @JsonProperty("PL")
    public void setPl(Map<String, String> value) { this.pl = value; }

    @JsonProperty("RU")
    public Map<String, String> getRu() { return ru; }
    @JsonProperty("RU")
    public void setRu(Map<String, String> value) { this.ru = value; }

    @JsonProperty("TZM")
    public Map<String, String> getTzm() { return tzm; }
    @JsonProperty("TZM")
    public void setTzm(Map<String, String> value) { this.tzm = value; }
}
