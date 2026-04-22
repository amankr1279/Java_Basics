package org.example;

import org.example.move.MoveStrategy;
import org.example.symbol.Symbol;

public class Player {
    Symbol symbol;

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    MoveStrategy moveStrategy;

    public Player(Symbol symbol, MoveStrategy moveStrategy) {
        this.symbol = symbol;
        this.moveStrategy = moveStrategy;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Cell makeMove() {
        return this.moveStrategy.makeMove();
    }
}
