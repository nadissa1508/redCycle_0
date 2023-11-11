/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Driver;
import Controlador.DriverContenedor;
import Modelo.Contenedor;
import Modelo.Usuario;
import java.util.ArrayList;
import java.awt.Image;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author nadis
 */
public class MisResiduos extends javax.swing.JFrame {

    /**
     * Creates new form MisResiduos
     */
   
    
    private static Driver driver;
    private DriverContenedor driverContenedor;
    
    
    public MisResiduos (Driver driver) {
        this.driver = driver;
        driverContenedor = new DriverContenedor(driver);
        initComponents();
        llenarCombo();
    }
    
    public void abrirMisResiduos() {
        this.dispose();
        MisResiduos residuos = new MisResiduos(driver);
        residuos.setVisible(true);
    }
    
     public void abrirReduccionResiduos() {
        this.dispose();
        ReduccionResiduos reduccion = new ReduccionResiduos(driver);
        reduccion.setVisible(true);
    }
    
     public void abrirClasifico() {
        this.dispose();
        Clasifico clasifico = new Clasifico(driver);
        clasifico.setVisible(true);
    }
     
    public void abrirMiCuenta(){
        this.dispose();
        MiCuenta cuenta = new MiCuenta(driver);
        cuenta.setVisible(true);
    }
    
     public void abrirEstadisticas() {
        this.dispose();
        Estadisticas estadisticas = new Estadisticas(driver);
        estadisticas.setVisible(true);
    }

    public void guardar(){
        
    }
    
    public void llenarCombo(){
       ArrayList<Contenedor> cB = new ArrayList<>();
        cB = driver.getUsuario().getContenedoresBasura();
        spCantidadResiduos.setValue(cB.get(0).getCantResiduos());
        for (int k=0;k<cB.size();k++){
           cbClasificacionesBasura.addItem(cB.get(k).getClasificacion()); 
        }
    }
    
    public void getResiduos(){
      ArrayList<Contenedor> cB = new ArrayList<>();
        cB = driver.getUsuario().getContenedoresBasura();
       
        for (int k=0;k<cB.size();k++){
            if (cB.get(k).getClasificacion().equals(cbClasificacionesBasura.getSelectedItem().toString())){
                spCantidadResiduos.setValue(cB.get(k).getCantResiduos());
                break;
            }
        }
         for (int k=0;k<cB.size();k++){
            if (cB.get(k).getClasificacion().equals("Multicapa")){
               txtCantMulticapa.setText(String.valueOf(cB.get(k).getCantResiduos()));
            }
            if (cB.get(k).getClasificacion().equals("Papel")){
               txtCantPapel.setText(String.valueOf(cB.get(k).getCantResiduos()));  
            }
            if (cB.get(k).getClasificacion().equals("Plastico")){
               txtCantPlasticos.setText(String.valueOf(cB.get(k).getCantResiduos()));
            }
            if (cB.get(k).getClasificacion().equals("Vidrio")){
               txtCantVidrios.setText(String.valueOf(cB.get(k).getCantResiduos()));  
            }
            if (cB.get(k).getClasificacion().equals("Organica")){
               txtCantOrganica.setText(String.valueOf(cB.get(k).getCantResiduos()));
            }
            if (cB.get(k).getClasificacion().equals("Metal")){
               txtCantMetal.setText(String.valueOf(cB.get(k).getCantResiduos()));  
            }
        }
    }
     
    public void setResiduos(){
        ArrayList<Contenedor> cB = new ArrayList<>();
        ArrayList<Contenedor> cBmod = new ArrayList<>();
        cB = driver.getUsuario().getContenedoresBasura();
        
        String itemSelected = cbClasificacionesBasura.getSelectedItem().toString();
        
       
        if (itemSelected.equals("Multicapa")){
        txtCantMulticapa.setText(String.valueOf(spCantidadResiduos.getValue()));
        }
        if (itemSelected.equals("Papel")){
        txtCantPapel.setText(String.valueOf(spCantidadResiduos.getValue()));
        }
        if (itemSelected.equals("Plastico")){
        txtCantPlasticos.setText(String.valueOf(spCantidadResiduos.getValue()));
        }
        if (itemSelected.equals("Vidrio")){
        txtCantVidrios.setText(String.valueOf(spCantidadResiduos.getValue()));
        }
        if (itemSelected.equals("Organica")){
        txtCantOrganica.setText(String.valueOf(spCantidadResiduos.getValue()));
        }
        if (itemSelected.equals("Metal")){
        txtCantMetal.setText(String.valueOf(spCantidadResiduos.getValue()));
        }
        
        for(int i=0;i<cB.size();i++){
            if (cB.get(i).getClasificacion().toString().equals(itemSelected)){
                Contenedor contTemp = new Contenedor(cB.get(i).getClasificacion(), cB.get(i).getLitros(), Integer.parseInt(spCantidadResiduos.getValue().toString()));
                cBmod.add(contTemp);
                
            }else {
                
                cBmod.add(cB.get(i));
            }
        }

        this.driver.setUsuario(driver.getUsuario().getId(), cBmod);
        
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
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbClasificacionesBasura = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        spCantidadResiduos = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbMiCuenta = new javax.swing.JLabel();
        lbClasifico = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbEstadisticas = new javax.swing.JLabel();
        lbReduccionResiduos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(246, 246, 246));
        jPanel4.setPreferredSize(new java.awt.Dimension(950, 560));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel144.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("Mis Residuos");

        jLabel4.setText("Seleccione el artículo que desee clasificar: ");

        cbClasificacionesBasura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbClasificacionesBasuraMouseClicked(evt);
            }
        });
        cbClasificacionesBasura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClasificacionesBasuraActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad producida:");

        spCantidadResiduos.setModel(new javax.swing.SpinnerNumberModel());
        spCantidadResiduos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCantidadResiduosStateChanged(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(73, 153, 28));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbClasificacionesBasura, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(spCantidadResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel144))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cbClasificacionesBasura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(spCantidadResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 430, 310));

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
        jPanel1.add(txtCantPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 59, -1));

        txtCantMulticapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantMulticapaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantMulticapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 59, -1));

        txtCantVidrios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantVidriosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantVidrios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 59, -1));
        jPanel1.add(txtCantOrganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 59, -1));
        jPanel1.add(txtCantPlasticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 59, -1));
        jPanel1.add(txtCantMetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 59, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_amarillo.png"));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 84, 103));

        jLabel9.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_verde.png"));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 81, 103));

        jLabel12.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_azul.png"));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 81, 101));

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_rojo.png"));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 229, 81, 103));

        jLabel13.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_morao.png"));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 227, 81, 103));

        jLabel14.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/bote_cafe.png"));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 233, 81, 103));

        jLabel28.setText("Cantidad");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 540, 390));

        lbMiCuenta.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbMiCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMiCuenta.setText("Mi Cuenta");
        lbMiCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMiCuentaMouseClicked(evt);
            }
        });
        jPanel4.add(lbMiCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, -1));

        lbClasifico.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbClasifico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClasifico.setText("¿Cómo lo clasifico?");
        lbClasifico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbClasificoMouseClicked(evt);
            }
        });
        jPanel4.add(lbClasifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mis Residuos");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        lbEstadisticas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstadisticas.setText("Estadísticas");
        lbEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEstadisticasMouseClicked(evt);
            }
        });
        jPanel4.add(lbEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 140, -1));

        lbReduccionResiduos.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbReduccionResiduos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReduccionResiduos.setText("Reducción de Residuos");
        lbReduccionResiduos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReduccionResiduosMouseClicked(evt);
            }
        });
        jPanel4.add(lbReduccionResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 260, -1));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"/src/main/java/img/fondo2.png"));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lbMiCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMiCuentaMouseClicked
        // TODO add your handling code here:
        abrirMiCuenta();
    }//GEN-LAST:event_lbMiCuentaMouseClicked

    private void lbClasificoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbClasificoMouseClicked
        // TODO add your handling code here:
        abrirClasifico();
    }//GEN-LAST:event_lbClasificoMouseClicked

    private void lbEstadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstadisticasMouseClicked
        // TODO add your handling code here:
        abrirEstadisticas();
    }//GEN-LAST:event_lbEstadisticasMouseClicked

    private void lbReduccionResiduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReduccionResiduosMouseClicked
        // TODO add your handling code here:
        abrirReduccionResiduos();
    }//GEN-LAST:event_lbReduccionResiduosMouseClicked

    private void txtCantVidriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantVidriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantVidriosActionPerformed

    private void cbClasificacionesBasuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClasificacionesBasuraActionPerformed
        // TODO add your handling code here:
         getResiduos();
    }//GEN-LAST:event_cbClasificacionesBasuraActionPerformed

    
    private void cbClasificacionesBasuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbClasificacionesBasuraMouseClicked
        // TODO add your handling code here:
        //System.out.println("estoy en el mouse clicked");
    }//GEN-LAST:event_cbClasificacionesBasuraMouseClicked

    private void txtCantMulticapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantMulticapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantMulticapaActionPerformed

    private void spCantidadResiduosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spCantidadResiduosStateChanged
        // TODO add your handling code here:
        //GRAGAGRGAGRG
        //setResiduos();
    }//GEN-LAST:event_spCantidadResiduosStateChanged

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
        setResiduos();
    }//GEN-LAST:event_btnGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(MisResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisResiduos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisResiduos(driver).setVisible(true);
                
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbClasificacionesBasura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbClasifico;
    private javax.swing.JLabel lbEstadisticas;
    private javax.swing.JLabel lbIMGContenedorMetal;
    private javax.swing.JLabel lbIMGContenedorMulticapa;
    private javax.swing.JLabel lbIMGContenedorOrganica;
    private javax.swing.JLabel lbIMGContenedorPapel;
    private javax.swing.JLabel lbIMGContenedorPlasticos;
    private javax.swing.JLabel lbIMGContenedorVidrios;
    private javax.swing.JLabel lbMetal;
    private javax.swing.JLabel lbMiCuenta;
    private javax.swing.JLabel lbMulticapa;
    private javax.swing.JLabel lbOrganica;
    private javax.swing.JLabel lbPapel;
    private javax.swing.JLabel lbPlasticos;
    private javax.swing.JLabel lbReduccionResiduos;
    private javax.swing.JLabel lbVidrios;
    private javax.swing.JSpinner spCantidadResiduos;
    private javax.swing.JTextField txtCantMetal;
    private javax.swing.JTextField txtCantMulticapa;
    private javax.swing.JTextField txtCantOrganica;
    private javax.swing.JTextField txtCantPapel;
    private javax.swing.JTextField txtCantPlasticos;
    private javax.swing.JTextField txtCantVidrios;
    // End of variables declaration//GEN-END:variables
}
