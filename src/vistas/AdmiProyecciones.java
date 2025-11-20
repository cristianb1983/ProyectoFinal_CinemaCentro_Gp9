/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author julianEsquiaga
 */
import entidades.Proyeccion;
import entidades.Proyeccion;
import persistencias.ProyeccionData;
import entidades.Pelicula;
import entidades.Sala;
import persistencias.PeliculasData;
import persistencias.SalaData;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AdmiProyecciones extends javax.swing.JInternalFrame {
    
    ProyeccionData proyeccionD = new ProyeccionData();
    PeliculasData peliculasD = new PeliculasData();
    SalaData salaD = new SalaData();
    /**
     * Creates new form AdmiProyecciones
     */
    ProyeccionData ProyeccionD = new ProyeccionData();
    
    public AdmiProyecciones() {
        initComponents();
        cargarComboOpcion();
        cargarComboIdPeliculas();
        cargarComboIdSalas();
        }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jpDatos = new javax.swing.JPanel();
        jlIdProyeccion = new javax.swing.JLabel();
        jlIdPelicula = new javax.swing.JLabel();
        jlIdSala = new javax.swing.JLabel();
        jlIdioma = new javax.swing.JLabel();
        jlSubtitulada = new javax.swing.JLabel();
        jtfIdProyeccion = new javax.swing.JTextField();
        jtfIdioma = new javax.swing.JTextField();
        jtfHoraInicio = new javax.swing.JTextField();
        jlHoraDeFin = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jlPrecio = new javax.swing.JLabel();
        jrbSISubtitulada = new javax.swing.JRadioButton();
        jrbNoSubtitulada = new javax.swing.JRadioButton();
        jrbNoEs3d = new javax.swing.JRadioButton();
        jrbSIEs3d = new javax.swing.JRadioButton();
        jlEs3d = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2idPelicula = new javax.swing.JComboBox<>();
        jComboBox3idSala = new javax.swing.JComboBox<>();
        ComboBoxOpciones = new javax.swing.JComboBox<>();
        jlHoraDeInicio = new javax.swing.JLabel();
        jtfHoraFin = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ADMINISTRACION - CARGA DE PROYECCIONES");

        jButtonBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/zoom_magnyfying_glass_search_icon_231650.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/brush_paint_icon_231542.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash_can_rubish_paper_bin_icon_231400.png"))); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jpDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlIdProyeccion.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlIdProyeccion.setText("idProyeccion");

        jlIdPelicula.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlIdPelicula.setText("idPelicula");

        jlIdSala.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlIdSala.setText("idSala");

        jlIdioma.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlIdioma.setText("idioma");

        jlSubtitulada.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlSubtitulada.setText("subtitulada");

        jtfIdProyeccion.setCaretColor(new java.awt.Color(0, 51, 204));

        jtfIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdiomaActionPerformed(evt);
            }
        });

        jtfHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHoraInicioActionPerformed(evt);
            }
        });

        jlHoraDeFin.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlHoraDeFin.setText("hora del fin");

        jlPrecio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlPrecio.setText("Precio del lugar");

        jrbSISubtitulada.setText("Si");

        jrbNoSubtitulada.setText("No");

        jrbNoEs3d.setText("No");

        jrbSIEs3d.setText("Si");

        jlEs3d.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlEs3d.setText("es 3D");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("elija una opcion ");

        jComboBox2idPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3idSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlHoraDeInicio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlHoraDeInicio.setText("hora de inicio");

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSubtitulada)
                                    .addComponent(jlEs3d))
                                .addGap(1, 1, 1)
                                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpDatosLayout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jrbNoEs3d))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jrbNoSubtitulada))))
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIdPelicula)
                            .addComponent(jlHoraDeInicio))
                        .addGap(40, 40, 40)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2idPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbSISubtitulada)
                                    .addComponent(jrbSIEs3d))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIdSala)
                    .addComponent(jlIdProyeccion)
                    .addComponent(jlIdioma)
                    .addComponent(jlHoraDeFin)
                    .addComponent(jlPrecio))
                .addGap(29, 29, 29)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3idSala, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlIdProyeccion)
                            .addComponent(jtfIdProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdSala)
                    .addComponent(jlIdPelicula)
                    .addComponent(jComboBox2idPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3idSala, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSubtitulada)
                    .addComponent(jrbSISubtitulada)
                    .addComponent(jrbNoSubtitulada)
                    .addComponent(jlIdioma)
                    .addComponent(jtfIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHoraDeFin)
                    .addComponent(jlHoraDeInicio)
                    .addComponent(jtfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEs3d)
                    .addComponent(jrbSIEs3d)
                    .addComponent(jrbNoEs3d)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecio))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jbGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/new_file_add_paper_icon_231603.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Proyecciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void jrbSIEs3dActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jrbSIEs3d.setSelected(false);
        jrbSIEs3d.setEnabled(false);
        }     
        private void jrbNoEs3dActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jrbNoEs3d.setSelected(false);
        jrbNoEs3d.setEnabled(false);
        }  
        private void SISubtituladaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jrbSISubtitulada.setSelected(false);
        jrbSISubtitulada.setEnabled(false);
        }     
        private void jrbNoSubtituladActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jrbNoSubtitulada.setSelected(false);
        jrbNoSubtitulada.setEnabled(false);
        }  
            
    private void jtfHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHoraInicioActionPerformed

    private void jtfIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdiomaActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
         int idProyeccion = Integer.parseInt(jtfIdProyeccion.getText());
         ProyeccionD.borrarProyeccion(idProyeccion);
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        jtfIdProyeccion.setText("");
        jtfHoraFin.setText("");
        jtfHoraInicio.setText("");
        jtfIdioma.setText("");
        jtfPrecio.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        boolean seleccion;
        
        if (jrbSIEs3d.isSelected()) {
            seleccion = false;
        }else{
            seleccion = true;
        }
        
        boolean seleccionSubtitulada;
        
        if (jrbSISubtitulada.isSelected()) {
            seleccionSubtitulada = false;
        }else{
            seleccionSubtitulada = true;
        }
    
        
        try {
            
            int idProy = Integer.parseInt(jtfIdProyeccion.getText());
            String idioma = jtfIdioma.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            String horaInicio = jtfHoraInicio.getText();
            LocalTime hora = LocalTime.parse(horaInicio, formatter);
            String horaFin = jtfHoraFin.getText();
            LocalTime hora2 = LocalTime.parse(horaFin, formatter);
            int idSala = Integer.parseInt((String) jComboBox3idSala.getSelectedItem());
            double precio = Double.parseDouble(jtfPrecio.getText());

            
            Proyeccion proyec = new Proyeccion(idProy, idioma, seleccion, seleccionSubtitulada, hora, hora2, idSala, precio);
            ProyeccionD.crearProyeccion(proyec);
            JOptionPane.showMessageDialog(this, "Proyeccion Guardada");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error de formato");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error");
        }
                    
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        int idProy = Integer.parseInt(jtfIdProyeccion.getText());
        
        Pelicula peli = new Pelicula();
        int pelicula = Integer.parseInt((String) jComboBox2idPelicula.getSelectedItem());
        peli.setIdPelicula(pelicula);
        
        Sala sala = new Sala();
        int idSala = Integer.parseInt((String) jComboBox3idSala.getSelectedItem());
        sala.setIdSala(idSala);
        
        String idioma = jtfIdioma.getText();
        
        String horaInicio = jtfHoraInicio.getText();      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaInicioParseo = LocalTime.parse(horaInicio, formatter);
        
        String horaFin = jtfHoraFin.getText();
        LocalTime horaFinParseo = LocalTime.parse(horaFin, formatter);
        
        double precio = Double.parseDouble(jtfPrecio.getText());
        boolean es3D;
        boolean subtitulada;
        if(jrbSIEs3d.isSelected()){
            es3D = true;
        }else{
            es3D = false;
        }
        if(jrbSISubtitulada.isSelected()){
            subtitulada = true;
        }else{
            subtitulada = false;
        }
        Proyeccion proy = new Proyeccion();
        proy.setIdProyeccion(idProy);
        proy.setSala(sala);
        proy.setPelicula(peli);
        proy.setHoraInicio(horaFinParseo);
        proy.setHoraFin(horaFinParseo);
        proy.setEs3D(es3D);
        proy.setIdioma(idioma);
        proy.setPrecio(precio);
        proy.setSubtitulada(subtitulada);
        proyeccionD.actualizarProyeccion(proy);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       // TODO add your handling code here:
        //valido que no este vacio el campo idproyeccion
        if (jtfIdProyeccion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un idProyeccion para buscar.");
            return;
        }
        
        try {
            int idProyeccion = Integer.parseInt(jtfIdProyeccion.getText());
            Proyeccion proy = proyeccionD.buscarProyeccion(idProyeccion);

            if (proy == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la proyección.");
                return;
            }

            //carga datos
            if (proy.getPelicula() != null) {
                jComboBox2idPelicula.setSelectedItem(String.valueOf(proy.getPelicula().getIdPelicula()));
            }

            if (proy.getSala() != null) {
                jComboBox3idSala.setSelectedItem(String.valueOf(proy.getSala().getIdSala()));
            }

            jtfIdioma.setText(proy.getIdioma());

            if (proy.isSubtitulada()) {
                jrbSISubtitulada.setSelected(true);
                jrbNoSubtitulada.setSelected(false);
            } else {
                jrbSISubtitulada.setSelected(false);
                jrbNoSubtitulada.setSelected(true);
            }

            if (proy.isEs3D()) {
                jrbSIEs3d.setSelected(true);
                jrbNoEs3d.setSelected(false);
            } else {
                jrbSIEs3d.setSelected(false);
                jrbNoEs3d.setSelected(true);
            }

            if (proy.getHoraInicio() != null) {
                jtfHoraInicio.setText(proy.getHoraInicio().toString());
            }

            if (proy.getHoraFin() != null) {
                jtfHoraFin.setText(proy.getHoraFin().toString());
            }

            jtfPrecio.setText(String.valueOf(proy.getPrecio()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID Invalido: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la proyeccion.");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

   
        
       
    
     private void cargarComboOpcion(){
        ComboBoxOpciones.removeAllItems();
        ComboBoxOpciones.addItem("Guardar");
        ComboBoxOpciones.addItem("Modificar");
        ComboBoxOpciones.addItem("Eliminar");
    }
     private void cargarComboIdPeliculas(){
        jComboBox2idPelicula.removeAllItems();
        List<Pelicula> peliculas = peliculasD.listarPeliculasenCartelera();
        for(Pelicula aux : peliculas){
        jComboBox2idPelicula.addItem(String.valueOf(aux.getIdPelicula()));
    }
    }
     
     private void cargarComboIdSalas(){
        jComboBox3idSala.removeAllItems();
        List<Sala> salas = salaD.listadoSalas();
        for(Sala aux : salas){
        jComboBox3idSala.addItem(String.valueOf(aux.getIdSala()));
    }
    }
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxOpciones;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboBox2idPelicula;
    private javax.swing.JComboBox<String> jComboBox3idSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JLabel jlEs3d;
    private javax.swing.JLabel jlHoraDeFin;
    private javax.swing.JLabel jlHoraDeInicio;
    private javax.swing.JLabel jlIdPelicula;
    private javax.swing.JLabel jlIdProyeccion;
    private javax.swing.JLabel jlIdSala;
    private javax.swing.JLabel jlIdioma;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlSubtitulada;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JRadioButton jrbNoEs3d;
    private javax.swing.JRadioButton jrbNoSubtitulada;
    private javax.swing.JRadioButton jrbSIEs3d;
    private javax.swing.JRadioButton jrbSISubtitulada;
    private javax.swing.JTextField jtfHoraFin;
    private javax.swing.JTextField jtfHoraInicio;
    private javax.swing.JTextField jtfIdProyeccion;
    private javax.swing.JTextField jtfIdioma;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}
