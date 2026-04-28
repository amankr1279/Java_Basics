package org.example.piece;

import org.example.moveStrategy.PawnStrategy;

public class Horse extends Piece{
    public Horse(boolean isWhite) {
        super(isWhite, new PawnStrategy(isWhite), "H");
    }
}
