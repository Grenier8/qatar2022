package com.gr18.qatar2022.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr18.qatar2022.data.entity.Match;
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

    public List<Team> getAllByGroup(String group) {
        return repository.findAllByGroup(group);
    }

    public void save(Team team) {
        repository.save(team);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void updateTeamStats(Team team, List<Match> matches) {
        int points = 0;
        int goalsFor = 0;
        int goalsAgainst = 0;
        for (Match match : matches) {
            points += match.getPointsForTeam(team);
            goalsFor += match.getGoalsForForTeam(team);
            goalsAgainst += match.getGoalsAgainstForTeam(team);
        }

        team.setPoints(points);
        team.setGoalsFor(goalsFor);
        team.setGoalsAgainst(goalsAgainst);

        save(team);
    }

}
