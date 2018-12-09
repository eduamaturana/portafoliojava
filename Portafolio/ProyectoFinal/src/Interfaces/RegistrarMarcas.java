/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;
import Clases.Marca;
import Clases.Rubroproducto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jorpi
 */
public class RegistrarMarcas extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarMarcas
     */
    public RegistrarMarcas() {
        initComponents();
        LblErrorMarca.setVisible(false);
        LblErrorRubro.setVisible(false);
        /*PlaceHolder holder = new PlaceHolder(TxtRubro, "Ingrese el rubro");
        PlaceHolder holder1 = new PlaceHolder(TxtDesc,"ingrese una pequeña descripción");
        PlaceHolder holder2 = new PlaceHolder(txtMarca,"ingrese la marca");*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        LblErrorMarca = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtRubro = new javax.swing.JTextField();
        LblErrorRubro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDesc = new javax.swing.JTextArea();
        btnRegistrarRubro = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Marcas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 13))); // NOI18N
        setName("Registrar Marcas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(997, 576));

        jLabel1.setText("Nueva Marca");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Registrar Marca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LblErrorMarca.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        LblErrorMarca.setForeground(new java.awt.Color(255, 0, 0));
        LblErrorMarca.setText("jLabel2");

        jLabel2.setText("Nuevo Rubro");

        LblErrorRubro.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        LblErrorRubro.setForeground(new java.awt.Color(255, 0, 0));
        LblErrorRubro.setText("jLabel2");

        jLabel3.setText("Descripción");

        TxtDesc.setColumns(20);
        TxtDesc.setRows(5);
        TxtDesc.setToolTipText("Este campo es opcional");
        jScrollPane1.setViewportView(TxtDesc);

        btnRegistrarRubro.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrarRubro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrarRubro.setText("Registrar Rubro");
        btnRegistrarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRubroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtRubro)
                            .addComponent(jScrollPane1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnRegistrarRubro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblErrorRubro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblErrorMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblErrorMarca))
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblErrorRubro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrarRubro)
                        .addGap(38, 38, 38))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            Marca marca  = new Marca();
            int validado = 0;
            String Marca = txtMarca.getText();
            
            
        try {
            if(marca.verNombreMarca(txtMarca.getText())==true){
                LblErrorMarca.setText("La marca "+Marca+" ya existe");
                LblErrorMarca.setVisible(true);
                validado++;
                
            }
            if(txtMarca.getText().trim().length()==0){
                LblErrorMarca.setText("Debe llenar el campo");
                LblErrorMarca.setVisible(true);
                validado++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            if(validado>0){
                JOptionPane.showMessageDialog(null, "No se puso efectuar el registro");
                validado = 0;
                
            }else{
                
                
                try {
                    marca.insertarMarca(txtMarca.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRubroActionPerformed
         Rubroproducto rubro= new Rubroproducto();
          int validado = 0;
         String Rubro = TxtRubro.getText();
       
         
         
         try {
            if(rubro.verNombreRubro(TxtRubro.getText())==true){
                LblErrorRubro.setText("El rubro "+Rubro+" ya existe");
                LblErrorRubro.setVisible(true);
                validado++;
                
            }
            
            if(TxtRubro.getText().trim().length()<=0){
             LblErrorRubro.setText("Debe llenar el campo");
             LblErrorRubro.setVisible(true);
             validado++;  
         }
         } catch (SQLException ex) {
            Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        if(validado>0){
             JOptionPane.showMessageDialog(null, "No se puso efectuar el registro");
             validado = 0;
             
        }else{

            try {
                rubro.insertarRubro(TxtRubro.getText(),TxtDesc.getText());
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarMarcas.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
    }//GEN-LAST:event_btnRegistrarRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblErrorMarca;
    private javax.swing.JLabel LblErrorRubro;
    private javax.swing.JTextArea TxtDesc;
    private javax.swing.JTextField TxtRubro;
    private javax.swing.JButton btnRegistrarRubro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}