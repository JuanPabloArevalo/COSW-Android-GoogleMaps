package cosw.eci.edu.googlemaps.model;

import android.location.Location;

/**
 * Created by JuanArevaloMerchan on 9/04/2018.
 */

public class LocationForm {

    private String name;
    private String description;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
