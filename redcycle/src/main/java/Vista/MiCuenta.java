/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Driver;
import Modelo.Usuario;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author nadis
 */
public class MiCuenta extends javax.swing.JFrame {

    /**
     * Creates new form MiCuenta
     */
    private static Driver driver;
    
   public MiCuenta(Driver driver) {
        this.driver = driver;
        initComponents();
        limpiar();
        traerDatos();
    }
    

    public void limpiar() {
        txtNombreUsuario.setText("");
        txtCorreo.setText("");
        txtPassword.setText("");
        cbOrganica.setSelected(false);
        cbPlastico.setSelected(false);
        cbMulticapa.setSelected(false);
        cbMetal.setSelected(false);
        cbVidrio.setSelected(false);
        cbPapel.setSelected(false);
    }

    public void traerDatos() {

        Usuario tempUser = new Usuario();
        tempUser = driver.getUsuario();

        txtNombreUsuario.setText(tempUser.getNombre());
        txtCorreo.setText(tempUser.getCorreo());
        txtPassword.setText(tempUser.getPassword());

        String[] clasificaciones = tempUser.getClasificacionesContenedores();
        for (int i = 0; i < tempUser.sizeContenedores(); i++) {
            if (clasificaciones[i] != null) {
                if (clasificaciones[i].equals("Organica")) {
                    cbOrganica.setSelected(true);
                } else if (clasificaciones[i].equals("Plastico")) {
                    cbPlastico.setSelected(true);
                } else if (clasificaciones[i].equals("Multicapa")) {
                    cbMulticapa.setSelected(true);
                } else if (clasificaciones[i].equals("Metal")) {
                    cbMetal.setSelected(true);
                } else if (clasificaciones[i].equals("Vidrio")) {
                    cbVidrio.setSelected(true);
                } else if (clasificaciones[i].equals("Papel")) {
                    cbPapel.setSelected(true);
                }
            }
        }
    }

    public void actualizarCuenta() {
        String litrosOrganica = "", litrosPlastico = "", litrosMulticapa = "", litrosMetal = "", litrosVidrio = "", litrosPapel = "";

        if (cbOrganica.isSelected()) {
            litrosOrganica = JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para basura organica: ");
        }
        if (cbPlastico.isSelected()) {
            litrosPlastico = JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para el plástico:");
        }
        if (cbMulticapa.isSelected()) {
            litrosMulticapa = JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para basura multicapa: ");
        }
        if (cbMetal.isSelected()) {
            litrosMetal = JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para metal: ");
        }
        if (cbVidrio.isSelected()) {
            litrosVidrio = JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para vidrio: ");
        }
        if (cbPapel.isSelected()) {
            litrosPapel = JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para papel y cartón: ");
        }
        
        Usuario usuarioActual = driver.getUsuario();
        int idUsuarioActual = usuarioActual.getId();
        
        driver.validarUsuario("actualizada", idUsuarioActual, txtNombreUsuario.getText(), txtCorreo.getText(), txtPassword.getText(), "Organica", litrosOrganica, "Plastico", litrosPlastico, "Multicapa", litrosMulticapa, "Metal", litrosMetal, "Vidrio", litrosVidrio, "Papel", litrosPapel, false);
    }

    public void abrirClasifico() {
        this.dispose();
        Clasifico clasifico = new Clasifico(driver);
        clasifico.setVisible(true);
    }
    
    public void abrirLogin() {
        this.dispose();
        Login login = new Login(driver);
        login.setVisible(true);
    }
    
    //a partir de aca falta configurar objeto driver

    public void abrirMisResiduos() {
        this.dispose();
        MisResiduos residuos = new MisResiduos(driver);
        residuos.setVisible(true);
    }

    public void abrirEstadisticas() {
        this.dispose();
        Estadisticas estadisticas = new Estadisticas(driver);
        estadisticas.setVisible(true);
    }

    public void abrirReduccionResiduos() {
        this.dispose();
        ReduccionResiduos reduccion = new ReduccionResiduos(driver);
        reduccion.setVisible(true);
    }
    
    private void cerrarVentana(){
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_OPTION){
            try{
                driver.guardarArchivoUser(); 
            }catch(Exception e){
               System.out.println("Error al guardar CSV DE USUARIO"); 
            }
            
             try{
                driver.guardarArchivoCont(); 
            }catch(IOException io){
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbOrganica = new javax.swing.JCheckBox();
        cbPlastico = new javax.swing.JCheckBox();
        cbMulticapa = new javax.swing.JCheckBox();
        cbMetal = new javax.swing.JCheckBox();
        cbVidrio = new javax.swing.JCheckBox();
        cbPapel = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbCuenta = new javax.swing.JLabel();
        lbComoClasifico = new javax.swing.JLabel();
        lbMisResiduos = new javax.swing.JLabel();
        lbEstadisticas = new javax.swing.JLabel();
        lbReduccionResiduos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/User2.png"));
        jLabel2.setText(".");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 14, 170, 130));

        jLabel4.setText("Nombre de usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 206, -1));
        jPanel2.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 206, -1));

        jLabel5.setText("Correo electrónico");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 206, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 206, -1));

        jLabel6.setText("Contraseña");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 206, -1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 206, -1));

        jLabel7.setText("Seleccione las clasificaciones de residuos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 26));

        jLabel8.setText("que le interesen:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 218, -1));

        cbOrganica.setText("Orgánica");
        jPanel2.add(cbOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, 20));

        cbPlastico.setText("Plástico");
        jPanel2.add(cbPlastico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, 20));

        cbMulticapa.setText("Multicapa");
        jPanel2.add(cbMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 20));

        cbMetal.setText("Metal");
        jPanel2.add(cbMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 20));

        cbVidrio.setText("Vidrio");
        jPanel2.add(cbVidrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 20));

        cbPapel.setText("Papel y cartón");
        jPanel2.add(cbPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 20));

        btnGuardar.setBackground(new java.awt.Color(73, 153, 28));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 120, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mi Cuenta");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 158, -1));

        btnCerrar.setBackground(new java.awt.Color(73, 153, 28));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 120, -1));

        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 580, 400));

        lbCuenta.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCuenta.setText("Mi Cuenta");
        jPanel1.add(lbCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        lbComoClasifico.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbComoClasifico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComoClasifico.setText("¿Cómo lo clasifico?");
        lbComoClasifico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbComoClasificoMouseClicked(evt);
            }
        });
        jPanel1.add(lbComoClasifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 210, -1));

        lbMisResiduos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbMisResiduos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMisResiduos.setText("Mis Residuos");
        lbMisResiduos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMisResiduosMouseClicked(evt);
            }
        });
        jPanel1.add(lbMisResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 140, -1));

        lbEstadisticas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadisticas.setText("Estadísticas");
        lbEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEstadisticasMouseClicked(evt);
            }
        });
        jPanel1.add(lbEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 140, -1));

        lbReduccionResiduos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbReduccionResiduos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReduccionResiduos.setText("Reducción de Residuos");
        lbReduccionResiduos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReduccionResiduosMouseClicked(evt);
            }
        });
        jPanel1.add(lbReduccionResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 260, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/panda.png"));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 560));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        actualizarCuenta();
        limpiar();
        traerDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lbComoClasificoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbComoClasificoMouseClicked
        // TODO add your handling code here:
        abrirClasifico();
    }//GEN-LAST:event_lbComoClasificoMouseClicked

    private void lbMisResiduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMisResiduosMouseClicked
        // TODO add your handling code here:
        abrirMisResiduos();
    }//GEN-LAST:event_lbMisResiduosMouseClicked

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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        abrirLogin();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        limpiar();
        
        
        
    }//GEN-LAST:event_btnCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiCuenta(driver).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox cbMetal;
    private javax.swing.JCheckBox cbMulticapa;
    private javax.swing.JCheckBox cbOrganica;
    private javax.swing.JCheckBox cbPapel;
    private javax.swing.JCheckBox cbPlastico;
    private javax.swing.JCheckBox cbVidrio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbComoClasifico;
    private javax.swing.JLabel lbCuenta;
    private javax.swing.JLabel lbEstadisticas;
    private javax.swing.JLabel lbMisResiduos;
    private javax.swing.JLabel lbReduccionResiduos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
