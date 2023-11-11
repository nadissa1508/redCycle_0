/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Driver;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author nadis
 */
public class CrearCuenta extends javax.swing.JFrame {

    /**
     * Creates new form CrearCuenta
     */
    private static Driver driver;

    public CrearCuenta(Driver driver) {
        this.driver = driver;
        initComponents();
        limpiar();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
        btnRegistrarse = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(73, 153, 28));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crear Cuenta");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 180, -1));
        jPanel2.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 206, -1));

        jLabel4.setText("Nombre de usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 206, -1));

        jLabel5.setText("Correo electrónico");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 206, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 206, -1));

        jLabel6.setText("Contraseña");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 206, -1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 206, -1));

        jLabel7.setText("Seleccione las clasificaciones de residuos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, 26));

        jLabel8.setText("que le interesen:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 218, -1));

        cbOrganica.setText("Orgánica");
        cbOrganica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrganicaActionPerformed(evt);
            }
        });
        jPanel2.add(cbOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 20));

        cbPlastico.setText("Plástico");
        jPanel2.add(cbPlastico, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 20));

        cbMulticapa.setText("Multicapa");
        jPanel2.add(cbMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, 20));

        cbMetal.setText("Metal");
        jPanel2.add(cbMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, 20));

        cbVidrio.setText("Vidrio");
        jPanel2.add(cbVidrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 20));

        cbPapel.setText("Papel y cartón");
        jPanel2.add(cbPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 20));

        btnRegistrarse.setBackground(new java.awt.Color(73, 153, 28));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 190, -1));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/logo.png"));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 110, 90));

        btnRegresar.setBackground(new java.awt.Color(73, 153, 28));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 650, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/fondo.png")
        );
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 940, 520));

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
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

    private void crearCuenta() {
        
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
        //int nuevoId = driver.obtenerSiguienteID();
        driver.validarUsuario("Creada ",0, txtNombreUsuario.getText(), txtCorreo.getText(), txtPassword.getText(), "Organica", litrosOrganica, "Plastico", litrosPlastico, "Multicapa", litrosMulticapa, "Metal", litrosMetal, "Vidrio", litrosVidrio, "Papel", litrosPapel, true);

    }
    
//    public void crearCuenta2() {
//        
//        String litrosOrganica = "", litrosPlastico = "", litrosMulticapa = "", litrosMetal = "", litrosVidrio = "", litrosPapel = "";
//
//       // if (cbOrganica.isSelected()) {
//            litrosOrganica = "2";//JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para basura organica: ");
//        //}
//        //if (cbPlastico.isSelected()) {
//            litrosPlastico =  "2";//JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para el plástico:");
//        //}
//        //if (cbMulticapa.isSelected()) {
//            litrosMulticapa =  "2";//JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para basura multicapa: ");
//       // }
//       // if (cbMetal.isSelected()) {
//            litrosMetal =  "2";//JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para metal: ");
//       // }
//       // if (cbVidrio.isSelected()) {
//            litrosVidrio =  "2";//JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para vidrio: ");
//       // }
//       // if (cbPapel.isSelected()) {
//            litrosPapel =  "2";//JOptionPane.showInputDialog("Ingrese la cantidad de litros de su contenedor para papel y cartón: ");
//       // }
//        //int nuevoId = driver.obtenerSiguienteID();
//        driver.validarUsuario("Creada ",0, "a", "a", "a", "Organica", litrosOrganica, "Plastico", litrosPlastico, "Multicapa", litrosMulticapa, "Metal", litrosMetal, "Vidrio", litrosVidrio, "Papel", litrosPapel, true);
//
//    }

    private void abrirLogin() {
        this.dispose();
        Login login = new Login(driver);
        login.setVisible(true);
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
    
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        crearCuenta();
        if(driver.getUsuario() != null){
            abrirLogin();
        }
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        abrirLogin();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cbOrganicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrganicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrganicaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta(driver).setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox cbMetal;
    private javax.swing.JCheckBox cbMulticapa;
    private javax.swing.JCheckBox cbOrganica;
    private javax.swing.JCheckBox cbPapel;
    private javax.swing.JCheckBox cbPlastico;
    private javax.swing.JCheckBox cbVidrio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
