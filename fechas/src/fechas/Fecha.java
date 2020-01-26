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
public class Fecha {
    Empleado nums = new Empleado();
    private int dia;
    private int mes;
    private int anio;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Fecha(int dia, int mes, int anio) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha() {
        super();
    }
    
    public String comprobacion() {
        int nummenor=0;
        String n[] = null;
        for (int i = 1; i <= 5; i++) {
           dia=nums.getFecha_ingreso().length;
           mes=nums.getFecha_ingreso().length;
           anio=nums.getFecha_ingreso().length;
           int completo=anio+mes+dia;
           if(nummenor>completo){
               nummenor=completo;
               
           }
            System.out.println(n[i]);
           
        }
        return "";
    }
    
    
}
