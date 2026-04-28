package org.example.piece;

import org.example.Cell;
import org.example.moveStrategy.MoveStrategy;

public abstract class Piece {
    boolean isWhite;
    MoveStrategy moveStrategy;
    String type;

    public Piece(boolean isWhite, MoveStrategy moveStrategy, String type) {
        this.isWhite = isWhite;
        this.moveStrategy = moveStrategy;
        this.type = type;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public String getType() {
        return type;
    }

    public Cell move(Cell from, String dir) {
        return moveStrategy.move(from, dir);
    }
}
