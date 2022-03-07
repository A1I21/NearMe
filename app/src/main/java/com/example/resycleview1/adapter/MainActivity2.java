package com.example.resycleview1.adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

import com.example.resycleview1.R;
import com.google.android.gms.maps.MapView;

import java.util.List;

import models.FaqPlaceObj;
import models.GetDetails;
import models.Result;
import viewmodels.MainViewModel2;

public class MainActivity2 extends AppCompatActivity {
TextView placeName;
TextView fid;
MapView MV;
private MainViewModel2 mainViewModel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        placeName= findViewById(R.id.pname);
        fid=findViewById(R.id.FID);
        MV=findViewById(R.id.mapView);
        String ID;
        ID=getIntent().getExtras().getString("FID");

       // fid.setText(ID);
       // mainViewModel2= ViewModelProviders.of(this).get(MainViewModel2.class);


        GetDetails getDetails=new GetDetails();
      String results= getDetails.getName();
        fid.setText(results);

           // FaqPlaceObj faqPlaceObj = new FaqPlaceObj();
          //  String current = results;
     //   fid.setText(getDetails.getName());

           // faqPlaceObj.setNigh(current.getLocation().getAddress());

            //faqPlaceObj.setId(current.getFsqId());

           // String iconurl = current.getCategories().get(0).getIcon().getPrefix()+current.getCategories().get(0).getIcon().getSuffix();
            //faqPlaceObj.setImageUrl("https://ss3.4sqi.net/img/categories_v2/arts_entertainment/themepark_bg_120.png");
          //  String name="ali";
           // String hello = String.format(getApplicationContext().getResources().getString(R.string.welcome_user),name);


    }

}