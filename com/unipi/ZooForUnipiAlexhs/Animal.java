package com.unipi.ZooForUnipiAlexhs;

import java.io.Serializable;

public abstract class Animal implements Serializable { //Serializable interface needed for serialization of the arraylist "animals"
    private String id;
    private String name;
    private int weight;

    public Animal(String id, String name, int weight) {
        this.id = id;
        System.out.println("Animal with id " + id + ", created!");
        this.name = name;
        this.weight = weight;
    }

    //getters and setters for the common characteristics
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight ;
    }
}
