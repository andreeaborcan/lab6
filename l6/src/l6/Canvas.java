/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author ada
 */
public final class Canvas extends JPanel {
    ImageIcon ii;
    BufferedImage img;
    JLabel label;
    Graphics graphics;
    
    
    public Canvas() throws IOException {
        //this.getGraphics() = img.createGraphics();
        label = new JLabel();
        setBounds(0, 0, 500, 300);
        img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB); 
        graphics = img.createGraphics();
        this.add(label);
    }
    public void drawShapeAt(int x, int y) {
                
        Random rand = new Random();
        //graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));
        //graphics.fill(new RegularPolygon(x, y, radius, sides));
    }

    public void paintFig(Graphics g){
        super.paintComponent(g);
          
          g.drawOval(100, 100, 60, 60); //FOR CIRCLE
          g.drawRect(80, 30, 20, 20); // FOR SQUARE
          g.drawRect(20, 100, 100, 20); // FOR RECT
     }
    
    public void save()
    {
        
        try {
                if (ImageIO.write(img, "png", new File("./output_image.png")))
                {
                    System.out.println("-- saved");
                }
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }

    
    @Override
    public void paint(Graphics g)
    {
        //super.paint(graphics);
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        //g.setPaintMode();
        // Draw Text
        //g.drawString("This is my custom Panel!",10,20);
        //
        /*
        Graphics2D g2d;
        g2d = (Graphics2D) g;
*/
    }
    
    public void drawCenteredCircle(Graphics g, int x, int y, int r) 
    {
        //g.setPaintMode();
        x = x-(r/2);
        y = y-(r/2);
        Ellipse p =new Ellipse((double)r, (double)r);
        Shape s;
        Random rand = new Random();
        
        float rr = rand.nextFloat();
        float gg = rand.nextFloat();
        float bb = rand.nextFloat();
        float aa = (float) (rand.nextFloat() / 2f + 0.5);
        
        Color c = new Color(rr, gg, bb, aa);
        g.setColor(c);
        graphics.setColor(c);
        g.fillOval(x, y, r, r);
        //g.drawOval(x,y,r,r);
        graphics.fillOval(x,y,r,r);
        //super.paintComponent(g);
        //update(g);
    }
    
    public void drawRandomPolygon(Graphics g)
    { 
        Random rand = new Random();
         Polygon p = new RegularPolygon(rand.nextInt(500), rand.nextInt(300), rand.nextInt(100), rand.nextInt(5)+3);
        
      
        float rr = rand.nextFloat();
        float gg = rand.nextFloat();
        float bb = rand.nextFloat();
        float aa = (float) (rand.nextFloat() / 2f + 0.5);
        
        Color c = new Color(rr, gg, bb, aa);
        g.setColor(c);
        graphics.setColor(c);
        g.fillPolygon(p);
        //g.drawOval(x,y,r,r);
        graphics.fillPolygon(p);
    }
    
    public void drawPolygon(Graphics g, int x, int y, int l, int nrl) 
    {
        //g.setPaintMode();
        Polygon p = new RegularPolygon(x, y, l, nrl);
        
        Random rand = new Random();
        float rr = rand.nextFloat();
        float gg = rand.nextFloat();
        float bb = rand.nextFloat();
        float aa = (float) (rand.nextFloat() / 2f + 0.5);
        
        Color c = new Color(rr, gg, bb, aa);
        g.setColor(c);
        graphics.setColor(c);
        g.fillPolygon(p);
        //g.drawOval(x,y,r,r);
        graphics.fillPolygon(p);
        //super.paintComponent(g);
        //update(g);
    }

    void load(Graphics g) throws IOException {
        System.err.println("aaaaaaaaaaaaaaaaa");
        img = ImageIO.read(new File("./output_image.png"));
        super.paint(g);
        super.paintComponent(graphics);
        //update(g);
        g.drawImage(img, 0, 0, null);
        graphics.drawImage(img, 0, 0, null);
        graphics = img.createGraphics();
    }
    void reset(Graphics g) {
        super.paint(g);
        super.paintComponent(graphics);
    }
    

}

