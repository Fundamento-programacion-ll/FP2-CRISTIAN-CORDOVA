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
        String datos;
        
        datos = JOptionPane.showInputDialog(null, "Ingrese los datos separados por punto y coma");
        StringTokenizer  tokens = new StringTokenizer(datos,";");
        this.nombreProvincia = tokens.nextToken();
        this.numeroHabitantes = Integer.parseInt(tokens.nextToken());        
    }
        

    @Override
    public String toString() {
        return "Nombre de la Provincia: "+nombreProvincia+" Numero de habitantes de la prvincia: "+numeroHabitantes;
    }
    
    
}
