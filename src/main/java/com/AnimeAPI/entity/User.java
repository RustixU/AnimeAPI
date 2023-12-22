package com.AnimeAPI.entity;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int quantityAnime;

    public User(int id, String firstName, String lastName, int quantityAnime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.quantityAnime = quantityAnime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getQuantityAnime() {
        return quantityAnime;
    }

    public void setQuantityAnime(int quantityAnime) {
        this.quantityAnime = quantityAnime;
    }
}
