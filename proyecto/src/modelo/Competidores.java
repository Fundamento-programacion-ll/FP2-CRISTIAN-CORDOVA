/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis Cajas
 */
public class Competidores {
    int ced;
    String matri;
    int idced;
    String nombre;
    String apellido;
    int edad;

    public Competidores() {
    }

    public Competidores(int ced, String matri, int idced, String nombre, String apellido, int edad) {
        this.ced = ced;
        this.matri = matri;
        this.idced = idced;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public String getMatri() {
        return matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }

    public int getIdced() {
        return idced;
    }

    public void setIdced(int idced) {
        this.idced = idced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
