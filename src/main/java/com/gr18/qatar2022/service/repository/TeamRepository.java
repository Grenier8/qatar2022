package com.gr18.qatar2022.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gr18.qatar2022.data.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query(value = "SELECT * FROM team WHERE team.group_name = ?1 ORDER BY team.points DESC", nativeQuery = true)
    List<Team> findAllByGroup(String group);

}
