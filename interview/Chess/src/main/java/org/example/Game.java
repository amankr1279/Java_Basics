package org.example;

import org.example.piece.King;
import org.example.piece.NoPiece;
import org.example.piece.Piece;

import java.util.Scanner;

public class Game {
    public Board board;
    public Player whitePlayer;
    public Player blackPlayer;


    public Game() {
        this.board = new Board();
        whitePlayer = new Player(true);
        blackPlayer = new Player(false);
    }

    public boolean checkWin() {
        int whiteCnt = 0;
        int blackCnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Cell cell = new Cell(i, j);
                Piece piece = board.getPiece(cell);
                if(piece instanceof King ) {
                    if (piece.isWhite()) {
                        whiteCnt += 1;
                    } else {
                        blackCnt += 1;
                    }
                }
            }
        }
        if (whiteCnt + blackCnt == 1){
            if (whiteCnt == 1) {
                System.out.println("White player wins!");
            } else {
                System.out.println("black player wins!");
            }
            return true;
        }
        return false;
    }

    public boolean isValidMove(Piece piece, Cell from, Cell to) {
        if (piece instanceof NoPiece) {
            return false;
        }
        if (from.row == to.row && from.col == to.col) {
            return false;
        }

        int r = to.getRow(), c = to.getCol();
        if (r < 0 || r >= 8 || c < 0 || c >= 8) {
            return false;
        }
        Piece oldPiece = board.getPiece(to);
        if (oldPiece instanceof NoPiece) {
            return true;
        } else {
            return oldPiece.isWhite() != piece.isWhite();
        }
    }

    public void play() {
        Player current = whitePlayer;
        while (!checkWin()) {
            board.print();
            int r,c;
            String dir = "";
            System.out.println("Enter position from where you want to move and in what direction :");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextInt();
            c = scanner.nextInt();
            Cell from = new Cell(r, c);
            dir = scanner.next();
            Piece piece = board.getPiece(from);
            Cell to = current.move(from, dir, piece);
            if (isValidMove(piece, from, to)) {
                board.setPiece(from, new NoPiece(piece.isWhite()));
                board.setPiece(to, piece);
                if (current.equals(whitePlayer)) {
                    current = blackPlayer;
                } else {
                    current = whitePlayer;
                }
            } else {
                System.out.println("invalid move suggested. Please retry");
            }

        }
    }
}
