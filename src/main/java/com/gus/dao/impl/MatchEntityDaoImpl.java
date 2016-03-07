package com.gus.dao.impl;

import com.gus.entity.MatchEntity;
import com.gus.entity.mapper.MatchEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatchEntityDaoImpl implements MatchEntityDao{

    private static final String INSERT_MATCH = "call public.ins_matches(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_MATCHES = "select * from public.matches";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private MatchEntityMapper matchEntityMapper;

    @Override
    public List<MatchEntity> findAll() {
        return jdbcTemplate.query(SELECT_ALL_MATCHES, matchEntityMapper);
    }

    @Override
    public MatchEntity findById(int id) {
        return null;
    }

    @Override
    public void persist(MatchEntity entity) {
        jdbcTemplate.update(INSERT_MATCH,
                entity.getMatchId(),
                entity.getMatchStaticId(),
                entity.getMatchCompId(),
                entity.getMatchDate(),
                entity.getMatchFormattedDate(),
                entity.getMatchStatus(),
                entity.getMatchTimer(),
                entity.getMatchTime(),
                entity.getMatchCommentaryAvailable(),
                entity.getMatchLocalteamId(),
                entity.getMatchLocalteamName(),
                entity.getMatchLocalteamScore(),
                entity.getMatchVisitorteamId(),
                entity.getMatchVisitorteamName(),
                entity.getMatchVisitorteamScore(),
                entity.getMatchHtScore(),
                entity.getMatchFtScore(),
                entity.getMatchEtScore());
    }
}
