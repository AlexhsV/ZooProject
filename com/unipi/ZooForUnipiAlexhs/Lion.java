package com.unipi.ZooForUnipiAlexhs;

import java.io.Serializable;

public class Lion extends Animal implements AnimalOperations, Serializable {
    private static final String category = "Mammal";
    private static final int avgMaxAge = 20;
    private boolean king;

    public Lion(String code, String name, int avgWeight, boolean king) {
        super(code, name, avgWeight);
        this.king = king;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    @Override
    public void makeNoise() {
        System.out.println("The lion says: Arggg Arggg Arggg!");
    }

    @Override
    public String toString() {
        return "Lion{" + super.toString() +
                ", king=" + king +
                '}';
    }
}
