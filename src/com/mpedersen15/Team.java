package com.mpedersen15;

import java.util.ArrayList;

/**
 * Created by Matt on 11/12/2017.
 */
public class Team<T extends Player> implements Comparable<Team>{
    private String name;
    private int gamesWon = 0;
    private int gamesTied = 0;
    private int gamesLost = 0;
    private ArrayList<T> teamMembers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player) {
        this.teamMembers.add(player);
    }

    public void addMatchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            gamesWon++;
        }else if (ourScore < theirScore){
            gamesLost++;
        }else {
            gamesTied++;
        }

        if (opponent != null) {
            opponent.addMatchResult(null, theirScore, ourScore);
        }
    }

    public int getPoints() {
        return (this.gamesWon * 2 + this.gamesTied);
    }

    public void printRoster() {
        System.out.println(this.getName() + " Roster:");
        for (T player : teamMembers) {
            System.out.println(player.getName());
        }
        System.out.println();
    }

    @Override
    public int compareTo(Team team) {
        if (this.getPoints() > team.getPoints()){
            return -1;
        }else if (this.getPoints() < team.getPoints()){
            return 1;
        }

        return 0;
    }
}
