package com.example.resycleview1.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resycleview1.R;

import java.util.List;

import adapter.onClickInterface;
import adapter.recviewadapter;
import models.FaqPlaceObj;
import models.Result;
import models.SearchPlaces;
import viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView mRecyclerview;
    private recviewadapter madapter;
    //private recviewadapter madapter;
    private MainViewModel mMainViewModel;

    private onClickInterface onclickInterface;
    private Button click;
    //Intent intent=new Intent(this, MainActivity2.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onclickInterface = new onClickInterface(){
            @Override
            public void ItemClicked(int clickedPos) {
                FaqPlaceObj clickedPlace =madapter.getPlacesList().get(clickedPos);
          String resid=clickedPlace.getId();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("FID",resid);
                startActivity(intent);



            }
        };


        mRecyclerview = findViewById(R.id.rec);
        mMainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
      mMainViewModel.getmSearchpalce().observe(this, new Observer<SearchPlaces>() {
          @Override
          public void onChanged(SearchPlaces searchPlaces) {

              if(searchPlaces==null)
                  return;
              List<Result> results = searchPlaces.getResults();

              for (int i = 0; i < results.size(); i++) {
                  FaqPlaceObj faqPlaceObj = new FaqPlaceObj();
                  Result current = results.get(i);
                  faqPlaceObj.setTitle(current.getName());
                  faqPlaceObj.setNigh(current.getLocation().getAddress());

                  faqPlaceObj.setId(current.getFsqId());

                  String iconurl = current.getCategories().get(0).getIcon().getPrefix()+current.getCategories().get(0).getIcon().getSuffix();
                  faqPlaceObj.setImageUrl("https://ss3.4sqi.net/img/categories_v2/arts_entertainment/themepark_bg_120.png");
                  String name="ali";
                  String hello = String.format(getApplicationContext().getResources().getString(R.string.welcome_user),name);


                  madapter.getPlacesList().add(faqPlaceObj);

              }


              madapter.notifyDataSetChanged();
          }
      });


        iniRecycleview();


    }


    private void iniRecycleview(){
      madapter=new recviewadapter(this,onclickInterface);
      RecyclerView.LayoutManager liniarlayout=new LinearLayoutManager(this);
      mRecyclerview.setLayoutManager(liniarlayout);
      mRecyclerview.setAdapter(madapter);
    }
}