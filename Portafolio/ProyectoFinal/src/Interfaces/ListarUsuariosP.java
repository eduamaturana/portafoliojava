/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Conexion;
import Clases.Tipousuario;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Ivan
 */
public class ListarUsuariosP extends javax.swing.JPanel {
   DefaultTableModel ListarTablaUsuarios;
    Tipousuario tipo = new Tipousuario();
    ResultSet rss = null;
    /**
     * Creates new form ListarUsuariosP
     */
    public ListarUsuariosP() throws SQLException, ClassNotFoundException {
         ListarTablaUsuarios = new DefaultTableModel(null,getColumna());
        setFilas();
        initComponents();
        rss = tipo.getTipoUsuario();
        while (rss.next()) {
            CbxTipo.addItem(rss.getString("NOMBRE_TIPOUSUARIO"));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableListarUsuarios = new javax.swing.JTable();
        BtnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CbxTipo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 3, 18))); // NOI18N
        setRequestFocusEnabled(false);

        TableListarUsuarios.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        TableListarUsuarios.setModel(ListarTablaUsuarios);
        jScrollPane1.setViewportView(TableListarUsuarios);

        BtnAceptar.setBackground(new java.awt.Color(153, 153, 255));
        BtnAceptar.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        BtnAceptar.setText("Volver");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Filtrar por Tipo Usuario");

        CbxTipo.setEditable(true);
        CbxTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        CbxTipo.setToolTipText("");
        CbxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxTipoItemStateChanged(evt);
            }
        });
        CbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxTipoActionPerformed(evt);
            }
        });
        CbxTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CbxTipoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents
    public String [] getColumna(){
        String columna[]= new String[]{"RUT","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","CORREO ELECTRONICO","DIRECCION","TELEFONO","ROL","COMUNA"};
        return columna;
    }
    
    public void setFilas() throws SQLException, ClassNotFoundException{
        
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query =  "select U.RUT_USUARIO,U.NOMBRE_USUARIO,U.APEPA_USUARIO,U.APEMA_USUARIO,U.CORREO_USUARIO,U.DIRECCION_USUARIO,U.TELEFONO_USUARIO,R.NOMBRE_TIPOUSUARIO,C.NOMBRE_COMUNA\n" +
"FROM USUARIO U , TIPOUSUARIO R, COMUNA C \n" +
"WHERE u.id_tipousuario = r.id_tipousuario AND u.id_comuna = c.id_comuna ";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        Object datos []=new Object[9];
        
        while(rs.next()){
            for (int i = 0; i < 9; i++) {
                datos[i]= rs.getObject(i+1);
            }
            ListarTablaUsuarios.addRow(datos);
        }
        rs.close();
    }
    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
     this.setVisible(false);
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void CbxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxTipoItemStateChanged
        String query = CbxTipo.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) TableListarUsuarios.getModel());
        TableListarUsuarios.setRowSorter(tr);
        if(query != ""){
            tr.setRowFilter(RowFilter.regexFilter(query));

        }else{
            TableListarUsuarios.setRowSorter(tr);
        }
    }//GEN-LAST:event_CbxTipoItemStateChanged

    private void CbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxTipoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_CbxTipoActionPerformed

    private void CbxTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbxTipoKeyTyped
        /* CbxCategoria.addKeyListener(new KeyAdapter() {
            public void KeyReleased(final KeyEvent e){
                String cadena = (CbxCategoria.getSelectedItem().toString()).toUpperCase();
                CbxCategoria.setSelectedItem(cadena);
                repaint();
                filtro();
            }
        });
        trsfiltro = new TableRowSorter(TableListarProductos.getModel());
        TableListarProductos.setRowSorter(trsfiltro);*/

    }//GEN-LAST:event_CbxTipoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JComboBox<String> CbxTipo;
    public javax.swing.JTable TableListarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}