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
        while (!board.checkWin()) {
            board.printBoard();
            int[] cell = currentPlayer.makeMove();
            int r = cell[0], c = cell[1];
            if (board.isValid(r, c)) {
                board.process(r, c, currentPlayer.getSymbol());
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
