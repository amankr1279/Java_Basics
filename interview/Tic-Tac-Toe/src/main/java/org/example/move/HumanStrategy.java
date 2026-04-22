package org.example.move;

import java.util.Scanner;

public class HumanStrategy implements MoveStrategy{


    @Override
    public int[] makeMove() {
        Scanner scanner = new Scanner(System.in);
        int[] cell = new int[2];
        System.out.print("Enter row and column space-separated :");
        for (int i = 0; i < 2; i++) {
            cell[i] = scanner.nextInt();
        }
        return cell;
    }
}
