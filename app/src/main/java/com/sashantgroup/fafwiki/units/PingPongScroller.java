package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class PingPongScroller {
    private double pong1;
    private double pong2Speed;
    private double pong2;
    private double ping1Speed;
    private double pong1Speed;
    private double ping2;
    private double ping2Speed;
    private double ping1;

    @JsonProperty("Pong1")
    public double getPong1() { return pong1; }
    @JsonProperty("Pong1")
    public void setPong1(double value) { this.pong1 = value; }

    @JsonProperty("Pong2Speed")
    public double getPong2Speed() { return pong2Speed; }
    @JsonProperty("Pong2Speed")
    public void setPong2Speed(double value) { this.pong2Speed = value; }

    @JsonProperty("Pong2")
    public double getPong2() { return pong2; }
    @JsonProperty("Pong2")
    public void setPong2(double value) { this.pong2 = value; }

    @JsonProperty("Ping1Speed")
    public double getPing1Speed() { return ping1Speed; }
    @JsonProperty("Ping1Speed")
    public void setPing1Speed(double value) { this.ping1Speed = value; }

    @JsonProperty("Pong1Speed")
    public double getPong1Speed() { return pong1Speed; }
    @JsonProperty("Pong1Speed")
    public void setPong1Speed(double value) { this.pong1Speed = value; }

    @JsonProperty("Ping2")
    public double getPing2() { return ping2; }
    @JsonProperty("Ping2")
    public void setPing2(double value) { this.ping2 = value; }

    @JsonProperty("Ping2Speed")
    public double getPing2Speed() { return ping2Speed; }
    @JsonProperty("Ping2Speed")
    public void setPing2Speed(double value) { this.ping2Speed = value; }

    @JsonProperty("Ping1")
    public double getPing1() { return ping1; }
    @JsonProperty("Ping1")
    public void setPing1(double value) { this.ping1 = value; }
}
