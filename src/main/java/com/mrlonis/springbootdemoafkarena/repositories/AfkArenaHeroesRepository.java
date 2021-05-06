package com.mrlonis.springbootdemoafkarena.repositories;

import com.mrlonis.springbootdemoafkarena.entities.AfkArenaHeroes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfkArenaHeroesRepository extends JpaRepository<AfkArenaHeroes, Integer> {
    List<AfkArenaHeroes> getAll();
}
