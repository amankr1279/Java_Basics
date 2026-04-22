package org.example.move;

import org.example.Cell;

import java.util.Scanner;

public class HumanStrategy implements MoveStrategy{


    @Override
    public Cell makeMove() {
        Scanner scanner = new Scanner(System.in);
        int[] indices = new int[2];
        System.out.print("Enter row and column space-separated :");
        for (int i = 0; i < 2; i++) {
            indices[i] = scanner.nextInt();
        }
        Cell cell = new Cell(indices);
        return cell;
    }
}
