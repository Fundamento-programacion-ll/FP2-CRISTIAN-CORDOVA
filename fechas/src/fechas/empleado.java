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
public class empleado {
    
    public static void main(String[] args) {
    
    
     
     
     int dimension = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados"));
     
      String nombre []= new String [dimension];
      String apellido []= new String [dimension];
      int fecha_ingreso []= new int [dimension];
      int fecha_nacimiento []= new int [dimension];
      double salario []= new double [dimension];
      double acum=0;
      
      
       for (int i = 0; i < dimension; i++) {
            nombre [i] = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
            
        }
    
        for (int i = 0; i < dimension; i++) {
            apellido [i] = JOptionPane.showInputDialog(null, "Ingrese el apellido: ");
            
        }
        
        
        for (int i = 0; i < dimension; i++) {
            fecha_ingreso [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Año de Ingreso: "));
            
        }
        
        for (int i = 0; i < dimension; i++) {
            fecha_nacimiento [i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Año de Nacimiento: "));
            
        } 
        
        for (int i = 0; i < dimension; i++) {
            salario [i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario: "));
            
        }
        
         acum=salario[1];
        for (int i=0;i<dimension;i++){
            if (salario[i]>acum){
                acum=salario[i];
            }
        }
        
        Resultados re= new Resultados();
        re.respuesta(nombre, apellido, fecha_ingreso, fecha_nacimiento, salario, acum, dimension);
        
        
        
        
        
    }
    

   
}
