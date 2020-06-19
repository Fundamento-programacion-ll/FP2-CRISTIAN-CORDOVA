/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto.conector;

/**
 *
 * @author Luis Cajas
 */
public class CompetidoresDAO {

    conector conectar = new conector();
    PreparedStatement ps;
    ResultSet rs;
    Competidores com = new Competidores();

    ///Listar Competiores////
    public List Listar() {
        List<Competidores> datos = new ArrayList<>();
        String sql = "select * from COMPETIDORES";
        try {
            ps = conectar.getConxion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Competidores com = new Competidores();
                com.setCed(rs.getInt(1));
                com.setMatri(rs.getString(2));
                com.setIdced(rs.getInt(3));
                com.setNombre(rs.getString(4));
                com.setApellido(rs.getString(5));
                com.setEdad(rs.getInt(6));
                datos.add(com);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CompetidoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

    //Agregar Competidores//
    public int agregar(Competidores com) {
        String sql = "INSERT INTO COMPETIDORES (CEDULA ,MATRICULA , ID_CEDULA_COMPETIDOR , NOMBRE ,APELLIDO ,EDAD ) VALUES (?,?,?,?,?,?)";
        try {
            ps = conectar.getConxion().prepareStatement(sql);
            ps.setInt(1, com.getCed());
            ps.setString(2, com.getMatri());
            ps.setInt(3, com.getIdced());
            ps.setString(4, com.getNombre());
            ps.setString(5, com.getApellido());
            ps.setInt(6, com.getEdad());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CompetidoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 1;
    }

    //Actualizar Competidores//
    public int Actualizar(Competidores com) {
        int r = 0 ;
        String sql = "UPDATE COMPETIDORES SET MATRICULA=?, ID_CEDULA_COMPETIDOR=? , NOMBRE=? ,APELLIDO=? ,EDAD=? WHERE CEDULA = ?";
        try {
            ps = conectar.getConxion().prepareStatement(sql);
            ps.setString(1, com.getMatri());
            ps.setInt(2, com.getIdced());
            ps.setString(3, com.getNombre());
            ps.setString(4, com.getApellido());
            ps.setInt(5, com.getEdad());
            ps.setInt(6, com.getCed());

            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            }else{
                return 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(CompetidoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return r;
    }
    //Eliminar Competidores///
    public void Eliminar(int ce){
        String sql = "DELETE FROM COMPETIDORES WHERE CEDULA = "+ce;
        try {
            ps = conectar.getConxion().prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CompetidoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
