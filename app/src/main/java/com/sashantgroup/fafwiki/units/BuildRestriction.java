package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BuildRestriction {
    RULEUBR_ON_HYDROCARBON_DEPOSIT, RULEUBR_ON_MASS_DEPOSIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RULEUBR_ON_HYDROCARBON_DEPOSIT: return "RULEUBR_OnHydrocarbonDeposit";
            case RULEUBR_ON_MASS_DEPOSIT: return "RULEUBR_OnMassDeposit";
        }
        return null;
    }

    @JsonCreator
    public static BuildRestriction forValue(String value) throws IOException {
        if (value.equals("RULEUBR_OnHydrocarbonDeposit")) return RULEUBR_ON_HYDROCARBON_DEPOSIT;
        if (value.equals("RULEUBR_OnMassDeposit")) return RULEUBR_ON_MASS_DEPOSIT;
        throw new IOException("Cannot deserialize BuildRestriction");
    }
}
