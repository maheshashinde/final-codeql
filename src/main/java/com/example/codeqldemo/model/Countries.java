package com.example.codeqldemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Countries {
    @Id
    private Integer id;
    private String name;
    private Integer population;

    public Countries(Integer id, String name, Integer population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public Countries() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
