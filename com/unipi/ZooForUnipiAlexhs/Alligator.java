package com.unipi.ZooForUnipiAlexhs;

public class Alligator extends Animal implements AnimalOperations{
    private static final String category = "Reptile";
    private static final int avgMaxAge = 90;
    private int victims;

    public Alligator(String code, String name, int avgWeight, int victims) {
        super(code, name, avgWeight);
        this.victims = victims;
    }

    public int getVictims() {
        return victims;
    }

    public void setVictims(int victims) {
        this.victims = victims;
    }

    @Override
    public void makeNoise() {
        System.out.println("The alligator says: Grr Grr Grr!");
    }

    @Override
    public String toString() {
        return "Alligator{" + super.toString() +
                ", victims=" + victims +
                '}';
    }
}
