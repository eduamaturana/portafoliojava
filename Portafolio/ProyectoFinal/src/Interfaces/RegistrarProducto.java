package Interfaces;

import Clases.Catgoriaproducto;
import Clases.Comuna;
import Clases.Empresa;
import Clases.Marca;
import Clases.Producto;
import Clases.Rubroproducto;
import Negocio.ProductoNegocio;
import Negocio.Registros;
import Negocio.TiendaProducto;
import Negocio.Validacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduardo
 */
public class RegistrarProducto extends javax.swing.JFrame {

    ResultSet rss = null;
    Marca marca = new Marca();
    Catgoriaproducto catprod = new Catgoriaproducto();
    Rubroproducto rubro = new Rubroproducto();
    Validacion validacion = new Validacion();
    Comuna comuna = new Comuna();
    Empresa empresa = new Empresa();
    TiendaProducto tindaprod = new TiendaProducto();
    ProductoNegocio prodControl = new ProductoNegocio();
    

    public RegistrarProducto() throws ClassNotFoundException, SQLException {
        initComponents();
        LbTiendaId.setVisible(false);
      
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        lblProducto.setVisible(true);
        txtFoto.setVisible(true);
        btnBuscarFoto.setVisible(true);
        LbErrorNombres.setVisible(false);
        LbErrorStock.setVisible(false);
        LbErrorCategoria.setVisible(false);
        LbErrorPrecio.setVisible(false);
        LbErrorMarca.setVisible(false);
        rss = catprod.getCategoriaProds();
        while (rss.next()) {
            cbxCategoria.addItem(rss.getString("NOMBRE_CATEGORIA"));
        }
        rss = marca.getMarcaProd();
        while (rss.next()) {
            cbxMarca.addItem(rss.getString("NOMBRE_MARCA"));
        }
        rss.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtNombreProd = new javax.swing.JTextField();
        Txtprecioprod = new javax.swing.JTextField();
        TxtDescripprod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Txtstockprod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LbErrorNombre = new javax.swing.JLabel();
        LbErrorNombres = new javax.swing.JLabel();
        LbErrorStock = new javax.swing.JLabel();
        LbErrorPrecio = new javax.swing.JLabel();
        LbErrorMarca = new javax.swing.JLabel();
        LbErrorCategoria = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();
        cbxCategoria = new javax.swing.JComboBox<>();
        txtFoto = new javax.swing.JTextField();
        btnBuscarFoto = new javax.swing.JButton();
        LbTienda = new javax.swing.JLabel();
        LbTiendaId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel1.setText("Nombre del producto");

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel2.setText("Precio");

        lblProducto.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblProducto.setText("Imagen");

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel4.setText("Descripcion");

        BtnRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        BtnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnRegistrar.setText("Registrar Producto");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        BtnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        TxtNombreProd.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        Txtprecioprod.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Txtprecioprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtprecioprodActionPerformed(evt);
            }
        });

        TxtDescripprod.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        TxtDescripprod.setToolTipText("(este campo no es obligatorio)");

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel8.setText("Stock");

        Txtstockprod.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel10.setText("Marca");

        jLabel11.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel11.setText("Categoria");

        LbErrorNombres.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        LbErrorNombres.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorNombres.setText("jLabel13");

        LbErrorStock.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        LbErrorStock.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorStock.setText("jLabel13");

        LbErrorPrecio.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        LbErrorPrecio.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorPrecio.setText("jLabel13");

        LbErrorMarca.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        LbErrorMarca.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorMarca.setText("jLabel13");

        LbErrorCategoria.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        LbErrorCategoria.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorCategoria.setText("jLabel13");

        cbxMarca.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cbxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione marca" }));

        cbxCategoria.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));

        txtFoto.setEditable(false);
        txtFoto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtFoto.setForeground(new java.awt.Color(0, 102, 204));

        btnBuscarFoto.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscarFoto.setText("Agregar");
        btnBuscarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFotoActionPerformed(evt);
            }
        });

        LbTiendaId.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LbErrorNombre)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel4))
                                        .addGap(87, 87, 87))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(TxtDescripprod, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(BtnRegistrar)
                                        .addGap(47, 47, 47)
                                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(LbErrorCategoria))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(LbErrorMarca))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(TxtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(77, 77, 77)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(LbErrorNombres, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(LbErrorPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(LbErrorStock, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                .addGap(58, 58, 58)
                                                .addComponent(lblProducto))
                                            .addComponent(Txtstockprod, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Txtprecioprod, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscarFoto))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(LbTienda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(LbTiendaId)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbErrorNombre)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbErrorNombres)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbErrorPrecio)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbErrorStock)
                                    .addComponent(lblProducto)
                                    .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarFoto))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Txtprecioprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(Txtstockprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbErrorMarca))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbErrorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TxtDescripprod, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(LbTienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(LbTiendaId)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        try {
            Registros registro = new Registros();
            Producto prod = new Producto();
            int validado= 0;
            if (TxtNombreProd.getText().trim().length()<=0) {
                LbErrorNombres.setText("El campo no debe ir vacio");
                LbErrorNombres.setVisible(true);
                validado++;
            }
            
            if (Txtprecioprod.getText().trim().length()<=0) {
                LbErrorPrecio.setText("El campo no debe ir vacio");
                LbErrorPrecio.setVisible(true); 
                validado++;
            }
            if(validacion.validacionLetras(Txtprecioprod.getText())){
                    LbErrorPrecio.setText("El precio no debe contener letras");
                    LbErrorPrecio.setVisible(true);
                    validado++;
            }
            if (Txtstockprod.getText().trim().length()<=0) {
                LbErrorStock.setText("El campo no debe ir vacio");
                LbErrorStock.setVisible(true);  
                validado++;
            }
             if(validacion.validacionLetras(Txtstockprod.getText())){
                    LbErrorStock.setText("El stock no debe contener letras");
                    LbErrorStock.setVisible(true);
                    validado++;
            }
            if(cbxMarca.getSelectedIndex()==0){
               LbErrorMarca.setText("Seleccione una marca");
                LbErrorMarca.setVisible(true);
                validado++;
                
            }
            if(cbxCategoria.getSelectedIndex()==0){
               LbErrorCategoria.setText("Seleccione una categoria");
                LbErrorCategoria.setVisible(true);
                validado++;
                
            }
            
            
            if (validado>0) {
                validado=0;
                     JOptionPane.showMessageDialog(null, "Registro no completado","Producto no registrado", JOptionPane.WARNING_MESSAGE);
                
            }else{
            prod.setIdProducto(1);
            prod.setStockProducto(Integer.parseInt(Txtstockprod.getText()));
            prod.setDescripcionProducto(TxtDescripprod.getText());
            prod.setCatprodIdCatprod(catprod.getCategoriaID(cbxCategoria.getSelectedItem().toString()));
            prod.setMarcaIdMarca(marca.getMarcaID(cbxMarca.getSelectedItem().toString()));
            prod.setNombreProducto(TxtNombreProd.getText());
            prod.setPrecioProducto(Integer.parseInt(Txtprecioprod.getText()));
            prod.setIdTienda(Integer.parseInt(LbTiendaId.getText()));
            File objArchivo = new File(txtFoto.getText());
            try {
                byte[] imagen = new byte[(int) objArchivo.length()];
                InputStream objInput = new FileInputStream(objArchivo);
                objInput.read(imagen);
                //Seteamos la imagen en el objeto producto
                prod.setImagenProducto(imagen);
            } catch (Exception e) {
                prod.setImagenProducto(null);
            }
            registro.insertarProducto(prod);
            //tindaprod.insertarProductoTienda(prodControl.getUltimoRegistro(), Integer.parseInt(this.lblIDEMPRESAUSAR.getText()));
            JOptionPane.showMessageDialog(null, "Producto insertado", "Se registro un nuevo producto", JOptionPane.INFORMATION_MESSAGE);
               dispose();
        }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar producto", "No se pudo registrar el producto "
                    + "Error: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);          
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TxtprecioprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtprecioprodActionPerformed

    }//GEN-LAST:event_TxtprecioprodActionPerformed

    private void btnBuscarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFotoActionPerformed
        JFileChooser openFile = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        openFile.setFileFilter(filtro);

        int returnValue = openFile.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String ruta = openFile.getSelectedFile().getAbsolutePath();
            txtFoto.setText(ruta);
        }
    }//GEN-LAST:event_btnBuscarFotoActionPerformed
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Img/iconoV2.png"));

        return retValue;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrarProducto().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JLabel LbErrorCategoria;
    private javax.swing.JLabel LbErrorMarca;
    private javax.swing.JLabel LbErrorNombre;
    private javax.swing.JLabel LbErrorNombres;
    private javax.swing.JLabel LbErrorPrecio;
    private javax.swing.JLabel LbErrorStock;
    private javax.swing.JLabel LbTienda;
    public javax.swing.JLabel LbTiendaId;
    private javax.swing.JTextField TxtDescripprod;
    private javax.swing.JTextField TxtNombreProd;
    private javax.swing.JTextField Txtprecioprod;
    private javax.swing.JTextField Txtstockprod;
    private javax.swing.JButton btnBuscarFoto;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField txtFoto;
    // End of variables declaration//GEN-END:variables

}
