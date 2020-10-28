package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class HitBox {
    private long collisionOffsetY;
    private double collisionOffsetX;
    private double sizeZ;
    private double sizeX;
    private double sizeY;
    private double collisionOffsetZ;

    @JsonProperty("CollisionOffsetY")
    public long getCollisionOffsetY() { return collisionOffsetY; }
    @JsonProperty("CollisionOffsetY")
    public void setCollisionOffsetY(long value) { this.collisionOffsetY = value; }

    @JsonProperty("CollisionOffsetX")
    public double getCollisionOffsetX() { return collisionOffsetX; }
    @JsonProperty("CollisionOffsetX")
    public void setCollisionOffsetX(double value) { this.collisionOffsetX = value; }

    @JsonProperty("SizeZ")
    public double getSizeZ() { return sizeZ; }
    @JsonProperty("SizeZ")
    public void setSizeZ(double value) { this.sizeZ = value; }

    @JsonProperty("SizeX")
    public double getSizeX() { return sizeX; }
    @JsonProperty("SizeX")
    public void setSizeX(double value) { this.sizeX = value; }

    @JsonProperty("SizeY")
    public double getSizeY() { return sizeY; }
    @JsonProperty("SizeY")
    public void setSizeY(double value) { this.sizeY = value; }

    @JsonProperty("CollisionOffsetZ")
    public double getCollisionOffsetZ() { return collisionOffsetZ; }
    @JsonProperty("CollisionOffsetZ")
    public void setCollisionOffsetZ(double value) { this.collisionOffsetZ = value; }
}
