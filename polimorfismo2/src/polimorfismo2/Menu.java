/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int p1, p2, r, l,la,lad,al;
        String op;
        
        Punto p = new Punto ();
        Circulo c = new Circulo();
        Cuadrado cu = new Cuadrado();
        Rectangulo rec = new Rectangulo();
        Cilindro ci= new Cilindro();
        
        op=JOptionPane.showInputDialog("----------MENU--------- \n"
                                                      + "---------FIGURA-------- \n"
                    + "1. Punto \n"
                    + "2. Circulo \n"
                    + "3. Cuadrado \n"
                    + "4. Retangulo \n"
                    + "5. Cilindro \n"
                    + "6. Salir \n");
        
        if (op.equalsIgnoreCase("punto")){
               p1=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto x"));
               p.setX(p1);
               p2=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto y"));
               p.setY(p2);   
        
                          JFrame ventana = new JFrame ();
                          ventana.add(p);
                          ventana.setSize(700,400);
                          ventana.setVisible(true);
                          ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          
        }else if (op.equalsIgnoreCase("circulo")){
               p1=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto x"));
               p.setX(p1);
               p2=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto y"));
               p.setY(p2);
               r=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto r"));
               c.setRadio(r);
                           JFrame ventana = new JFrame ();
                           ventana.add(c);
                           ventana.setSize(700,400);
                           ventana.setVisible(true);
                           ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           
               System.out.println("El area del circulo es: "+c.area());
        }else if (op.equalsIgnoreCase("cuadrado")){
               p1=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto x"));
               p.setX(p1);
               p2=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto y"));
               p.setY(p2);
               l=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
               cu.setLado1(l);
                           JFrame ventana = new JFrame ();
                           ventana.add(cu);
                           ventana.setSize(700,400);
                           ventana.setVisible(true);
                           ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if (op.equalsIgnoreCase("rectangulo")){
               p1=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto x"));
               p.setX(p1);
               p2=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto y"));
               p.setY(p2);
               la=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho del rectangulo "));
               rec.setLado(la);
               lad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto 2 del rectangulo"));
               rec.setLado2(lad);
                           JFrame ventana = new JFrame ();
                           ventana.add(rec);
                           ventana.setSize(700,400);
                           ventana.setVisible(true);
                           ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if (op.equalsIgnoreCase("Cilindro")){
               p1=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto x"));
               p.setX(p1);
               p2=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto y"));
               p.setY(p2);
               al=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
               ci.setAltura(al);
                           JFrame ventana = new JFrame ();
                           ventana.add(ci);
                           ventana.setSize(700,400);
                           ventana.setVisible(true);
                           ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else{
             JOptionPane.showMessageDialog(null, "no existe esa opcion");
        }
        
    }
    
}
