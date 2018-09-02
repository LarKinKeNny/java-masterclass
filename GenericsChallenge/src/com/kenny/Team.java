package com.kenny;

public class Team<T> implements Comparable<Team<T>>{
    private String name;
    private int points = 0;
    private int gamesWon = 0;
    private int gamesLost = 0;
    private int gamesDrawn = 0;

    public Team(String name) {
        this.name = name;
    }

    public void calculateResult(Team <T> opponent, int ownScore, int opponentScore ){
        if(ownScore > opponentScore){
            this.gamesWon++;
            opponent.gamesLost++;
        }else if(opponentScore > ownScore){
            opponent.gamesWon++;
            this.gamesLost++;
        }else{
            this.gamesDrawn++;
            opponent.gamesDrawn++;
        }
        this.calculatePoints();
        opponent.calculatePoints();
    }

    private void calculatePoints(){
        this.points = (this.gamesWon*5) +(this.gamesDrawn * 2) + this.gamesLost;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesDrawn() {
        return gamesDrawn;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.points > team.points){
            return -1;
        }else if(this.points < team.points){
            return 1;
        }else{
            return 0;
        }
    }
}
