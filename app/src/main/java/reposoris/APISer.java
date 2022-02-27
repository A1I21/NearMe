package reposoris;

import models.SearchPlaces;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APISer {

    @Headers("Authorization: fsq3tUXPD0FOBapkpHblNLQUomDnWaqEIXOFoP2VsLcNriQ=")
    @GET("places/search")
    Call<SearchPlaces> getplace(@Query("ll") String loc);


/*
    @Headers("Authorization: fsq3py+s6TDhEFfVeNUIVXQZ+bKAseJsigmMpiyLXrVqQKk=")
    @GET("places/{fsq_id}")
    Call<DetailsPlaceses> getDet(@Path("fsq_id") String IDPlace);

*/



}
