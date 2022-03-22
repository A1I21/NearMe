package viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import models.GetDetails;
import reposoris.Repos;

public class MainViewModel2 extends AndroidViewModel {
    private MutableLiveData<GetDetails> MgetDetails;

    private Repos mRepo;

    public MainViewModel2(@NonNull Application application) {
        super(application);
        mRepo = new Repos();


    }

    public MutableLiveData<GetDetails> getMgetDetails(String id) {
        return mRepo.getDetails(id);
    }

    public void setMgetDetails(MutableLiveData<GetDetails> mgetDetails) {
        MgetDetails = mgetDetails;
    }
}


