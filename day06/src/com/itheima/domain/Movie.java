package com.itheima.domain;

import java.util.Objects;

public class Movie {
    private String name;
    private Double Score;
    private String actor;

    public Movie() {
    }

    public Movie(String name, Double score, String actor) {
        this.name = name;
        Score = score;
        this.actor = actor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && Objects.equals(Score, movie.Score) && Objects.equals(actor, movie.actor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                ", actor='" + actor + '\'' +
                '}';
    }
}
