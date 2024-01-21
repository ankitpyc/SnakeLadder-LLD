package org.example.domain;

import org.example.LadderSnakeBoard;

public class UserUtils {

    public static boolean hasUserWon(Point point, int boardSize) {
        return (point.startRow == boardSize - 1 && point.startColumn == boardSize - 1);
    }

    public static User updateUserPosition(int diceVal, User user, BoardManager board) {
        String history = "User moved from (%s ,%s )  to (%s , %s)";


        int boardSize = board.getLadderSnakeBoard().getBoardSize();
        LadderSnakeBoard snakeBoard = board.getLadderSnakeBoard();
        int prevX = user.getUserPosition().startRow;
        int prevY = user.getUserPosition().startColumn;

        if (isIndexGreaterThanBoard(prevX, prevY, diceVal, boardSize)) {
            return user;
        }

        int x = prevX;
        int y = prevY;
        if (diceVal + prevY > boardSize - 1) {
            y = (diceVal + prevY) - boardSize;
            x = x + 1;
        } else {
            y = y + diceVal;
        }
        if (snakeBoard.getBoard()[x][y] instanceof Snakes) {
            System.out.println("Snakes Bite at  " + x + " - " + y);
            Point snake = snakeBoard.getBoard()[x][y];
            x = snake.endRow;
            y = snake.endColumn;
        } else if (snakeBoard.getBoard()[x][y] instanceof Ladder) {
            System.out.println("Ladder at  " + x + " - " + y);
            Point ladder = snakeBoard.getBoard()[x][y];
            x = ladder.endRow;
            y = ladder.endColumn;
        }
        System.out.println(String.format(history, prevX, prevY, x, y));
        user.getUserPosition().setStartRow(x);
        user.getUserPosition().setStartColumn(y);
        return user;
    }

    private static boolean isIndexGreaterThanBoard(int x, int y, int diceVal, int boardSize) {
        if (x == boardSize - 1 && (y + diceVal > boardSize - 1)) {
            System.out.println("Invalid Dice no , from (x,y) need to get a " + (boardSize - y));
            return true;
        }
        return false;
    }


}
