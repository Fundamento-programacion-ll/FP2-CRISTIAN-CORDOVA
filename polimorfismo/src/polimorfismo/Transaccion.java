/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author crist
 */
public  abstract class Transaccion {
    private int cuenta;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public Transaccion(int cuenta) {
        this.cuenta = cuenta;
    }

    public Transaccion() {
    }
    
    
    
    
    
    public abstract String ejecutar();
    
    public String obtenerCuenta(){
        return ejecutar();
    }
}
