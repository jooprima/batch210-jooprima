package com.xsis.quiz06.soal04;

import java.util.Random;
import java.util.Scanner;

public class RockScisorPaper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] suit = {"rock","scissor","paper"};

        boolean loop = true;

        while (loop){
            System.out.print("\nEnter rock,scissor or paper : ");
            String player = sc.next();

            System.out.print("Computer's choice : ");
            int computerChoice = rand.nextInt(suit.length);
            String computer = suit[computerChoice];

            System.out.println(computer);

            System.out.println("\n"+Winner(player,computer));

            System.out.print("\nTry again ? (y/n) : ");
            String tryAgain = sc.next();

            if (tryAgain.equalsIgnoreCase("n")){
                loop = false;
            }

        }


    }

    private static String Winner(String players, String computers) {
        String winners = null;

        if (players.equalsIgnoreCase("rock") && computers.equalsIgnoreCase("scissor")){
            winners = "You wins";
        } else if (players.equalsIgnoreCase("rock") && computers.equalsIgnoreCase("paper")){
            winners = "Computer wins";
        } else if (players.equalsIgnoreCase("scissor") && computers.equalsIgnoreCase("rock")){
            winners = "Computer wins";
        } else if (players.equalsIgnoreCase("scissor") && computers.equalsIgnoreCase("paper")){
            winners = "You wins";
        } else if (players.equalsIgnoreCase("paper") && computers.equalsIgnoreCase("rock")){
            winners = "You wins";
        } else if (players.equalsIgnoreCase("paper") && computers.equalsIgnoreCase("scissor")){
            winners = "Computer wins";
        } else if (players.equalsIgnoreCase(computers)){
            winners = "Draws";
        }

        return winners;
    }
}
