/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;

/**
 *
 * @author crist
 */
public class Cilindro extends Canvas {
    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Cilindro(int altura) {
        this.altura = altura;
    }

    public Cilindro(int altura, GraphicsConfiguration gc) {
        super(gc);
        this.altura = altura;
    }

   

    public Cilindro() {
    }

    
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.drawLine(100, 100, 100, this.altura);
        g.drawLine(200, 100, 200, this.altura);
        g.drawOval(100, 75, 100, 50);
        g.drawOval(100, this.altura-25, 100, 50);
        
        
       
        
    }
    
    @Override
    public String toString() {
        return "Cilindro="+this.altura+" punto x= "+getX()+" Punto y= "+getY();
    }
    
    
}
