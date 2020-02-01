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
public class Tringulo extends Dimensiones{
    
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
        System.out.println("Selecciono el Area del triangulo");
        System.out.println("Su base es: "+getBase());
        System.out.println("Su altura es: "+getAltura());
        System.out.println("Resultado del area: "+areatriangulo(getBase(),getAltura()));
        
    }
    
    
    
    public void volumen (){
        System.out.println("--------------------------------");
        System.out.println("Selecciono el Volumen del triangulo");
        System.out.println("Su base es: "+getBase());
        System.out.println("Su altura es: "+getAltura());
        System.out.println("Resultado del volumen: "+volumentriangulo(getBase(), getAltura()));
    }
    
    public void perimetro (){
        System.out.println("--------------------------------");
        System.out.println("Selecciono el Perimetro del triangulo");
        System.out.println("Sus 3 lados son: "+getLado());
        System.out.println("Resultado del perimetro: "+perimetrotriangulo(getLado()));
    }
    
    

    public Tringulo(double area, double volumen, double perimetro, int lado, int base, int altura) {
        super(lado, base, altura);
        this.area = area;
        this.volumen = volumen;
        this.perimetro = perimetro;
    }

    public Tringulo(double area, double volumen, double perimetro) {
        this.area = area;
        this.volumen = volumen;
        this.perimetro = perimetro;
    }

    public Tringulo() {
    }
    
    
}
