package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JavaSwing extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Page");

        JButton button = new JButton("Go to Sub Page");
        button.setBounds(50, 50, 200, 30);
        button.addActionListener(e -> {
            JFrame subFrame = new JFrame("Sub Page");

            JLabel label = new JLabel("This is Sub Page.");
            label.setBounds(50, 50, 200, 30);

            subFrame.add(label);
            subFrame.setSize(300, 150);
            subFrame.setLayout(null);
            subFrame.setVisible(true);
        });

        frame.add(button);
        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}