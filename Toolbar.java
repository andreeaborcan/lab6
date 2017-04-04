/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author ada
 */
public class Toolbar extends JPanel{
    JLabel dimensiune=new JLabel();
    JLabel nr_laturi=new JLabel();
    JSpinner dim = new JSpinner(new SpinnerNumberModel(10,1,200,1));
    JSpinner nr_l = new JSpinner(new SpinnerNumberModel(5, 3, 10, 1));
    JButton add=new JButton();
     JLabel functie=new JLabel();
    JTextField text=new JTextField(1);
    JLabel textgol=new JLabel();
    JLabel textgol1=new JLabel();
    JLabel textgol2=new JLabel();
    JButton deseneazaGraf=new JButton();
    
    JSpinner marime = new JSpinner(new SpinnerNumberModel(10, 10, 100, 10));
    public Toolbar(){
                

        dimensiune.setText("DIMENSIUNE: ");
        add(dimensiune);
        dimensiune.setBackground(Color.yellow);
       add(dim);
       add(textgol1);
         nr_laturi.setText("NR. LATURI: ");
        add(nr_laturi);
        nr_laturi.setBackground(Color.yellow);
        add(nr_l);
        add(textgol2);
        //setBackground(Color.gray);
        add.setText("ADD");
        add(add);
       
        this.setSize(new Dimension(200,200));
        functie.setText("FUNCTIE:");
        add(functie);
      
        add(text);
        text.setSize(new Dimension(200,100));
        textgol.setText("Marime:");
         add(textgol);
         add(marime);
        this.setLayout(new GridLayout(4, 2));
        deseneazaGraf.setText("Deseneaza graf");
        add(deseneazaGraf);
    }
}
