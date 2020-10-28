package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Overcharge {
    private long commandDamage;
    private long minDamage;
    private double energyMult;
    private long maxDamage;
    private long structureDamage;

    @JsonProperty("commandDamage")
    public long getCommandDamage() { return commandDamage; }
    @JsonProperty("commandDamage")
    public void setCommandDamage(long value) { this.commandDamage = value; }

    @JsonProperty("minDamage")
    public long getMinDamage() { return minDamage; }
    @JsonProperty("minDamage")
    public void setMinDamage(long value) { this.minDamage = value; }

    @JsonProperty("energyMult")
    public double getEnergyMult() { return energyMult; }
    @JsonProperty("energyMult")
    public void setEnergyMult(double value) { this.energyMult = value; }

    @JsonProperty("maxDamage")
    public long getMaxDamage() { return maxDamage; }
    @JsonProperty("maxDamage")
    public void setMaxDamage(long value) { this.maxDamage = value; }

    @JsonProperty("structureDamage")
    public long getStructureDamage() { return structureDamage; }
    @JsonProperty("structureDamage")
    public void setStructureDamage(long value) { this.structureDamage = value; }
}
