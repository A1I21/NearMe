package reposoris;

import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import models.Result;
import models.SearchPlaces;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {


    private static final String baseUrl=("https://api.foursquare.com/v3/");

    public static Retrofit getretrofit(){
        Gson gson=new GsonBuilder().setLenient().create();

        return new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create(gson)).build();
    }









    public static APISer getapi(){

        return getretrofit().create(APISer.class);
    }


}





