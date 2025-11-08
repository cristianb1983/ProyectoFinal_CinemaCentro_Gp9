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
    }


    Connection con = Conexion.buscarConexion();
    PeliculasData pelid = new PeliculasData(con);
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ADMINISTRACION - GESTION DE PELICULAS");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("GESTION DE PELICULAS");

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

        jBcargar.setText("CARGAR");
        jBcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcargarActionPerformed(evt);
            }
        });

        jBmodificar.setText("MODIFICAR");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBeliminar.setText("ELIMINAR");

        jLpelicula.setText("ID PELICULA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLenCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jRBsi)
                        .addGap(36, 36, 36)
                        .addComponent(jRBno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                        .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTdirector)
                                            .addComponent(jTactores)
                                            .addComponent(jTorigen)
                                            .addComponent(jTgenero, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                            .addComponent(jTtitulo)
                                            .addComponent(jDestreno, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFidPelicula))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jBcargar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcargar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcargar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private com.toedter.calendar.JDateChooser jDestreno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLactores;
    private javax.swing.JLabel jLdirector;
    private javax.swing.JLabel jLenCartelera;
    private javax.swing.JLabel jLestreno;
    private javax.swing.JLabel jLgenero;
    private javax.swing.JLabel jLorigen;
    private javax.swing.JLabel jLpelicula;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JRadioButton jRBno;
    private javax.swing.JRadioButton jRBsi;
    private javax.swing.JTextField jTFidPelicula;
    private javax.swing.JTextField jTactores;
    private javax.swing.JTextField jTdirector;
    private javax.swing.JTextField jTgenero;
    private javax.swing.JTextField jTorigen;
    private javax.swing.JTextField jTtitulo;
    // End of variables declaration//GEN-END:variables
}
