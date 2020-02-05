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
public class Circulo extends Punto{
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
        
    }
    
    
    public void dibujo(Graphics g){
        g.setColor(Color.RED);
        g.drawOval(super.getX(),getY(), this.radio, this.radio);
    }

    

    @Override
    public String toString() {
        return "El radio es:"+this.radio;
    }

    
    
}
