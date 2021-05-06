package com.mrlonis.springdataoperations.repositories;

import com.mrlonis.springdataoperations.entities.AfkArenaHeroes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfkArenaHeroesRepository extends JpaRepository<AfkArenaHeroes, Integer> {
    List<AfkArenaHeroes> getAll();
}
