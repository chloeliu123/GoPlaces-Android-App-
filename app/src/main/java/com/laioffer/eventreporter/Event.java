package com.laioffer.eventreporter;

import android.widget.ImageView;

/**
 * Created by chloe on 9/25/2017.
 */

public class Event {
    /**
     * All data for a event.
     */
    private String title;
    private String address;
    private String description;
    private int image;
    private int like;
    private String id;

    public int getLike() {
        return like;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getId() {
        return id;
    }

    public long getTime() {
        return time;
    }

    public String getUsername() {
        return username;
    }

    public String getImgUri() {
        return imgUri;
    }

    private long time;
    private String username;
    private String imgUri;

    public Event() {}

    /**
     * Constructor
     */
    public Event(String title, String address, String description, int image) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.image = image;
    }

    /**
     * Getters for private attributes of Event class.
     */
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }
    public String getDescription() { return this.description; }
    public int getImage() {return this.image; }
}

