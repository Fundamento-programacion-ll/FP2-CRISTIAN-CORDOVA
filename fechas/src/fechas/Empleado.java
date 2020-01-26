/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Empleado {
    
    String [] nombre,apellidos;
    int []salario;
    int [] fecha_ingreso, fecha_nacimiento;

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public int[] getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(int[] fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int[] getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int[] fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Empleado(String[] nombre, String[] apellidos, int[] salario, int[] fecha_ingreso, int[] fecha_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Empleado() {
    }
    
    public void ingresarempleados (int numempleados){
    
        String [] nom = new String[numempleados];
        String [] ape = new String[numempleados];
        int [] salario = new int[numempleados];
        int [] feching = new int[numempleados];
        int [] fechnac = new int[numempleados];
        double acum=0;
        
        for (int i = 0; i < numempleados; i++) {
            nom [i] = JOptionPane.showInputDialog(null,(i+1)+". "+"Ingrese el Nombre del empleado: ");
            ape [i] = JOptionPane.showInputDialog(null,(i+1)+". "+"Ingrese el Apellido del empleado N°: ");
            salario [i] = Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+". "+"Ingrese el Salario del empleado N°: "));
            feching [i] = Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+". "+"Ingrese la fecha de ingreso del empleado N°: "));
            fechnac [i] = Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+". "+"Ingrese la fecha de nacimiento del empleado N°: "));
        }
        ///////////////////////Salario mayor/////////////////////////////
        acum=salario[1];
        for (int i=0;i<numempleados;i++){
            if (salario[i]>acum){
                acum=salario[i];
            }
        }
        ////////////////////////////////////////////////////
         for (int i = 0; i < numempleados; i++) {
            System.out.println("Empleado "+(i+1)+". "+"Nombre: "+nom[i]+" Apellido: "+ape[i]+" Salario: "+ salario[i]+" Fecha de Ingreso: "+ feching[i]+" Fecha de Nacimiento: "+fechnac[i]+"\n");
            
            if (salario[i]==acum){
                System.out.println("El salario mayor es: "+acum+ " del trabajador(a): "+nom [i]+" "+ape[i]);
            }
        }   
        
        
        setNombre(nom);
        setApellidos(ape);
        setSalario(salario);
        setFecha_ingreso(feching);
        setFecha_nacimiento(fechnac);
    }
    
    
    
}
