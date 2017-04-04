/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author ada
 */
public class DrawingFrame extends JFrame {

    private int nbSides;
    private int nbShapes;
    private int stroke;
    Toolbar toolbar;
    JButton Draw = new JButton();
    ControlPanel controlPanel;
    Canvas canvas;

    /*
    public Graphics=create(int x,
              int y,
              int width,
              int height)
     */
    public DrawingFrame(String title) throws IOException {
        super(title);

        setSize(500, 700);
        this.setLayout(new GridLayout(3, 1));

        toolbar = new Toolbar();
        this.add(toolbar);
        canvas = new Canvas();
        this.add(canvas);
        controlPanel = new ControlPanel();
        this.add(controlPanel);
        this.setVisible(true);
        //this.setLocationRelativeTo(null);

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.err.println("Am printat");
                System.err.println(e.getX());
                System.err.println(e.getY());
                int offset = 0;//toolbar.getHeight()+30;
                //canvas.paintFig(canvas.getGraphics());
                int r = (int) toolbar.dim.getValue();
                int nrl = (int) toolbar.nr_l.getValue();
                //canvas.drawCenteredCircle(canvas.getGraphics(), e.getX(), e.getY()-offset, r);
                canvas.drawPolygon(canvas.getGraphics(), e.getX(), e.getY() - offset, r, nrl);
                // drawShapeAt(e.getX(), e.getY());    
                //paintComponent(g);     
                //paint(g);
            }
        });

        controlPanel.SAVE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectionButtonPressed();
            }

            private void selectionButtonPressed() {
                canvas.save();

            }
        });
        toolbar.add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectionButtonPressed();
            }

            private void selectionButtonPressed() {
                canvas.drawRandomPolygon(canvas.getGraphics());
            }
        });

        controlPanel.LOAD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    selectionButtonPressed();
                } catch (IOException ex) {
                    Logger.getLogger(DrawingFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void selectionButtonPressed() throws IOException {
                canvas.load(canvas.getGraphics());
            }
        });
        controlPanel.RESET.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    selectionButtonPressed();
                } catch (IOException ex) {
                    Logger.getLogger(DrawingFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void selectionButtonPressed() throws IOException {
                canvas.reset(canvas.getGraphics());
            }
        });
        toolbar.deseneazaGraf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectionButtonPressed();
            }

            private void selectionButtonPressed() {
               
                canvas.deseneazaGraf(canvas.getGraphics(),toolbar.text.getText(),50);
                
                canvas.deseneazaAxe(canvas.getGraphics());
            }
        });
        

        this.setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
