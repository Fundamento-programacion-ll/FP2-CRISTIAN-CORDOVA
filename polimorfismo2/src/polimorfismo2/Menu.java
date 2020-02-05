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
        
        int p1, p2, r;
        String op;
        
        Punto p = new Punto ();
        Circulo c = new Circulo();
        
        op=JOptionPane.showInputDialog("----------MENU--------- \n"
                                                      + "---------FIGURA-------- \n"
                    + "1. Punto \n"
                    + "2. Circulo \n"
                    + "3. Salir");
        
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
               r=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto r"));
               c.setRadio(r);
                           JFrame ventana = new JFrame ();
                           ventana.add(p);
                           ventana.setSize(700,400);
                           ventana.setVisible(true);
                           ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else{
             JOptionPane.showMessageDialog(null, "no exisste esa opcion");
        }
        
        if (op.equalsIgnoreCase("circulo")){
               r=Integer.parseInt(JOptionPane.showInputDialog("Ingerse el punto r"));
               c.setRadio(r);
        }
        
      
        
       
    }
    
}
