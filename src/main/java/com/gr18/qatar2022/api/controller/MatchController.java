package com.gr18.qatar2022.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gr18.qatar2022.data.entity.Match;
import com.gr18.qatar2022.service.MatchService;

@CrossOrigin(origins = { "*" }, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("/api/v1/matches")
public class MatchController {

    @Autowired
    private MatchService service;

    @GetMapping(path = "/")
    public List<Match> getAll() {
        return service.getAll();
    }

    @GetMapping(path = "/{id}")
    public Match getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping(path = "/group/{group}/")
    public List<Match> getAllByGroup(@PathVariable String group) {
        return service.getAllByGroup(group);
    }

    @PostMapping(path = "/")
    public void save(@RequestBody Match match) {
        service.save(match);
    }

    @PutMapping(path = "/")
    public void update(@RequestBody Match match) {
        service.save(match);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
