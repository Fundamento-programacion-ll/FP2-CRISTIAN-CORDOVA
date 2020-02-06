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
public class Punto extends Figura {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }

    
    /*public punto() {
        super();
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores del punto separados por coma");
        StringTokenizer tokens = new StringTokenizer(datos, ",");               
        this.x = Integer.parseInt(tokens.nextToken());
        this.y = Integer.parseInt(tokens.nextToken());                
   }
   */
    
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(this.x, this.y, 20, 20);
        
    }

    @Override
    public String toString() {
        return "puntos: [ x = "+this.x+", y = "+this.y+" ]";
    }

    @Override
    public double area() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
