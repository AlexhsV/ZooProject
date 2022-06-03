package com.unipi.ZooForUnipiAlexhs;

public class Alligator extends Animal implements AnimalOperations{
    private static final String category = "Reptile";      //can not change
    private static final int avgMaxAge = 90;
    private int victims;

    public Alligator(String id, String name, int weight, int victims) {
        super(id, name, weight);  //calling the Animal constructor for id,name,weight
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

    @Override   //toString Override so the objects can be printed
    public String toString() {
        return "Alligator{" + super.toString() +
                ", victims=" + victims +
                '}';
    }
}
