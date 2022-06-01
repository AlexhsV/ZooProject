package com.unipi.ZooForUnipiAlexhs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame  {

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
    private JLabel outputLabel;
    private JLabel imageLabel;
    private JLabel showAnimals;


    public Form1() {

        /*
        JFrame frame = new JFrame();
        frame.setTitle("Admin - Dashboard");
        //frame.setContentPane(new Form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(1280,720);
        frame.setVisible(true);

        ImageIcon logo = new ImageIcon("logo.png");
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(Color.white);
*/

        viewAllAvailableAnimalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //imagePanel.setVisible(false);
                //imageLabel.setVisible(true);
                //frame.getContentPane().removeAll(); //or .remove(previousPanel);
                //imagePanel.remove(imagePanel);
                //imageLabel.remove(imageLabel);
                //imageLabel.setEnabled(false);
                //label.setBorder(border);
                imagePanel.setEnabled(false);
                outputLabel.setText("here are the animals: " + ZooKeeper.getAnimals());
            }
        });
    }




}
