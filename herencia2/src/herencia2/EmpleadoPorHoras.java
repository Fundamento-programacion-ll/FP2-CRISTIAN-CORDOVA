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
public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        
        this.horas = ((horas > 0 && horas <= 168)? horas : 0 );
    }

    
    
    
    public EmpleadoPorHoras(double sueldo, double horas, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public EmpleadoPorHoras(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public EmpleadoPorHoras() {
    }

    @Override
    public Double calcularIngreso() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0.0;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado: \n Nombre: "+ getNombre()+ " Apellido: "+ getApellido()+ " Por horas: "+ getHoras();
    }
    
}
