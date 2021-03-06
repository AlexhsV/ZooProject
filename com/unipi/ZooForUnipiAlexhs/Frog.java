package com.unipi.ZooForUnipiAlexhs;

public class Frog extends Animal implements AnimalOperations{
    private static final String category = "Amphibian";
    private static final int avgMaxAge = 15;
    private boolean poisonous;

    public Frog(String id, String name, int weight, boolean poisonous) {
        super(id, name, weight);
        this.poisonous = poisonous;
    }

    public boolean getPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public void makeNoise() {
        System.out.println("The frog says: Squack Squack Squack!");
    }

    @Override
    public String toString() {
        return "Frog{" + super.toString() +
                ", poisonous=" + poisonous +
                '}';
    }
}
