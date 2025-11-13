/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.TicketCompra;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencias.TicketData;

/**
 *
 * @author crb_p
 */
public class GestionTikets extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla = new DefaultTableModel();
    TicketData ticketD = new TicketData();
    public GestionTikets() {
        initComponents();
        tablaCabecera();
        borrarFilasDeTabla();
    }

   

    private void borrarFilasDeTabla() {
        int indice = modeloTabla.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    private void tablaCabecera() {
        ArrayList<Object> filaCabercera = new ArrayList<>();
        modeloTabla.addColumn("id Ticket");
        modeloTabla.addColumn("Fecha de Compra");
        modeloTabla.addColumn("Fecha de Funcion");
        modeloTabla.addColumn("DNI comprador");
        modeloTabla.addColumn("Tipo de Compra");
        modeloTabla.addColumn("Codigo de Venta");
        modeloTabla.addColumn("monto");
        for (Object it : filaCabercera) {
            modeloTabla.addColumn(it);
        }
        jtTickets.setModel(modeloTabla);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfIdCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTickets = new javax.swing.JTable();
        jbLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ADMINISTRACION - GESTION DE TICKETS");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Tickets");

        jtfIdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdCompraActionPerformed(evt);
            }
        });

        jLabel2.setText("BUSCAR POR ID DE COMPRA:");

        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setIconTextGap(22);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtTickets.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTickets);

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese y presione enter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpiar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminar)))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbLimpiar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdCompraActionPerformed
        if(jtfIdCompra.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar el id del ticket");
            return;
        }
        try {
            int idTicket = Integer.parseInt(jtfIdCompra.getText());
            TicketCompra ticket = ticketD.buscarTicketPorId(idTicket);
            modeloTabla.addRow(new Object [] {
                ticket.getIdTicket(),
                ticket.getFechaCompra(),
                ticket.getFechaFuncion(),
                ticket.getComprador().getDniComprador(),
                ticket.getTipoCompra(),
                ticket.getCodigoVenta(),
                ticket.getMonto()
            });
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "El id ingresado no existe");
        }
    }//GEN-LAST:event_jtfIdCompraActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if(jtfIdCompra.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar un id");
            return;
        }
        try {
            int idTicket = Integer.parseInt(jtfIdCompra.getText());
            if(ticketD.anularTicket(idTicket)){
                JOptionPane.showMessageDialog(this, "Ticket eliminado");
            }else {
                JOptionPane.showMessageDialog(this, "Ticket no encontrado");
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "No se pudo eliminar");
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTable jtTickets;
    private javax.swing.JTextField jtfIdCompra;
    // End of variables declaration//GEN-END:variables
}
