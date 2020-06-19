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
import modelo.autos;
import proyecto.conector;


/**
 *
 * @author crist
 */
public class controladorAutos {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conector conectar = new conector();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void agregar(autos auto) {  
        
       String sqlInsert = "insert into autos (matricula,cedula,modelo,nombre_dueño) values (?,?,?,?)";
        try {
            //Error porque necesita un try-cath
            con = conectar.getConxion();
            ps = con.prepareStatement(sqlInsert);  
            
            ps.setString(1,auto.getMatricula());
            ps.setInt(2,auto.getCedula());
            ps.setString(3,auto.getModelo());
            ps.setString(4,auto.getNombreDueño());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
            
        } catch (SQLException ex) {
            
            System.err.println("error: "+ex);
            
            JOptionPane.showMessageDialog(null,"Los datos no fueron ingresados correctamente");
           
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List listarautos(){
        List<autos> datosauto = new ArrayList<>();
        try {
            con = conectar.getConxion();
            ps = con.prepareStatement("select * from autos");
            rs = ps.executeQuery();
            while (rs.next()) {
                autos au = new autos();
                au.setMatricula(rs.getString(1));
                au.setCedula(rs.getInt(2));
                au.setModelo(rs.getString(3));
                au.setNombreDueño(rs.getString(4));
                datosauto.add(au);
            }
        } catch (Exception e) {
        }
        return datosauto;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ModificarDatos(autos modauto){
        String sqlUpdate= "UPDATE autos SET  cedula=?, modelo=?, nombre_dueño=? "+" WHERE matricula=?";

        try {
            con = conectar.getConxion();
            ps = con.prepareStatement(sqlUpdate);
            
            
            ps.setInt(1,modauto.getCedula());
            ps.setString(2,modauto.getModelo());
            ps.setString(3,modauto.getNombreDueño());
            ps.setString(4,modauto.getMatricula());
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
        String sqlupdate = "DELETE FROM autos WHERE matricula=?";
        try {
            con = conectar.getConxion();
            ps = con.prepareStatement(sqlupdate);
            
            ps.setString(1, Idp);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(controladorAutos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
