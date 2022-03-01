package models;

public class FaqPlaceObj {
    private String title;
    private String imageUrl;
    private String nigh;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNigh() {
        return nigh;
    }

    public void setNigh(String nigh) {
        this.nigh = nigh;
    }

    public FaqPlaceObj(String imageUrl, String title, String nigh, String id) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.nigh=nigh;
        this.id=id;
    }

    public FaqPlaceObj() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}

