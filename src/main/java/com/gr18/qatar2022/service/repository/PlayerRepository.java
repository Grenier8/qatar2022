package com.gr18.qatar2022.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gr18.qatar2022.data.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
