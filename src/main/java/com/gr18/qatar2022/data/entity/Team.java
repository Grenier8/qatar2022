package com.gr18.qatar2022.data.entity;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity(name = "Team")
@Table(name = "team", uniqueConstraints = {
        @UniqueConstraint(name = "team_name_unique", columnNames = "name"),
        @UniqueConstraint(name = "team_small_name_unique", columnNames = "small_name")
})
public class Team {
    @Id
    @SequenceGenerator(name = "team_sequence", sequenceName = "team_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "team_sequence")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "small_name", nullable = false)
    private String smallName;

    @Column(name = "goals_for", nullable = false)
    private Integer goalsFor;

    @Column(name = "goals_against", nullable = false)
    private Integer goalsAgainst;

    @Column(name = "yellow_cards", nullable = false)
    private Integer yellowCards;

    @Column(name = "red_cards", nullable = false)
    private Integer redCards;

    public Team() {
    }

    public Team(Long id, String name, String smallName, Integer goalsFor, Integer goalsAgainst, Integer yellowCards,
            Integer redCards) {
        this.id = id;
        this.name = name;
        this.smallName = smallName;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmallName() {
        return this.smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }

    public Integer getGoalsFor() {
        return this.goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return this.goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getYellowCards() {
        return this.yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getRedCards() {
        return this.redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

}
