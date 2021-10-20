package com.dio.pokemontypeapi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ElementCollection(targetClass=String.class)
    private List<String> weaknesses;
    @ElementCollection(targetClass=String.class)
    private List<String> strengths;

    public Type() {
        weaknesses = new ArrayList<>();
        strengths = new ArrayList<>();
    }

    public Type(String name, List<String> weaknesses, List<String> strengths) {
        this.name = name;
        this.weaknesses = weaknesses;
        this.strengths = strengths;
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
