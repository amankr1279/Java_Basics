package org.example;


public class Game {
    private final Board board;
    private final Player playerX;
    private final Player playerO;
    private Player currentPlayer;

    public Game() {
        this.board = new Board(3);
        PlayerFactory playerFactory = new PlayerFactory();
        playerX = playerFactory.createPlayer("X");
        playerO = playerFactory.createPlayer("O");
        currentPlayer = playerO;
    }

    public void play() {
        while (!board.checkWin() && !board.checkDraw()) {
            board.printBoard();
            Cell cell = currentPlayer.makeMove();
            if (board.isValid(cell)){
                board.process(cell, currentPlayer.getSymbol());
                if (currentPlayer.equals(playerX)) {
                    currentPlayer = playerO;
                } else {
                    currentPlayer = playerX;
                }
            } else {
                System.out.println("Invalid data, please retry");
            }
        }
    }
}
