/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.apariencia;
import proyecto.conector;

/**
 *
 * @author crist
 */
public class controladorapariencia {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conector conectar = new conector();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void agregar(apariencia apa) {  
        
       String sqlInsert = "insert into apariencia (id_cedula_competidor,cedula,color_auto,modificaciones,nombre_representante) values (?,?,?,?,?)";
        try {
            //Error porque necesita un try-cath
            con = conectar.getConxion();
            ps = con.prepareStatement(sqlInsert);  
            
            ps.setInt(1,apa.getCedulaCo());
            ps.setInt(2,apa.getCedulaRe());
            ps.setString(3,apa.getColor());
            ps.setString(4,apa.getModificacion());
            ps.setString(5,apa.getNombreRe());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
            
        } catch (SQLException ex) {
            
            System.err.println("error: "+ex);
            
            JOptionPane.showMessageDialog(null,"Los datos no fueron ingresados correctamente");
           
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List listarapariencia(){
        List<apariencia> datoapariencia = new ArrayList<>();
        try {
            con = conectar.getConxion();
            ps = con.prepareStatement("select * from apariencia");
            rs = ps.executeQuery();
            while (rs.next()) {
                apariencia ap = new apariencia();
                ap.setCedulaCo(rs.getInt(1));
                ap.setCedulaRe(rs.getInt(2));
                ap.setColor(rs.getString(3));
                ap.setModificacion(rs.getString(4));
                ap.setNombreRe(rs.getString(5));
                
                datoapariencia.add(ap);
            }
        } catch (Exception e) {
        }
        return datoapariencia;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ModificarDatos(apariencia modauto){
        String sqlUpdate= "UPDATE apariencia SET  cedula=?, color_auto=?, modificaciones=?, nombre_representante=? "+" WHERE id_cedula_competidor=?";
        try {
            con = conectar.getConxion();
            ps = con.prepareStatement(sqlUpdate);
            
            
            ps.setInt(1,modauto.getCedulaRe());
            ps.setString(2,modauto.getColor());
            ps.setString(3,modauto.getModificacion());
            ps.setString(4,modauto.getNombreRe());
            ps.setInt(5,modauto.getCedulaCo());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos actualizados correctamente");
            
        } catch (SQLException ex) {
            
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null,"No se pudieron actualizar los datos");
        
        }
            
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public void Eliminar(String Idp) {
        String sqlupdate = "DELETE FROM apariencia WHERE id_cedula_competidor=?";
        try {
            con = conectar.getConxion();
            ps = con.prepareStatement(sqlupdate);
            
            ps.setString(1, Idp);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(controladorapariencia.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
