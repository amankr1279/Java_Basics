package org.example.moveStrategy;

import org.example.Cell;

import java.util.Scanner;

public class BishopStrategy implements MoveStrategy{
    private final Scanner scanner = new Scanner(System.in);
    public boolean isWhite;

    public BishopStrategy(boolean isWhite) {
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
        // move RU, RD, LU, LD
        System.out.print("Enter number of steps you want to move:");
        int steps = scanner.nextInt();
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
                c -= hori;
                steps -= 1;
            }
        } else if (dir.equalsIgnoreCase("LU")) {
            while (steps > 0) {
                r -= vert;
                c += hori;
                steps -= 1;
            }
        }

        return new Cell(r, c);
    }
}
