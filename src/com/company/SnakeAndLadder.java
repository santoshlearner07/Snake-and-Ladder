package com.company;

/**
 * Double dice player , snake bites are random, Two player game.
 */

public class SnakeAndLadder {
    public static void main(String[] args) {
        int PLAYER_1_POSITION = 0;
        int PLAYER_2_POSITION = 0;
        int COUNT = 0;
        while (PLAYER_2_POSITION <= 99 && PLAYER_1_POSITION <= 99) {
            int Player1 = (int) Math.floor(Math.random() * 10) % 6 + (int) Math.floor(Math.random() * 10) % 6;
            int Player2 = ((int) Math.floor(Math.random() * 10) % 6 + (int) Math.floor(Math.random() * 10) % 6);
            COUNT = COUNT + 1;
            int b = (int) Math.floor(Math.random() * 10) % 2;
            switch (b) {
                case 0:
                    PLAYER_1_POSITION = PLAYER_1_POSITION + Player1;
                    PLAYER_2_POSITION = PLAYER_2_POSITION + Player2;
                    if (PLAYER_1_POSITION < 0) {
                        PLAYER_1_POSITION = 0;
                    }
                    if (PLAYER_2_POSITION < 0) {
                        PLAYER_2_POSITION = 0;
                    }

                    break;
                case 1: // SNAKE BITES ARE RANDOM
                    PLAYER_1_POSITION = PLAYER_1_POSITION - Player1;
                    PLAYER_2_POSITION = PLAYER_2_POSITION - Player2;
                    if (PLAYER_1_POSITION > 101) {
                        PLAYER_1_POSITION = PLAYER_1_POSITION - Player1;
                    }
                    if (PLAYER_2_POSITION > 101) {
                        PLAYER_2_POSITION = PLAYER_2_POSITION - Player2;
                    }
                    break;

            }
        }
        if (PLAYER_1_POSITION == 100) {
            System.out.println("Player1 won the game by " + COUNT + " time throwing the dice");
        } else {
            System.out.println("Player2 won the game by " + COUNT + " time throwing the dice");

        }

    }
}

