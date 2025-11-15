/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.imageio.plugins.jpeg.JPEG;
import entidades.Comprador;
import entidades.LugarAsiento;
import entidades.Pelicula;
import entidades.Proyeccion;
import java.sql.Connection;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import persistencias.CompradorData;
import persistencias.Conexion;
import persistencias.LugarData;
import persistencias.PeliculasData;
import persistencias.ProyeccionData;

/**
 *
 * @author crb_p
 */
public class VistaCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCompra
     */
    PeliculasData peliculaD = new PeliculasData();
    ProyeccionData proyeccionD = new ProyeccionData();
    LugarData lugarD = new LugarData();
    public VistaCompra() {
        initComponents();
        cargarPelisEnCartelera();

    }

    CompradorData compradores = new CompradorData();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBsalas = new javax.swing.JComboBox<>();
        jDCfecha = new com.toedter.calendar.JDateChooser();
        jCBhorario = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScantidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jTFprecio = new javax.swing.JTextField();
        jLdni = new javax.swing.JLabel();
        jTFdni = new javax.swing.JTextField();
        jBverificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jBcomprar = new javax.swing.JButton();
        jcbAsientos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCBpelicula = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("COMPRA DE ENTRADAS");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Peliculas en Cartelera :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Salas :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Seleccione la Fecha :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Seleccione el Horario :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Asientos Disponibles :");

        jCBhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBhorarioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Cantidad de tickets :");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Precio:");

        jLdni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLdni.setText("INGRESE SU DNI :");

        jBverificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBverificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tick_ok_correct_icon_231639.png"))); // NOI18N
        jBverificar.setText("VERIFICAR");
        jBverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Forma de pago :");

        jRadioButton1.setText("Efectivo");

        jRadioButton2.setText("Tarjeta de debito");

        jRadioButton3.setText("Tarjeta de credito(solo compra online)");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movie-seats-booking-interface-vector.jpg"))); // NOI18N

        jBcomprar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jBcomprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/wallet_money_icon_231405.png"))); // NOI18N
        jBcomprar.setText("COMPRAR");
        jBcomprar.setIconTextGap(20);
        jBcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcomprarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMPRAR ENTRADAS");

        jCBpelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBpeliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTFprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButton1)
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jBcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jScantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(397, 397, 397)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jCBpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jLdni, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCBsalas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLdni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jCBpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCBsalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jDCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTFprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButton3)))
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverificarActionPerformed
        try {
            int dni = Integer.parseInt(jTFdni.getText());
            if (!compradores.existeDni(dni)) {

                JOptionPane.showMessageDialog(this, "Usuario no registrado! por favor realice el registro e intente nuevamente.");

                jCBpelicula.setEnabled(false);
                jCBsalas.setEnabled(false);
                jcbAsientos.setEnabled(false);
                jCBhorario.setEnabled(false);
                jDCfecha.setEnabled(false);
                jScantidad.setEnabled(false);
                jTFprecio.setEnabled(false);
            } else {

                jCBpelicula.setEnabled(true);
                jCBsalas.setEnabled(true);
                jcbAsientos.setEnabled(true);
                jCBhorario.setEnabled(true);
                jDCfecha.setEnabled(true);
                jScantidad.setEnabled(true);
                jTFprecio.setEnabled(true);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido (solo números).");
        }
    }//GEN-LAST:event_jBverificarActionPerformed
    
    private void cargarPelisEnCartelera(){
        List<Pelicula> peliculas = peliculaD.listarPeliculasenCartelera();
        for(Pelicula aux : peliculas){
            jCBpelicula.addItem(aux);
        }
    }
        
    private void jBcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcomprarActionPerformed
          VistaFinalizarCompra cargarTarjeta = new VistaFinalizarCompra();
          getDesktopPane().add(cargarTarjeta);
          cargarTarjeta.setVisible(true);
    }//GEN-LAST:event_jBcomprarActionPerformed

    private void jCBpeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBpeliculaActionPerformed
        Pelicula pelicula = (Pelicula) jCBpelicula.getSelectedItem();
        int idPelicula = pelicula.getIdPelicula();
        System.out.println(idPelicula);
        
        List<Proyeccion> proyecciones = proyeccionD.listarProyeccionesPorPelicula(idPelicula);
        System.out.println(proyecciones);
        jCBsalas.removeAllItems();
        for(Proyeccion aux : proyecciones){
            jCBsalas.addItem(aux.getSala().getNroSala());
        }
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        jCBhorario.removeAllItems();
        String horario = null;
        for(Proyeccion aux : proyecciones){
            horario = aux.getHoraInicio().format(formato);
            jCBhorario.addItem(horario);
        }

//        Proyeccion proy = proyeccionD.ProyeccionPorPelicula2(idPelicula);  
//        System.out.println(proy);
//        List<LugarAsiento> lugares = lugarD.obtenerLugaresDisponibles(proy);
//        System.out.println(lugares);
//        for(LugarAsiento aux : lugares){
//            jcbAsientos.addItem(aux);
//        }
        
        //Buscar en base al horario
        Proyeccion proy = proyeccionD.ProyeccionPorPeliculaHorario(idPelicula, horario);  
        System.out.println(proy);
        List<LugarAsiento> lugares = lugarD.obtenerLugaresDisponibles(proy);
        System.out.println(lugares);
        for(LugarAsiento aux : lugares){
            jcbAsientos.addItem(aux);
        }
    }//GEN-LAST:event_jCBpeliculaActionPerformed

    private void jCBhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBhorarioActionPerformed
        Pelicula pelicula = (Pelicula) jCBpelicula.getSelectedItem();
        int idPelicula = pelicula.getIdPelicula();

        String horario = (String)jCBhorario.getSelectedItem();
        Proyeccion proy = proyeccionD.ProyeccionPorPeliculaHorario(idPelicula, horario);  
//        System.out.println(proy);
        List<LugarAsiento> lugares = lugarD.obtenerLugaresDisponibles(proy);
//        System.out.println(lugares);
        jcbAsientos.removeAllItems();
        for(LugarAsiento aux : lugares){
            jcbAsientos.addItem(aux);
        }
    }//GEN-LAST:event_jCBhorarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcomprar;
    private javax.swing.JButton jBverificar;
    private javax.swing.JComboBox<String> jCBhorario;
    private javax.swing.JComboBox<Pelicula> jCBpelicula;
    private javax.swing.JComboBox<Integer> jCBsalas;
    private com.toedter.calendar.JDateChooser jDCfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLdni;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSpinner jScantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFprecio;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos;
    // End of variables declaration//GEN-END:variables
}
