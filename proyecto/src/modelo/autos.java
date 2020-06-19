/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author crist
 */
public class autos {
    
    String matricula, modelo, nombreDueño;
    int cedula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public autos(String matricula, String modelo, String nombreDueño, int cedula) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.nombreDueño = nombreDueño;
        this.cedula = cedula;
    }

    public autos(String modelo, String nombreDueño, int cedula) {
        this.modelo = modelo;
        this.nombreDueño = nombreDueño;
        this.cedula = cedula;
    }
    
    

    public autos() {
    }
    
    
    
            
            
}
