/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.user;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class usuario {
    
    public void menu(){
        user metodos = new user();
        int opcion=0;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"MENU \n"+"1.-agregar Persona \n"+"2.-agregar persona 2 \n"+"3.-Salir \n", this));
        do{
        switch(opcion){
            case 1: 
                String nombre=JOptionPane.showInputDialog(null,"Ingrese un  nombre");
                metodos.agregarPersona(nombre);
                System.out.println(metodos.listaPersona());
                break;
            case 2:
                System.out.println(metodos.listaPersona());
                break;
            case 3:
                opcion=3;
                break;
            default:
                opcion=3;
                break;
        }
        }while(opcion !=3);
    }
}
