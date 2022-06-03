package com.unipi.ZooForUnipiAlexhs;

public class Giraffe extends Animal implements AnimalOperations{
    private static final String category = "Mammal";
    private static final int avgMaxAge = 25;
    private float neckLength;

    public Giraffe(String code, String name, int weight, float neckLength) {
        super(code, name, weight);
        this.neckLength = neckLength;
    }

    public float getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(float neckLength) {
        this.neckLength = neckLength;
    }

    @Override
    public void makeNoise() {
        System.out.println("The giraffe says: (fun fact they don't make any sound :( )");
    }

    @Override
    public String toString() {
        return "Giraffe{" + super.toString() +
                ", length of the neck=" + neckLength +
                '}';
    }
}
