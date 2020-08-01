package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class UIUnitViewOverrides {
    private String capacitorDuration;
    private String maxHealth;
    private String productionPerSecondEnergy;
    private String productionPerSecondMass;

    @JsonProperty("CapacitorDuration")
    public String getCapacitorDuration() { return capacitorDuration; }
    @JsonProperty("CapacitorDuration")
    public void setCapacitorDuration(String value) { this.capacitorDuration = value; }

    @JsonProperty("MaxHealth")
    public String getMaxHealth() { return maxHealth; }
    @JsonProperty("MaxHealth")
    public void setMaxHealth(String value) { this.maxHealth = value; }

    @JsonProperty("ProductionPerSecondEnergy")
    public String getProductionPerSecondEnergy() { return productionPerSecondEnergy; }
    @JsonProperty("ProductionPerSecondEnergy")
    public void setProductionPerSecondEnergy(String value) { this.productionPerSecondEnergy = value; }

    @JsonProperty("ProductionPerSecondMass")
    public String getProductionPerSecondMass() { return productionPerSecondMass; }
    @JsonProperty("ProductionPerSecondMass")
    public void setProductionPerSecondMass(String value) { this.productionPerSecondMass = value; }
}
