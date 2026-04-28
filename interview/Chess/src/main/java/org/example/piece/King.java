package org.example.piece;

import org.example.moveStrategy.PawnStrategy;

public class King extends Piece{
    public King(boolean isWhite) {
        super(isWhite, new PawnStrategy(isWhite), "K");
    }
}
