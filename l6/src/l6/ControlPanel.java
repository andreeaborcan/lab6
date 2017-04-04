/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
        
        //this.setLayout(new GridLayout(3, 4, 19, 10));
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
    }
    
    public ControlPanel() {
         this.setLayout(new FlowLayout());
      // DrawingFrame DF=new DrawingFrame();
        SAVE.setText("SAVE");
        add(SAVE,BorderLayout.SOUTH);
        LOAD.setText("LOAD");
        add(LOAD,BorderLayout.SOUTH);
        
        RESET.setText("RESET");
        add(RESET,BorderLayout.SOUTH);
         //setBackground(Color.MAGENTA);
         this.setSize(new Dimension(100,700));
    }

    
    
   
}
