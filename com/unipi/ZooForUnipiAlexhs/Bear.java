package com.unipi.ZooForUnipiAlexhs;

public class Bear extends Animal implements AnimalOperations{
    private static final String category = "Mammal";
    private static final int avgMaxAge = 40;
    private String region;

    public Bear(String code, String name, int weight, String region) {
        super(code, name, weight);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public void makeNoise() {
        System.out.println("The bear says: Growl Growl Growl!");
    }

    @Override
    public String toString() {
        return "Bear{" + super.toString() +
                ", region=" + region +
                '}';
    }
}
