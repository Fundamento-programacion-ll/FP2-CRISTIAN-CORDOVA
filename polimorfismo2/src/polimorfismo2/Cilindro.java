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
public class Cilindro extends Circulo {
    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Cilindro(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura = altura;
    }

    public Cilindro(int altura, int radio) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro(int altura) {
        this.altura = altura;
    }

    public Cilindro() {
    }

    
    public void dibujo(Graphics g){
        g.setColor(Color.GREEN);
        g.drawOval(super.getX(),getY(),getRadio(), getRadio());
       
        
    }
    
    @Override
    public String toString() {
        return "Cilindro="+this.altura;
    }
    
    
}
