package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class SeabedTreads {
    private boolean scrollTreads;

    @JsonProperty("ScrollTreads")
    public boolean getScrollTreads() { return scrollTreads; }
    @JsonProperty("ScrollTreads")
    public void setScrollTreads(boolean value) { this.scrollTreads = value; }
}
