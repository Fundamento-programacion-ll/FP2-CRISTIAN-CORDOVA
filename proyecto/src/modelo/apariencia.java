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
public class apariencia {
    int cedulaCo, cedulaRe;
    String color, modificacion, nombreRe; 

    public int getCedulaCo() {
        return cedulaCo;
    }

    public void setCedulaCo(int cedulaCo) {
        this.cedulaCo = cedulaCo;
    }

    public int getCedulaRe() {
        return cedulaRe;
    }

    public void setCedulaRe(int cedulaRe) {
        this.cedulaRe = cedulaRe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModificacion() {
        return modificacion;
    }

    public void setModificacion(String modificacion) {
        this.modificacion = modificacion;
    }

    public String getNombreRe() {
        return nombreRe;
    }

    public void setNombreRe(String nombreRe) {
        this.nombreRe = nombreRe;
    }

    public apariencia(int cedulaCo, int cedulaRe, String color, String modificacion, String nombreRe) {
        this.cedulaCo = cedulaCo;
        this.cedulaRe = cedulaRe;
        this.color = color;
        this.modificacion = modificacion;
        this.nombreRe = nombreRe;
    }

    public apariencia() {
    }
    

  
    
    
}
