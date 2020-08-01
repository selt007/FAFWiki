package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Albedo {
    EMPTY, TARMACS_TAR12_X_01__ALBEDO, TARMACS_TAR12_X_AEON_01__ALBEDO, TARMACS_TAR12_X_CYBRAN_01__ALBEDO, TARMACS_TAR12_X_NOMADS_01__ALBEDO, TARMACS_TAR12_X_SERAPHIM_01__ALBEDO, TARMACS_TAR6_X_01__ALBEDO, TARMACS_TAR6_X_AEON_01__ALBEDO, TARMACS_TAR6_X_CYBRAN_01__ALBEDO, TARMACS_TAR6_X_NOMADS_01__ALBEDO, TARMACS_TAR6_X_SERAPHIM_01__ALBEDO, TARMACS_TAR8_X_01__ALBEDO, TARMACS_TAR8_X_AEON_01__ALBEDO, TARMACS_TAR8_X_CYBRAN_01__ALBEDO, TARMACS_TAR8_X_NOMADS_01__ALBEDO, TARMACS_TAR8_X_SERAPHIM_01__ALBEDO;

    @JsonValue
    public String toValue() {
        switch (this) {
        case EMPTY: return "";
        case TARMACS_TAR12_X_01__ALBEDO: return "Tarmacs/Tar12x_01_albedo";
        case TARMACS_TAR12_X_AEON_01__ALBEDO: return "Tarmacs/Tar12x_aeon_01_albedo";
        case TARMACS_TAR12_X_CYBRAN_01__ALBEDO: return "Tarmacs/Tar12x_cybran_01_albedo";
        case TARMACS_TAR12_X_NOMADS_01__ALBEDO: return "Tarmacs/Tar12x_nomads_01_albedo";
        case TARMACS_TAR12_X_SERAPHIM_01__ALBEDO: return "Tarmacs/Tar12x_seraphim_01_albedo";
        case TARMACS_TAR6_X_01__ALBEDO: return "Tarmacs/Tar6x_01_albedo";
        case TARMACS_TAR6_X_AEON_01__ALBEDO: return "Tarmacs/Tar6x_aeon_01_albedo";
        case TARMACS_TAR6_X_CYBRAN_01__ALBEDO: return "Tarmacs/Tar6x_cybran_01_albedo";
        case TARMACS_TAR6_X_NOMADS_01__ALBEDO: return "Tarmacs/Tar6x_nomads_01_albedo";
        case TARMACS_TAR6_X_SERAPHIM_01__ALBEDO: return "Tarmacs/Tar6x_seraphim_01_albedo";
        case TARMACS_TAR8_X_01__ALBEDO: return "Tarmacs/Tar8x_01_albedo";
        case TARMACS_TAR8_X_AEON_01__ALBEDO: return "Tarmacs/Tar8x_aeon_01_albedo";
        case TARMACS_TAR8_X_CYBRAN_01__ALBEDO: return "Tarmacs/Tar8x_cybran_01_albedo";
        case TARMACS_TAR8_X_NOMADS_01__ALBEDO: return "Tarmacs/Tar8x_nomads_01_albedo";
        case TARMACS_TAR8_X_SERAPHIM_01__ALBEDO: return "Tarmacs/Tar8x_seraphim_01_albedo";
        }
        return null;
    }

    @JsonCreator
    public static Albedo forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("Tarmacs/Tar12x_01_albedo")) return TARMACS_TAR12_X_01__ALBEDO;
        if (value.equals("Tarmacs/Tar12x_aeon_01_albedo")) return TARMACS_TAR12_X_AEON_01__ALBEDO;
        if (value.equals("Tarmacs/Tar12x_cybran_01_albedo")) return TARMACS_TAR12_X_CYBRAN_01__ALBEDO;
        if (value.equals("Tarmacs/Tar12x_nomads_01_albedo")) return TARMACS_TAR12_X_NOMADS_01__ALBEDO;
        if (value.equals("Tarmacs/Tar12x_seraphim_01_albedo")) return TARMACS_TAR12_X_SERAPHIM_01__ALBEDO;
        if (value.equals("Tarmacs/Tar6x_01_albedo")) return TARMACS_TAR6_X_01__ALBEDO;
        if (value.equals("Tarmacs/Tar6x_aeon_01_albedo")) return TARMACS_TAR6_X_AEON_01__ALBEDO;
        if (value.equals("Tarmacs/Tar6x_cybran_01_albedo")) return TARMACS_TAR6_X_CYBRAN_01__ALBEDO;
        if (value.equals("Tarmacs/Tar6x_nomads_01_albedo")) return TARMACS_TAR6_X_NOMADS_01__ALBEDO;
        if (value.equals("Tarmacs/Tar6x_seraphim_01_albedo")) return TARMACS_TAR6_X_SERAPHIM_01__ALBEDO;
        if (value.equals("Tarmacs/Tar8x_01_albedo")) return TARMACS_TAR8_X_01__ALBEDO;
        if (value.equals("Tarmacs/Tar8x_aeon_01_albedo")) return TARMACS_TAR8_X_AEON_01__ALBEDO;
        if (value.equals("Tarmacs/Tar8x_cybran_01_albedo")) return TARMACS_TAR8_X_CYBRAN_01__ALBEDO;
        if (value.equals("Tarmacs/Tar8x_nomads_01_albedo")) return TARMACS_TAR8_X_NOMADS_01__ALBEDO;
        if (value.equals("Tarmacs/Tar8x_seraphim_01_albedo")) return TARMACS_TAR8_X_SERAPHIM_01__ALBEDO;
        throw new IOException("Cannot deserialize Albedo");
    }
}
