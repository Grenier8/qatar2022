package com.gr18.qatar2022.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr18.qatar2022.data.entity.Team;
import com.gr18.qatar2022.service.repository.TeamRepository;

@Service
public class TeamService {

    @Autowired
    private TeamRepository repository;

    public List<Team> getAll() {
        return repository.findAll();
    }

    public Team getById(Long id) {
        return repository.findById(id).get();
    }

    public void save(Team team) {
        repository.save(team);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

}
