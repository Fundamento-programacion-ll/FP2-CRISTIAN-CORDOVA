/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

/**
 *
 * @author crist
 */
public class Resultados {
    public void respuesta (String [] nombre, String [] apellido, int [] fecha_ingreso, int [] fecha_nacimiento, double [] salario, double acum, int dimension){
        for (int i = 0; i < dimension; i++) {
            
            
            System.out.println(i+". "+"Nombre y Apellido: "+nombre [i]+" "+apellido [i]+" AÑO DE INGRESO: "+fecha_ingreso [i]
            +" FECHA DE NACIMIENTO: "+fecha_nacimiento [i]+" SU SALARIO ES DE: "+salario [i]);
            
            if (salario[i]==acum){
                System.out.println("El salario mayor es: "+acum+ "del trabajador: "+nombre [i]+" "+apellido[i]);
            }
        } 
    }
}
