package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Chess Game");
        /**
         * Chess requirements:-
         * Game
         * 8x8 board
         * pieces: king, queen, pawn, rook, bishop, horse
         * colours: black and white --> one to each player --> 2 players
         * Player --> move strategy, factory for making
         * checkWin(), checkDraw() --> board
         * piece transformation from pawn to any other piece type
         * piece --> move strategy and factory
         * move validation for evey piece
         */

        Game game = new Game();
        game.play();
    }
}