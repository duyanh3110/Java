package com.company;

public class Main {

    public static void main(String[] args) {
//        calculateScore(true, 800, 5, 100);
//        calculateScore(false, 10000, 8, 200);
//
//        displayHighScorePosition("Duy", calculateHighScorePosition(1000));

//        int newScorer = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScorer);
//
//        calculateScore(200);
        double centimeters = calcFeetAndInchesToCentimeter(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeter(157);
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int ranking) {
        System.out.println(playerName + " managed to get into position " + ranking + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, np player score.");
        return 0;
    }
}
