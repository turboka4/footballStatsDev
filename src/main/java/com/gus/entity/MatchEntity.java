package com.gus.entity;

import java.util.Collection;

public class MatchEntity {
    private int match_id;
    private int match_static_id;
    private int match_comp_id;
    private String match_date;
    private String match_formatted_date;
    private String match_status;
    private String match_timer;
    private String match_time;
    private String match_commentary_available;
    private int match_localteam_id;
    private String match_localteam_name;
    private int match_localteam_score;
    private int match_visitorteam_id;
    private String match_visitorteam_name;
    private int match_visitorteam_score;
    private String match_ht_score;
    private String match_ft_score;
    private String match_et_score;

    private Collection<MatchEventEntity> events;

    public int getMatchId() { return match_id; }

    public int getMatchStaticId() { return match_static_id; }

    public int getMatchCompId() { return match_comp_id; }

    public int getMatchLocalteamId() { return match_localteam_id; }

    public int getMatchLocalteamScore() { return match_localteam_score; }

    public int getMatchVisitorteamId() { return match_visitorteam_id; }

    public int getMatchVisitorteamScore() { return match_visitorteam_score; }

    public String getMatchLocalteamName() { return match_localteam_name; }

    public String getMatchVisitorteamName() { return match_visitorteam_name; }

    public String getMatchDate() { return match_date; }

    public String getMatchFormattedDate() { return match_formatted_date; }

    public String getMatchStatus() { return match_status; }

    public String getMatchTimer() { return match_timer; }

    public String getMatchTime() { return match_time; }

    public String getMatchCommentaryAvailable() { return match_commentary_available; }

    public String getMatchHtScore() { return match_ht_score; }

    public String getMatchFtScore() { return match_ft_score; }

    public String getMatchEtScore() { return match_et_score; }

    public Collection<MatchEventEntity> getMatchEvents() { return events; }

    public void setMatchId(int match_id) { this.match_id = match_id; }

    public void setMatchStaticId(int match_static_id) { this.match_static_id = match_static_id; }

    public void setMatchCompId(int match_comp_id) { this.match_comp_id = match_comp_id; }

    public void setMatchLocalteamId(int match_localteam_id) { this.match_localteam_id = match_localteam_id; }

    public void setMatchLocalteamScore(int match_localteam_score) { this.match_localteam_score = match_localteam_score; }

    public void setMatchVisitorteamId(int match_visitorteam_id) { this.match_visitorteam_id = match_visitorteam_id; }

    public void setMatchVisitorteamScore(int match_visitorteam_score) { this.match_visitorteam_score = match_visitorteam_score; }

    public void setLocalteamName(String match_localteam_name) { this.match_localteam_name = match_localteam_name; }

    public void setVisitorteamName(String match_visitorteam_name) { this.match_visitorteam_name = match_visitorteam_name; }

    public void setMatchDate(String match_date) { this.match_date = match_date; }

    public void setMatchFormattedDate(String match_formatted_date) { this.match_formatted_date = match_formatted_date; }

    public void setMatchStatus(String match_status) { this.match_status = match_status; }

    public void setMatchTimer(String match_timer) { this.match_timer = match_timer; }

    public void setMatchTime(String match_time) { this.match_time = match_time; }

    public void setMatchCommentaryAvailable(String match_commentary_available) { this.match_commentary_available = match_commentary_available; }

    public void setMatchHtScore(String match_ht_score) { this.match_ht_score = match_ht_score; }

    public void setMatchFtScore(String match_ft_score) { this.match_ft_score = match_ft_score; }

    public void setMatchEtScore(String match_et_score) { this.match_et_score = match_et_score; }

    public void setMatchEvents(Collection<MatchEventEntity> events) { this.events = events; }




}

