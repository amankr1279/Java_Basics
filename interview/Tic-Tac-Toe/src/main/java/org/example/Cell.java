package org.example;

public class Cell {
    private int r;
    private int c;


    public Cell(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public Cell(int[] indices) {
        this.r = indices[0];
        this.c = indices[1];
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

}
