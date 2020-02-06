/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author crist
 */
public class Cuadrado extends Punto {
    private int lado1;
    

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public Cuadrado(int lado1, int x, int y) {
        super(x, y);
        this.lado1 = lado1;
    }

    public Cuadrado(int lado1) {
        this.lado1 = lado1;
    }

    
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(super.getX(),super.getY(), getLado1(), getLado1());
        
    }
    
    public Cuadrado() {
    }

    @Override
    public String toString() {
        return "Los lados del cuadrado son: "+this.lado1+" punto x= "+getX()+" Punto y= "+getY();
    }
    
    
    
    
}
