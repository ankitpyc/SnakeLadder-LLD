package org.example;

import org.example.domain.GameController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing game!");
        GameController gameController = new GameController();
        System.out.println("Game starts!");
        gameController.startGame();
    }
}
