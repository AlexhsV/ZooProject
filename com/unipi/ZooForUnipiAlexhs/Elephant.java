package com.unipi.ZooForUnipiAlexhs;

public class Elephant extends Animal implements AnimalOperations{
    private static final String category = "Mammal";
    private static final int avgMaxAge = 35;
    private float trunkLength;

    public Elephant(String code, String name, int avgWeight, float trunkLength) {
        super(code, name, avgWeight);
        this.trunkLength = trunkLength;
    }

    public float getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(float trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeNoise() {
        System.out.println("The elephant says: Pawoo Pawoo Pawoo!");
    }

    @Override
    public String toString() {
        return "Elephant{" + super.toString() +
                ", length of the trunk=" + trunkLength +
                '}';
    }
}
