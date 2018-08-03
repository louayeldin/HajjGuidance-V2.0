package com.example.louayeldin.hajjguidance;

import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_main);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }



    /*a function that mark specific place in saudi arabia which is makkah - added 2/8/2018 */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Add a marker in Makkah, Saudi Arabia,
        // and move the map's camera to the same location.
        // Customizing the map style to be look different from the Default layout of Google Map
        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.map_style));
            if (!success) {
                Log.e("MainAcivity", "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e("MainActivity", "Can't find style. Error: ", e);
        }

        LatLng location = new LatLng(	21.427, 39.826);
        googleMap.addMarker(new MarkerOptions().position(location)
                .title("مكة المكرمة"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(location));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,15));
        // Zoom in, animating the camera.
        googleMap.animateCamera(CameraUpdateFactory.zoomIn());
        // Zoom out to zoom level 10, animating with a duration of 2 seconds.
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
    }



    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SettingScreen.class);
        startActivity(intent);
        finish();

    }
}
