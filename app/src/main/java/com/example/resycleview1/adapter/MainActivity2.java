package com.example.resycleview1.adapter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.resycleview1.R;
import com.google.android.gms.maps.MapView;

import java.util.List;
import java.util.StringJoiner;

import models.Category;
import models.FaqPlaceObj;
import models.Geocodes;
import models.GetDetails;
import models.Result;
import viewmodels.MainViewModel2;

public class MainActivity2 extends AppCompatActivity {
TextView placeName;
TextView fid;
TextView catogery;
MapView MV;
Button goB,saveB;
private MainViewModel2 mainViewModel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        placeName= findViewById(R.id.pname);
        fid=findViewById(R.id.FID);
        goB=findViewById(R.id.goButton);
        saveB=findViewById(R.id.Savebutton);
        catogery=findViewById(R.id.catogery);
        String ID;
        Double l1,l2;
        ID=getIntent().getExtras().getString("FID");
       l1=getIntent().getExtras().getDouble("L1");
        l2=getIntent().getExtras().getDouble("L2");
        //encode the google maps URL



        mainViewModel2= ViewModelProviders.of(this).get(MainViewModel2.class);

    mainViewModel2.getMgetDetails(ID).observe(this, new Observer<GetDetails>() {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onChanged(GetDetails getDetails) {
        String nameReaslts,adress;
        nameReaslts= getDetails.getName();
        placeName.setText(nameReaslts);
        adress=getDetails.getLocation().getAddress();
        fid.setText(adress);


        List<Category> listcategory=getDetails.getCategories();
        StringBuffer output=new StringBuffer();

        for(int i=0;i<listcategory.size();i++){
            Category current=listcategory.get(i);
            String result= current.getName();
            output.append(result);
            output.append("-");
        }
        catogery.setText(output);
    }
});

    }
}