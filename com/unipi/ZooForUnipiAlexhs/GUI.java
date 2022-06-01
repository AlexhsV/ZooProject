package com.unipi.ZooForUnipiAlexhs;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame();
        frame.setTitle("Admin - Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1280,720);
        frame.setVisible(true);

        ImageIcon logo = new ImageIcon("logo.png");
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(Color.white);



        JLabel label = new JLabel();
        label.setText("Welcome Admin!");
        frame.add(label);

        ImageIcon image = new ImageIcon("theZoo.png");
        label.setIcon(image);


    }
}


