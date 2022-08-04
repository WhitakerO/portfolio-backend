package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "percentage")
    private int percentage;
    @Column(name = "islanguage")
    private boolean islanguage;
    @Column(name = "image")
    private String image;

    public Skill() {
    }

    public Skill(Long id, String name, int percentage, boolean islanguage, String image) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.islanguage = islanguage;
        this.image = image;
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

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public boolean isIslanguage() {
        return islanguage;
    }

    public void setIslanguage(boolean islanguage) {
        this.islanguage = islanguage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}