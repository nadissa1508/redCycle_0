/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.DriverContenedor;
import Controlador.DriverUsuario;
import Modelo.Contenedor;
import Modelo.ControlContenedor;
import Modelo.Usuario;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
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

    public Estadisticas(DriverUsuario driver) {
        this.driver = driver;
        initComponents();
        limpiar();
        traerDatos();
    }

    public void limpiar() {
        lbEstadoMetal.setText("No aplica");
        lbEstadoMulticapa.setText("No aplica");
        lbEstadoOrganica.setText("No aplica");
        lbEstadoPapel.setText("No aplica");
        lbEstadoPlasticos.setText("No aplica");
        lbEstadoVidrio.setText("No aplica");
    }

    public String calcularNivelContenedor(Contenedor contenedor) {
        String alerta = "";
        float litros = contenedor.getLitros();
        float cantResiduos = contenedor.getCantResiduos();

        // Calcula el nivel del contenedor como un valor entre 0 y 1
        float nivel = cantResiduos / litros;

        // Define los umbrales para determinar el nivel
        float umbralVacio = 1.0f / 3.0f;
        float umbralMedioLleno = 2.0f / 3.0f;

        // Compara el nivel con los umbrales
        if (nivel <= umbralVacio) {
            alerta = "vacio";
        } else if (nivel <= umbralMedioLleno) {
            alerta = "medio lleno";
        } else {
            alerta = "lleno";
        }
        return alerta;
    }
    
    public Color colorAlerta(String nivelContenedor){
        Color color = Color.WHITE;
        if(nivelContenedor.equals("vacio")){
            color = Color.GREEN;
        }else if(nivelContenedor.equals("medio lleno")){
            color = Color.YELLOW;
        }else if(nivelContenedor.equals("lleno")){
            color = Color.RED;
        }
        return color;
    }

    public void traerDatos() {
        DriverContenedor driverCont = new DriverContenedor();
        ArrayList<ControlContenedor> controlContenedores = driverCont.leerCSV();
        if (!controlContenedores.isEmpty()) {
            for (int i = 0; i < controlContenedores.size(); i++) {
                if (controlContenedores.get(i).getClasificacion().equals("Multicapa") && controlContenedores.get(i).getIdUsuario() == driver.getUsuario().getId()) {
                    lbEstadoMulticapa.setText(calcularNivelContenedor(controlContenedores.get(i).getContenedor()));
                    lbEstadoMulticapa.setBackground(colorAlerta(calcularNivelContenedor(controlContenedores.get(i).getContenedor())));
                    lbEstadoMulticapa.setOpaque(true);
                }
                if (controlContenedores.get(i).getClasificacion().equals("Papel") && controlContenedores.get(i).getIdUsuario() == driver.getUsuario().getId()) {
                    lbEstadoPapel.setText(calcularNivelContenedor(controlContenedores.get(i).getContenedor()));
                    lbEstadoPapel.setBackground(colorAlerta(calcularNivelContenedor(controlContenedores.get(i).getContenedor())));
                    lbEstadoPapel.setOpaque(true);
                }
                if (controlContenedores.get(i).getClasificacion().equals("Plastico") && controlContenedores.get(i).getIdUsuario() == driver.getUsuario().getId()) {
                    lbEstadoPlasticos.setText(calcularNivelContenedor(controlContenedores.get(i).getContenedor()));
                    lbEstadoPlasticos.setBackground(colorAlerta(calcularNivelContenedor(controlContenedores.get(i).getContenedor())));
                    lbEstadoPlasticos.setOpaque(true);
                }

                if (controlContenedores.get(i).getClasificacion().equals("Vidrio") && controlContenedores.get(i).getIdUsuario() == driver.getUsuario().getId()) {
                    lbEstadoVidrio.setText(calcularNivelContenedor(controlContenedores.get(i).getContenedor()));
                    lbEstadoVidrio.setBackground(colorAlerta(calcularNivelContenedor(controlContenedores.get(i).getContenedor())));
                    lbEstadoVidrio.setOpaque(true);
                }

                if (controlContenedores.get(i).getClasificacion().equals("Organica") && controlContenedores.get(i).getIdUsuario() == driver.getUsuario().getId()) {
                    lbEstadoOrganica.setText(calcularNivelContenedor(controlContenedores.get(i).getContenedor()));
                    lbEstadoOrganica.setBackground(colorAlerta(calcularNivelContenedor(controlContenedores.get(i).getContenedor())));
                    lbEstadoOrganica.setOpaque(true);
                }
                if (controlContenedores.get(i).getClasificacion().equals("Metal") && controlContenedores.get(i).getIdUsuario() == driver.getUsuario().getId()) {
                    lbEstadoMetal.setText(calcularNivelContenedor(controlContenedores.get(i).getContenedor()));
                    lbEstadoMetal.setBackground(colorAlerta(calcularNivelContenedor(controlContenedores.get(i).getContenedor())));
                    lbEstadoMetal.setOpaque(true);
                }

            }
        }
    }

    public void abrirMiCuenta() {
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
    public void cargarGrafica(){
       
         lbGrafica.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/grafica1.png")
        );
        
    }

    public void instrucciones() {
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
        lbGrafica = new javax.swing.JLabel();
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
        lbEstadoMulticapa = new javax.swing.JLabel();
        lbEstadoVidrio = new javax.swing.JLabel();
        lbEstadoPapel = new javax.swing.JLabel();
        lbEstadoMetal = new javax.swing.JLabel();
        lbEstadoPlasticos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbEstadoOrganica = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

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
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

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
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, -1));

        jLabel4.setText("Seleccione fecha para ver sus estadísticas : ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 20));

        lbGrafica.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
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
        lbMulticapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMulticapa.setText("Multicapa");
        jPanel1.add(lbMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

        lbPapel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbPapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPapel.setText("Papel");
        jPanel1.add(lbPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 80, -1));

        lbVidrios.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbVidrios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVidrios.setText("Vidrios");
        jPanel1.add(lbVidrios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, -1));

        lbPlasticos.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbPlasticos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlasticos.setText("Plásticos");
        jPanel1.add(lbPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 20, 90, -1));

        lbMetal.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbMetal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMetal.setText("Metal");
        jPanel1.add(lbMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 80, -1));

        lbOrganica.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbOrganica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOrganica.setText("Orgánica");
        jPanel1.add(lbOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 80, -1));

        lbEstadoMulticapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoMulticapa.setText("Cantidad");
        jPanel1.add(lbEstadoMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));

        lbEstadoVidrio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoVidrio.setText("Cantidad");
        jPanel1.add(lbEstadoVidrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, -1));

        lbEstadoPapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoPapel.setText("Cantidad");
        jPanel1.add(lbEstadoPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 80, -1));

        lbEstadoMetal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoMetal.setText("Cantidad");
        jPanel1.add(lbEstadoMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 80, -1));

        lbEstadoPlasticos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoPlasticos.setText("Cantidad");
        jPanel1.add(lbEstadoPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 80, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_amarillo.png"));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 84, 103));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_verde.png"));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 81, 103));

        jLabel16.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_azul.png"));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 81, 101));

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_rojo.png"));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 81, 103));

        jLabel17.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_morao.png"));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 81, 103));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_cafe.png"));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 81, 103));

        lbEstadoOrganica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadoOrganica.setText("Cantidad");
        jPanel1.add(lbEstadoOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 80, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 530, 390));

        btnBuscar.setBackground(new java.awt.Color(73, 153, 28));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 190, -1));

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        cargarGrafica();
    }//GEN-LAST:event_btnBuscarActionPerformed

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
    private javax.swing.JButton btnBuscar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbBoton;
    private javax.swing.JLabel lbEstadoMetal;
    private javax.swing.JLabel lbEstadoMulticapa;
    private javax.swing.JLabel lbEstadoOrganica;
    private javax.swing.JLabel lbEstadoPapel;
    private javax.swing.JLabel lbEstadoPlasticos;
    private javax.swing.JLabel lbEstadoVidrio;
    private javax.swing.JLabel lbGrafica;
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
    // End of variables declaration//GEN-END:variables
}
