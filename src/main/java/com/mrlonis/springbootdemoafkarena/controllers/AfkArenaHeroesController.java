package com.mrlonis.springbootdemoafkarena.controllers;

import com.mrlonis.springbootdemoafkarena.entities.AfkArenaHeroes;
import com.mrlonis.springbootdemoafkarena.services.AfkArenaHeroesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/afkarena")
@Api(tags = {"AFK Arena"})
public class AfkArenaHeroesController {
    private final AfkArenaHeroesService afkArenaHeroesService;

    @Autowired
    public AfkArenaHeroesController(AfkArenaHeroesService afkArenaHeroesService) {
        this.afkArenaHeroesService = afkArenaHeroesService;
    }

    @ResponseBody
    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(httpMethod = "GET", value = "Fetches all AFK Arena Heroes from the Database", response = AfkArenaHeroes.class)
    public List<AfkArenaHeroes> getAll() {
        return this.afkArenaHeroesService.getAll();
    }
}
