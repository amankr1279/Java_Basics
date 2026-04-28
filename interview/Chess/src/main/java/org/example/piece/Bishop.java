package org.example.piece;

import org.example.moveStrategy.BishopStrategy;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite, new BishopStrategy(isWhite), "B");
    }
}
