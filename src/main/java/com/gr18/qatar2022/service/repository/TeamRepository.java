package com.gr18.qatar2022.service.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gr18.qatar2022.data.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
