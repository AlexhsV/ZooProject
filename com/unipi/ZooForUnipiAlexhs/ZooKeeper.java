package com.unipi.ZooForUnipiAlexhs;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public abstract class ZooKeeper{

    private static ArrayList<Animal> animals = new ArrayList<>();

    public static ArrayList<Animal> getAnimals() {
        return animals;
    }

    private static int alligators;  //counter of each animal, to create the unique id of each object
    private static int bears;       //static needed so they can be referenced from the static methods
    private static int elephants;
    private static int frogs;
    private static int giraffes;
    private static int gorillas;
    private static int lions;
    private static int lizards;

     protected static void addAnimals(){
        String[] Animals = {"Alligator", "Bear", "Elephant","Frog","Giraffe","Gorilla","Lion","Lizard"};
        String choice = (String) JOptionPane.showInputDialog(null, "Which animal do you want to add in the zoo? :\n", "Adding an animal", JOptionPane.PLAIN_MESSAGE, null, Animals, "Alligator");

        int weight= Integer.parseInt(JOptionPane.showInputDialog("Give weight  (hint: int numbers only!): "));

        String name= JOptionPane.showInputDialog("Give name  (hint: String only!): ");

        switch (choice) {
            case "Alligator" -> {

                int victims = Integer.parseInt(JOptionPane.showInputDialog("Give victims  (hint: int numbers only!): "));
                alligators += 1;    //+1 alligators have been created
                String id = String.format("AL%03d", alligators);  //unique id for each alligator generated here
                ZooKeeper.animals.add(new Alligator(id, name, weight, victims));

            }
            case "Bear" -> {

                String region = JOptionPane.showInputDialog("Give region  (hint: String only!): ");

                bears += 1;
                String id = String.format("BE%03d", bears);
                ZooKeeper.animals.add(new Bear(id, name, weight, region));

            }
            case "Elephant" -> {

                float trunkLength = Float.parseFloat(JOptionPane.showInputDialog("Give length of the trunk:  (hint: float/int only!):"));

                elephants += 1;
                String id = String.format("EL%03d", elephants);
                ZooKeeper.animals.add(new Elephant(id, name, weight, trunkLength));

            }
            case "Frog" -> {

                boolean poisonous = Boolean.parseBoolean(JOptionPane.showInputDialog("Is it poisonous?  (hint: true or false only!): "));

                frogs += 1;
                String id = String.format("FR%03d", frogs);
                ZooKeeper.animals.add(new Frog(id, name, weight, poisonous));


            }
            case "Giraffe" -> {

                float neckLength = Float.parseFloat(JOptionPane.showInputDialog("Give length of the neck:  (hint: float/int only!): "));

                giraffes += 1;
                String id = String.format("GI%03d", giraffes);
                ZooKeeper.animals.add(new Giraffe(id, name, weight, neckLength));

            }
            case "Gorilla" -> {

                int strength = Integer.parseInt(JOptionPane.showInputDialog("How strong is it?  (hint: int only 1-10!): "));

                gorillas += 1;
                String id = String.format("GO%03d", gorillas);
                ZooKeeper.animals.add(new Gorilla(id, name, weight, strength));


            }
            case "Lion" -> {

                boolean king = Boolean.parseBoolean(JOptionPane.showInputDialog("Is it the king?  (hint: true or false only!): "));

                lions += 1;
                String id = String.format("LIO%03d", lions);
                ZooKeeper.animals.add(new Lion(id, name, weight, king));


            }
            case "Lizard" -> {

                float tailLength = Float.parseFloat((JOptionPane.showInputDialog("Give length of the tail  (hint: float/int only!)::")));

                lizards += 1;
                String id = String.format("LIZ%03d", lizards);
                ZooKeeper.animals.add(new Lizard(id, name, weight, tailLength));
            }
        }
    }



    protected static void searchByName(){
        String animalToSearch= JOptionPane.showInputDialog("Enter name of the animal you want to search for: ");

        boolean exists = false;
        for (var animal: ZooKeeper.animals) {   //search the arraylist animals | var holds every time the type of the object
            if(animal.getName() != null && animal.getName().contains(animalToSearch)) {
                JOptionPane.showMessageDialog(null, animalToSearch + ", exists and here are it's characteristics: " + animal);
                exists = true;
                break;
            }

        }
        if (!exists)
            JOptionPane.showMessageDialog(null, animalToSearch + ", does not exist ");
    }


    protected static int searchById() {
        String idToSearch= JOptionPane.showInputDialog("Enter id of the animal you want to search for: ");

        int currentPosition = 0;
        for (var animal: ZooKeeper.animals) {
            if(animal.getid() != null && animal.getid().contains(idToSearch)) {
                JOptionPane.showMessageDialog(null, idToSearch + ", exists and here are it's characteristics: " + animal);
                return currentPosition;
            }

            currentPosition++;
        }

        JOptionPane.showMessageDialog(null, idToSearch + ", does not exist ");

        return -1;  //return -1 if it does not exist
    }



    protected static void editById() {
        int position = searchById();
        if (position != -1) {

            String[] characteristics = {"Name", "id", "Weight","Special/Last Characteristic"};
            String characteristic = (String) JOptionPane.showInputDialog(null, "Which characteristic do you want to edit? :\n", "Edit a characteristic", JOptionPane.PLAIN_MESSAGE, null, characteristics, "Name");

            switch (characteristic) {
                case "Name":
                    String name = JOptionPane.showInputDialog("Enter new name for the animal: ");
                    animals.get(position).setName(name);
                    break;
                case "id":
                    String id = JOptionPane.showInputDialog("Enter new id for the animal: ");
                    animals.get(position).setid(id);
                    break;
                case "Weight":
                    int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter new weight for the animal: "));
                    animals.get(position).setWeight(weight);
                    break;
                case "Special/Last Characteristic":
                    if (animals.get(position) instanceof Alligator) {
                        System.out.print("Enter new number of victims: ");
                        int victims = Integer.parseInt(JOptionPane.showInputDialog("Enter new number for victims: "));
                        ((Alligator) animals.get(position)).setVictims(victims);
                    } else if (animals.get(position) instanceof Bear) {
                        String region = JOptionPane.showInputDialog("Give new region: ");
                        ((Bear) animals.get(position)).setRegion(region);
                    } else if (animals.get(position) instanceof Elephant) {
                        float trunkLength = Float.parseFloat(JOptionPane.showInputDialog("Give length of the trunk: "));
                        ((Elephant) animals.get(position)).setTrunkLength(trunkLength);
                    } else if (animals.get(position) instanceof Frog) {
                        boolean poisonous = Boolean.parseBoolean(JOptionPane.showInputDialog("Is it poisonous? (true or false): "));
                        ((Frog) animals.get(position)).setPoisonous(poisonous);
                    } else if (animals.get(position) instanceof Giraffe) {
                        float neckLength = Float.parseFloat(JOptionPane.showInputDialog("Give length of the neck: "));
                        ((Giraffe) animals.get(position)).setNeckLength(neckLength);
                    } else if (animals.get(position) instanceof Gorilla) {
                        int strength = Integer.parseInt(JOptionPane.showInputDialog("How strong is it? (1-10): "));
                        ((Gorilla) animals.get(position)).setStrength(strength);
                    } else if (animals.get(position) instanceof Lion) {
                        boolean king = Boolean.parseBoolean(JOptionPane.showInputDialog("Is it the king? (true or false): "));
                        ((Lion) animals.get(position)).setKing(king);
                    } else {
                        float tailLength = Float.parseFloat((JOptionPane.showInputDialog("Give length of the tail:")));
                        ((Lizard) animals.get(position)).setTailLength(tailLength);
                    }
                    break;
            }
        }
    }



    protected static void removeById(){
        int position = searchById();
        if (position != -1) {
            ZooKeeper.animals.remove(position);
            JOptionPane.showMessageDialog(null,  "Exists and here are it's characteristics: ");
        }
    }


    //serialization
    protected static void saveData(){
        File f = new File("animalsData.bin");

        try(ObjectOutputStream os = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(f)))) {
            os.writeObject(animals);
        }
        catch (IOException e) {
            System.err.println(e);  //outputs the error
        }

    }


}






