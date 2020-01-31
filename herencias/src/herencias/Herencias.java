/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author crist
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro perrito = new Perro (10, "perro", "masculino", "Dogy",5);
        perrito.datosPerro();
        
        Gato gatito =  new Gato (7,"mimi");
        gatito.datosGato();
    }
    
}
