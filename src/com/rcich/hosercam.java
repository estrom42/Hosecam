package com.rcich;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hosercam {
    private JButton buttonMessage;
    private JPanel panelMain;

    public hosercam() {
        buttonMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Fuck off, world!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("hosercam");
        frame.setContentPane(new hosercam().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
