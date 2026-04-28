package org.example.piece;

import org.example.moveStrategy.PawnStrategy;

public class Pawn extends Piece{

    public Pawn(boolean isWhite) {
        super(isWhite, new PawnStrategy(isWhite), "P");
    }
}
