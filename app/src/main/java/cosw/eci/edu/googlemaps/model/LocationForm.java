package cosw.eci.edu.googlemaps.model;


import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

/**
 * Created by JuanArevaloMerchan on 9/04/2018.
 */

public class LocationForm implements Serializable{

    private String name;
    private String description;
    private double latitude;
    private double longitude;

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
