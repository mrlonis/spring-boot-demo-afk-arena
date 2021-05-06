package com.mrlonis.springbootdemoafkarena.controllers;

import com.mrlonis.springbootdemoafkarena.entities.AfkArenaHeroes;
import com.mrlonis.springbootdemoafkarena.services.AfkArenaHeroesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afkarena")
public class AfkArenaHeroesController {
    private final AfkArenaHeroesService afkArenaHeroesService;

    @Autowired
    public AfkArenaHeroesController(AfkArenaHeroesService afkArenaHeroesService) {
        this.afkArenaHeroesService = afkArenaHeroesService;
    }

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AfkArenaHeroes>> getAll() {
        List<AfkArenaHeroes> response = this.afkArenaHeroesService.getAll();
        return ResponseEntity.ok(response);
    }
}
