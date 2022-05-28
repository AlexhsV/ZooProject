package com.unipi.ZooForUnipiAlexhs;

import java.util.ArrayList;

public abstract class ZooKeeper {

    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    public static ArrayList<Animal> getAnimals() {
        return animals;
    }

}
