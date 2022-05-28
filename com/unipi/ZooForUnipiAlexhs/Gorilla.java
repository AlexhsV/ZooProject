package com.unipi.ZooForUnipiAlexhs;

public class Gorilla extends Animal implements AnimalOperations{
    private static final String category = "Mammal";
    private static final int avgMaxAge = 55;
    private int strength;

    public Gorilla(String code, String name, int avgWeight, int bananasEatenDaily) {
        super(code, name, avgWeight);
        this.strength = bananasEatenDaily;
    }

    public int getBananasEatenDaily() {
        return strength;
    }

    public void setBananasEatenDaily(int bananasEatenDaily) {
        this.strength = bananasEatenDaily;
    }

    @Override
    public void makeNoise() {
        System.out.println("The gorilla says: Aoou Aoou Aoou!");
    }

    @Override
    public String toString() {
        return "Gorilla{" + super.toString() +
                ", strength=" + strength +
                '}';
    }
}
