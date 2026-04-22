package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Tic-tac-toe game using LLD Design patterns");

        /**
         * Design requirements:-
         * Board, Symbol, Player, Game
         * 2 Symbols:- X/O
         * 2 players and they have a move making strategy
         * Players are created using factory design
         * Board is of NxN side. Default size is N = 3
         *
         * Further enhancements:-
         * use a game listener with Observer pattern to notofy players
         */
        Game game = new Game();
        game.play();
    }
}