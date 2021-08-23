package com.eni.TP.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Superpouvoir {

    @Id // Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incrémenté
    private int id;
    private String name;
    private String description;
    private int maxscore;

    public Superpouvoir() {
    }


    public Superpouvoir(String name, String description, int maxscore) {
        this.name = name;
        this.description = description;
        this.maxscore = maxscore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxscore() {
        return maxscore;
    }

    public void setMaxscore(int maxscore) {
        this.maxscore = maxscore;
    }

    @Override
    public String toString() {
        return "Superpouvoir{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", maxscore=" + maxscore +
                '}';
    }
}
