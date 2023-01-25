package com.gr18.qatar2022.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr18.qatar2022.data.entity.Match;
import com.gr18.qatar2022.data.entity.MatchStats;
import com.gr18.qatar2022.data.entity.Team;
import com.gr18.qatar2022.service.repository.MatchRepository;

@Service
public class MatchService {

    @Autowired
    private MatchRepository repository;

    @Autowired
    private MatchStatsService matchStatsService;

    @Autowired
    private TeamService teamService;

    public List<Match> getAll() {
        return repository.findAll();
    }

    public Match getById(Long id) {
        return repository.findById(id).get();
    }

    public List<Match> getAllByGroup(String group) {
        return repository.findAllByGroup(group);
    }

    public List<Match> getAllByTeam(Long idTeam) {
        return repository.findAllByTeam(idTeam);
    }

    public void save(Match match) {
        repository.save(match);

        match.getHomeTeam().getStatsFromMatch(match.getHomeMatchStats(), match.getAwayMatchStats());
        match.getAwayTeam().getStatsFromMatch(match.getAwayMatchStats(), match.getHomeMatchStats());

        matchStatsService.save(match.getHomeMatchStats());
        matchStatsService.save(match.getAwayMatchStats());

        teamService.updateTeamStats(match.getHomeTeam(), getAllByTeam(match.getHomeTeam().getId()));
        teamService.updateTeamStats(match.getAwayTeam(), getAllByTeam(match.getAwayTeam().getId()));
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

}
