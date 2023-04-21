package org.example;
import javax.swing.*;
import java.awt.*;

public class SortingAlgorithmVisualizer extends JFrame {

    // Setup for GUI elements
    public SortingAlgorithmVisualizer() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,4));

        // Sorting algorithm dropdown
        JComboBox<String> algorithmDropdown = new JComboBox<String>(new String[] {"Bubble Sort", "Selection Sort", "Insertion Sort", "Quick Sort", "Merge Sort"});
        panel.add(new JLabel("Sorting Algorithm:"));
        panel.add(algorithmDropdown);

        // Algorithm delay dropdown
        Integer[] delayValues =  {0, 50, 100, 500, 1000};
        JComboBox<Integer> delayDropdown = new JComboBox<Integer>(delayValues);
        panel.add(new JLabel("Delay (ms):"));
        panel.add(delayDropdown);

        // Start and Reset buttons
        JButton startButton = new JButton("Start");
        panel.add(startButton);

        JButton resetButton = new JButton("Reset");
        panel.add(resetButton);

        // Add panel to frame
        add(panel);

        // Frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        SortingAlgorithmVisualizer visualizer = new SortingAlgorithmVisualizer();
    }
}