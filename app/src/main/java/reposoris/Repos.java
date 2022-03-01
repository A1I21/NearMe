package reposoris;

import androidx.lifecycle.MutableLiveData;

import models.GetDetails;
import models.SearchPlaces;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repos {

    public Repos() {

    }
    public MutableLiveData<SearchPlaces> getPlaces(String ll){
        final MutableLiveData<SearchPlaces> data = new MutableLiveData<>();
        RetroClass.getapi().getplace(ll).enqueue(new Callback<SearchPlaces>() {
            @Override
            public void onResponse(Call<SearchPlaces> call, Response<SearchPlaces> response) {
              if(response.isSuccessful()){
                  data.setValue(response.body());
              }

            }

            @Override
            public void onFailure(Call<SearchPlaces> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return data;
    }


   
}