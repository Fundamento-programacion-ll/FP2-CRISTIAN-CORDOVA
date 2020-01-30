/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crist
 */
public class conector {
    
    Connection conexion;
    
    String url = "jdbc:mysql://localhost:32769/prueba?useSSL=false";
    String usuario = "admin";
    String pasword = "12345678";
    
    public conector (){
        
       try {
            conexion = (Connection) DriverManager.getConnection(url,usuario,pasword);
            if(conexion != null){
                System.out.println("Se conecto");
            }else{
                System.out.println("No se conecto");
            }
            
        } catch (SQLException ex) {
            System.err.println("Error de conexion");
            ex.printStackTrace();
        }

    }
    
    public Connection getConxion(){
        return conexion;
    }
    
    public void Desconectars (){
        conexion=null;
    }
    
    
    
}
