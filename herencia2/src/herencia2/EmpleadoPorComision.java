/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author crist
 */
public class EmpleadoPorComision  extends Empleado{
    private double ventasbrutas;
    private double tarifacomision;

    public double getVentasbrutas() {
        return ventasbrutas;
    }

    public void setVentasbrutas(double ventasbrutas) {
        this.ventasbrutas = ventasbrutas;
    }

    public double getTarifacomision() {
        return tarifacomision;
    }

    public void setTarifacomision(double tarifacomision) {
        this.tarifacomision = tarifacomision;
    }

   
    
    
    public EmpleadoPorComision(double ventasbrutas, double tarifacomision, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.ventasbrutas = ventasbrutas;
        this.tarifacomision = tarifacomision;
    }

    public EmpleadoPorComision(double ventasbrutas, double tarifacomision) {
        this.ventasbrutas = ventasbrutas;
        this.tarifacomision = tarifacomision;
    }

    public EmpleadoPorComision() {
    }

    @Override
    public Double calcularIngreso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Empleado Asalariado: \n Nombre: "+ getNombre()+ " Apellido: "+ getApellido()+ " Por horas: "+ getTarifacomision();
    }
    
}
