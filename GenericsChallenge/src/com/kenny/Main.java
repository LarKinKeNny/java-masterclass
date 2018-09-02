package com.kenny;

public class Main {

    public static void main(String[] args) {
	    Team<RugbyTeam> aussies = new Team<>("Aussies");
	    Team<RugbyTeam> boks = new Team<>("Boks");
	    Team<FootballTeam> bafana = new Team<>("Bafana");
	    Team<CricketTeam> proteas = new Team<>("Proteas");
	    Team<CricketTeam> titans = new Team<>("Titans");
	    LeagueTable<RugbyTeam> rugbyScoreBoard = new LeagueTable<>("Rugby");
	    LeagueTable<CricketTeam> cricketScoreBoard = new LeagueTable<>("Cricket");
	    LeagueTable<FootballTeam> footballScoreBoard = new LeagueTable<>("Football");


        boks.calculateResult(aussies, 15, 9);
        boks.calculateResult(aussies, 10, 52);
		aussies.calculateResult(boks, 50, 25);
		aussies.calculateResult(boks, 33, 12);


        titans.calculateResult(proteas,198, 198);
        proteas.calculateResult(titans,512, 280);

	    rugbyScoreBoard.addTeam(aussies);
	    rugbyScoreBoard.addTeam(boks);
	    cricketScoreBoard.addTeam(proteas);
	    cricketScoreBoard.addTeam(titans);
	    footballScoreBoard.addTeam(bafana);
	    rugbyScoreBoard.printBoard();
        System.out.println();
        cricketScoreBoard.printBoard();
        System.out.println();
        footballScoreBoard.printBoard();
    }
}
