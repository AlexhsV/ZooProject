package com.unipi.ZooForUnipiAlexhs;

public class Lizard extends Animal implements AnimalOperations{
    private static final String category = "Reptile";
    private static final int avgMaxAge = 15;
    private float tailLength;

    public Lizard(String code, String name, int weight, float tailLength) {
        super(code, name, weight);
        this.tailLength = tailLength;
    }

    public float getTailLength() {
        return tailLength;
    }

    public void setTailLength(float tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public void makeNoise() {
        System.out.println("The lizard says: Sll Sll Sll!");
    }

    @Override
    public String toString() {
        return "Lizard{" + super.toString() +
                ", length of the tail=" + tailLength +
                '}';
    }
}
