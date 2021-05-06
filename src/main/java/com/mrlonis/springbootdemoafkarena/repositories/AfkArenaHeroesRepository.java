package com.mrlonis.springbootdemoafkarena.repositories;

import com.mrlonis.springbootdemoafkarena.entities.AfkArenaHeroes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "afkArenaHeroes", path = "afkArenaHeroes")
public interface AfkArenaHeroesRepository extends JpaRepository<AfkArenaHeroes, Integer> {
    List<AfkArenaHeroes> findAll();
}
