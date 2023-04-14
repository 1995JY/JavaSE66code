package com.itheima.domain;

import java.util.Objects;

public class Movie {
    private String name;
    private double score;
    private String actor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.score, score) == 0 && Objects.equals(name, movie.name) && Objects.equals(actor, movie.actor);
    }

    public Movie() {
    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     *
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * 获取
     *
     * @return actor
     */
    public String getActor() {
        return actor;
    }

    /**
     * 设置
     *
     * @param actor
     */
    public void setActor(String actor) {
        this.actor = actor;
    }

    public String toString() {
        return "Movie{name = " + name + ", score = " + score + ", actor = " + actor + "}";
    }
}
