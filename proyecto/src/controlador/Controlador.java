/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.xml.internal.txw2.TXW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Competidores;
import modelo.CompetidoresDAO;
import vista.Vista;


/**
 *
 * @author Luis Cajas
 */
public class Controlador implements ActionListener {

    CompetidoresDAO dao = new CompetidoresDAO();
    Competidores com = new Competidores();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(Vista v) {
        this.vista = v;
        this.vista.btn_listar.addActionListener(this);
        this.vista.btn_agregar.addActionListener(this);
        this.vista.btn_editar.addActionListener(this);
        this.vista.btn_actualizar.addActionListener(this);
        this.vista.btn_eliminar.addActionListener(this);
        this.vista.btn_limpiar.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_listar) {
            vista.txt_cedula.setEditable(true);
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btn_agregar) {
            vista.txt_cedula.setEditable(true);
            agregar();
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btn_editar) {
            vista.txt_cedula.setEditable(false);
            int fila = vista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debe Seleccionar Una Fila");
            } else {
                int ce = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
                String Matri = (String) vista.tabla.getValueAt(fila, 1);
                int id = Integer.parseInt((String) vista.tabla.getValueAt(fila, 2).toString());
                String Nom = (String) vista.tabla.getValueAt(fila, 3);
                String Apell = (String) vista.tabla.getValueAt(fila, 4);
                int Ed = Integer.parseInt((String) vista.tabla.getValueAt(fila, 5).toString());
                vista.txt_cedula.setText("" + ce);
                vista.txt_matricula.setText(Matri);
                vista.txt_id.setText("" + id);
                vista.txt_nombres.setText(Nom);
                vista.txt_apellidos.setText(Apell);
                vista.txt_edad.setText("" + Ed);

            }
        }
        if (e.getSource() == vista.btn_actualizar) {
            vista.txt_cedula.setEditable(false);
            Actualizar();
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btn_eliminar) {
            listar(vista.tabla);
            eliminar();

        }
        if (e.getSource() == vista.btn_limpiar) {
            vista.txt_cedula.setEditable(true);
            Limpiar();
        }

    }

    public void listar(JTable tabla) {
        centrartabla(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Competidores> lista = dao.Listar();
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getCed();
            object[1] = lista.get(i).getMatri();
            object[2] = lista.get(i).getIdced();
            object[3] = lista.get(i).getNombre();
            object[4] = lista.get(i).getApellido();
            object[5] = lista.get(i).getEdad();
            modelo.addRow(object);
        }
        //vista.tabla.setModel(modelo);
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }
    

    public void agregar() {
        if (vista.txt_cedula.getText().equals("") && vista.txt_matricula.getText().equals("") && vista.txt_id.getText().equals("")
                && vista.txt_nombres.getText().equals("") && vista.txt_apellidos.getText().equals("") && vista.txt_edad.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Debe llenar los campos para añadir un nuevo competidor");
        }else{
         int ce = Integer.parseInt(vista.txt_cedula.getText());
        String mat = vista.txt_matricula.getText();
        int idce = Integer.parseInt(vista.txt_id.getText());
        String no = vista.txt_nombres.getText();
        String ape = vista.txt_apellidos.getText();
        int ed = Integer.parseInt(vista.txt_edad.getText());
        com.setCed(ce);
        com.setMatri(mat);
        com.setIdced(idce);
        com.setNombre(no);
        com.setApellido(ape);
        com.setEdad(ed);
        int r = dao.agregar(com);
        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Competidor Agregado Con Exito");
        } else {
            JOptionPane.showMessageDialog(vista, "No Se Pudo Agregar Un Nuevo Competidor");
        }
        }
            
    }

    public void Actualizar() {
        if (vista.txt_cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "El campo N°Cedula esta vacio, debe selecionar la opcion Editar");
        } else {
            int ce = Integer.parseInt(vista.txt_cedula.getText());
            String mat = vista.txt_matricula.getText();
            int idce = Integer.parseInt(vista.txt_id.getText());
            String no = vista.txt_nombres.getText();
            String ape = vista.txt_apellidos.getText();
            int ed = Integer.parseInt(vista.txt_edad.getText());

            com.setCed(ce);
            com.setMatri(mat);
            com.setIdced(idce);
            com.setNombre(no);
            com.setApellido(ape);
            com.setEdad(ed);
            int r = dao.Actualizar(com);
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Competidor Actualizado Con Exito");
            } else {
                JOptionPane.showMessageDialog(vista, "No Se Pudo Actualizar El Competidor");
            }
        }
        vista.txt_cedula.setText("");
        vista.txt_nombres.setText("");
        vista.txt_apellidos.setText("");
        vista.txt_id.setText("");
        vista.txt_edad.setText("");
        vista.txt_matricula.setText("");

    }

    public void limpiarTabla() {
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void eliminar() {
        int fila = vista.tabla.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe Seleccionar Una Fila");

        } else {

            int ce = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
            dao.Eliminar(ce);
            limpiarTabla();
            JOptionPane.showMessageDialog(vista, "Competidor Eliminado");

            listar(vista.tabla);
        }
    }

    public void Limpiar() {
        vista.txt_cedula.setText("");
        vista.txt_nombres.setText("");
        vista.txt_apellidos.setText("");
        vista.txt_id.setText("");
        vista.txt_edad.setText("");
        vista.txt_matricula.setText("");
        limpiarTabla();
    }
    
    void centrartabla(JTable tabla) {
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }
    }
    

}
