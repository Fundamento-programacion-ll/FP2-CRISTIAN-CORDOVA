/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimensiones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class menu {
    
    public static void main(String[] args) {       
        int op, op2, op3;
        int c;
        double pi=3.14;
        int lado,base,altura;
        
        String condicion = "";
        
        
        Tringulo tri = new Tringulo ();
        Cuadrado cua= new Cuadrado ();
        Circulo ci= new Circulo ();
        Scanner sc=new Scanner (System.in);
        
        do{
            
            op = Integer.parseInt(JOptionPane.showInputDialog("----------MENU--------- \n"
                                                             + "------Dimensiones----- \n"
                    + "1. Triangulo \n"
                    + "2. Cuadrado \n"
                    + "3. Circulo"));
            
           switch(op){
            case 1:
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("----------MENU--------- \n"
                                                             + "------Triangulo----- \n"
                    + "1. AREA \n"
                    + "2. VOLUMEN \n"
                    + "3. PERIMETRO"));
                      switch (op2){
                         case 1:
                             base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                             tri.setBase(base);
                             altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
                             tri.setAltura(altura);
                             tri.area();
                             
                             break;
                         case 2:
                             base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                             tri.setBase(base);
                             altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
                             tri.setAltura(altura);
                             tri.volumen();
                             
                             break;
                         case 3:
                             
                             lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Lado"));
                             tri.setLado(lado);
                             tri.perimetro();
                             
                             break;
                         
                         default:
                             System.out.println("No está disponible esa opcion");
                             break;
                      }
                
                condicion = JOptionPane.showInputDialog("Desea sacar otro metodo escriba (si) para continuar \n"+"(no) para Terminar el proceso de Dimension");
                break;
                
                
            case 2:
                op3 = Integer.parseInt(JOptionPane.showInputDialog("----------MENU--------- \n"
                                                             + "------Cuadrado----- \n"
                    + "1. AREA \n"
                    + "2. VOLUMEN \n"
                    + "3. PERIMETRO"));
                      switch (op3){
                         case 1:
                             lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
                             cua.setLado(lado);
                             cua.area();
                             
                             break;
                         case 2:
                             lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
                             cua.setLado(lado);
                             cua.volumen();
                             
                             break;
                         case 3:
                             
                             lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
                             cua.setLado(lado);
                             cua.perimetro();
                             
                             break;
                         
                         default:
                             System.out.println("No está disponible esa opcion");
                             break;
                      }
                
                condicion = JOptionPane.showInputDialog("Desea sacar otro metodo escriba (si) para continuar \n"+"(no) para Terminar el proceso de Dimension");
                break;
            case 3:
                c=Integer.parseInt(JOptionPane.showInputDialog("Circunferencia del Circulo \n"+ "1. Ingrese el radio"));
                ci.setRadio(c);
                ci.circunferencia();
                System.out.println("El resultado del la circunferencia es: "+ ci.circuloCircunferencia(pi, c));
                
                
                condicion = JOptionPane.showInputDialog("Desea sacar otro metodo escriba (si) para continuar \n"+"(no) para Terminar el proceso de Dimension");
                break;
            default:
                condicion = JOptionPane.showInputDialog("No esta disponible la figura \n"+"Desea sacar otro metodo escriba (si) para continuar \n"
                        +"(no) para Terminar el proceso de Dimension");
                
                
                break;        
        }
            
            
          
        }while(condicion.equals("si") || condicion.equals("SI"));
        System.out.println("/n/n Progreso Finalizado /n*");
    }
}
