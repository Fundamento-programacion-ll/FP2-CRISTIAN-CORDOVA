/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadoraes;

import java.util.Comparator;

/**
 *
 * @author crist
 */
public class Comparador implements Comparator{

    int compararNombre;
    Provincias provincia1, provincia2;
    
    
    @Override
    public int compare(Object pro1, Object pro2) {
        
        provincia1 = (Provincias)pro1;
        provincia2 = (Provincias)pro2;
        
        if(provincia1.getNumeroHabitantes() > provincia2.getNumeroHabitantes()){
            compararNombre = 1;
        }else {
            compararNombre = -1;
        }
        
        //compararNombre = (provincia1.getNombreProvincia().compareToIgnoreCase(provincia2.getNombreProvincia()));
        
        return compararNombre;
    }
    
    
    
}
