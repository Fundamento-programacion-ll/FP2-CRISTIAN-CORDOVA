/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

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
        
       EmpleadoSalariado em = new EmpleadoSalariado(32, "Cristian", "Cordova", 120);
        System.out.println(em);
        
        EmpleadoPorComision ep = new EmpleadoPorComision(320, 430, "Cristian", "Cordova", 320);
        System.out.println(ep);
        
        EmpleadoPorHoras eh = new EmpleadoPorHoras(210, 320, "Cristian", "Cordova", 320);
        System.out.println(eh);
        
        EmpleadoBaseMasComision eb = new EmpleadoBaseMasComision(210, 320, 2310,"Cristian","Cordova",12345);
        System.out.println(eb);
    }
    
}
