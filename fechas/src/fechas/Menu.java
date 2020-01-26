/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Menu {
    
    
    public static void main(String[] args) {
        
        Empleado em = new Empleado();
        Fecha fe=new Fecha();
                
        int numemp = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cuantos empleados va a ingresar "));
        em.ingresarempleados(numemp);
        
        
        
    }
}
