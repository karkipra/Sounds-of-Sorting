/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendering;

/**
 *
 * @author pratikkarki
 */
import java.awt.BorderLayout;

import javax.swing.JFrame;

import audio.NoteIndices;

public class SortingVisualizer {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    // NOTE: Before running make sure any programs that affect your screen's color, for example
    // Flux, are turned off and that your volume is turned up.
    public static void main(String[] args) throws InterruptedException {        
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new BorderLayout());
        NoteIndices notes = new NoteIndices(0);
        
        ArrayPanel   arrayPanel   = new ArrayPanel(notes, WIDTH, HEIGHT);
        ControlPanel controlPanel = new ControlPanel(notes, arrayPanel); 
        
        frame.setTitle("Sorting Visualizer");
        frame.add(controlPanel, BorderLayout.PAGE_END);
        frame.add(arrayPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
