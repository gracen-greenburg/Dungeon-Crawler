package com.gg;
import javax.swing.JFrame;

/**
 * @author gracen-greenburg 2026
 * Main class to test Jframe creation
 */
public class main {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Jframe Window Test");

        frame.setSize(500, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the window once done

        frame.setVisible(true);
    }
}
