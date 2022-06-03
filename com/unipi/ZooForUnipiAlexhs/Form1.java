package com.unipi.ZooForUnipiAlexhs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Form1 implements ZooOperations{

    private static ArrayList<Animal> animals = new ArrayList<>();

    //public static ArrayList<Animal> animals {
        //return animals;
    //}

    private static int alligators;  //counter of each animal, to create the unique code of each object
    private static int bears;       //static needed so they can be referenced from the static methods
    private static int elephants;
    private static int frogs;
    private static int giraffes;
    private static int gorillas;
    private static int lions;
    private static int lizards;

    JPanel mainPanel;
    private JPanel whitePanel;
    private JPanel grayPanel;
    private JButton viewAllAvailableAnimalsButton;
    private JPanel button1Panel;
    private JButton addNewAnimalButton;
    private JPanel button3Panel;
    private JPanel button2Panel;
    private JButton searchForAnAnimalButton;
    private JPanel button4Panel;
    private JPanel button5Panel;
    private JPanel button6Panel;
    private JPanel button7Panel;
    private JButton searchForAnAnimalButton1;
    private JButton editAnimalCharacteristicsByButton;
    private JButton deleteAnimalByCodeButton;
    private JButton saveAndExitButton;
    private JPanel bluePanel;
    private JLabel welcomeLabel;
    private JPanel imagePanel;
    private JLabel imageLabel;

     public void addAnimals(){
        String[] Animals = {"Alligator", "Bear", "Elephant","Frog","Giraffe","Gorilla","Lion","Lizard"};
        String choice = (String) JOptionPane.showInputDialog(null, "Which animal do you want to add in the zoo? :\n", "Adding an animal", JOptionPane.PLAIN_MESSAGE, null, Animals, "Alligator");

        int weight= Integer.parseInt(JOptionPane.showInputDialog("Give weight: "));

        String name= JOptionPane.showInputDialog("Give name: ");

         switch (choice) {
             case "Alligator" -> {

                 int victims = Integer.parseInt(JOptionPane.showInputDialog("Give victims: "));
                 alligators += 1;
                 String code = String.format("AL%03d", alligators);
                 Form1.animals.add(new Alligator(code, name, weight, victims));

             }
             case "Bear" -> {

                 String region = JOptionPane.showInputDialog("Give region: ");

                 bears += 1;
                 String code = String.format("BE%03d", bears);
                 Form1.animals.add(new Bear(code, name, weight, region));

             }
             case "Elephant" -> {

                 float trunkLength = Float.parseFloat(JOptionPane.showInputDialog("Give length of the trunk: "));

                 elephants += 1;
                 String code = String.format("EL%03d", elephants);
                 Form1.animals.add(new Elephant(code, name, weight, trunkLength));

             }
             case "Frog" -> {

                 boolean poisonous = Boolean.parseBoolean(JOptionPane.showInputDialog("Is it poisonous? (true or false): "));

                 frogs += 1;
                 String code = String.format("FR%03d", frogs);
                 Form1.animals.add(new Frog(code, name, weight, poisonous));


             }
             case "Giraffe" -> {

                 float neckLength = Float.parseFloat(JOptionPane.showInputDialog("Give length of the neck: "));

                 giraffes += 1;
                 String code = String.format("GI%03d", giraffes);
                 Form1.animals.add(new Giraffe(code, name, weight, neckLength));

             }
             case "Gorilla" -> {

                 int strength = Integer.parseInt(JOptionPane.showInputDialog("How strong is it? (1-10): "));

                 gorillas += 1;
                 String code = String.format("GO%03d", gorillas);
                 Form1.animals.add(new Gorilla(code, name, weight, strength));


             }
             case "Lion" -> {

                 boolean king = Boolean.parseBoolean(JOptionPane.showInputDialog("Is it the king? (true or false): "));

                 lions += 1;
                 String code = String.format("LIO%03d", lions);
                 Form1.animals.add(new Lion(code, name, weight, king));


             }
             case "Lizard" -> {

                 float tailLength = Float.parseFloat((JOptionPane.showInputDialog("Give length of the tail:")));

                 lizards += 1;
                 String code = String.format("LIZ%03d", lizards);
                 Form1.animals.add(new Lizard(code, name, weight, tailLength));
             }
         }
    }



    public void searchByName(){
        String animalToSearch= JOptionPane.showInputDialog("Enter name of the animal you want to search for: ");

        boolean exists = false;
        for (var animal: Form1.animals) {
            if(animal.getName() != null && animal.getName().contains(animalToSearch)) {
                JOptionPane.showMessageDialog(null, animalToSearch + ", exists and here are it's characteristics: " + animal);
                exists = true;
                break;
            }

        }
        if (!exists)
            JOptionPane.showMessageDialog(null, animalToSearch + ", does not exist ");
    }


    public int searchByCode() {
        String codeToSearch= JOptionPane.showInputDialog("Enter code of the animal you want to search for: ");

        int currentPosition = 0;
        for (var animal: Form1.animals) {
            if(animal.getCode() != null && animal.getCode().contains(codeToSearch)) {
                JOptionPane.showMessageDialog(null, codeToSearch + ", exists and here are it's characteristics: " + animal);
                return currentPosition;
            }

            currentPosition++;
        }

        JOptionPane.showMessageDialog(null, codeToSearch + ", does not exist ");

        return -1;  //return -1 if it does not exist
    }






    public void editByCode() {
        int position = searchByCode();
        if (position != -1) {

            String[] characteristics = {"Name", "Code", "Weight","Special/Last Characteristic"};
            String characteristic = (String) JOptionPane.showInputDialog(null, "Which characteristic do you want to edit? :\n", "Edit a characteristic", JOptionPane.PLAIN_MESSAGE, null, characteristics, "Name");

            switch (characteristic) {
                case "Name":
                    String name = JOptionPane.showInputDialog("Enter new name for the animal: ");
                    animals.get(position).setName(name);
                    break;
                case "Code":
                    String code = JOptionPane.showInputDialog("Enter new code for the animal: ");
                    animals.get(position).setCode(code);
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



    public void removeByCode(){
        int position = searchByCode();
        if (position != -1) {
            Form1.animals.remove(position);
            JOptionPane.showMessageDialog(null,  "Exists and here are it's characteristics: ");
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

    public Form1() {

        viewAllAvailableAnimalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button1
                JOptionPane.showMessageDialog(null, String.valueOf(Form1.animals));
            }
        });

        addNewAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button2
                addAnimals();
            }
        });
        searchForAnAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button3
                searchByName();

            }
        });
        searchForAnAnimalButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button4
                searchByCode();

            }
        });
        editAnimalCharacteristicsByButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button5
                editByCode();
            }

        });

        deleteAnimalByCodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button6
                removeByCode();
            }
        });
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Admin - Dashboard");
        frame.setContentPane(new Form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1280,720);
        frame.pack();
        frame.setVisible(true);

        ImageIcon logo = new ImageIcon("logo.png");
        frame.setIconImage(logo.getImage());


    }


}
