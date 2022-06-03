package com.unipi.ZooForUnipiAlexhs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {

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
    private JButton searchForAnAnimalButton1;
    private JButton editAnimalCharacteristicsByButton;
    private JButton deleteAnimalByIdButton;
    private JPanel bluePanel;
    private JLabel welcomeLabel;
    private JPanel imagePanel;
    private JLabel imageLabel;



    public MainForm() {
        //actions performed for each button when clicked

        viewAllAvailableAnimalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button1
                JOptionPane.showMessageDialog(null, String.valueOf(ZooKeeper.getAnimals()));
            }
        });

        addNewAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button2
                ZooKeeper.addAnimals();
            }
        });
        searchForAnAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button3
                ZooKeeper.searchByName();

            }
        });
        searchForAnAnimalButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button4
                ZooKeeper.searchById();

            }
        });
        editAnimalCharacteristicsByButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button5
                ZooKeeper.editById();
            }

        });

        deleteAnimalByIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //button6
                ZooKeeper.removeById();
            }
        });

    }


    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Admin - Dashboard");
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1280,720);
        frame.pack();
        frame.setVisible(true);

        ImageIcon logo = new ImageIcon("logo.png");
        frame.setIconImage(logo.getImage());


        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                ZooKeeper.saveData();
                System.out.println("Data saved and application finished with exit code 0");

            }
        });

    }

}
