package com.ba2364.inclassassignment10_benjamina;

import java.io.Serializable;

public class Team implements Serializable {

    public String teamName;
    public String yearEst;
    public int logoIDNum;

    public Team() {
    }

    public Team(String teamName, String yearEst, int logoIDNum) {
        this.teamName = teamName;
        this.yearEst = yearEst;
        this.logoIDNum = logoIDNum;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getYearEst() {
        return yearEst;
    }

    public void setYearEst(String yearEst) {
        this.yearEst = yearEst;
    }

    public int getLogoIDNum() {
        return logoIDNum;
    }

    public void setLogoIDNum(int logoIDNum) {
        this.logoIDNum = logoIDNum;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", yearEst='" + yearEst + '\'' +
                ", logoIDNum=" + logoIDNum +
                '}';
    }
}