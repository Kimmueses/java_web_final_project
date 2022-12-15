package com.example.java_web_final_project.Models;

import jakarta.persistence.*;

@Entity
public class Travel {

    // instances
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String countryName;
    @Column
    private String landmarkName;

    // default constructor
    public Travel() {

    }

    // constructors
    public Travel(Integer id) {
        this.id = id;
    }

    public Travel(String countryName) {
        this.countryName = countryName;
    }

    public String getLandmarkName() {
        return landmarkName;
    }

    // getters & setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return countryName;
    }

    public void setCountry(String country) {
        this.countryName = country;
    }

    public String getLandmark() {
        return landmarkName;
    }

    public void setLandmark(String landmark) {
        this.landmarkName = landmark;
    }

    // toString
    @Override
    public String toString() {
        return "Travel{" +
                "id=" + id +
                ", country='" + countryName + '\'' +
                ", landmark='" + landmarkName + '\'' +
                '}';
    }
}
