/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class menu {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        series  re= new series ();
        int num;
         
         
         System.out.println("Ingresar un numero numeros");
         num=sc.nextInt();
         
         re.setNum1(num);
         System.out.println("El resultado es: "+re.resultado());
         
         
        
        
    }
}
