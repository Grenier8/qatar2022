package com.gr18.qatar2022.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gr18.qatar2022.data.entity.Player;
import com.gr18.qatar2022.service.PlayerService;

@RestController
@RequestMapping(path = "/api/v1/players")
public class PlayerController {
    @Autowired
    private PlayerService service;

    @GetMapping(path = "/")
    public List<Player> getAll() {
        return service.getAll();
    }

    @GetMapping(path = "/{id}")
    public Player getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping(path = "/")
    public void save(@RequestBody Player player) {
        service.save(player);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
