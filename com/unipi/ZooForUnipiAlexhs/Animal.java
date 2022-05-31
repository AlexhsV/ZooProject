package com.unipi.ZooForUnipiAlexhs;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String code;
    private String name;
    private int avgWeight;

    public Animal(String code, String name, int avgWeight) {
        this.code = code;
        System.out.println("Animal with code " + code + ", created!");
        this.name = name;
        this.avgWeight = avgWeight;
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

    public int getAvgWeight() {
        return avgWeight;
    }

    public void setAvgWeight(int avgWeight) {
        this.avgWeight = avgWeight;
    }


    @Override
    public String toString() {
        return "code=" + code +
                ", name='" + name + '\'' +
                ", avgWeight=" + avgWeight ;
    }
}
