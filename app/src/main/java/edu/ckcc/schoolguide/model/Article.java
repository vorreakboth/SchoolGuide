package edu.ckcc.schoolguide.model;

import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String imageUrl;

    @SerializedName("photo")
    private String photoUrl;

    @SerializedName("description")
    private String description;

    @SerializedName("date")
    private String date;

    public Article(String title, String imageUrl, String description, String date) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getPhotoUrl(){ return photoUrl; }

    public void setPhotoUrl(){ this.photoUrl = photoUrl; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { this.description = description; }
}