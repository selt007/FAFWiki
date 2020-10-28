package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Flare {
    private long radius;
    private boolean stack;
    private String category;
    private double offsetMult;

    @JsonProperty("Radius")
    public long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(long value) { this.radius = value; }

    @JsonProperty("Stack")
    public boolean getStack() { return stack; }
    @JsonProperty("Stack")
    public void setStack(boolean value) { this.stack = value; }

    @JsonProperty("Category")
    public String getCategory() { return category; }
    @JsonProperty("Category")
    public void setCategory(String value) { this.category = value; }

    @JsonProperty("OffsetMult")
    public double getOffsetMult() { return offsetMult; }
    @JsonProperty("OffsetMult")
    public void setOffsetMult(double value) { this.offsetMult = value; }
}
