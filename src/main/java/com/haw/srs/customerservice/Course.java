package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
//@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer anzahlTeilnehmer;

    public Course(String name) {
        this.name = name;
        anzahlTeilnehmer = 0;
    }

    public void incrementAnzahlTeilnehmer() {
        anzahlTeilnehmer++;
    }

    public void decrementAnzahlTeilnehmer() {
        if (anzahlTeilnehmer > 0) {
            throw new IllegalArgumentException("Number of persons in a course may not be negative.");
        }
        anzahlTeilnehmer--;
    }
}
