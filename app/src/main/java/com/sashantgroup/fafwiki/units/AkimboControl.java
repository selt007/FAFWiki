package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AkimboControl {
    private boolean allowRetargettingSecondWeapon;
    private String fifthWeapon;
    private String firstWeapon;
    private String fourthWeapon;
    private boolean head;
    private String headBone;
    private String headYawLimit;
    private String headYawSpeed;
    private String secondWeapon;
    private String thirdWeapon;
    private String torsoBone;
    private String torsoYawRange;
    private String torsoYawSpeed;

    @JsonProperty("AllowRetargettingSecondWeapon")
    public boolean getAllowRetargettingSecondWeapon() { return allowRetargettingSecondWeapon; }
    @JsonProperty("AllowRetargettingSecondWeapon")
    public void setAllowRetargettingSecondWeapon(boolean value) { this.allowRetargettingSecondWeapon = value; }

    @JsonProperty("FifthWeapon")
    public String getFifthWeapon() { return fifthWeapon; }
    @JsonProperty("FifthWeapon")
    public void setFifthWeapon(String value) { this.fifthWeapon = value; }

    @JsonProperty("FirstWeapon")
    public String getFirstWeapon() { return firstWeapon; }
    @JsonProperty("FirstWeapon")
    public void setFirstWeapon(String value) { this.firstWeapon = value; }

    @JsonProperty("FourthWeapon")
    public String getFourthWeapon() { return fourthWeapon; }
    @JsonProperty("FourthWeapon")
    public void setFourthWeapon(String value) { this.fourthWeapon = value; }

    @JsonProperty("Head")
    public boolean getHead() { return head; }
    @JsonProperty("Head")
    public void setHead(boolean value) { this.head = value; }

    @JsonProperty("HeadBone")
    public String getHeadBone() { return headBone; }
    @JsonProperty("HeadBone")
    public void setHeadBone(String value) { this.headBone = value; }

    @JsonProperty("HeadYawLimit")
    public String getHeadYawLimit() { return headYawLimit; }
    @JsonProperty("HeadYawLimit")
    public void setHeadYawLimit(String value) { this.headYawLimit = value; }

    @JsonProperty("HeadYawSpeed")
    public String getHeadYawSpeed() { return headYawSpeed; }
    @JsonProperty("HeadYawSpeed")
    public void setHeadYawSpeed(String value) { this.headYawSpeed = value; }

    @JsonProperty("SecondWeapon")
    public String getSecondWeapon() { return secondWeapon; }
    @JsonProperty("SecondWeapon")
    public void setSecondWeapon(String value) { this.secondWeapon = value; }

    @JsonProperty("ThirdWeapon")
    public String getThirdWeapon() { return thirdWeapon; }
    @JsonProperty("ThirdWeapon")
    public void setThirdWeapon(String value) { this.thirdWeapon = value; }

    @JsonProperty("TorsoBone")
    public String getTorsoBone() { return torsoBone; }
    @JsonProperty("TorsoBone")
    public void setTorsoBone(String value) { this.torsoBone = value; }

    @JsonProperty("TorsoYawRange")
    public String getTorsoYawRange() { return torsoYawRange; }
    @JsonProperty("TorsoYawRange")
    public void setTorsoYawRange(String value) { this.torsoYawRange = value; }

    @JsonProperty("TorsoYawSpeed")
    public String getTorsoYawSpeed() { return torsoYawSpeed; }
    @JsonProperty("TorsoYawSpeed")
    public void setTorsoYawSpeed(String value) { this.torsoYawSpeed = value; }
}
