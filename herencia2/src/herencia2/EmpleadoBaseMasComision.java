/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salariobase;

    public double getSalariobase() {
        return salariobase;
        
    }

    public void setSalariobase(double salariobase) {
        
        this.salariobase = salariobase;
        
    }

    public double ingresos(){
        return salariobase * super.calcularIngreso();
    }
    
    
    
    public EmpleadoBaseMasComision(double salariobase, double ventasbrutas, double tarifacomision, String nombre, String apellido, int ci) {
        super(ventasbrutas, tarifacomision, nombre, apellido, ci);
        this.salariobase = salariobase;
    }

    public EmpleadoBaseMasComision(double salariobase, double ventasbrutas, double tarifacomision) {
        super(ventasbrutas, tarifacomision);
        this.salariobase = salariobase;
    }

    public EmpleadoBaseMasComision(double salariobase) {
        this.salariobase = salariobase;
    }

    

    public EmpleadoBaseMasComision() {
    }
    
    
}
