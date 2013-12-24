package com.algebra.sports;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);

		GoogleMap googleMap = ((SupportMapFragment) (getSupportFragmentManager()
				.findFragmentById(R.id.maps))).getMap();

		Intent address = this.getIntent();
		double lat = address.getDoubleExtra("latitude", 0);
		double lng = address.getDoubleExtra("longitude", 0);
		LatLng latLng = new LatLng(lat, lng);

		googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		googleMap.addMarker(new MarkerOptions().position(latLng).icon(
				BitmapDescriptorFactory
						.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
		googleMap.getUiSettings().setCompassEnabled(true);
		googleMap.getUiSettings().setZoomControlsEnabled(true);
		googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 14));

	}
}
