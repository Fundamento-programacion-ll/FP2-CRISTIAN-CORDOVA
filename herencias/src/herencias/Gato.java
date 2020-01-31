/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author crist
 */
public class Gato extends animal{
    private float estatura;
    private String color;

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
   public void datosGato (){
    
        System.out.println("Nombre del gato: "+getNombre()+" edad del gato: " + getEdad() + " Estatura: " + getEstatura());
        System.out.println(suma(1, 2));
}
    
    public Gato(float estatura, String color, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
        this.color = color;
    }

    public Gato(float estatura, String color) {
        this.estatura = estatura;
        this.color = color;
    }
    
    
    
    
}
