package org.example.moveStrategy;

import org.example.Cell;

public class PawnStrategy implements MoveStrategy{
    public boolean isWhite;

    public PawnStrategy(boolean isWhite) {
        this.isWhite = isWhite;
    }
    @Override
    public Cell move(Cell from, String dir) {
        int r = from.getRow(), c = from.getCol();
        int vert = 1, hori = 1;
        if (!isWhite) {
            vert = -1;
            hori = -1;
        }
        Cell to = new Cell(r, c);
        if (dir.equalsIgnoreCase("U")) {
            to.setRow(r + vert);
        } else if (dir.equalsIgnoreCase("A")) {
            to.setRow(r + vert);
            to.setCol(c + hori);
        }
        return to;
    }

}
