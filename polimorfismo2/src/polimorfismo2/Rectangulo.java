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
public class Rectangulo extends Punto{
    private int lado;
    private int lado2;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    
    
    public Rectangulo(int lado, int lado2, int x, int y) {
        super(x, y);
        this.lado = lado;
        this.lado2 = lado2;
    }

    public Rectangulo(int lado, int lado2) {
        this.lado = lado;
        this.lado2 = lado2;
    }

    
    public void paint(Graphics g){
        g.setColor(Color.RED);
       g.drawRect(super.getX(),super.getY(), getLado(), getLado2());
        
    }
    
    
    public Rectangulo() {
    }

    @Override
    public String toString() {
        return "Los lados del rectangulo son: "+this.lado+", "+this.lado2+" punto x= "+getX()+" Punto y= "+getY();
    }
    
    
}
