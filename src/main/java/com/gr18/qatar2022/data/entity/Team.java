package com.gr18.qatar2022.data.entity;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Team")
@Table(name = "team")
public class Team {
    @Id
    @SequenceGenerator(name = "team_sequence", sequenceName = "team_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "team_sequence")
    private Long id;

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

    public Team(Long id, Integer goalsFor, Integer goalsAgainst, Integer yellowCards, Integer redCards) {
        this.id = id;
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

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", goalsFor='" + getGoalsFor() + "'" +
                ", goalsAgainst='" + getGoalsAgainst() + "'" +
                ", yellowCards='" + getYellowCards() + "'" +
                ", redCards='" + getRedCards() + "'" +
                "}";
    }

}
