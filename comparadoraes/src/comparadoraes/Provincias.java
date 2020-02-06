/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadoraes;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Provincias {
    private String nombreProvincia;
    private int numeroHabitantes;

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public Provincias(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public Provincias() {
        super();
        String datosNombre;
        int datosHabitantes;
        
        
        datosNombre = JOptionPane.showInputDialog("ingrese el nombre de las provincia separados por ';'");
        datosHabitantes=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de habitantes de esa privincia"));
        StringTokenizer tokens = new StringTokenizer(datosNombre, ";");
        this.nombreProvincia=tokens.nextToken();
        this.numeroHabitantes=datosHabitantes; 
    }
    
    
}
