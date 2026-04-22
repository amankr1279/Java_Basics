package org.example;

import org.example.symbol.Symbol;
import org.example.symbol.SymbolBlank;

public class Board {
    private final Integer side;
    private final Symbol[][] grid;

    public Board(Integer side) {
        this.side = side;
        this.grid = new Symbol[side][side];
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) {
                grid[r][c] = new SymbolBlank();
            }
        }
    }

    public void printBoard() {
        for (int r = 0; r < side; r++) {
            System.out.print("| ");
            for (int c = 0; c < side; c++) {
                Symbol symbol = grid[r][c];
                System.out.print(symbol.getPiece() + " ");
            }
            System.out.println("|");
        }
    }

    public boolean isValid(Cell cell) {
        int r = cell.getR(), c = cell.getC();
        if (r < 0 || r >= side){
            return false;
        }
        if (c < 0 || c >= side ) {
            return false;
        }
        return grid[r][c].getPiece().contains("-");
    }

    public void process(Cell cell, Symbol symbol) {
        int r = cell.getR(), c = cell.getC();
        this.grid[r][c] = symbol;
    }
    
    private void announce(int oCnt, int xCnt) {
        if (oCnt == side) {
            System.out.println("PlayerO wins");
        }
        if (xCnt == side) {
            System.out.println("PlayerX wins");
        }
    }

    public boolean checkDraw() {
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) {
                if (grid[r][c].getPiece().contains("-")) {
                    return false;
                }
            }
        }
        System.out.println("Match is draw!");
        return true;
    }

    public boolean checkWin () {
        // row
        for (int r = 0; r < side; r++) {
            int oCnt = 0, xCnt = 0;
            for (int c = 0; c < side; c++) {
                Symbol symbol = grid[r][c];
                if (symbol.getPiece().contains("X")) {
                    xCnt += 1;
                } else if (symbol.getPiece().contains("O")) {
                    oCnt += 1;
                }
            }
            if (oCnt == side || xCnt == side) {
                announce(oCnt, xCnt);
                return true;
            }
        }

        // column
        for (int c = 0; c < side; c++) {
            int oCnt = 0, xCnt = 0;
            for (int r = 0; r < side; r++) {
                Symbol symbol = grid[r][c];
                if (symbol.getPiece().contains("X")) {
                    xCnt += 1;
                } else if (symbol.getPiece().contains("O")) {
                    oCnt += 1;
                }
            }
            if (oCnt == side || xCnt == side) {
                announce(oCnt, xCnt);
                return true;
            }
        }

        // diagonal
        int r = 0, c = 0;
        int oCnt = 0, xCnt = 0;
        while (r < side && c < side) {
            Symbol symbol = grid[r][c];
            if (symbol.getPiece().contains("X")) {
                xCnt += 1;
            } else if (symbol.getPiece().contains("O")) {
                oCnt += 1;
            }
            r += 1;
            c += 1;
        }
        if (oCnt == side || xCnt == side) {
            announce(oCnt, xCnt);
            return true;
        }

        oCnt = xCnt = 0;
        r = 0;
        c = side - 1;
        while (r < side && c >= 0) {
            Symbol symbol = grid[r][c];
            if (symbol.getPiece().contains("X")) {
                xCnt += 1;
            } else if (symbol.getPiece().contains("O")) {
                oCnt += 1;
            }
            r += 1;
            c -= 1;
        }
        if (oCnt == side || xCnt == side) {
            announce(oCnt, xCnt);
            return true;
        }

        return false;
    }
}
