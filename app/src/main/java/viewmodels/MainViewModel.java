package viewmodels;

import android.app.Application;
import android.app.Person;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.resycleview1.adapter.person;

import java.util.ArrayList;
import java.util.List;

import models.Result;
import models.SearchPlaces;
import reposoris.APISer;
import reposoris.Repos;
import reposoris.RetroClass;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<SearchPlaces> mSearchpalce;
    private Repos mRpo;




    public MainViewModel(@NonNull Application application) {
        super(application);
         person driver=new person("aa","aa");
         mRpo =new Repos();


        this.mSearchpalce=mRpo.getPlaces("41.8781,-87.6298");

    }

    public MutableLiveData<SearchPlaces> getmSearchpalce() {
        return mSearchpalce;
    }

    public void setmSearchpalce(MutableLiveData<SearchPlaces> mSearchpalce) {
        this.mSearchpalce = mSearchpalce;
    }
}
