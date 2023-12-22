package com.AnimeAPI.entity;

public class Anime {
    private int id;
    private String nameAnime;
    private String studio;
    private int quantityEpisode;

    public Anime(int id, String nameAnime, String studio, int quantityEpisode) {
        this.id = id;
        this.nameAnime = nameAnime;
        this.studio = studio;
        this.quantityEpisode = quantityEpisode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAnime() {
        return nameAnime;
    }

    public void setNameAnime(String nameAnime) {
        this.nameAnime = nameAnime;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getQuantityEpisode() {
        return quantityEpisode;
    }

    public void setQuantityEpisode(int quantityEpisode) {
        this.quantityEpisode = quantityEpisode;
    }
}
