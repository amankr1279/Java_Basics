package org.example.symbol;

public class SymbolO extends Symbol{
    String piece;
    public SymbolO() {
        this.piece = "O";
    }

    @Override
    public String getPiece() {
        return piece;
    }
}
