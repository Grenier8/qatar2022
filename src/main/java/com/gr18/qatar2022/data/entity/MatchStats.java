package com.gr18.qatar2022.data.entity;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "MatchStats")
@Table(name = "match_stats")
public class MatchStats {
    @Id
    @SequenceGenerator(name = "match_stats_sequence", sequenceName = "match_stats_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "match_stats_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "goals", nullable = false)
    private Integer goals;

    @Column(name = "yellow_cards", nullable = false)
    private Integer yellowCards;

    @Column(name = "red_cards", nullable = false)
    private Integer redCards;

    @Column(name = "possession")
    private Integer possession;

    public MatchStats() {
    }

    public MatchStats(Integer goals, Integer yellowCards, Integer redCards, Integer possession) {
        this.goals = goals;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.possession = possession;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGoals() {
        return this.goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
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

    public Integer getPossession() {
        return this.possession;
    }

    public void setPossession(Integer possession) {
        this.possession = possession;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", goals='" + getGoals() + "'" +
                ", yellowCards='" + getYellowCards() + "'" +
                ", redCards='" + getRedCards() + "'" +
                ", possession='" + getPossession() + "'" +
                "}";
    }

}
