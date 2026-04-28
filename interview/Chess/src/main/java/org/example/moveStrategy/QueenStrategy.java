package org.example.moveStrategy;

import org.example.Cell;

import java.util.Scanner;

public class QueenStrategy implements MoveStrategy{
    private final Scanner scanner = new Scanner(System.in);
    public boolean isWhite;

    public QueenStrategy(boolean isWhite) {
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
        System.out.print("Enter number of steps you want to move:");
        int steps = scanner.nextInt();

        // move RU, RD, LU, LD, R, L, U, D
        if (dir.equalsIgnoreCase("RU")) {
            while (steps > 0) {
                r -= vert;
                c += hori;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("RD")) {
            while (steps > 0) {
                r += vert;
                c -= hori;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("LD")) {
            while (steps > 0) {
                r += vert;
                c += hori;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("LU")) {
            while (steps > 0) {
                r -= vert;
                c += hori;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("R")) {
            while (steps > 0) {
                c += hori;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("L")) {
            while (steps > 0) {
                c -= hori;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("U")) {
            while (steps > 0) {
                r += vert;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("D")) {
            while (steps > 0) {
                r -= vert;
                steps -= 1;
            }
        }
        return new Cell(r, c);
    }
}
