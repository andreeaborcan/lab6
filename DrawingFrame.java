/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingframe;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author ada
 */
public class DrawingFrame extends JFrame {
    private int nbSides;
    private int nbShapes;
    private int stroke;
    JButton Draw=new JButton();
     ControlPanel controlPanel;
    public static void main(String[] args) throws IOException {
  DrawingFrame drawingFrame=new DrawingFrame("AA");
   
    }
     public DrawingFrame(String title) {
        super(title);

        setSize(300, 350);
        this.setLayout(new GridLayout(3, 1));
        
        controlPanel = new ControlPanel();
        this.add(controlPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

        this.setVisible(true);

    }
    
}
