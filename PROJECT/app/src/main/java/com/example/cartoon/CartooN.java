package com.example.cartoon;

import android.webkit.WebView;

import java.io.Serializable;

public class CartooN implements Serializable {

    private String name;
    private double rating;
    private int season;
    private int episodes;
    private int year;
    private int image;
    private String webView;

    public CartooN(String name, double rating, int season, int episodes, int year, int image, String webView) {
        this.name = name;
        this.rating = rating;
        this.season = season;
        this.episodes = episodes;
        this.year = year;
        this.image = image;
        this.webView = webView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getWebView() {
        return webView;
    }

    public void setWebView(String webView) {
        this.webView = webView;
    }
}
