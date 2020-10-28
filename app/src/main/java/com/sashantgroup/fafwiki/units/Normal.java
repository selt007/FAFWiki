package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Normal {
    TARMACS_TAR12_X_01__NORMALS, TARMACS_TAR12_X_AEON_01__NORMALS, TARMACS_TAR12_X_CYBRAN_01__NORMALS, TARMACS_TAR12_X_SERAPHIM_01__NORMALS, TARMACS_TAR6_X_01__NORMALS, TARMACS_TAR6_X_AEON_01__NORMALS, TARMACS_TAR6_X_CYBRAN_01__NORMALS, TARMACS_TAR6_X_SERAPHIM_01__NORMALS, TARMACS_TAR8_X_01__NORMALS, TARMACS_TAR8_X_AEON_01__NORMALS, TARMACS_TAR8_X_CYBRAN_01__NORMALS, TARMACS_TAR8_X_SERAPHIM_01__NORMALS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TARMACS_TAR12_X_01__NORMALS: return "Tarmacs/Tar12x_01_normals";
            case TARMACS_TAR12_X_AEON_01__NORMALS: return "Tarmacs/Tar12x_aeon_01_normals";
            case TARMACS_TAR12_X_CYBRAN_01__NORMALS: return "Tarmacs/Tar12x_cybran_01_normals";
            case TARMACS_TAR12_X_SERAPHIM_01__NORMALS: return "Tarmacs/Tar12x_seraphim_01_normals";
            case TARMACS_TAR6_X_01__NORMALS: return "Tarmacs/Tar6x_01_normals";
            case TARMACS_TAR6_X_AEON_01__NORMALS: return "Tarmacs/Tar6x_aeon_01_normals";
            case TARMACS_TAR6_X_CYBRAN_01__NORMALS: return "Tarmacs/Tar6x_cybran_01_normals";
            case TARMACS_TAR6_X_SERAPHIM_01__NORMALS: return "Tarmacs/Tar6x_seraphim_01_normals";
            case TARMACS_TAR8_X_01__NORMALS: return "Tarmacs/Tar8x_01_normals";
            case TARMACS_TAR8_X_AEON_01__NORMALS: return "Tarmacs/Tar8x_aeon_01_normals";
            case TARMACS_TAR8_X_CYBRAN_01__NORMALS: return "Tarmacs/Tar8x_cybran_01_normals";
            case TARMACS_TAR8_X_SERAPHIM_01__NORMALS: return "Tarmacs/Tar8x_seraphim_01_normals";
        }
        return null;
    }

    @JsonCreator
    public static Normal forValue(String value) throws IOException {
        if (value.equals("Tarmacs/Tar12x_01_normals")) return TARMACS_TAR12_X_01__NORMALS;
        if (value.equals("Tarmacs/Tar12x_aeon_01_normals")) return TARMACS_TAR12_X_AEON_01__NORMALS;
        if (value.equals("Tarmacs/Tar12x_cybran_01_normals")) return TARMACS_TAR12_X_CYBRAN_01__NORMALS;
        if (value.equals("Tarmacs/Tar12x_seraphim_01_normals")) return TARMACS_TAR12_X_SERAPHIM_01__NORMALS;
        if (value.equals("Tarmacs/Tar6x_01_normals")) return TARMACS_TAR6_X_01__NORMALS;
        if (value.equals("Tarmacs/Tar6x_aeon_01_normals")) return TARMACS_TAR6_X_AEON_01__NORMALS;
        if (value.equals("Tarmacs/Tar6x_cybran_01_normals")) return TARMACS_TAR6_X_CYBRAN_01__NORMALS;
        if (value.equals("Tarmacs/Tar6x_seraphim_01_normals")) return TARMACS_TAR6_X_SERAPHIM_01__NORMALS;
        if (value.equals("Tarmacs/Tar8x_01_normals")) return TARMACS_TAR8_X_01__NORMALS;
        if (value.equals("Tarmacs/Tar8x_aeon_01_normals")) return TARMACS_TAR8_X_AEON_01__NORMALS;
        if (value.equals("Tarmacs/Tar8x_cybran_01_normals")) return TARMACS_TAR8_X_CYBRAN_01__NORMALS;
        if (value.equals("Tarmacs/Tar8x_seraphim_01_normals")) return TARMACS_TAR8_X_SERAPHIM_01__NORMALS;
        throw new IOException("Cannot deserialize Normal");
    }
}
