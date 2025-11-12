/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.TicketCompra;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencias.TicketData;

/**
 *
 * @author crb_p
 */
public class VistaEstadisticas extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTicketsPorFecha = new DefaultTableModel();
    private DefaultTableModel modeloTicketsPorPeliculas = new DefaultTableModel();
    private DefaultTableModel modeloCompradoresPorFecha = new DefaultTableModel();

    private TicketData ticketD = new TicketData();
    public VistaEstadisticas() {
        initComponents();
        tablaTicketsPorFecha();
        tablaTicketsPorPelicula();
        tablaCompradoresPorFecha();
        cargarComboPeliculas();

    }

    private void tablaTicketsPorFecha() {
        ArrayList<Object> filaCabercera = new ArrayList<>();
        modeloTicketsPorFecha.addColumn("Fecha de Compra");
        modeloTicketsPorFecha.addColumn("Fecha de la Funcion");
        modeloTicketsPorFecha.addColumn("Comprador");
        modeloTicketsPorFecha.addColumn("Tipo de Compra");
        modeloTicketsPorFecha.addColumn("Codigo de Venta");
        modeloTicketsPorFecha.addColumn("Monto Total");
        for (Object it : filaCabercera) {
            modeloTicketsPorFecha.addColumn(it);
        }
        jTtiketsPorFecha.setModel(modeloTicketsPorFecha);
    }

    private void tablaTicketsPorPelicula() {
        ArrayList<Object> filaCabercera = new ArrayList<>();
        modeloTicketsPorPeliculas.addColumn("Fecha de Compra");
        modeloTicketsPorPeliculas.addColumn("Fecha de la Funcion");
        modeloTicketsPorPeliculas.addColumn("Comprador");
        modeloTicketsPorPeliculas.addColumn("Tipo de Compra");
        modeloTicketsPorPeliculas.addColumn("Codigo de Venta");
        modeloTicketsPorPeliculas.addColumn("Monto Total");
        for (Object it : filaCabercera) {
            modeloTicketsPorPeliculas.addColumn(it);
        }
        jTticketsPorPelicula.setModel(modeloTicketsPorPeliculas);
    }

    private void tablaCompradoresPorFecha() {
        ArrayList<Object> filaCabercera = new ArrayList<>();
        modeloCompradoresPorFecha.addColumn("DNI del Comprador");
        modeloCompradoresPorFecha.addColumn("Nombre");
        modeloCompradoresPorFecha.addColumn("Fecha de Nacimiento");
        modeloCompradoresPorFecha.addColumn("Medio de Pago");
        for (Object it : filaCabercera) {
            modeloCompradoresPorFecha.addColumn(it);
        }
        jTcompradoresPorFecha.setModel(modeloCompradoresPorFecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPestadistica = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdcPorFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTtiketsPorFecha = new javax.swing.JTable();
        jbLimpiarFechas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcbPeliculas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTticketsPorPelicula = new javax.swing.JTable();
        jbLimpiarFechas1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jdcCompradores = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcompradoresPorFecha = new javax.swing.JTable();
        jbLimpiarFechas2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ESTADISTICAS");

        jLabel1.setText("INGRESE LA FECHA: ");

        jdcPorFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcPorFechaPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TICKETS EMITIDOS");

        jTtiketsPorFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTtiketsPorFecha);

        jbLimpiarFechas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbLimpiarFechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/brush_paint_icon_231542.png"))); // NOI18N
        jbLimpiarFechas.setText("Limpiar");
        jbLimpiarFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarFechasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdcPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 267, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jbLimpiarFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLimpiarFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTPestadistica.addTab("TICKETS EMITIDOS POR FECHA", jPanel1);

        jLabel5.setText("SELECCIONE LA PELICULA: ");

        jcbPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPeliculasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TICKETS EMITIDOS");

        jTticketsPorPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTticketsPorPelicula);

        jbLimpiarFechas1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbLimpiarFechas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/brush_paint_icon_231542.png"))); // NOI18N
        jbLimpiarFechas1.setText("Limpiar");
        jbLimpiarFechas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarFechas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jbLimpiarFechas1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbLimpiarFechas1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTPestadistica.addTab("TICKETS EMITIDOS POR PELICULA", jPanel2);

        jLabel3.setText("SELECCIONE LA FECHA: ");

        jdcCompradores.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcCompradoresPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LISTA DE COMPRADORES");

        jTcompradoresPorFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTcompradoresPorFecha);

        jbLimpiarFechas2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbLimpiarFechas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/brush_paint_icon_231542.png"))); // NOI18N
        jbLimpiarFechas2.setText("Limpiar");
        jbLimpiarFechas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarFechas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jdcCompradores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jbLimpiarFechas2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcCompradores, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLimpiarFechas2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTPestadistica.addTab("COMPRADORES POR FECHA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPestadistica)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTPestadistica)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdcPorFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcPorFechaPropertyChange
        cargarTablaPorFecha();
    }//GEN-LAST:event_jdcPorFechaPropertyChange

    private void jcbPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPeliculasActionPerformed
        cargarTablaPorPeliculas();
    }//GEN-LAST:event_jcbPeliculasActionPerformed

    private void jbLimpiarFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarFechasActionPerformed
        modeloTicketsPorFecha.setRowCount(0);
    }//GEN-LAST:event_jbLimpiarFechasActionPerformed

    private void jdcCompradoresPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcCompradoresPropertyChange
        cargarTablaPorCompradores();
    }//GEN-LAST:event_jdcCompradoresPropertyChange

    private void jbLimpiarFechas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarFechas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarFechas1ActionPerformed

    private void jbLimpiarFechas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarFechas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarFechas2ActionPerformed

    public void cargarTablaPorCompradores(){
        List<TicketCompra> tickets = new ArrayList();
        try{
            LocalDate fechaFuncion = jdcCompradores.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            tickets = ticketD.listarTicketsPorFechaAsistida(fechaFuncion);
            for(TicketCompra aux : tickets){
                modeloCompradoresPorFecha.addRow(new Object []{
                    aux.getComprador().getDniComprador(),
                    aux.getComprador().getNombre(),
                    aux.getComprador().getFechaNacimiento(),
                    aux.getComprador().getMedioDePago()
                });
            }
        }catch(NullPointerException e){
            System.out.println("Control de error de compradores para la primera vez al iniciar la ventana");
        }
    }
            
    public void cargarTablaPorFecha(){
        List<TicketCompra> tickets = new ArrayList();
        try {
            LocalDate fecha = jdcPorFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fecha2 = fecha.plusDays(1);
            tickets = ticketD.listarTicketsPorFecha(fecha, fecha2);
            for (TicketCompra aux : tickets) {
                modeloTicketsPorFecha.addRow(new Object[] {
                    aux.getFechaCompra(),
                    aux.getFechaFuncion(),
                    aux.getComprador().getDniComprador(),
                    aux.getTipoCompra(),
                    aux.getCodigoVenta(),
                    aux.getMonto()
                });              
            }
        }catch(NullPointerException e){
            System.out.println("debe seleccionar una fecha");
        }
    }
    
    public void cargarTablaPorPeliculas(){
        String peliString = (String) jcbPeliculas.getSelectedItem();
        String[] partesPeli = peliString.split(",");
        int idPelicula = Integer.parseInt(partesPeli[0]);
        List<TicketCompra> tickets = ticketD.listarTicketPorPelicula(idPelicula);
        
        for(TicketCompra aux : tickets){
            modeloTicketsPorPeliculas.addRow(new Object[] {
                aux.getFechaCompra(),
                aux.getFechaFuncion(),
                aux.getComprador().getDniComprador(),
                aux.getTipoCompra(),
                aux.getCodigoVenta(),
                aux.getMonto()
            });
        } 
    }
    
    private void cargarComboPeliculas(){
        jcbPeliculas.addItem("1, Duna: Parte Dos");
        jcbPeliculas.addItem("2, Inside Out 2");
        jcbPeliculas.addItem("3, Joker: Folie à Deux");
        jcbPeliculas.addItem("4, Venom: The Last Dance");
        jcbPeliculas.addItem("5, La Sociedad de la Nieve");
        jcbPeliculas.addItem("6, Wicked");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTPestadistica;
    private javax.swing.JTable jTcompradoresPorFecha;
    private javax.swing.JTable jTticketsPorPelicula;
    private javax.swing.JTable jTtiketsPorFecha;
    private javax.swing.JButton jbLimpiarFechas;
    private javax.swing.JButton jbLimpiarFechas1;
    private javax.swing.JButton jbLimpiarFechas2;
    private javax.swing.JComboBox<String> jcbPeliculas;
    private com.toedter.calendar.JDateChooser jdcCompradores;
    private com.toedter.calendar.JDateChooser jdcPorFecha;
    // End of variables declaration//GEN-END:variables
}
