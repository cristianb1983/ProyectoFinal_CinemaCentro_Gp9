/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.imageio.plugins.jpeg.JPEG;
import entidades.Comprador;
import entidades.DetalleTicket;
import entidades.LugarAsiento;
import entidades.Pelicula;
import entidades.Proyeccion;
import entidades.TicketCompra;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import persistencias.CompradorData;
import persistencias.Conexion;
import persistencias.LugarData;
import persistencias.PeliculasData;
import persistencias.ProyeccionData;
import persistencias.TicketData;

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
    TicketData ticketD = new TicketData();
    SpinnerNumberModel spinnerModelo = new SpinnerNumberModel();
    public VistaCompra() {
        initComponents();
        cargarPelisEnCartelera();
        setearFecha();
        setearSpinner();
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
        jrbEfectivo = new javax.swing.JRadioButton();
        jrbDebito = new javax.swing.JRadioButton();
        jrbCredito = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jBcomprar = new javax.swing.JButton();
        jcbAsientos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCBpelicula = new javax.swing.JComboBox<>();
        jcbAsientos1 = new javax.swing.JComboBox<>();
        jcbAsientos3 = new javax.swing.JComboBox<>();
        jcbAsientos2 = new javax.swing.JComboBox<>();
        jcbAsientos4 = new javax.swing.JComboBox<>();
        jcbAsientos5 = new javax.swing.JComboBox<>();
        jcbAsientos6 = new javax.swing.JComboBox<>();
        jcbAsientos7 = new javax.swing.JComboBox<>();

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

        jScantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jScantidadStateChanged(evt);
            }
        });

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

        jrbEfectivo.setText("Efectivo");
        jrbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEfectivoActionPerformed(evt);
            }
        });

        jrbDebito.setText("Tarjeta de debito");
        jrbDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDebitoActionPerformed(evt);
            }
        });

        jrbCredito.setText("Tarjeta de credito(solo compra online)");
        jrbCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCreditoActionPerformed(evt);
            }
        });

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

        jcbAsientos.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMPRAR ENTRADAS");

        jCBpelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBpeliculaActionPerformed(evt);
            }
        });

        jcbAsientos1.setEnabled(false);

        jcbAsientos3.setEnabled(false);

        jcbAsientos2.setEnabled(false);

        jcbAsientos4.setEnabled(false);

        jcbAsientos5.setEnabled(false);

        jcbAsientos6.setEnabled(false);

        jcbAsientos7.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jBcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jCBpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
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
                                .addComponent(jCBsalas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(265, 265, 265)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAsientos1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAsientos2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAsientos3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jcbAsientos4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAsientos5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jcbAsientos6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbAsientos7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTFprecio)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jrbEfectivo)
                                .addGap(29, 29, 29)
                                .addComponent(jrbDebito)
                                .addGap(29, 29, 29)
                                .addComponent(jrbCredito)))))
                .addGap(88, 88, 88))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jCBpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jCBsalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jDCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jCBhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jScantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jTFprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAsientos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAsientos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAsientos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAsientos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAsientos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAsientos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAsientos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbDebito)
                        .addComponent(jrbCredito)
                        .addComponent(jrbEfectivo))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBcomprar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
        //Obtenemos los datos para cargar el ticket
        if(jDCfecha.getDate() == null || jScantidad.getValue().equals(0) || jTFdni.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe elegir una fecha/cantidad de entradas/Colocar su dni");
            return;
        }
        
        if(!jrbEfectivo.isSelected() && !jrbDebito.isSelected() && !jrbCredito.isSelected()){
            JOptionPane.showMessageDialog(this, "Debe elegir una forma de pago");
            return;
        }
        
        LocalDate fechaFuncion = jDCfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(fechaFuncion);
        String precioLugar = jTFprecio.getText().replace(",", ".");
        double precio = Double.parseDouble(precioLugar);
        System.out.println(precio);
        LocalDateTime fechaCompra = LocalDateTime.now();
        String opciones;
        if (jrbCredito.isSelected()) {
            opciones = "Online";
        } else {
            opciones = "Taquilla";
        }
        
        //Obtenemos los datos del detalle que se cargara junto con el ticket
        List<DetalleTicket> detalles = new ArrayList();
        DetalleTicket detalle = new DetalleTicket();
        Pelicula pelicula = (Pelicula) jCBpelicula.getSelectedItem();
        int idPelicula = pelicula.getIdPelicula();
        int cantidad = (int)jScantidad.getValue();
        
        String montoDetalle = jTFprecio.getText().replace(",", ".");
        double monto = Double.parseDouble(montoDetalle);
        monto = monto * cantidad;

        String horario = (String) jCBhorario.getSelectedItem();
        Proyeccion proy = proyeccionD.ProyeccionPorPeliculaHorario(idPelicula, horario);
        int idProyeccion = proy.getIdProyeccion();
        
        //Obtenemos los asientos
        LugarAsiento lugar1 = (LugarAsiento)jcbAsientos.getSelectedItem();
        int idLugar1 = lugar1.getIdLugar();
        
        LugarAsiento lugar2 = (LugarAsiento)jcbAsientos1.getSelectedItem();
        int idLugar2 = lugar2.getIdLugar();
                
        LugarAsiento lugar3 = (LugarAsiento)jcbAsientos2.getSelectedItem();
        int idLugar3 = lugar3.getIdLugar();
        
        LugarAsiento lugar4 = (LugarAsiento)jcbAsientos3.getSelectedItem();
        int idLugar4 = lugar4.getIdLugar();
                
        LugarAsiento lugar5 = (LugarAsiento)jcbAsientos4.getSelectedItem();
        int idLugar5 = lugar5.getIdLugar();
                
        LugarAsiento lugar6 = (LugarAsiento)jcbAsientos5.getSelectedItem();
        int idLugar6 = lugar6.getIdLugar();
                
        LugarAsiento lugar7 = (LugarAsiento)jcbAsientos6.getSelectedItem();
        int idLugar7 = lugar7.getIdLugar();
                
        LugarAsiento lugar8 = (LugarAsiento)jcbAsientos7.getSelectedItem();
        int idLugar8 = lugar8.getIdLugar();
        
        //Solo los agregamos a lugares si cumple con la cantidad
        List<LugarAsiento> lugares = new ArrayList();
        switch(cantidad){
            case 1:
                lugares.add(lugar1);
                break;
            case 2:
                lugares.add(lugar1);                
                lugares.add(lugar2);
                break;
            case 3:
                lugares.add(lugar1);
                lugares.add(lugar2);
                lugares.add(lugar3);
                break;
            case 4:
                lugares.add(lugar1);
                lugares.add(lugar2);
                lugares.add(lugar3);
                lugares.add(lugar4);
                break;
            case 5:
                lugares.add(lugar1);
                lugares.add(lugar2);
                lugares.add(lugar3);
                lugares.add(lugar4);
                lugares.add(lugar5);
                break;
            case 6:
                lugares.add(lugar1);
                lugares.add(lugar2);
                lugares.add(lugar3);
                lugares.add(lugar4);
                lugares.add(lugar5);
                lugares.add(lugar6);
                break;
            case 7:
                lugares.add(lugar1);
                lugares.add(lugar2);
                lugares.add(lugar3);
                lugares.add(lugar4);
                lugares.add(lugar5);
                lugares.add(lugar6);
                lugares.add(lugar7);
                break;
            case 8:
                lugares.add(lugar1);
                lugares.add(lugar2);
                lugares.add(lugar3);
                lugares.add(lugar4);
                lugares.add(lugar5);
                lugares.add(lugar6);
                lugares.add(lugar7);
                lugares.add(lugar8);
                break;
        }
        Set<LugarAsiento> sinDuplicados = new HashSet(lugares);
        if (sinDuplicados.size() < lugares.size()) {
            JOptionPane.showMessageDialog(this, "Los asientos seleccionados deben ser diferentes");
            return;
        }
  
        //seteamos atributos a dealle
        detalle.setProyeccion(proy);
        detalle.setSubtotal(monto);
        detalle.setCantidad(cantidad);
        detalle.setLugares(lugares);
        detalles.add(detalle);
        
        //Seteamos atributos al ticket
        TicketCompra ticket = new TicketCompra();
        ticket.setDetalles(detalles);
        ticket.setFechaCompra(fechaCompra);
        ticket.setFechaFuncion(fechaFuncion);
        ticket.setMonto(precio);
        ticket.setTipoCompra(opciones);
        
        long dni = Long.parseLong(jTFdni.getText());
        Comprador comprador = new Comprador();
        comprador.setDniComprador(dni); //parsear long
        
        if(ticket.getTipoCompra().equals("Online")){
            String codigoVenta = generarCodigoVenta();
            ticket.setCodigoVenta(codigoVenta);
        }
        
        ticket.setComprador(comprador);
        ticketD.generarTicket(ticket);
        
        if(jrbDebito.isSelected() || jrbCredito.isSelected()){
            VistaFinalizarCompra cargarTarjeta = new VistaFinalizarCompra();
            getDesktopPane().add(cargarTarjeta);
            cargarTarjeta.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "Compra realizada con exito");
        }
    }//GEN-LAST:event_jBcomprarActionPerformed

    private void jCBpeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBpeliculaActionPerformed
        Pelicula pelicula = (Pelicula) jCBpelicula.getSelectedItem();
        int idPelicula = pelicula.getIdPelicula();
//        System.out.println(idPelicula);
        
        List<Proyeccion> proyecciones = proyeccionD.listarProyeccionesPorPelicula(idPelicula);
//        System.out.println(proyecciones);
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
//        System.out.println(proy);
        List<LugarAsiento> lugares = lugarD.obtenerLugaresDisponibles(proy);
        System.out.println(lugares);
        for(LugarAsiento aux : lugares){
            jcbAsientos.addItem(aux);
            jcbAsientos1.addItem(aux);
            jcbAsientos2.addItem(aux);
            jcbAsientos3.addItem(aux);
            jcbAsientos4.addItem(aux);
            jcbAsientos5.addItem(aux);
            jcbAsientos6.addItem(aux);
            jcbAsientos7.addItem(aux);
        }
    }//GEN-LAST:event_jCBpeliculaActionPerformed

    private void jCBhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBhorarioActionPerformed
        Pelicula pelicula = (Pelicula) jCBpelicula.getSelectedItem();
        int idPelicula = pelicula.getIdPelicula();

        String horario = (String)jCBhorario.getSelectedItem();
        Proyeccion proy = proyeccionD.ProyeccionPorPeliculaHorario(idPelicula, horario);  
        List<LugarAsiento> lugares = lugarD.obtenerLugaresDisponibles(proy);

        jcbAsientos.removeAllItems();
        jcbAsientos1.removeAllItems();
        jcbAsientos1.removeAllItems();
        jcbAsientos2.removeAllItems();
        jcbAsientos3.removeAllItems();
        jcbAsientos4.removeAllItems();
        jcbAsientos5.removeAllItems();
        jcbAsientos6.removeAllItems();
        jcbAsientos7.removeAllItems();
        for(LugarAsiento aux : lugares){
            jcbAsientos.addItem(aux);
            jcbAsientos1.addItem(aux);
            jcbAsientos2.addItem(aux);
            jcbAsientos3.addItem(aux);
            jcbAsientos4.addItem(aux);
            jcbAsientos5.addItem(aux);
            jcbAsientos6.addItem(aux);
            jcbAsientos7.addItem(aux);
        }
    }//GEN-LAST:event_jCBhorarioActionPerformed

    private void jrbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEfectivoActionPerformed
        if(jrbEfectivo.isSelected()){
            jrbDebito.setEnabled(false);
            jrbCredito.setEnabled(false);
        }
    }//GEN-LAST:event_jrbEfectivoActionPerformed

    private void jrbDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDebitoActionPerformed
        if(jrbDebito.isSelected()){
            jrbEfectivo.setEnabled(false);
            jrbCredito.setEnabled(false);
        }
    }//GEN-LAST:event_jrbDebitoActionPerformed

    private void jrbCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCreditoActionPerformed
        if(jrbCredito.isSelected()){
            jrbEfectivo.setEnabled(false);
            jrbDebito.setEnabled(false);
        }
    }//GEN-LAST:event_jrbCreditoActionPerformed

    private void jScantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jScantidadStateChanged
        //Habilitar combos y calcular el precio
        int cantidad = (int)jScantidad.getValue();
        
        Pelicula pelicula = (Pelicula) jCBpelicula.getSelectedItem();
        int idPelicula = pelicula.getIdPelicula();
        
        String horario = (String)jCBhorario.getSelectedItem();
        Proyeccion proy = proyeccionD.ProyeccionPorPeliculaHorario(idPelicula, horario);
        
        String precio = String.format("%.2f", proy.getPrecio() * cantidad);
        jTFprecio.setText(precio);
        
        switch(cantidad){
            case 0:
                jcbAsientos.setEnabled(false);
                jcbAsientos1.setEnabled(false);
                jcbAsientos2.setEnabled(false);
                jcbAsientos3.setEnabled(false);
                jcbAsientos4.setEnabled(false);
                jcbAsientos5.setEnabled(false);
                jcbAsientos6.setEnabled(false);
                jcbAsientos7.setEnabled(false);
                break;
            case 1:
                jcbAsientos.setEnabled(true);
                jcbAsientos1.setEnabled(false);
                jcbAsientos2.setEnabled(false);
                jcbAsientos3.setEnabled(false);
                jcbAsientos4.setEnabled(false);
                jcbAsientos5.setEnabled(false);
                jcbAsientos6.setEnabled(false);
                jcbAsientos7.setEnabled(false);
                break;
            case 2:
                jcbAsientos.setEnabled(true);
                jcbAsientos1.setEnabled(true);
                jcbAsientos2.setEnabled(false);
                jcbAsientos3.setEnabled(false);
                jcbAsientos4.setEnabled(false);
                jcbAsientos5.setEnabled(false);
                jcbAsientos6.setEnabled(false);
                jcbAsientos7.setEnabled(false);
                break;
            case 3:
                jcbAsientos.setEnabled(true);
                jcbAsientos1.setEnabled(true);
                jcbAsientos2.setEnabled(true);
                jcbAsientos3.setEnabled(false);
                jcbAsientos4.setEnabled(false);
                jcbAsientos5.setEnabled(false);
                jcbAsientos6.setEnabled(false);
                jcbAsientos7.setEnabled(false);
                break;
            case 4:
                jcbAsientos.setEnabled(true);
                jcbAsientos1.setEnabled(true);
                jcbAsientos2.setEnabled(true);
                jcbAsientos3.setEnabled(true);
                jcbAsientos4.setEnabled(false);
                jcbAsientos5.setEnabled(false);
                jcbAsientos6.setEnabled(false);
                jcbAsientos7.setEnabled(false);
                break;
            case 5:
                jcbAsientos.setEnabled(true);
                jcbAsientos1.setEnabled(true);
                jcbAsientos2.setEnabled(true);
                jcbAsientos3.setEnabled(true);
                jcbAsientos4.setEnabled(true);
                jcbAsientos5.setEnabled(false);
                jcbAsientos6.setEnabled(false);
                jcbAsientos7.setEnabled(false);
                break;
            case 6:
                jcbAsientos.setEnabled(true);
                jcbAsientos1.setEnabled(true);
                jcbAsientos2.setEnabled(true);
                jcbAsientos3.setEnabled(true);
                jcbAsientos4.setEnabled(true);
                jcbAsientos5.setEnabled(true);
                jcbAsientos6.setEnabled(false);
                jcbAsientos7.setEnabled(false);
                break;
            case 7:
                jcbAsientos.setEnabled(true);
                jcbAsientos1.setEnabled(true);
                jcbAsientos2.setEnabled(true);
                jcbAsientos3.setEnabled(true);
                jcbAsientos4.setEnabled(true);
                jcbAsientos5.setEnabled(true);
                jcbAsientos6.setEnabled(true);
                jcbAsientos7.setEnabled(false);
                break;
            case 8:
                jcbAsientos7.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jScantidadStateChanged

    private void setearFecha(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaMaxima = fechaActual.plusDays(6);
        Date fechaMin = Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fechaMax = Date.from(fechaMaxima.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDCfecha.setMinSelectableDate(fechaMin);
        jDCfecha.setMaxSelectableDate(fechaMax);
    }
    
    private void setearSpinner(){
        spinnerModelo.setMaximum(8);
        spinnerModelo.setMinimum(0);
        jScantidad.setModel(spinnerModelo);
    }
    
    private String generarCodigoVenta() {
        int numero = (int) (Math.random() * 10_000_000); // 0 a 9.999.999
        return String.format("%07d", numero); // completa con ceros a la izquierda
    }
    
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
    private javax.swing.JSpinner jScantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFprecio;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos1;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos2;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos3;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos4;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos5;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos6;
    private javax.swing.JComboBox<LugarAsiento> jcbAsientos7;
    private javax.swing.JRadioButton jrbCredito;
    private javax.swing.JRadioButton jrbDebito;
    private javax.swing.JRadioButton jrbEfectivo;
    // End of variables declaration//GEN-END:variables
}
