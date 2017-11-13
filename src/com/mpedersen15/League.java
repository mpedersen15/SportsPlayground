package com.mpedersen15;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Matt on 11/12/2017.
 */
public class League<T extends Player> {
    private String name;
    private ArrayList<Team<T>> teamList = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(Team<T> team){
        this.teamList.add(team);
    }

    public void printStandings() {
        Collections.sort(teamList);
        for (Team team : teamList) {
            System.out.println(team.getName() + " - " + team.getPoints() + " pts");
        }
    }
}
