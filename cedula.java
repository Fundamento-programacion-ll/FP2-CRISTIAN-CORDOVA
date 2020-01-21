/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class cedula {
     public static void main(String[] args) {
    
        
        String cedula;
        int c;
        int suma=0;
        int acum;
        int resta=0;
        
         Scanner sc=new Scanner (System.in);
         
        System.out.println("Ingrese la cedula");
        cedula=sc.nextLine();
         
        for (int i = 0; i < cedula.length()-1; i++) {
            c=Integer.parseInt(cedula.charAt(i)+"");
            if(i%2==0){
                c=c*2;
                if (c>9) {
                    c=c-9;
                }
            }
          suma=suma+c;  
        }
        
        if(suma%10 != 0){
            acum=((suma/10)+1)*10;
            resta=acum-suma;
        }
        
        int ultimo=Integer.parseInt(cedula.charAt(9)+"");
        
        if(ultimo==resta){
            
            System.err.println("cedula correcta");
            
        }else {
               
        System.out.println("cedula incorrecta");
        }
    }
}
