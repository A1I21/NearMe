package com.example.resycleview1.adapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resycleview1.R;

import java.util.List;

import adapter.recviewadapter;
import models.Nicepalce;
import models.Result;
import models.SearchPlaces;
import viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView mRecyclerview;
    private recviewadapter madapter;
    //private recviewadapter madapter;
    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerview = findViewById(R.id.rec);
        mMainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
      mMainViewModel.getmSearchpalce().observe(this, new Observer<SearchPlaces>() {
          @Override
          public void onChanged(SearchPlaces searchPlaces) {
              if(searchPlaces==null)
                  return;
              List<Result> results = searchPlaces.getResults();
              for (int i = 0; i < results.size(); i++) {
                  Result current = results.get(i);
                  Nicepalce nicepalce = new Nicepalce();
                  nicepalce.setTitle(current.getName());
                  nicepalce.setNigh(current.getLocation().getAddress());
                  String iconurl = current.getCategories().get(0).getIcon().getPrefix()+current.getCategories().get(0).getIcon().getSuffix();
                  nicepalce.setImageUrl("https://ss3.4sqi.net/img/categories_v2/arts_entertainment/themepark_bg_120.png");
                  String name="ali";
                  String hello = String.format(getApplicationContext().getResources().getString(R.string.welcome_user),name);


                  madapter.getMniceplace().add(nicepalce);

              }

              madapter.notifyDataSetChanged();
          }
      });

        iniRecycleview();

    }


    private void iniRecycleview(){
      madapter=new recviewadapter(this);
      RecyclerView.LayoutManager liniarlayout=new LinearLayoutManager(this);
      mRecyclerview.setLayoutManager(liniarlayout);
      mRecyclerview.setAdapter(madapter);
    }
}