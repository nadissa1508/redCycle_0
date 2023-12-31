/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.DriverUsuario;

import Controlador.DriverClasifico;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 19/09/2023
 * Fecha final: 17/11/2023
 *
 * @author Nadissa Lopez 23764
 * @author Vianka Castro 23201
 * @author Ricardo Godinez 23247
 */
public class Clasifico extends javax.swing.JFrame {

       /**
     * Constructor que inicializa los componentes de la interfaz y establece la conexión con los controladores.
     * 
     * @param driver El controlador de usuario para la gestión de datos de usuario.
     */
    private static DriverUsuario driver;
    private static DriverClasifico driverClasifico;

    public Clasifico(DriverUsuario driver) {
        this.driver = driver;
        driverClasifico = new DriverClasifico();
        initComponents();
        limpiar();
    }
  /**
     * Método para limpiar los campos y reiniciar la interfaz a su estado inicial.
     */
    public void limpiar() {
        txtBuscarArticulo.setText("");
        txtDescripcion.setText("");
        lbClasificacion.setText("Clasificación");
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
    }
    /**
     * Método para buscar la clasificación de un artículo basado en el texto ingresado por el usuario.
     */
    public void buscarArticulo() {
        String tituloLabel = driverClasifico.buscarArticulo(txtBuscarArticulo.getText());
        if (tituloLabel.equals("Organica")) {
            lbClasificacion.setText(tituloLabel);
            txtDescripcion.setText(driverClasifico.devolverDescripcion(tituloLabel));
        } else if (tituloLabel.equals("Plastico")) {
            lbClasificacion.setText(tituloLabel);
            txtDescripcion.setText(driverClasifico.devolverDescripcion(tituloLabel));
        } else if (tituloLabel.equals("Multicapa")) {
            lbClasificacion.setText(tituloLabel);
            txtDescripcion.setText(driverClasifico.devolverDescripcion(tituloLabel));
        } else if (tituloLabel.equals("Metal")) {
            lbClasificacion.setText(tituloLabel);
            txtDescripcion.setText(driverClasifico.devolverDescripcion(tituloLabel));
        } else if (tituloLabel.equals("Vidrio")) {
            lbClasificacion.setText(tituloLabel);
            txtDescripcion.setText(driverClasifico.devolverDescripcion(tituloLabel));
        } else if (tituloLabel.equals("Papel y cartón")) {
            lbClasificacion.setText(tituloLabel);
            txtDescripcion.setText(driverClasifico.devolverDescripcion(tituloLabel));
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el artículo!");
            limpiar();
        }

    }

    /**
     * Método para abrir la interfaz de gestión de residuos del usuario.
     */
    public void abrirMisResiduos() {
        this.dispose();
        MisResiduos residuos = new MisResiduos(driver);
        residuos.setVisible(true);
    }
    /**
     * Método para abrir la interfaz de la cuenta del usuario.
     */
    public void abrirMiCuenta() {
        this.dispose();
        MiCuenta cuenta = new MiCuenta(driver);
        cuenta.setVisible(true);
    }
    /**
     * Método para abrir la interfaz de estadísticas de la aplicación.
     */
    public void abrirEstadisticas() {
        this.dispose();
        Estadisticas estadisticas = new Estadisticas(driver);
        estadisticas.setVisible(true);
    }
    /**
     * Método para abrir la interfaz de reducción de residuos.
     */
    public void abrirReduccionResiduos() {
        this.dispose();
        ReduccionResiduos reduccion = new ReduccionResiduos(driver);
        reduccion.setVisible(true);
    }
        /**
     * Método para mostrar las instrucciones de uso de la aplicación.
     */
    public void instrucciones(){
        JOptionPane.showMessageDialog(null, "¿Cómo lo Clasifico? Ayuda a encontrar el tipo de clasificación de algún material en específico. \nEscribe el nombre del material y luego presiona buscar.", "Instrucciones de Uso", JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Método para cerrar la ventana y, si es necesario, guardar los datos antes de salir.
     */
     private void cerrarVentana() {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
        if ((resp == JOptionPane.YES_OPTION) && (driver.getSizeUsuarios() > 0)) {
            try {
                driver.guardarArchivoUser();
            } catch (Exception e) {
                System.out.println("Error al guardar CSV DE USUARIO");
            }

            try {
                driver.guardarArchivoCont();
            } catch (IOException io) {
                System.out.println("Error al guardar CSV DE CONTENEDORES");
            }
            System.exit(0);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarArticulo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlBoton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbClasificacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lbCuenta = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbMisResiduos = new javax.swing.JLabel();
        lbEstadisticas = new javax.swing.JLabel();
        lbReduccionResiduos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel4.setText("Ingrese el artículo que desee clasificar: ");

        btnBuscar.setBackground(new java.awt.Color(73, 153, 28));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("¿Cómo lo clasifico?");

        jLabel5.setText("Pej. Pan viejo, blister de pastillas, revistas.");

        jlBoton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/boton.png")
        );
        jlBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel144)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(txtBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnBuscar)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 380, 300));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        lbClasificacion.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbClasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClasificacion.setText("Plástico");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbClasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbClasificacion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 420, 310));

        lbCuenta.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCuenta.setText("Mi Cuenta");
        lbCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCuentaMouseClicked(evt);
            }
        });
        jPanel1.add(lbCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 90));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("¿Cómo lo clasifico?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 220, 70));

        lbMisResiduos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbMisResiduos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMisResiduos.setText("Mis Residuos");
        lbMisResiduos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMisResiduosMouseClicked(evt);
            }
        });
        jPanel1.add(lbMisResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 140, 70));

        lbEstadisticas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadisticas.setText("Estadísticas");
        lbEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEstadisticasMouseClicked(evt);
            }
        });
        jPanel1.add(lbEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 130, 70));

        lbReduccionResiduos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbReduccionResiduos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReduccionResiduos.setText("Reducción de Residuos");
        lbReduccionResiduos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReduccionResiduosMouseClicked(evt);
            }
        });
        jPanel1.add(lbReduccionResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 260, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/fondo2.png"));
        jLabel2.setPreferredSize(new java.awt.Dimension(950, 560));
        jLabel2.setRequestFocusEnabled(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1050, 590));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscarArticulo();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lbMisResiduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMisResiduosMouseClicked
        // TODO add your handling code here:
        abrirMisResiduos();
    }//GEN-LAST:event_lbMisResiduosMouseClicked

    private void lbCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCuentaMouseClicked
        // TODO add your handling code here:
        abrirMiCuenta();
    }//GEN-LAST:event_lbCuentaMouseClicked

    private void lbEstadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstadisticasMouseClicked
        // TODO add your handling code here:
        abrirEstadisticas();
    }//GEN-LAST:event_lbEstadisticasMouseClicked

    private void lbReduccionResiduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReduccionResiduosMouseClicked
        // TODO add your handling code here:
        abrirReduccionResiduos();
    }//GEN-LAST:event_lbReduccionResiduosMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing

    private void jlBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBotonMouseClicked
        // TODO add your handling code here:
        instrucciones();
    }//GEN-LAST:event_jlBotonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clasifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clasifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clasifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clasifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clasifico(driver).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBoton;
    private javax.swing.JLabel lbClasificacion;
    private javax.swing.JLabel lbCuenta;
    private javax.swing.JLabel lbEstadisticas;
    private javax.swing.JLabel lbMisResiduos;
    private javax.swing.JLabel lbReduccionResiduos;
    private javax.swing.JTextField txtBuscarArticulo;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
