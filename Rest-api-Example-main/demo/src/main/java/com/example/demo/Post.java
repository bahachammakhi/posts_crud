package com.example.demo;

public class Post {
    private Long id;
    private String name;
    private String description;
    private Float likes;
    private Float date;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Float getLikes() {
        return this.likes;
    }

    public void setLikes(Float likes) {
        this.likes = likes;
    }

     public Float getDate() {
        return this.date;
    }

    public void setDate(Float date) {
        this.date = date;
    }
}
