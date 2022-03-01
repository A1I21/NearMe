package com.example.resycleview1.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.resycleview1.R;
import com.google.android.gms.maps.MapView;

public class MainActivity2 extends AppCompatActivity {
TextView placeName;
TextView fid;
MapView MV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        placeName= findViewById(R.id.pname);
        fid=findViewById(R.id.FID);
        MV=findViewById(R.id.mapView);
        String ID;
        ID=getIntent().getExtras().getString("FID");
        fid.setText(ID);


    }

}