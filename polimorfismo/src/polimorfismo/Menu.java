/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;

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
        
        int cuenta;
        String mensaje;
        double retir, depo, sald,total;
        
        SolicitudSaldo sa = new SolicitudSaldo();    
        Deposito de = new Deposito();
        Retiros re = new Retiros();
        
        
        cuenta=Integer.parseInt(JOptionPane.showInputDialog("--------Menu---------"+"\nIngrese su numenro de cuenta"));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        do{
        sald = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Su saldo"));   
        
        if(sald <= 0){
            JOptionPane.showMessageDialog(null, "cantidad negativa o cero incorrecto"+"\n Intente nuevamente");
        }
        }while (sald <=0);
                
        do {
       //////////////////////////////////////////////////////////////////////////////////////////////////////
         retir = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el retiro que va hacer"));
        if (retir >70){
            JOptionPane.showMessageDialog(null, "Maximo de retiro hata 70");
        }else if (retir <=0 ){
             JOptionPane.showMessageDialog(null, "cantidad negativa o  cero incorrecto"+"\n Intente nuevamente");
        }         
        }while(retir <= 0 || retir>=71);
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        
        do{
        depo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Deposito que va hacer"));  
        
        if(depo <= 0){
            JOptionPane.showMessageDialog(null, "cantidad negativa o cero incorrecto"+"\n Intente nuevamente");
        }
        }while (depo <=0);
        
        total=sald+depo-retir;
        
        SolicitudSaldo a=new SolicitudSaldo(sald, cuenta);
        System.out.println(a);
        
        Retiros b=new Retiros(retir, cuenta);
        System.out.println(b);
        
        Deposito c=new  Deposito(depo, cuenta);
        System.out.println(c);
        
        
        System.out.println("Su total de saldo es: "+total);
    }
    
}
        