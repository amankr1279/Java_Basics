package org.example.symbol;

public class SymbolX extends Symbol{
    String piece;
    public SymbolX() {
        this.piece = "X";
    }

    @Override
    public String getPiece() {
        return piece;
    }
}
