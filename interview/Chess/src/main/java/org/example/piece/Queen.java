package org.example.piece;

import org.example.moveStrategy.QueenStrategy;

public class Queen extends Piece{
    public Queen(boolean isWhite) {
        super(isWhite, new QueenStrategy(isWhite), "Q");
    }
}
