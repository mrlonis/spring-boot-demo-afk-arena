package com.mrlonis.springdataoperations.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AfkArena_Heroes")
public class AfkArenaHeroes implements ProjectEntity {
    @Id
    @Column(name = "HeroId")
    private Integer heroId;

    @Column(name = "HeroName")
    private String heroName;

    @Column(name = "AscensionLevel")
    private String ascensionLevel;

    @Column(name = "OnCrystal")
    private Boolean onCrystal;

    @Column(name= "Copies")
    private Integer copies;
}
