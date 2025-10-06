package com.example.countriesapp.model;

import java.util.List;

public class Model {
    private String title;
    private String description;
    private List<String> images;
    private String videoPath;

    public Model(String title, String description, List<String> images, String videoPath) {
        this.title = title;
        this.description = description;
        this.images = images;
        this.videoPath = videoPath;
    }

    // Getters for Thymeleaf
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getImages() {
        return images;
    }

    public String getVideoPath() {
        return videoPath;
    }
}
