package com.lourenco.JogosInfMascAAE;

public class Game {
    String TeamA;
    String TeamB;
    String GameResultSets;
    String GameResultParcials;
    String LinkVideo;
    String Scout;
    int FotoA;
    int FotoB;

    public Game(String teamA, String teamB, String gameResultSets, String gameResultParcials, String linkVideo, String scout, int fotoA, int fotoB) {
        this.TeamA = teamA;
        this.TeamB = teamB;
        this.GameResultSets = gameResultSets;
        this.GameResultParcials = gameResultParcials;
        this.LinkVideo = linkVideo;
        this.Scout = scout;
        this.FotoA = fotoA;
        this.FotoB = fotoB;
    }

    public String getTeamA() {
        return TeamA;
    }

    public void setTeamA(String teamA) {
        this.TeamA = teamA;
    }

    public String getTeamB() {
        return TeamB;
    }

    public void setTeamB(String teamB) {
        this.TeamB = teamB;
    }

    public String getGameResultSets() {
        return GameResultSets;
    }

    public void setGameResultSets(String gameResultSets) {
        this.GameResultSets = gameResultSets;
    }

    public String getGameResultParcials() {
        return GameResultParcials;
    }

    public void setGameResultParcials(String gameResultParcials) {
        this.GameResultParcials = gameResultParcials;
    }

    public String getLinkVideo() {
        return LinkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.LinkVideo = linkVideo;
    }

    public String getScout() {
        return Scout;
    }

    public void setScout(String scout) {
        this.Scout = scout;
    }

    public int getFotoA() {
        return FotoA;
    }

    public void setFotoA(int fotoA) {
        this.FotoA = fotoA;
    }

    public int getFotoB() {
        return FotoB;
    }

    public void setFotoB(int fotoB) {
        this.FotoB = fotoB;
    }
}

