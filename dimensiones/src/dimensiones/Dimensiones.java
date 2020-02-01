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
public class Dimensiones {

    private int lado;
    private int base;
    private int altura;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Dimensiones(int lado, int base, int altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public Dimensiones() {
    }
    /////////////////TRIANGULO/////////////////////
     public int areatriangulo (int base, int altura){
        return (base*altura)/2;
    }
     
     public int volumentriangulo (int base, int altura){
        return (base*base)*altura/3;
    }
     
     public int perimetrotriangulo (int lado){
        return 3*lado;
    }
    //////////////////Cuadrado/////////////////////
    public int areacuadrado (int lado){
        return lado*lado;
    }
     
     public int volumencuadrado (int lado){
        return lado*lado*lado;
    }
     
     public int perimetrocuadrado (int lado){
        return 4*lado;
    } 
}
