package me.troyg.assignment4;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        GUI.jFrame = new JFrame("File Formatter");
        GUI.jFrame.setContentPane(new GUI().jPanel);
        GUI.jFrame.pack();
        GUI.jFrame.setVisible(true);
    }

}
