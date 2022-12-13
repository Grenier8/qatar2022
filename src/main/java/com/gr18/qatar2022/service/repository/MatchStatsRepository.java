package com.gr18.qatar2022.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gr18.qatar2022.data.entity.MatchStats;

@Repository
public interface MatchStatsRepository extends JpaRepository<MatchStats, Long> {

}
