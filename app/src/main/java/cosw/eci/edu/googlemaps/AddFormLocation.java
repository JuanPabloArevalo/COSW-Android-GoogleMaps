package cosw.eci.edu.googlemaps;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.model.LatLng;

import cosw.eci.edu.googlemaps.model.LocationForm;

public class AddFormLocation extends AppCompatActivity {
    EditText txt_name, txt_description, txt_latitude, txt_longitude;
    public static final String LOCATION_FORM = "com.eci.edu.googlrmaps.LOCATION_FORM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_form_location);
        txt_name = findViewById(R.id.txt_name);
        txt_description = findViewById(R.id.txt_description);
        txt_latitude = findViewById(R.id.txt_latitude);
        txt_longitude = findViewById(R.id.txt_longitude);
    }

    public void saveLocation(View view){
        if(validateForm()){
            Intent result = new Intent(this, MapsActivity.class);
            LocationForm locationForm = new LocationForm();
            locationForm.setDescription(txt_description.getText().toString());
            locationForm.setName(txt_name.getText().toString());
            /*LatLng sydney = new LatLng(-34, 151);*/
            double latitude = Double.parseDouble(txt_latitude.getText().toString());
            double longitude = Double.parseDouble(txt_longitude.getText().toString());
            Log.i("Latitude", latitude+"");
            Log.i("Longitude", longitude+"");
            locationForm.setLatitude(latitude);
            locationForm.setLongitude(longitude);
            result.putExtra(LOCATION_FORM, locationForm);
            setResult(RESULT_OK, result);
            finish();
        }

    }


    public boolean validateForm(){
        EditText txt_name = findViewById(R.id.txt_name);
        EditText txt_description = findViewById(R.id.txt_description);
        EditText txt_latitude = findViewById(R.id.txt_latitude);
        EditText txt_longitude = findViewById(R.id.txt_longitude);

        if (txt_name.length() == 0) {
            txt_name.setError("Please enter either a name");
            return false;
        }
        if (txt_description.length() == 0) {
            txt_description.setError("Please enter either a description");
            return false;
        }

        if (txt_latitude.length() == 0) {
            txt_latitude.setError("Please enter a valid latitude");
            return false;
        }

        if (txt_longitude.length() == 0) {
            txt_longitude.setError("Please enter a valid longitude");
            return false;
        }
        return true;
    }
}
