package com.example.android.singlescreenapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LocationManager locationManager;
    private Location myLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView strAddress = (TextView) findViewById(R.id.Address);

        TextView textView = (TextView) findViewById(R.id.Email);
        SpannableString content = new SpannableString("clickandplaytogiveaway@gmail.com");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        textView.setText(content);

    }

    /**
     * This method is called when the address is clicked
     */
    public void displayMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ro/maps/dir//Piața+Sudului,+București/@44.3994007,26.1113024,14z/data=!4m8!4m7!1m0!1m5!1m1!1s0x40b1fe42e4268d17:0x416b9561d5523680!2m2!1d26.1210071!2d44.3936964?hl=en" ));
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called when the email is clicked
     */
    public void sendEmail(View view) {
        String email = "mailto:clickandplaytogiveaway@gmail.com";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" ));
        try {
            startActivity(emailIntent);
        } catch (ActivityNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}







