/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimensiones;

/**
 *
 * @author crist
 */
public class Circulo extends Dimensiones {
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public double circuloCircunferencia (double pi, int radio){
        return 2*pi*radio;
    }
    
    
    public void circunferencia (){
        System.out.println("--------------------------------");
        System.out.println("Resultados de la Circunferencia del circulo");
        System.out.println("Su radio es: "+getRadio());
    }
    

    public Circulo(int radio, int lado, int base, int altura) {
        super(lado, base, altura);
        this.radio = radio;
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
    
    
    
}
