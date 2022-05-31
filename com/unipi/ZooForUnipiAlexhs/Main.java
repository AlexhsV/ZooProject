package com.unipi.ZooForUnipiAlexhs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new GUI();

        loop: while (true) {
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

            switch (selection) {

                case 1:
                    System.out.println(ZooKeeper.getAnimals()); //getter needed to print the arraylist
                    break;

                case 2:
                    ZooKeeper.addAnimals(input);
                    break;

                case 3:
                    ZooKeeper.searchByName(input);
                    break;

                case 4:
                    ZooKeeper.searchByCode(input);
                    break;

                case 5:
                    ZooKeeper.editbyCode(input);
                    break;

                case 6:
                    ZooKeeper.removeByCode(input);
                    break;

                case 7:
                    ZooKeeper.saveData();
                    break loop;

            }
        }

    }

}









