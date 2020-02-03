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
public class EmpleadoSalariado extends Empleado {
    private double salarioSemanal;

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal > 0){
        this.salarioSemanal = salarioSemanal;
        }else{
              System.out.println(0);  
        }
    }

     public void salario (){
         System.out.println("-Nombre: "+getNombre()+ " -Apellido: "+getApellido() +" -Salario Semalnal:" +getSalarioSemanal());
    }
    
    
    public EmpleadoSalariado(double salarioSemanal, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoSalariado(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoSalariado() {
    }

    @Override
    public Double calcularIngreso() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0.0;   
    }
    
    @Override
    public String toString() {
        return "Empleado Asalariado: \n Nombre: "+ getNombre()+ " Apellido: "+ getApellido()+ "Salario semanal: "+ getSalarioSemanal(); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
    
}
