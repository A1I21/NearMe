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
        this.MgetDetails = mRepo.getDetails("5a187743ccad6b307315e6fe");

    }

    public MutableLiveData<GetDetails> getMgetDetails() {
        return MgetDetails;
    }

    public void setMgetDetails(MutableLiveData<GetDetails> mgetDetails) {
        MgetDetails = mgetDetails;
    }
}


