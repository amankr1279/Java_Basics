package org.example;

import org.example.move.HumanStrategy;
import org.example.symbol.SymbolO;
import org.example.symbol.SymbolX;

public class PlayerFactory {
    public Player createPlayer(String symbol) {
        if (symbol.toLowerCase().contains("x")) {
            return new Player(new SymbolX(), new HumanStrategy());
        }
        return new Player(new SymbolO(), new HumanStrategy());
    }
}
