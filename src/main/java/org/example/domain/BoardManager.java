package org.example.domain;


import org.example.LadderSnakeBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BoardManager {

    private LadderSnakeBoard ladderSnakeBoard;

    private List<Snakes> snakes = new ArrayList<>();

    private List<Ladder> ladders = new ArrayList<>();

    private Queue<User> users;

    private User currUser;

    public BoardManager(){
        this.ladderSnakeBoard = new LadderSnakeBoard(10);
        addSnakes();
        addLadder();
        creteBoard();
    }

    private void creteBoard() {
        System.out.println("Creating board");

        for (int i = 0; i < ladderSnakeBoard.getBoardSize(); i++) {
            for (int j = 0; j < ladderSnakeBoard.getBoardSize(); j++) {
                    ladderSnakeBoard.getBoard()[i][j] = new Point(i,j);
            }
        }

        for(Snakes snake : snakes){
            ladderSnakeBoard.getBoard()[snake.startRow][snake.startColumn] = snake;
        }

        for(Ladder ladder : ladders){
            ladderSnakeBoard.getBoard()[ladder.startRow][ladder.startColumn] = ladder;
        }
    }

    private void addLadder() {
        Ladder ladder = new Ladder(0,8,2,7);
        Ladder ladder2 = new Ladder(2,1,5,8);
        Ladder ladder3 = new Ladder(7,3,9,8);
        ladders.add(ladder);
        ladders.add(ladder2);
        ladders.add(ladder3);
    }

    private void addSnakes() {
        Snakes snake = new Snakes(2,9,0,9);
        Snakes snakes2 = new Snakes(4,7,0,5);
        snakes.add(snake);
        snakes.add(snakes2);
    }

    public LadderSnakeBoard getLadderSnakeBoard() {
        return ladderSnakeBoard;
    }
}
