package org.example;

import org.example.domain.Point;

public class LadderSnakeBoard {
    private Point[][] board;
    private int boardSize;

    public LadderSnakeBoard(int boardSize) {
        this.boardSize = boardSize;
        this.board = new Point[boardSize][boardSize];
    }

    public Point[][] getBoard() {
        return board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
}
