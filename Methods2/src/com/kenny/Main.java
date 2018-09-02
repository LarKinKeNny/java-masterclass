package com.kenny;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        int finalScore;
//	    finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
//	    print(finalScore);
//	    score = 10000;
//	    levelCompleted = 8;
//	    bonus = 200;
//        finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
//        print(finalScore);
        finalScore = 1500;
        int position = calculateHighScorePosition(finalScore);
        displayHighScorePosition("Benny", position);
        finalScore = 900;
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition("John", position);
        finalScore = 400;
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition("Piet", position);
        finalScore = 50;
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition("Saartjie", position);

    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted, int bonus ){
        int finalScore = 0;
        if(gameOver){
         finalScore = score + (levelCompleted*bonus);
         finalScore+=200;
         return finalScore;
        }
        return -1;

    }
    public static int calculateHighScorePosition(int finalScore){
        if(finalScore > 1000){
            return 1;
        }else if (finalScore > 500){
            return 2;
        }else if(finalScore > 100){
            return 3;
        }else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String playerName,int position){
        System.out.println(playerName + " managed to get the position " + position + " in the High score table.");
    }

    public static void print (int finalScore){
        System.out.println("Your final score was:" + finalScore);
    }
}
