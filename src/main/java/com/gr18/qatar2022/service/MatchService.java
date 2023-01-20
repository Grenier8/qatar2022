package com.gr18.qatar2022.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gr18.qatar2022.data.entity.Match;
import com.gr18.qatar2022.service.repository.MatchRepository;

@Service
public class MatchService {

    @Autowired
    private MatchRepository repository;

    public List<Match> getAll() {
        return repository.findAll();
    }

    public Match getById(Long id) {
        return repository.findById(id).get();
    }

    public List<Match> getAllByGroup(String group) {
        return repository.findAllByGroup(group);
    }

    public void save(Match match) {
        repository.save(match);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

}
