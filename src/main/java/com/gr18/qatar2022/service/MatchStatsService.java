package com.gr18.qatar2022.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr18.qatar2022.data.entity.MatchStats;
import com.gr18.qatar2022.service.repository.MatchStatsRepository;

@Service
public class MatchStatsService {
    @Autowired
    private MatchStatsRepository repository;

    public List<MatchStats> getAll() {
        return repository.findAll();
    }

    public MatchStats getById(Long id) {
        return repository.findById(id).get();
    }

    public void save(MatchStats matchStats) {
        repository.save(matchStats);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
