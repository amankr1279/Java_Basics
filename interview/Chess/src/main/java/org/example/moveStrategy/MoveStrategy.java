package org.example.moveStrategy;

import org.example.Cell;

public interface MoveStrategy {
    Cell move(Cell from, String dir);
}
