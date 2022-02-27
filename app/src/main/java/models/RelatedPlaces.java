
package models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RelatedPlaces {

    @SerializedName("children")
    private List<Object> mChildren;

    public List<Object> getChildren() {
        return mChildren;
    }

    public void setChildren(List<Object> children) {
        mChildren = children;
    }

}
