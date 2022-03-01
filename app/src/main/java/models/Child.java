
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Child {

    @SerializedName("fsq_id")
    private String mFsqId;
    @SerializedName("name")
    private String mName;

    public String getFsqId() {
        return mFsqId;
    }

    public void setFsqId(String fsqId) {
        mFsqId = fsqId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
