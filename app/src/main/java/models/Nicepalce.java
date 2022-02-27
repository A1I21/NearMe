package models;

public class Nicepalce {
    private String title;
    private String imageUrl;
    private String nigh;

    public String getNigh() {
        return nigh;
    }

    public void setNigh(String nigh) {
        this.nigh = nigh;
    }

    public Nicepalce(String imageUrl, String title, String nigh) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.nigh=nigh;
    }

    public Nicepalce() {
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

