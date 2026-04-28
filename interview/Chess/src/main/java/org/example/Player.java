package org.example;

import org.example.piece.Piece;

public class Player {
    boolean isWhite;

    public Player(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public Cell move(Cell from, String dir, Piece piece) {
        return piece.move(from, dir);
    }
}
