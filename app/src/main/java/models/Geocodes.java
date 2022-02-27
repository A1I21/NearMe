
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Geocodes {

    @SerializedName("front_door")
    private FrontDoor mFrontDoor;
    @SerializedName("main")
    private Main mMain;

    public FrontDoor getFrontDoor() {
        return mFrontDoor;
    }

    public void setFrontDoor(FrontDoor frontDoor) {
        mFrontDoor = frontDoor;
    }

    public Main getMain() {
        return mMain;
    }

    public void setMain(Main main) {
        mMain = main;
    }

}
