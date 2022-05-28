package com.unipi.ZooForUnipiAlexhs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            int selection;
            Scanner input = new Scanner(System.in);

            System.out.println("**************************************************");

            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - Προβολή όλων των διαθέσιμων ζώων του ζωολογικού κήπου");
            System.out.println("2 - Προσθήκη νέου ζώου");
            System.out.println("3 - Αναζήτηση ζώου βάσει ονόματος");
            System.out.println("4 - Αναζήτηση ζώου βάσει κωδικού");
            System.out.println("5 - Επεξεργασία ζώου βάσει κωδικού");
            System.out.println("6 - Διαγραφή ζώου βάσει κωδικού");
            System.out.println("7 - Έξοδος από την εφαρμογή\n");

            selection = input.nextInt();

            if (selection == 1) {
                System.out.println(ZooKeeper.getAnimals());
            }

            else if (selection == 2) {
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

                System.out.println("Give code:");
                String code = input.next();

                if (choice == 1) {

                    System.out.println("Give victims:");
                    int victims = input.nextInt();

                    (ZooKeeper.getAnimals()).add(new Alligator(code, name, weight, victims));

                } else if (choice == 2) {

                    System.out.println("Give region:");
                    String region = input.next();

                    (ZooKeeper.getAnimals()).add(new Bear(code, name, weight, region));

                } else if (choice == 3) {

                    System.out.println("Give length of the trunk:");
                    float trunkLength = input.nextFloat();

                    (ZooKeeper.getAnimals()).add(new Elephant(code, name, weight, trunkLength));

                } else if (choice == 4) {

                    System.out.println("Is it poisonous? (true or false):");
                    boolean poisonous = input.nextBoolean();

                    (ZooKeeper.getAnimals()).add(new Frog(code, name, weight, poisonous));

                } else if (choice == 5) {

                    System.out.println("Give length of the neck:");
                    float neckLength = input.nextFloat();

                    (ZooKeeper.getAnimals()).add(new Giraffe(code, name, weight, neckLength));

                } else if (choice == 6) {

                    System.out.println("How strong is it? (1-10)");
                    int strength = input.nextInt();

                    (ZooKeeper.getAnimals()).add(new Gorilla(code, name, weight, strength));

                } else if (choice == 7) {

                    System.out.println("Is it the king? (true or false):");
                    boolean king = input.nextBoolean();

                    (ZooKeeper.getAnimals()).add(new Lion(code, name, weight, king));

                } else if (choice == 8) {

                    System.out.println("Give length of the tail:");
                    float tailLength = input.nextFloat();

                    ZooKeeper.getAnimals().add(new Lizard(code, name, weight, tailLength));

                }
            }

            else if (selection == 3){

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

            else if (selection == 4){

                System.out.println("Enter code of the animal you want to search for: ");
                String codeToSearch = input.next(); //Integer needed because .contains does not work with primitives

                boolean exists = false;
                for (var animal: ZooKeeper.getAnimals()) {
                    if(animal.getCode() != null && animal.getCode().contains(codeToSearch)) {
                        System.out.println(codeToSearch + ", exists and here are it's characteristics: " + animal);
                        exists = true;
                        break;
                    }

                }
                if (!exists)
                    System.out.println(codeToSearch + ", does not exist ");

            }

            else if (selection == 5){

                System.out.println("Enter code of the animal you want to edit it's characteristics: ");
                String codeToSearch = input.next();

                boolean exists = false;
                for (var animal: ZooKeeper.getAnimals()) {
                    if(animal.getCode() != null && animal.getCode().contains(codeToSearch)) {
                        System.out.println(codeToSearch + ", exists and here are it's characteristics: " + animal);
                        exists = true;
                        System.out.println("Which characteristic do you want to edit? \n" + "1 - Name" + "2 - Code" + "3 - Weight" + "4 - Special Characteristic");
                        int characteristic = input.nextInt();
                        switch (characteristic) {
                            case 1 -> {
                                System.out.println("Enter new name for the animal: ");
                                String name = input.next();
                                animal.setName(name);
                            }
                            case 2 -> {
                                System.out.println("Enter new code for the animal: ");
                                String code = input.next();
                                animal.setCode(code);
                            }
                            case 3 -> {
                                System.out.println("Enter new average weight for the animal: ");
                                int weight = input.nextInt();
                                animal.setAvgWeight(weight);
                            }
                            case 4 -> System.out.println("UNDER CONSTRUCTION");
                            //String code = input.next();
                            //animal.set(code);
                        }
                        break;
                    }

                }
                if (!exists)
                    System.out.println(codeToSearch + ", does not exist ");

            }

            else if (selection == 6){
                System.out.println("Enter code of the animal you want to delete: ");
                String codeToSearch = input.next(); //Integer needed because .contains does not work with primitives

                boolean exists = false;
                for (var animal: ZooKeeper.getAnimals()) {
                    if(animal.getCode() != null && animal.getCode().contains(codeToSearch)) {
                        System.out.println(codeToSearch + ", deleting the animal with characteristics: " + animal);
                        exists = true;
                        ZooKeeper.getAnimals().remove(animal);
                        break;
                    }

                }
                if (!exists)
                    System.out.println(codeToSearch + ", does not exist ");
            }




            else if (selection == 7) {
                break;
            }


        }

    }









        }





