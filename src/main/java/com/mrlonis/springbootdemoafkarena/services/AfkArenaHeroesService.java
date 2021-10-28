package com.mrlonis.springbootdemoafkarena.services;

import com.mrlonis.springbootdemoafkarena.entities.AfkArenaHeroes;
import com.mrlonis.springbootdemoafkarena.repositories.AfkArenaHeroesRepository;
import com.mrlonis.springbootdemoafkarena.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AfkArenaHeroesService {
    private final ProjectRepository projectRepository;
    private final AfkArenaHeroesRepository afkArenaHeroesRepository;

    @Autowired
    public AfkArenaHeroesService(AfkArenaHeroesRepository afkArenaHeroesRepository,
                                 ProjectRepository projectRepository) {
        this.afkArenaHeroesRepository = afkArenaHeroesRepository;
        this.projectRepository = projectRepository;
    }

    public List<AfkArenaHeroes> getAll() {
        return afkArenaHeroesRepository.findAll();
    }
}
