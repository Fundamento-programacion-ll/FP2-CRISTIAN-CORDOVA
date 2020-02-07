/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadoraes;

/**
 *
 * @author crist
 */
public class Comparadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        String salida = "";
        Pais p = new Pais();
        
        p.setListaprovincias();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        
        
        p.ordenarpornombreProvincia();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        
        p.ordenarpornumerodeHabitantes();
        salida += "Lista Habitantes: \n"+p.toString();
        System.out.println(salida);
    }
    
}
