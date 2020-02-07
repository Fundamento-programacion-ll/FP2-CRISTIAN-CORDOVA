/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadoraes;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Pais {
    private ArrayList<Provincias> listaprovincias;

    public ArrayList<Provincias> getListaprovincias() {
        return listaprovincias;
    }

    public void setListaprovincias() {
        int opcion ;
        Provincias provincia;
        do {            
            provincia = new Provincias();
            agregarProvincia(provincia);
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_CANCEL_OPTION);
        } while (opcion==JOptionPane.YES_NO_CANCEL_OPTION);
        
    }

    public Pais(ArrayList<Provincias> listaprovincias) {
        this.listaprovincias = listaprovincias;
    }

    public Pais() {
        this.listaprovincias = new ArrayList<>();
    }
    
    public void agregarProvincia (Provincias provinsia){
        
        this.listaprovincias.add(provinsia);
        
    }
    
    public void ordenarpornombreProvincia(){
        //ordenar la lista de objetos por el nombre 
        Collections.sort(listaprovincias, new Comparador());
    }
    
    public void ordenarpornumerodeHabitantes(){
        //ordenar por numero de habitantes
         Collections.sort(listaprovincias, new Comparador());
        
    }
    

    @Override
    public String toString() {
        return "Lista provincias \n"+listaprovincias;
    }
    
    
    
    
}
