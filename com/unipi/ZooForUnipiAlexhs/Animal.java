package com.unipi.ZooForUnipiAlexhs;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String code;
    private String name;
    private int weight;

    public Animal(String code, String name, int weight) {
        this.code = code;
        System.out.println("Animal with code " + code + ", created!");
        this.name = name;
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        return "code=" + code +
                ", name='" + name + '\'' +
                ", weight=" + weight ;
    }
}
