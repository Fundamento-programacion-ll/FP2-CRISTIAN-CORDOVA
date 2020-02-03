/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author crist
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        SolicitudSaldo a=new SolicitudSaldo(400, 1726233164);
        System.out.println(a);
        
        Retiros b=new Retiros(100, 1726233164);
        System.out.println(b);
        
        Deposito c=new  Deposito(500, 1726233164);
        System.out.println(c);
        
        totalsaldo();
    }
    
    
    
    
    
    public static void totalsaldo (){        
        double total;
        total=400+500-100;
        System.out.println("El saldo total que tiene es de: "+total);
        
    }
    
}
