package com.mrlonis.springdataoperations.services;

import com.mrlonis.springdataoperations.entities.AfkArenaHeroes;
import com.mrlonis.springdataoperations.repositories.AfkArenaHeroesRepository;
import com.mrlonis.springdataoperations.repositories.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return afkArenaHeroesRepository.getAll();
    }
}
