package com.AnimeAPI.controller;

import com.AnimeAPI.entity.Anime;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class AnimeController {
    private List<Anime> animeList = new ArrayList<>();

    public AnimeController() {
        this.animeList.addAll(List.of(
                new Anime (1,"Магическая битва", "MAPPA", 24)
        ));
    }

    @GetMapping("/anime")
    Iterable<Anime> getAnime() {
        return animeList;
    }

    @GetMapping("/anime/{id}")
    Optional<Anime> getAnimeById(@PathVariable int id) {
        for (Anime a: animeList) {
            if (a.getId() == id) {
                return Optional.of(a);
            }
        }
        return Optional.empty();
    }

    @PostMapping("/anime")
    Anime postAnime(@RequestBody Anime anime) {
        animeList.add(anime);
        return anime;
    }

    @DeleteMapping("/anime/{id}")
    void deleteAnime(@PathVariable int id) {
        animeList.removeIf(b -> b.getId() == id);
    }
}
