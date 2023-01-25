package com.gr18.qatar2022.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gr18.qatar2022.data.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query(value = "SELECT * FROM match,team WHERE match.phase = 1 AND match.id_home_team = team.id AND team.group_name = ?1", nativeQuery = true)
    List<Match> findAllByGroup(String group);

    @Query(value = "SELECT * FROM match WHERE match.phase = 1 AND (match.id_home_team = ?1 OR match.id_away_team = ?1)", nativeQuery = true)
    List<Match> findAllByTeam(Long idTeam);

    // List<Match> findAllByGroup(String group);
}
