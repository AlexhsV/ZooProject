package com.unipi.ZooForUnipiAlexhs;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ZooKeeper {

    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    public static ArrayList<Animal> getAnimals() {
        return animals;
    }

    private static int alligators;  //counter of each animal, to create the unique code of each object
    private static int bears;       //static needed so they can be referenced from the static method
    private static int elephants;
    private static int frogs;
    private static int giraffes;
    private static int gorillas;
    private static int lions;
    private static int lizards;


    static void addAnimals(Scanner input) {    //parsing the object input of class Scanner, created in the main function
        System.out.println("Which animal do you want to add in the zoo?");
        System.out.println("-------------------------\n");
        System.out.println("1 - Alligator");
        System.out.println("2 - Bear");
        System.out.println("3 - Elephant");
        System.out.println("4 - Frog");
        System.out.println("5 - Giraffe");
        System.out.println("6 - Gorilla");
        System.out.println("7 - Lion");
        System.out.println("8 - Lizard");
        int choice = input.nextInt();

        System.out.println("Give weight:");
        int weight = input.nextInt();

        System.out.println("Give name:");
        String name = input.next();


        if (choice == 1) {

            System.out.println("Give victims:");
            int victims = input.nextInt();

            alligators+=1;
            String code = String.format("AL%03d", alligators);
            ZooKeeper.animals.add(new Alligator(code, name, weight, victims));

        } else if (choice == 2) {

            System.out.println("Give region:");
            String region = input.next();

            bears+=1;
            String code = String.format("BE%03d", bears);
            ZooKeeper.animals.add(new Bear(code, name, weight, region));

        } else if (choice == 3) {

            System.out.println("Give length of the trunk:");
            float trunkLength = input.nextFloat();

            elephants+=1;
            String code = String.format("EL%03d", elephants);
            ZooKeeper.animals.add(new Elephant(code, name, weight, trunkLength));

        } else if (choice == 4) {

            System.out.println("Is it poisonous? (true or false):");
            boolean poisonous = input.nextBoolean();

            frogs+=1;
            String code = String.format("FR%03d", frogs);
            ZooKeeper.animals.add(new Frog(code, name, weight, poisonous));


        } else if (choice == 5) {

            System.out.println("Give length of the neck:");
            float neckLength = input.nextFloat();

            giraffes+=1;
            String code = String.format("GI%03d", giraffes);
            ZooKeeper.animals.add(new Giraffe(code, name, weight, neckLength));

        } else if (choice == 6) {

            System.out.println("How strong is it? (1-10)");
            int strength = input.nextInt();

            gorillas+=1;
            String code = String.format("GO%03d", gorillas);
            ZooKeeper.animals.add(new Gorilla(code, name, weight, strength));


        } else if (choice == 7) {

            System.out.println("Is it the king? (true or false):");
            boolean king = input.nextBoolean();

            lions+=1;
            String code = String.format("LIO%03d", lions);
            ZooKeeper.animals.add(new Lion(code, name, weight, king));


        } else if (choice == 8) {

            System.out.println("Give length of the tail:");
            float tailLength = input.nextFloat();

            lizards+=1;
            String code = String.format("LIZ%03d", lizards);
            ZooKeeper.animals.add(new Lizard(code, name, weight, tailLength));


        }
    }



    static void searchByName(Scanner input){
        System.out.println("Enter name of the animal you want to search for: ");
        String animalToSearch = input.next();

        boolean exists = false;
        for (var animal: ZooKeeper.getAnimals()) {
            if(animal.getName() != null && animal.getName().contains(animalToSearch)) {
                System.out.println(animalToSearch + ", exists and here are it's characteristics: " + animal);
                exists = true;
                break;
            }

        }
        if (!exists)
            System.out.println(animalToSearch + ", does not exist ");

    }



    static int searchByCode(Scanner input) {
        System.out.println("Enter code of the animal you want to search for: ");
        String codeToSearch = input.next(); //Integer needed because .contains does not work with primitives

        int currentPosition = 0;
        boolean exists = false;
        for (var animal: ZooKeeper.getAnimals()) {
            if(animal.getCode() != null && animal.getCode().contains(codeToSearch)) {
                System.out.println(codeToSearch + ", exists and here are it's characteristics: " + animal);
                exists = true;
                return currentPosition;
            }

            currentPosition++;
        }
        if (!exists)
            System.out.println(codeToSearch + ", does not exist ");

        return -1;  //return -1 if it does not exist
    }


    static void editbyCode(Scanner input) {
        int position = searchByCode(input);
        if (position != -1) {
            System.out.println("Which characteristic do you want to edit? \n" + "1-Name " + "2-Code " + "3-Weight " + "4-Special/Last Characteristic");
            int characteristic = input.nextInt();
            switch (characteristic) {
                case 1 -> {
                    System.out.print("Enter new name for the animal: ");
                    String name = input.next();
                    animals.get(position).setName(name);
                }
                case 2 -> {
                    System.out.print("Enter new code for the animal: ");
                    String code = input.next();
                    animals.get(position).setCode(code);
                }
                case 3 -> {
                    System.out.print("Enter new average weight for the animal: ");
                    int weight = input.nextInt();
                    animals.get(position).setAvgWeight(weight);
                }
                case 4 -> {
                    if (animals.get(position) instanceof Alligator) {
                        System.out.print("Enter new number of victims: ");
                        int victims = input.nextInt();
                        ((Alligator) animals.get(position)).setVictims(victims);
                    }
                    else if (animals.get(position) instanceof Bear) {
                        System.out.print("Enter new region: ");
                        String region = input.next();
                        ((Bear) animals.get(position)).setRegion(region);
                    }
                    else if (animals.get(position) instanceof Elephant) {
                        System.out.print("Enter new trunk length: ");
                        float trunkLength = input.nextFloat();
                        ((Elephant) animals.get(position)).setTrunkLength(trunkLength);
                    }
                    else if (animals.get(position) instanceof Frog) {
                        System.out.print("Enter new status of poisonous (true or false): ");
                        boolean poisonous = input.nextBoolean();
                        ((Frog) animals.get(position)).setPoisonous(poisonous);
                    }
                    else if (animals.get(position) instanceof Giraffe) {
                        System.out.print("Enter new neck length: ");
                        float neckLength = input.nextFloat();
                        ((Giraffe) animals.get(position)).setNeckLength(neckLength);
                    }
                    else if (animals.get(position) instanceof Gorilla) {
                        System.out.print("Enter new number of strength: ");
                        int strength = input.nextInt();
                        ((Gorilla) animals.get(position)).setStrength(strength);
                    }
                    else if (animals.get(position) instanceof Lion) {
                        System.out.print("Is it still the king? (true or false): ");
                        boolean king = input.nextBoolean();
                        ((Lion) animals.get(position)).setKing(king);
                    }
                    else {
                        System.out.print("Enter new tail length: ");
                        float tailLength = input.nextFloat();
                        ((Lizard) animals.get(position)).setTailLength(tailLength);
                    }

                }

            }

        }
    }

    static void removeByCode(Scanner input){
        int position = searchByCode(input);
        if (position != -1) {
            ZooKeeper.animals.remove(position);
            System.out.println("The animal has been removed");
        }

    }

    static void saveData(){
        File f = new File("animalsData.bin");

        try(ObjectOutputStream os = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(f)))) {
            os.writeObject(String.valueOf(animals));
        }
        catch (IOException e) {
            System.err.println(e);
        }


    }

}






