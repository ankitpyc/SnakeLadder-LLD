package org.example.domain;

import java.util.Random;

public class DiceManager {

    Random random = new Random();
    private int num;

    public DiceManager(int maxNumber) {
        this.num = maxNumber;
    }

    public int rollDice() {
        return random.nextInt(num) + 1;
    }

}
