package com.gr18.qatar2022.data.entity;

import static jakarta.persistence.GenerationType.SEQUENCE;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name = "Match")
@Table(name = "match")
public class Match {
    @Id
    @SequenceGenerator(name = "match_sequence", sequenceName = "match_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "match_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "ended")
    private Boolean ended;

    @ManyToOne
    @JoinColumn(name = "id_home_team", referencedColumnName = "id", nullable = false)
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "id_away_team", referencedColumnName = "id", nullable = false)
    private Team awayTeam;

    @ManyToOne
    @JoinColumn(name = "id_home_match_stats", referencedColumnName = "id", nullable = false)
    private MatchStats homeMatchStats;

    @ManyToOne
    @JoinColumn(name = "id_away_match_stats", referencedColumnName = "id", nullable = false)
    private MatchStats awayMatchStats;

    public Match() {
    }

    public Match(Long id, Date date, Team homeTeam, Team awayTeam, MatchStats homeMatchStats,
            MatchStats awayMatchStats) {
        this.id = id;
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeMatchStats = homeMatchStats;
        this.awayMatchStats = awayMatchStats;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getAwayTeam() {
        return this.awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return this.homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MatchStats getHomeMatchStats() {
        return this.homeMatchStats;
    }

    public void setHomeMatchStats(MatchStats homeMatchStats) {
        this.homeMatchStats = homeMatchStats;
    }

    public MatchStats getAwayMatchStats() {
        return this.awayMatchStats;
    }

    public void setAwayMatchStats(MatchStats awayMatchStats) {
        this.awayMatchStats = awayMatchStats;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", homeTeam='" + getHomeTeam() + "'" +
                ", awayTeam='" + getAwayTeam() + "'" +
                "}";
    }

}
