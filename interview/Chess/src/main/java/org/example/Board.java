package org.example;

import org.example.piece.*;

public class Board {
    public Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new NoPiece(true);
            }
        }

        setRow(0, false); // Black pieces
        for (int c = 0 ; c < 8; c++) {
            board[1][c] = new Pawn(false);
        }
        setRow(7, true); // White pieces
        for (int c = 0 ; c < 8; c++) {
            board[6][c] = new Pawn(true);
        }
    }

    private void setRow(int row, boolean isWhite) {
        board[row][0] = board[row][7] = new Rook(isWhite);
        board[row][1] = board[row][6] = new Horse(isWhite);
        board[row][2] = board[row][5] = new Bishop(isWhite);
        board[row][3] = new Queen(isWhite);
        board[row][4] = new King(isWhite);
    }

    public Piece getPiece(Cell cell) {
        int r = cell.row, c = cell.col;
        return board[r][c];
    }

    public void setPiece(Cell cell, Piece piece) {
        int r = cell.row, c = cell.col;
        board[r][c] = piece;
    }

    public void print() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece = board[i][j];
                System.out.print(piece.getType() + " ");
            }
            System.out.println();
        }
    }
}
