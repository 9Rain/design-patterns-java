package com.dio.designpatternsimplementation.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    private String mainAttack;
    @ElementCollection(targetClass=String.class)
    private List<String> weaknesses;
    @ElementCollection(targetClass=String.class)
    private List<String> strengths;

    public Pokemon() {

    }

    public Pokemon(String name, List<String> weaknesses, List<String> strengths, String type, String mainAttack) {
        this.name = name;
        this.weaknesses = weaknesses;
        this.strengths = strengths;
        this.type = type;
        this.mainAttack = mainAttack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMainAttack() {
        return mainAttack;
    }

    public void setMainAttack(String mainAttack) {
        this.mainAttack = mainAttack;
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<String> strengths) {
        this.strengths = strengths;
    }
}
