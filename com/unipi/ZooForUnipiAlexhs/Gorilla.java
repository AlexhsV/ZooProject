package com.unipi.ZooForUnipiAlexhs;

public class Gorilla extends Animal implements AnimalOperations{
    private static final String category = "Mammal";
    private static final int avgMaxAge = 55;
    private int strength;

    public Gorilla(String code, String name, int weight, int strength) {
        super(code, name, weight);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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
