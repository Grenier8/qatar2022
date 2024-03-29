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

import com.gr18.qatar2022.data.entity.Team;
import com.gr18.qatar2022.service.TeamService;

@CrossOrigin(origins = { "*" }, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping(path = "/api/v1/teams")
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping(path = "/")
    public List<Team> getAll() {
        return service.getAll();
    }

    @GetMapping(path = "/{id}")
    public Team getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping(path = "/group/{group}/")
    public List<Team> getAllByGroup(@PathVariable String group) {
        return service.getAllByGroup(group);
    }

    @PostMapping(path = "/")
    public void save(@RequestBody Team team) {
        service.save(team);
    }

    @PutMapping(path = "/")
    public void update(@RequestBody Team team) {
        service.save(team);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
