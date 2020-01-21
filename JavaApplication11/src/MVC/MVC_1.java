/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Modelo.persona;
import Vista.usuario;
import java.util.Scanner;


/**
 *
 * @author crist
 */
public class MVC_1 {
    
    public static void main(String[] args) {
        usuario inicio= new usuario();
        
        String cedula;
        int c;
        int suma=0;
        int acum;
        int resta=0;
        
         
            persona cristian = new persona ("cristian","cordova","",0,"22222", "la 41", 'm', true);
            System.out.println(cristian);
            inicio.menu();
        
    }
}
