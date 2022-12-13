package com.gr18.qatar2022.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr18.qatar2022.data.entity.Player;
import com.gr18.qatar2022.service.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public List<Player> getAll() {
        return repository.findAll();
    }

    public Player getById(Long id) {
        return repository.findById(id).get();
    }

    public void save(Player player) {
        repository.save(player);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
