
package models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Location {

    @SerializedName("address")
    private String mAddress;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("cross_street")
    private String mCrossStreet;
    @SerializedName("dma")
    private String mDma;
    @SerializedName("locality")
    private String mLocality;
    @SerializedName("neighborhood")
    private List<String> mNeighborhood;
    @SerializedName("postcode")
    private String mPostcode;
    @SerializedName("region")
    private String mRegion;

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCrossStreet() {
        return mCrossStreet;
    }

    public void setCrossStreet(String crossStreet) {
        mCrossStreet = crossStreet;
    }

    public String getDma() {
        return mDma;
    }

    public void setDma(String dma) {
        mDma = dma;
    }

    public String getLocality() {
        return mLocality;
    }

    public void setLocality(String locality) {
        mLocality = locality;
    }

    public List<String> getNeighborhood() {
        return mNeighborhood;
    }

    public void setNeighborhood(List<String> neighborhood) {
        mNeighborhood = neighborhood;
    }

    public String getPostcode() {
        return mPostcode;
    }

    public void setPostcode(String postcode) {
        mPostcode = postcode;
    }

    public String getRegion() {
        return mRegion;
    }

    public void setRegion(String region) {
        mRegion = region;
    }

}
