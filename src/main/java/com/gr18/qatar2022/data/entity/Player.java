package com.gr18.qatar2022.data.entity;

import static jakarta.persistence.GenerationType.SEQUENCE;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Player")
@Table(name = "table")
public class Player {
    @Id
    @SequenceGenerator(name = "player_sequence", sequenceName = "player_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "player_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "goals", nullable = false)
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "yellow_cards")
    private Integer yellowCards;

    @Column(name = "red_cards")
    private Integer redCards;

    @Column(name = "id_team")
    private Long idTeam;

    public Player() {
    }

    public Player(Long id, String name, Integer goals, Integer assists, Integer yellowCards, Integer redCards,
            Long idTeam) {
        this.id = id;
        this.name = name;
        this.goals = goals;
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.idTeam = idTeam;
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

    public Integer getGoals() {
        return this.goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return this.assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
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

    public Long getIdTeam() {
        return this.idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", goals='" + getGoals() + "'" +
                ", assists='" + getAssists() + "'" +
                ", yellowCards='" + getYellowCards() + "'" +
                ", redCards='" + getRedCards() + "'" +
                "}";
    }

}
