/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Controlador.DriverUsuario;
import Modelo.Usuario;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author nadis
 */
public class Estadisticas extends javax.swing.JFrame {

    /**
     * Creates new form Estadísticas
     */
    public Estadisticas() {
        
        initComponents();
    }
    private static DriverUsuario driver;
    public Estadisticas (DriverUsuario driver) {
        this.driver = driver;
        initComponents();
    }
    
    public void abrirMiCuenta(){
        this.dispose();
        MiCuenta cuenta = new MiCuenta(driver);
        cuenta.setVisible(true);
    }
    
    public void abrirReduccionResiduos() {
        this.dispose();
        ReduccionResiduos reduccion = new ReduccionResiduos(driver);
        reduccion.setVisible(true);
    }
     
    public void abrirMisResiduos() {
        this.dispose();
        MisResiduos residuos = new MisResiduos(driver);
        residuos.setVisible(true);
    }
    
    public void abrirClasifico() {
        this.dispose();
        Clasifico clasifico = new Clasifico(driver);
        clasifico.setVisible(true);
    }

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
     
     public void instrucciones(){
        JOptionPane.showMessageDialog(null, "Estadísticas emplea una representación gráfica de tus contenedores y cuáles van acumulados. \nAdemás tus contenedores se basarán en la acumulación y si deseas retirar la basura de alguno. ", "Instrucciones de Uso", JOptionPane.INFORMATION_MESSAGE);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbBoton = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbIMGContenedorVidrios = new javax.swing.JLabel();
        lbIMGContenedorOrganica = new javax.swing.JLabel();
        lbIMGContenedorMulticapa = new javax.swing.JLabel();
        lbIMGContenedorPapel = new javax.swing.JLabel();
        lbIMGContenedorMetal = new javax.swing.JLabel();
        lbIMGContenedorPlasticos = new javax.swing.JLabel();
        lbMulticapa = new javax.swing.JLabel();
        lbPapel = new javax.swing.JLabel();
        lbVidrios = new javax.swing.JLabel();
        lbPlasticos = new javax.swing.JLabel();
        lbMetal = new javax.swing.JLabel();
        lbOrganica = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtCantPapel = new javax.swing.JTextField();
        txtCantMulticapa = new javax.swing.JTextField();
        txtCantVidrios = new javax.swing.JTextField();
        txtCantOrganica = new javax.swing.JTextField();
        txtCantPlasticos = new javax.swing.JTextField();
        txtCantMetal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(246, 246, 246));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mi Cuenta");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 110, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("¿Cómo lo clasifico?");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mis Residuos");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 150, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Estado de los Contenedores");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reducción de Residuos");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 260, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Estadísticas");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 140, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Estadísticas");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 150, -1));

        jLabel4.setText("Seleccione fecha para ver sus estadísticas : ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 360, 240));

        jlbBoton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/boton.png")
        );
        jlbBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbBotonMouseClicked(evt);
            }
        });
        jPanel4.add(jlbBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 40, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lbIMGContenedorVidrios, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 217, -1, 113));
        jPanel1.add(lbIMGContenedorOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 169, -1, -1));
        jPanel1.add(lbIMGContenedorMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 275, -1, 109));
        jPanel1.add(lbIMGContenedorPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 419, -1, -1));
        jPanel1.add(lbIMGContenedorMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 402, -1, -1));
        jPanel1.add(lbIMGContenedorPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 388, -1, -1));

        lbMulticapa.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbMulticapa.setText("Multicapa");
        jPanel1.add(lbMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lbPapel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbPapel.setText("Papel");
        jPanel1.add(lbPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        lbVidrios.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbVidrios.setText("Vidrios");
        jPanel1.add(lbVidrios, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 206, -1, -1));

        lbPlasticos.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbPlasticos.setText("Plásticos");
        jPanel1.add(lbPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 57, -1));

        lbMetal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbMetal.setText("Metal");
        jPanel1.add(lbMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 57, -1));

        lbOrganica.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbOrganica.setText("Orgánica");
        jPanel1.add(lbOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel22.setText("Cantidad");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 152, -1, -1));

        jLabel23.setText("Cantidad");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 338, -1, -1));

        jLabel24.setText("Cantidad");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel26.setText("Cantidad");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel27.setText("Cantidad");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        txtCantPapel.setEditable(false);
        jPanel1.add(txtCantPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 59, -1));

        txtCantMulticapa.setEditable(false);
        jPanel1.add(txtCantMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 59, -1));

        txtCantVidrios.setEditable(false);
        jPanel1.add(txtCantVidrios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 59, -1));

        txtCantOrganica.setEditable(false);
        jPanel1.add(txtCantOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 59, -1));

        txtCantPlasticos.setEditable(false);
        jPanel1.add(txtCantPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 59, -1));

        txtCantMetal.setEditable(false);
        jPanel1.add(txtCantMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 59, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_amarillo.png"));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 84, 103));

        jLabel15.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_verde.png"));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 81, 103));

        jLabel16.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_azul.png"));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 81, 101));

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_rojo.png"));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 229, 81, 103));

        jLabel17.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_morao.png"));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 227, 81, 103));

        jLabel18.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_cafe.png"));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 233, 81, 103));

        jLabel28.setText("Cantidad");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 540, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/fondo2.png")
        );
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        abrirMiCuenta();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        abrirClasifico();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        abrirMisResiduos();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        abrirReduccionResiduos();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing

    private void jlbBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbBotonMouseClicked
        // TODO add your handling code here:
        instrucciones();
    }//GEN-LAST:event_jlbBotonMouseClicked

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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas(driver).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbBoton;
    private javax.swing.JLabel lbIMGContenedorMetal;
    private javax.swing.JLabel lbIMGContenedorMulticapa;
    private javax.swing.JLabel lbIMGContenedorOrganica;
    private javax.swing.JLabel lbIMGContenedorPapel;
    private javax.swing.JLabel lbIMGContenedorPlasticos;
    private javax.swing.JLabel lbIMGContenedorVidrios;
    private javax.swing.JLabel lbMetal;
    private javax.swing.JLabel lbMulticapa;
    private javax.swing.JLabel lbOrganica;
    private javax.swing.JLabel lbPapel;
    private javax.swing.JLabel lbPlasticos;
    private javax.swing.JLabel lbVidrios;
    private javax.swing.JTextField txtCantMetal;
    private javax.swing.JTextField txtCantMulticapa;
    private javax.swing.JTextField txtCantOrganica;
    private javax.swing.JTextField txtCantPapel;
    private javax.swing.JTextField txtCantPlasticos;
    private javax.swing.JTextField txtCantVidrios;
    // End of variables declaration//GEN-END:variables
}
