/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author ada
 */
public class ControlPanel extends JPanel  {

    public JButton LOAD = new JButton();
    public JButton SAVE = new JButton();
    public JButton RESET = new JButton();

    public void arange() {
        
        this.setLayout(new GridLayout(3, 4, 19, 10));
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
    }
    
    public ControlPanel() {
      // DrawingFrame DF=new DrawingFrame();
        SAVE.setText("SAVE");
        add(SAVE);
        LOAD.setText("LOAD");
        add(LOAD);
        
        RESET.setText("RESET");
        add(RESET);setBackground(Color.MAGENTA);
         setBackground(Color.MAGENTA);
        
    }

    
    
   
}
