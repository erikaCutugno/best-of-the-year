package org.lessons.best.year.java.best_of_the_year.controller;

public class Movie {
    private String title;
    private Integer id;

    public Movie(String title, Integer id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
