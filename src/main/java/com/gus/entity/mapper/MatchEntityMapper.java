package com.gus.entity.mapper;

import com.gus.entity.MatchEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MatchEntityMapper implements RowMapper<MatchEntity> {

    @Override
    public MatchEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        MatchEntity entity = new MatchEntity();
        entity.setMatchId(resultSet.getInt("match_id"));
        entity.setMatchStaticId(resultSet.getInt("match_static_id"));
        entity.setMatchCompId(resultSet.getInt("match_comp_id"));
        entity.setMatchLocalteamId(resultSet.getInt("match_localteam_id"));
        entity.setMatchLocalteamScore(resultSet.getInt("match_localteam_score"));
        entity.setMatchVisitorteamId(resultSet.getInt("match_cisitorteam_id"));
        entity.setMatchVisitorteamScore(resultSet.getInt("match_cisitorteam_score"));
        entity.setLocalteamName(resultSet.getString("match_localteam_name"));
        entity.setVisitorteamName(resultSet.getString("match_visitorteam_name"));
        entity.setMatchDate(resultSet.getString("match_date"));
        entity.setMatchFormattedDate(resultSet.getString("match_formatted_date"));
        entity.setMatchStatus(resultSet.getString("match_status"));
        entity.setMatchTimer(resultSet.getString("match_timer"));
        entity.setMatchTime(resultSet.getString("match_time"));
        entity.setMatchCommentaryAvailable(resultSet.getString("match_commentary_available"));
        entity.setMatchHtScore(resultSet.getString("match_ht_score"));
        entity.setMatchFtScore(resultSet.getString("match_ft_score"));
        entity.setMatchEtScore(resultSet.getString("match_et_score"));
        return entity;
    }
}
