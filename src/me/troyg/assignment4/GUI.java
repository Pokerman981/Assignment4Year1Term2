package me.troyg.assignment4;

import javax.swing.*;
import java.io.File;

public class GUI {
    public File inFile;
    public File outFile;

    public static JFrame jFrame;


    public JPanel jPanel;
    private JFileChooser jFileChooser = new JFileChooser();
    private JButton button1;

    GUI() {
        button1.setText("Open");

        button1.addActionListener(e -> {
            JButton clickButton = (JButton) e.getSource();
            jFileChooser.showOpenDialog(jFrame);

        });
    }
}
