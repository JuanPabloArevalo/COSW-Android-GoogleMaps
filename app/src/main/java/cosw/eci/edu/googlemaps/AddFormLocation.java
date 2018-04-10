package cosw.eci.edu.googlemaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddFormLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_form_location);
    }

    public void addLocation(View view){
        if(validateForm()){

        }
        finish();
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
