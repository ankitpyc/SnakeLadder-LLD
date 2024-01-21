package org.example.domain;

import java.util.LinkedList;
import java.util.Queue;

public class GameController {

    private Queue<User> users = new LinkedList<>();
    private User currentUser;

    private BoardManager boardManager;

    private DiceManager diceManager;

    private boolean isGameOver = false;
    private User winnerUser = null;

    public GameController() {
        this.boardManager = new BoardManager();
        this.diceManager = new DiceManager(6);
        users.add(new User("ankit ", "8604"));
        users.add(new User("akash ", "8605"));
        users.add(new User("akhilesh ", "8622"));
    }

    public void startGame() {
        System.out.println("Starting Game");
        while (isGameOver == false) {
            currentUser = users.poll();
            System.out.println("User Playing is " + currentUser.getName());
            int diceVal = diceManager.rollDice();
            System.out.println("Dice outcome : " + diceVal);
            currentUser = UserUtils.updateUserPosition(diceVal, currentUser, boardManager);
            if (UserUtils.hasUserWon(currentUser.getUserPosition(), boardManager.getLadderSnakeBoard().getBoardSize())) {
                isGameOver = true;
                winnerUser = currentUser;
                break;
            }
            users.add(currentUser);
        }

        System.out.println("User " + winnerUser.getName() + "has won ");
    }

}
