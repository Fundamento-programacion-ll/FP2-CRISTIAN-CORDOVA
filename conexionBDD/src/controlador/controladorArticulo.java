/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

/**
 *
 * @author crist
 */
public class controladorArticulo {
    conector conexion = new conector();
    PreparedStatement ps = null;
    
    public void ingresarArticulos(articulo nuevoArticulo){
        String sqlInsert = "insert into articulos (nombre,descripcion,precio) values (?,?,?)";
        try {
            //Error porque necesita un try-cath
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1,nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
            
        } catch (SQLException ex) {
            
            System.err.println("error: "+ex);
            
            JOptionPane.showMessageDialog(null,"Los datos no fueron ingresados correctamente");
           
        }
    }
}
