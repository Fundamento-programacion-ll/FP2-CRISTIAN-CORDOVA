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
    
     public int areatriangulo (int num1, int num2){
        return num1 + num2;
    }
    
}
