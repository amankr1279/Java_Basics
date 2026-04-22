package org.example.symbol;

public class SymbolBlank extends Symbol{
    String piece;

    public SymbolBlank() {
        // hard-code blank piece
        this.piece = "-";
    }

    @Override
    public String getPiece() {
        return piece;
    }
}
