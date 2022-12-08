package com.gr18.qatar2022.data.entity;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Match")
@Table(name = "match")
public class Match {
    @Id
    @SequenceGenerator(name = "match_sequence", sequenceName = "match_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "match_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "id_home_team", nullable = false)
    private Long idHomeTeam;

    @Column(name = "id_away_team", nullable = false)
    private Long idAwayTeam;

    public Match() {
    }

    public Match(Long id, Long idHomeTeam, Long idAwayTeam) {
        this.id = id;
        this.idHomeTeam = idHomeTeam;
        this.idAwayTeam = idAwayTeam;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdHomeTeam() {
        return this.idHomeTeam;
    }

    public void setIdHomeTeam(Long idHomeTeam) {
        this.idHomeTeam = idHomeTeam;
    }

    public Long getIdAwayTeam() {
        return this.idAwayTeam;
    }

    public void setIdAwayTeam(Long idAwayTeam) {
        this.idAwayTeam = idAwayTeam;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", idHomeTeam='" + getIdHomeTeam() + "'" +
                ", idAwayTeam='" + getIdAwayTeam() + "'" +
                "}";
    }

}
