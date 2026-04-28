package org.example.piece;

import org.example.moveStrategy.PawnStrategy;

public class Rook extends Piece{
    public Rook(boolean isWhite) {
        super(isWhite, new PawnStrategy(isWhite), "R");
    }
}
