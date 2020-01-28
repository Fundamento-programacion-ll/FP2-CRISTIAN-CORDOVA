/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdd;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author crist
 */
public class ConexionBDD {
    
    public static void main(String[] args) {
        // TODO code application logic here
        PreparedStatement ps = null;
        conector stringConexion = new conector();
        stringConexion.getConxion();
    }
    
}
