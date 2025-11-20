/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.DetalleTicket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencias.DetalleTicketData;

/**
 *
 * @author crb_p
 */
public class VistaDetalleTicket extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla = new DefaultTableModel();
    DetalleTicketData detalleD = new DetalleTicketData();
    public VistaDetalleTicket() {
        initComponents();
        tablaCabecera();
        borrarFilasDeTabla();
        cargarCombo();
    }

   private void borrarFilasDeTabla() {
        int indice = modeloTabla.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    private void tablaCabecera() {
        ArrayList<Object> filaCabercera = new ArrayList<>();
        modeloTabla.addColumn("Pelicula");
        modeloTabla.addColumn("Sala");
        modeloTabla.addColumn("Lugar");
        modeloTabla.addColumn("Cantidad de Tickets");
        modeloTabla.addColumn("Hora de inicio");
        modeloTabla.addColumn("Hora de fin");
        modeloTabla.addColumn("Fecha de funcion");
        modeloTabla.addColumn("Subtotal");
        for (Object it : filaCabercera) {
            modeloTabla.addColumn(it);
        }
        jTdetalleCompra.setModel(modeloTabla);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdetalleCompra = new javax.swing.JTable();
        jtfDni = new javax.swing.JTextField();
        jtfIdCompra = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbOpciones = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("DETALLES DE COMPRA");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLES DE LA COMPRA");

        jLabel2.setText("BUSCAR POR ID DE COMPRA:");

        jLabel3.setText("BUSCAR POR DNI :");

        jTdetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTdetalleCompra);

        jtfDni.setEnabled(false);

        jtfIdCompra.setEnabled(false);
        jtfIdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdCompraActionPerformed(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/zoom_magnyfying_glass_search_icon_231650.png"))); // NOI18N
        jBbuscar.setText("BUSCAR");
        jBbuscar.setIconTextGap(28);
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Elija una opcion");

        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jcbOpciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(250, 250, 250)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdCompraActionPerformed

    }//GEN-LAST:event_jtfIdCompraActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        modeloTabla.setRowCount(0);
        String opciones = (String) jcbOpciones.getSelectedItem();
        try {
            switch(opciones){
                case "Buscar por id de compra":
                    if(!jtfIdCompra.getText().trim().isEmpty()){
                        int idTicket = Integer.parseInt(jtfIdCompra.getText());
                        List<DetalleTicket> detalles = detalleD.listarDetallePorCodigoVenta(idTicket);
                        if(!detalles.isEmpty()){
                            modeloTabla.setRowCount(0);
                            for(DetalleTicket aux : detalles){
                                modeloTabla.addRow(new Object[] {
                                    aux.getProyeccion().getPelicula().getTitulo(),
                                    aux.getProyeccion().getSala().getNroSala(),
                                    aux.getLugares(),
                                    aux.getCantidad(),
                                    aux.getProyeccion().getHoraInicio(),
                                    aux.getProyeccion().getHoraFin(),
                                    aux.getTicket().getFechaFuncion(),
                                    aux.getSubtotal()
                                });
                            } 
                        }else {
                            JOptionPane.showMessageDialog(this, "El id " + idTicket + " de compra no existe");
                        }
                    }else {
                        JOptionPane.showMessageDialog(this, "Debe llenar el campo");
                    }    
                    break;
                case "Buscar por dni":
                    if(!jtfDni.getText().trim().isEmpty()){
                        int dni = Integer.parseInt(jtfDni.getText());
                        List<DetalleTicket> detallesPorDni = detalleD.buscarDetallePorComprador(dni);
                        if(!detallesPorDni.isEmpty()){
                            modeloTabla.setRowCount(0);
                            for(DetalleTicket aux : detallesPorDni){
                                modeloTabla.addRow(new Object[] {
                                    aux.getProyeccion().getPelicula().getTitulo(),
                                    aux.getProyeccion().getSala().getNroSala(),
                                    aux.getLugares(),
                                    aux.getCantidad(),
                                    aux.getProyeccion().getHoraInicio(),
                                    aux.getProyeccion().getHoraFin(),
                                    aux.getTicket().getFechaFuncion(),
                                    aux.getSubtotal()
                                });
                            }    
                        }else {
                            JOptionPane.showMessageDialog(this, "El dni " + dni + " no existe");
                        }
                    }else {
                        JOptionPane.showMessageDialog(this, "Debe llenar el campo");
                    }    
                    break;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error de formato");
        }    
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
        String opciones = (String) jcbOpciones.getSelectedItem();
        switch(opciones){
            case "Buscar por id de compra":
                jtfIdCompra.setEnabled(true);
                jtfDni.setEnabled(false);
                break;
            case "Buscar por dni":
                jtfIdCompra.setEnabled(false);
                jtfDni.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed
    
    private void cargarCombo(){
        jcbOpciones.addItem("Buscar por id de compra");
        jcbOpciones.addItem("Buscar por dni");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTdetalleCompra;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfIdCompra;
    // End of variables declaration//GEN-END:variables
}
