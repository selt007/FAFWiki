package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class PingPongScroller {
    private String ping1;
    private String ping1Speed;
    private String ping2;
    private String ping2Speed;
    private String pong1;
    private String pong1Speed;
    private String pong2;
    private String pong2Speed;

    @JsonProperty("Ping1")
    public String getPing1() { return ping1; }
    @JsonProperty("Ping1")
    public void setPing1(String value) { this.ping1 = value; }

    @JsonProperty("Ping1Speed")
    public String getPing1Speed() { return ping1Speed; }
    @JsonProperty("Ping1Speed")
    public void setPing1Speed(String value) { this.ping1Speed = value; }

    @JsonProperty("Ping2")
    public String getPing2() { return ping2; }
    @JsonProperty("Ping2")
    public void setPing2(String value) { this.ping2 = value; }

    @JsonProperty("Ping2Speed")
    public String getPing2Speed() { return ping2Speed; }
    @JsonProperty("Ping2Speed")
    public void setPing2Speed(String value) { this.ping2Speed = value; }

    @JsonProperty("Pong1")
    public String getPong1() { return pong1; }
    @JsonProperty("Pong1")
    public void setPong1(String value) { this.pong1 = value; }

    @JsonProperty("Pong1Speed")
    public String getPong1Speed() { return pong1Speed; }
    @JsonProperty("Pong1Speed")
    public void setPong1Speed(String value) { this.pong1Speed = value; }

    @JsonProperty("Pong2")
    public String getPong2() { return pong2; }
    @JsonProperty("Pong2")
    public void setPong2(String value) { this.pong2 = value; }

    @JsonProperty("Pong2Speed")
    public String getPong2Speed() { return pong2Speed; }
    @JsonProperty("Pong2Speed")
    public void setPong2Speed(String value) { this.pong2Speed = value; }
}
