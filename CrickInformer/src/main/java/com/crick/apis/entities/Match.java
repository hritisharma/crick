package com.crick.apis.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "crick_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String matchNumberValue;

    private String battingTeam;

    private String battingTeamScore;

    private String ballTeam;

    private String ballTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date = new Date();


    public Match(int matchId, String teamHeading, String matchNumberValue, String battingTeam, String battingTeamScore, String ballTeam, String ballTeamScore, String liveText, String matchLink, String textComplete, MatchStatus status) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberValue = matchNumberValue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.ballTeam = ballTeam;
        this.ballTeamScore = ballTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
    }

    public Match() {
    }

    public void setStatus()
    {
        if(textComplete.isBlank())
        {
            this.status = MatchStatus.LIVE;
        }
        else
        {
            this.status = MatchStatus.COMPLETED;
        }
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberValue() {
        return matchNumberValue;
    }

    public void setMatchNumberValue(String matchNumberValue) {
        this.matchNumberValue = matchNumberValue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBallTeam() {
        return ballTeam;
    }

    public void setBallTeam(String ballTeam) {
        this.ballTeam = ballTeam;
    }

    public String getBallTeamScore() {
        return ballTeamScore;
    }

    public void setBallTeamScore(String ballTeamScore) {
        this.ballTeamScore = ballTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
    }

    public void setBowlTeam(String bowlTeam) {
    }

    public void setBowlTeamScore(String bowlTeamScore) {
    }

    public void setMatchStatus() {
    }
}
