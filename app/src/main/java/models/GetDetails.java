
package models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GetDetails {

    @SerializedName("categories")
    private List<Category> mCategories;
    @SerializedName("chains")
    private List<Object> mChains;
    @SerializedName("fsq_id")
    private String mFsqId;
    @SerializedName("geocodes")
    private Geocodes mGeocodes;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("name")
    private String mName;
    @SerializedName("related_places")
    private RelatedPlaces mRelatedPlaces;
    @SerializedName("timezone")
    private String mTimezone;

    public List<Category> getCategories() {
        return mCategories;
    }

    public void setCategories(List<Category> categories) {
        mCategories = categories;
    }

    public List<Object> getChains() {
        return mChains;
    }

    public void setChains(List<Object> chains) {
        mChains = chains;
    }

    public String getFsqId() {
        return mFsqId;
    }

    public void setFsqId(String fsqId) {
        mFsqId = fsqId;
    }

    public Geocodes getGeocodes() {
        return mGeocodes;
    }

    public void setGeocodes(Geocodes geocodes) {
        mGeocodes = geocodes;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public RelatedPlaces getRelatedPlaces() {
        return mRelatedPlaces;
    }

    public void setRelatedPlaces(RelatedPlaces relatedPlaces) {
        mRelatedPlaces = relatedPlaces;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

}
