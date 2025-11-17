/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Pelicula;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import persistencias.Conexion;
import persistencias.PeliculasData;

/**
 *
 * @author crb_p
 */
public class VistaPeliculas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaPeliculas
     */
    public VistaPeliculas() {
        initComponents();
        Conexion.buscarConexion();
        cargarCombo();
    }


    Connection con = Conexion.buscarConexion();
    PeliculasData pelid = new PeliculasData(con);
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtitulo = new javax.swing.JLabel();
        jLdirector = new javax.swing.JLabel();
        jLactores = new javax.swing.JLabel();
        jLorigen = new javax.swing.JLabel();
        jLgenero = new javax.swing.JLabel();
        jLestreno = new javax.swing.JLabel();
        jLenCartelera = new javax.swing.JLabel();
        jTtitulo = new javax.swing.JTextField();
        jTdirector = new javax.swing.JTextField();
        jTactores = new javax.swing.JTextField();
        jTorigen = new javax.swing.JTextField();
        jTgenero = new javax.swing.JTextField();
        jDestreno = new com.toedter.calendar.JDateChooser();
        jRBsi = new javax.swing.JRadioButton();
        jRBno = new javax.swing.JRadioButton();
        jBcargar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLpelicula = new javax.swing.JLabel();
        jTFidPelicula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbOpciones = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ADMINISTRACION - GESTION DE PELICULAS");

        jLtitulo.setText("TITULO:");

        jLdirector.setText("DIRECTOR:");

        jLactores.setText("ACTORES:");

        jLorigen.setText("ORIGEN:");

        jLgenero.setText("GENERO:");

        jLestreno.setText("ESTRENO:");

        jLenCartelera.setText("EN CARTELERA:");

        jTgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTgeneroActionPerformed(evt);
            }
        });

        jRBsi.setText("SI");

        jRBno.setText("NO");

        jBcargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new_file_add_paper_icon_231603.png"))); // NOI18N
        jBcargar.setText("CARGAR");
        jBcargar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcargarActionPerformed(evt);
            }
        });

        jBmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pen_pencil_write_edit_icon_231611 (1).png"))); // NOI18N
        jBmodificar.setText("MODIFICAR");
        jBmodificar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash_can_rubish_paper_bin_icon_231400.png"))); // NOI18N
        jBeliminar.setText("ELIMINAR");
        jBeliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBeliminar.setIconTextGap(6);
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jLpelicula.setText("ID PELICULA:");

        jLabel2.setText("ELIJA UNA OPCION:");

        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("GESTION DE PELICULAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLenCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jRBsi)
                        .addGap(36, 36, 36)
                        .addComponent(jRBno)
                        .addGap(107, 322, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLdirector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addComponent(jLtitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLactores, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLgenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addComponent(jLorigen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLestreno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBmodificar)
                                        .addGap(57, 57, 57)
                                        .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTdirector)
                                        .addComponent(jTactores)
                                        .addComponent(jTorigen)
                                        .addComponent(jTgenero, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                        .addComponent(jTtitulo)
                                        .addComponent(jDestreno, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFidPelicula))))
                            .addComponent(jLpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBcargar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLpelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFidPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdirector, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdirector, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLactores, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTactores, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDestreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLestreno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLenCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBsi)
                    .addComponent(jRBno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcargar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTgeneroActionPerformed

    private void jBcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcargarActionPerformed
         if(jTtitulo.getText().trim().isEmpty() || jTdirector.getText().trim().isEmpty()|| jTactores.getText().trim().isEmpty()|| 
            jTorigen.getText().trim().isEmpty()|| jTgenero.getText().trim().isEmpty()|| jDestreno.getDate() == null){
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
            return;
        }
        if(!jRBsi.isSelected() && !jRBno.isSelected()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opcion de cartelera.");
            return;
        }
        try {
            String titulo = jTtitulo.getText();
            String director = jTdirector.getText();
            String actores = jTactores.getText();
            String origen = jTorigen.getText();
            String genero = jTgenero.getText();
            LocalDate estreno = jDestreno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            boolean enCartelera;
            if(jRBsi.isSelected()){
                enCartelera = true;
            }else{
                enCartelera = false;
            }
            Pelicula pel = new Pelicula(titulo, director, actores, origen, genero,estreno,enCartelera );
            if(pelid.cargarPelicula(pel)) {
                JOptionPane.showMessageDialog(this, "Pelicula guardada");
            }else{
                JOptionPane.showMessageDialog(this, "La pelicula ya existe");
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error de formato");
        }
    }//GEN-LAST:event_jBcargarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
         try {
            if (jTtitulo.getText().trim().isEmpty() || jTdirector.getText().trim().isEmpty()|| jTactores.getText().trim().isEmpty()||
                jTorigen.getText().trim().isEmpty()|| jTgenero.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se puedo realizar la actulizacion. Los campos no pueden estar vacios");
                return;
            }

            String titulo = jTtitulo.getText();
            String director = jTdirector.getText();
            String actores = jTactores.getText();
            String origen = jTorigen.getText();
            String genero = jTgenero.getText();
            LocalDate estreno = jDestreno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean enCartelera = jRBsi.isSelected();
            Pelicula peli = new Pelicula();
            peli.setTitulo(titulo);
            peli.setDirector(director);
            peli.setActores(actores);
            peli.setOrigen(origen);
            peli.setGenero(genero);
            peli.setEstreno(estreno);
            peli.setEnCartelera(enCartelera);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + e.getMessage());
        }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        int idPelicula = Integer.parseInt(jTFidPelicula.getText());
        pelid.EliminarPelicula(idPelicula);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
        String opciones = (String)jcbOpciones.getSelectedItem();
        switch(opciones){
            case "Cargar":
                jTFidPelicula.setEnabled(false);
                jTtitulo.setEnabled(true);
                jTdirector.setEnabled(true);
                jTactores.setEnabled(true);
                jTorigen.setEnabled(true);
                jTgenero.setEnabled(true);
                jDestreno.setEnabled(true);
                jRBsi.setEnabled(true);
                jRBno.setEnabled(true);
                jBcargar.setEnabled(true);
                jBmodificar.setEnabled(false);
                jBeliminar.setEnabled(false);
                break;
            case "Modificar":
                jTFidPelicula.setEnabled(true);
                jTtitulo.setEnabled(true);
                jTdirector.setEnabled(true);
                jTactores.setEnabled(true);
                jTorigen.setEnabled(true);
                jTgenero.setEnabled(true);
                jDestreno.setEnabled(true);
                jRBsi.setEnabled(true);
                jRBno.setEnabled(true);
                jBcargar.setEnabled(false);
                jBmodificar.setEnabled(true);
                jBeliminar.setEnabled(false);
                break;
            case "Eliminar":
                jTFidPelicula.setEnabled(true);
                jTtitulo.setEnabled(false);
                jTdirector.setEnabled(false);
                jTactores.setEnabled(false);
                jTorigen.setEnabled(false);
                jTgenero.setEnabled(false);
                jDestreno.setEnabled(false);
                jRBsi.setEnabled(false);
                jRBno.setEnabled(false);
                jBcargar.setEnabled(false);
                jBmodificar.setEnabled(false);
                jBeliminar.setEnabled(true);            
                break;
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed

    private void cargarCombo(){
        jcbOpciones.addItem("Cargar");
        jcbOpciones.addItem("Modificar");
        jcbOpciones.addItem("Eliminar");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcargar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private com.toedter.calendar.JDateChooser jDestreno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLactores;
    private javax.swing.JLabel jLdirector;
    private javax.swing.JLabel jLenCartelera;
    private javax.swing.JLabel jLestreno;
    private javax.swing.JLabel jLgenero;
    private javax.swing.JLabel jLorigen;
    private javax.swing.JLabel jLpelicula;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBno;
    private javax.swing.JRadioButton jRBsi;
    private javax.swing.JTextField jTFidPelicula;
    private javax.swing.JTextField jTactores;
    private javax.swing.JTextField jTdirector;
    private javax.swing.JTextField jTgenero;
    private javax.swing.JTextField jTorigen;
    private javax.swing.JTextField jTtitulo;
    private javax.swing.JComboBox<String> jcbOpciones;
    // End of variables declaration//GEN-END:variables
}
