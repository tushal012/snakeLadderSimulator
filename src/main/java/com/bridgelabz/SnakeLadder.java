package com.bridgelabz;

public class SnakeLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    private static boolean player2_position;
    private static boolean p1ayer1_position;


    public static void main(String[] args) {
        System.out.println("welcome to snake and ladder program");


        int player1_position=0;
        int p1ayer2_position=0;
        int newPosition = 0;
        int winPosition = 100;
        int count1=0;
        int count2=0;
        int currentPlayer = 1;
        int checkOption ;

        while (true) {

            if(currentPlayer==1) {
                System.out.println("now player-1's turn");
                count1++;
            int dieRolls = (int) (Math.random() * 6) + 1;
                checkOption = (int) (Math.random()*3);
            switch (checkOption) {
                case NO_PLAY:
                    newPosition = 0;
                    break;
                case LADDER:
                    newPosition = dieRolls;
                    break;
                case SNAKE:
                    newPosition = -dieRolls;
                    break;
            }
                player1_position=player1_position+newPosition;
                if (p1ayer1_position<0) {
                    p1ayer1_position = 0;
            }
                if (p1ayer1_position>100) {
                    player1_position=newPosition;

            }
                System.out.println("now Player-1 at "+player1_position+"th"+" position");
                if (player1_position==100) {
                    break;
                }
            }
            else {
                count2++;
                System.out.println("now player-2's turn");
                int dieRolls = (int) (Math.random()*6)+1;
                checkOption = (int) (Math.random()*3);


                switch (checkOption) {
                    case NO_PLAY :
                        newPosition = 0;
                        break;
                    case LADDER :
                        newPosition = dieRolls ;
                        break;
                    case SNAKE :
                        newPosition = -dieRolls ;
                        break;
                }
                player2_position = player2_position + newPosition;
                if (player2_position<0) {
                    player2_position = 0;
                }
                if (player2_position>100) {
                    player2_position=newPosition;
                }
                System.out.println("now Player-2 at "+player2_position+"th"+" position");
                if (player2_position==100) {
                    break;
                }

        }
            if(checkOption==1) {
                System.out.println("Ohh, You got ladder. Now play again.");
            }
            else {
                if(currentPlayer==1) {
                    currentPlayer = 2;
                }
                else {
                    currentPlayer = 1;
                }

            }

        }
        if (player1_position==100) {
            System.out.println("\nCongratulation Player-1 you are win! \n after die rolled "+ count1+" times.");
        } else {
            System.out.println("\nCongratulation Player-2 you are win! \n after die rolled "+ count2+" times.");

        }
    }
}




