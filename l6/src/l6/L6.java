/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6;

import net.objecthunter.exp4j.*;
import java.io.IOException;
/**
 *
 * @author ada
 */
public class L6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DrawingFrame a=new DrawingFrame("ceb");
        a.setVisible(true);
        Expression e = new ExpressionBuilder("cos(x)").variable("x").build().setVariable("x", 0);
        System.err.println(e.evaluate());
    }
    
}
