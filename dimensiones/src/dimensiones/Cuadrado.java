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
public class Cuadrado extends Dimensiones{
     private double area, volumen, perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void area (){
        System.out.println("--------------------------------");
        System.out.println("Selecciono el Area del Cuadrado");
        System.out.println("Sus lados son: "+getLado());
        System.out.println("Resultado del area: "+areacuadrado(getLado()));
        
    }
    
    public void volumen (){
        System.out.println("--------------------------------");
        System.out.println("Selecciono el Volumen del Cuadrado");
        System.out.println("Su base es: "+getLado());
        System.out.println("Resultado del volumen: "+volumencuadrado(getLado()));
    }
    
    public void perimetro (){
        System.out.println("--------------------------------");
        System.out.println("Selecciono el Perimetro del Cuadrado");
        System.out.println("Sus 4 lados son: "+getLado());
        System.out.println("Resultado swl perimetro: "+perimetrocuadrado(getLado()));
    }
    
    public Cuadrado(double area, double volumen, double perimetro, int lado, int base, int altura) {
        super(lado, base, altura);
        this.area = area;
        this.volumen = volumen;
        this.perimetro = perimetro;
    }

    public Cuadrado(double area, double volumen, double perimetro) {
        this.area = area;
        this.volumen = volumen;
        this.perimetro = perimetro;
    }

    public Cuadrado() {
    }

    
     
     
     
}
