package com.gr18.qatar2022.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gr18.qatar2022.data.entity.MatchStats;

public interface MatchStatsRepository extends JpaRepository<MatchStats, Long> {

}
