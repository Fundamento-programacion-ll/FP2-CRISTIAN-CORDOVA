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
    
    
}
