package com.example.zoobrasov;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Map_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map_, container, false);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.MY_MAP);
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {




                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(45.612340, 25.632029),16.54f));
//                googleMap.setLatLngBoundsForCameraTarget(restrictie);
                googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.614078218115274,25.633363611996174)).title("Casa de bilete").icon(mapDecriptor(getContext(),R.drawable.bilete_icon)));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61424754241784,25.63350433797833)).title("Parcare").icon(mapDecriptor(getContext(),R.drawable.parcare_icon)));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.614340178073434,25.63150618225336)).title("Parcare").icon(mapDecriptor(getContext(),R.drawable.parcare_icon)));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61353124076876, 25.633020335129622)).title("Tigru siberian"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61347177586054, 25.6334517352678)).title("Leul african"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61329870599273, 25.633550069122826)).title("Leul alb"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61340964827713, 25.632861732137638)).title("Tigru bengalez alb"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.613243234768255, 25.633178938121596)).title("Tigru siberian"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.613177179086556, 25.633663013577465)).title("Leul african"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61295367601431, 25.633641891181473)).title("Leopardul zăpezilor"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61338449908339, 25.633862502872944)).title("Iepuri"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61380781411763, 25.632940493524075)).title("Macac coadă-de-leu"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61291333748457, 25.633435025811195)).title("Leopardul zăpezilor"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.6126973382357, 25.633177869021893)).title("Panda roșu"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.612789741924985, 25.632975697517395)).title("Jaguar"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61240230208687, 25.63209023326635)).title("Bufnița polară/ Păun indian"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61262041322089, 25.63214220106602)).title("Steller / Vultur cu capul alb"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61270883007336, 25.63189007341862)).title("Lebada alba / Lebada neagră"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.612383539799154, 25.631204769015312)).title("Cămilă bactriană"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.611849281022636, 25.63022945076227)).title("Urs brun"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61236102504563, 25.630317963659763)).title("Urs brun"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.612725481507425, 25.630509071052074)).title("Struț african"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61280944218423, 25.62988881021738)).title("Mistreț / Nutire"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61293209959503, 25.630751810967922)).title("Cai"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.613102365460605, 25.630519464612007)).title("Lamă"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.6134438337378, 25.63057579100132)).title("Cerb european"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.6134039460932, 25.631106197834015)).title("Lup cenușiu"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.613737926315565, 25.630941577255726)).title("Cerb lopătar"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61362652779331, 25.63189208507538)).title("Vulpe roșie"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61389927788807, 25.631613135337833)).title("Căprioară"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61354538262517, 25.632380582392216)).title("Lemur"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61387934348928, 25.63242383301258)).title("Colobus guereza"));
                googleMap.addMarker(new MarkerOptions().position(new LatLng(45.61364013015105, 25.632593147456646)).title("Capucini cu fața albă "));




                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(@NonNull LatLng latLng) {
//                        MarkerOptions markerOptions=new MarkerOptions();
//                        markerOptions.position(latLng);
//                        markerOptions.title(latLng.latitude + " KG "+ latLng.longitude);
                        //  googleMap.clear();
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,18));
//                        googleMap.addMarker(markerOptions);
                    }
                });
            }
            private BitmapDescriptor mapDecriptor(Context context, int vectorId){
                Drawable icon= ContextCompat.getDrawable(context,vectorId);
                icon.setBounds(0,0,icon.getIntrinsicHeight(),icon.getIntrinsicWidth());
                Bitmap bitmap=Bitmap.createBitmap(icon.getIntrinsicWidth(),icon.getIntrinsicHeight(),Bitmap.Config.ARGB_8888);
                Canvas canvas=new Canvas(bitmap);
                icon.draw(canvas);

                return BitmapDescriptorFactory.fromBitmap(bitmap);
            };
        });




        return view;
    }


}