package com.kenny;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LeagueTable<T extends Team> {
    private List<Team<T>> leagueList = new ArrayList<>();
    private String name;

    public LeagueTable(String leagueName) {
        this.name = leagueName;
    }

    public void addTeam(Team<T> team){
      leagueList.add(team);
      Collections.sort(leagueList);
    }

    public void printBoard(){
        System.out.println("*****" + this.name + "****");
        System.out.println("****Team****Points***");
        int count = 1;
        for (Team team: leagueList) {
            System.out.println(count + ".\t" + team.getName() + "\t\t" + team.getPoints());
            count++;
        }
    }


}
