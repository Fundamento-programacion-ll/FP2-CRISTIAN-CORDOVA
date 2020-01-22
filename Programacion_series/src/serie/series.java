/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

/**
 *
 * @author crist
 */
public class series {

    int num1;

    public series() {
        
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }


    
    
    public int resultado (){
        int base=2;
        int result=1;
    for (int i = 0; i < num1; i++) {
            result=result*base;
        }
        return result;
    }
    
    
   
}
