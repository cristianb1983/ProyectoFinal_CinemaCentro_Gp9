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
import entidades.DetalleTicket;
import entidades.Proyeccion;
import persistencias.ProyeccionData;
import entidades.Pelicula;
import entidades.Sala;
import persistencias.PeliculasData;
import persistencias.SalaData;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencias.DetalleTicketData;
import persistencias.TicketData;

public class AdmiProyecciones extends javax.swing.JInternalFrame {

    ProyeccionData proyeccionD = new ProyeccionData();
    PeliculasData peliculasD = new PeliculasData();
    SalaData salaD = new SalaData();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    ProyeccionData ProyeccionD = new ProyeccionData();
    DetalleTicketData detalleD = new DetalleTicketData();
    TicketData ticketD = new TicketData();

    public AdmiProyecciones() {
        initComponents();
        cargarComboOpcion();
        cargarComboIdPeliculas();
        cargarComboIdSalas();
        cargarColumnas();
         ButtonGroup grupo3D = new ButtonGroup();
    grupo3D.add(jrbSIEs3d);
    grupo3D.add(jrbNoEs3d);

    ButtonGroup grupoSub = new ButtonGroup();
    grupoSub.add(jrbSISubtitulada);
    grupoSub.add(jrbNoSubtitulada);
    }

    void cargarColumnas() {
        modeloTabla.addColumn("id-Proyeccion");
        modeloTabla.addColumn("id-Pelicula");
        modeloTabla.addColumn("id-Sala");
        modeloTabla.addColumn("Idioma");
        modeloTabla.addColumn("es3D?");
        modeloTabla.addColumn("Subtitulada");
        modeloTabla.addColumn("Hora de Inicio");
        modeloTabla.addColumn("Hora de Finalizacion");
        modeloTabla.addColumn("Precio");
        jTmostrarProyecciones.setModel(modeloTabla);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTmostrarProyecciones = new javax.swing.JTable();
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
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pen_pencil_write_edit_icon_231611 (1).png"))); // NOI18N
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
        jButtonBorrar.setText("Eliminar");
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

        ComboBoxOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxOpcionesActionPerformed(evt);
            }
        });

        jlHoraDeInicio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlHoraDeInicio.setText("hora de inicio");

        jTmostrarProyecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTmostrarProyecciones);

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlSubtitulada)
                    .addComponent(jlEs3d)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIdPelicula)
                            .addComponent(jlHoraDeInicio))
                        .addGap(40, 40, 40)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2idPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addComponent(jrbSIEs3d)
                                .addGap(18, 18, 18)
                                .addComponent(jrbNoEs3d))
                            .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jpDatosLayout.createSequentialGroup()
                                    .addComponent(jrbSISubtitulada)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbNoSubtitulada))
                                .addComponent(jtfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpDatosLayout.createSequentialGroup()
                        .addComponent(jlPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addComponent(jlIdSala)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3idSala, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addComponent(jlIdProyeccion)
                                .addGap(28, 28, 28)
                                .addComponent(jtfIdProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIdioma)
                            .addComponent(jlHoraDeFin))
                        .addGap(43, 43, 43)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIdProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlIdProyeccion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbActualizar)
                                .addGap(52, 52, 52)
                                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
        try {
            int idProyeccion = Integer.parseInt(jtfIdProyeccion.getText());
            DetalleTicket detalle = detalleD.buscarDetalleTicketPorProyeccion(idProyeccion);
            int idTicket = detalle.getTicket().getIdTicket();
            ticketD.anularTicket2(idTicket);
            ProyeccionD.borrarProyeccion(idProyeccion);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "No se pudo borrar la proyeccion");
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfIdProyeccion.setText("");
        jtfHoraFin.setText("");
        jtfHoraInicio.setText("");
        jtfIdioma.setText("");
        jtfPrecio.setText("");
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (jtfIdioma.getText().trim().isEmpty()
                || jtfHoraInicio.getText().trim().isEmpty()
                || jtfHoraFin.getText().trim().isEmpty()
                || jtfPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
            return;
        }

        try {
            int idPelicula = Integer.parseInt((String) jComboBox2idPelicula.getSelectedItem());
            int idSala = Integer.parseInt((String) jComboBox3idSala.getSelectedItem());
            

            Pelicula peli = new Pelicula();
            peli.setIdPelicula(idPelicula);

            Sala sala = new Sala();
            sala.setIdSala(idSala);

            String idioma = jtfIdioma.getText();
            double precio = Double.parseDouble(jtfPrecio.getText());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime horaInicio = LocalTime.parse(jtfHoraInicio.getText(), formatter);
            LocalTime horaFin = LocalTime.parse(jtfHoraFin.getText(), formatter);

            boolean es3D = jrbSIEs3d.isSelected();
            boolean subtitulada = jrbSISubtitulada.isSelected();

            Proyeccion proyeccion = new Proyeccion(peli, idioma, es3D, subtitulada, horaInicio, horaFin, sala, precio);
            ProyeccionD.crearProyeccion(proyeccion);
            JOptionPane.showMessageDialog(this, "Proyeccion Guardada");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de formato");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Error");
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
//      
       if (jtfIdioma.getText().trim().isEmpty()
                || jtfHoraInicio.getText().trim().isEmpty()
                || jtfHoraFin.getText().trim().isEmpty()
                || jtfPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
            return;
        }

        try {
            int idPelicula = Integer.parseInt((String) jComboBox2idPelicula.getSelectedItem());
            int idSala = Integer.parseInt((String) jComboBox3idSala.getSelectedItem());
            int idProyeccion = Integer.parseInt(jtfIdProyeccion.getText());

            Pelicula peli = new Pelicula();
            peli.setIdPelicula(idPelicula);

            Sala sala = new Sala();
            sala.setIdSala(idSala);

            String idioma = jtfIdioma.getText();
            
            double precio = Double.parseDouble(jtfPrecio.getText());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime horaInicio = LocalTime.parse(jtfHoraInicio.getText(), formatter);
            LocalTime horaFin = LocalTime.parse(jtfHoraFin.getText(), formatter);

            boolean es3D ;
             if(jrbSIEs3d.isSelected()){
                es3D = true;
            }else{
                es3D = false;
            }
            boolean subtitulada = jrbSISubtitulada.isSelected();

            Proyeccion proy = new Proyeccion();
            proy.setIdProyeccion(idProyeccion);
            proy.setPelicula(peli);
            proy.setSala(sala);
            proy.setEs3D(es3D);
            proy.setHoraInicio(horaInicio);
            proy.setHoraFin(horaFin);
            proy.setIdioma(idioma);
            proy.setPrecio(precio);
            proy.setSubtitulada(subtitulada);
            
            ProyeccionD.actualizarProyeccion(proy);
            JOptionPane.showMessageDialog(this, "Proyeccion Actualizada");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de formato");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Error");
        }

//int idProy = Integer.parseInt(jtfIdProyeccion.getText());
//
//        Pelicula peli = new Pelicula();
//        int pelicula = Integer.parseInt((String) jComboBox2idPelicula.getSelectedItem());
//        peli.setIdPelicula(pelicula);
//
//        Sala sala = new Sala();
//        int idSala = Integer.parseInt((String) jComboBox3idSala.getSelectedItem());
//        sala.setIdSala(idSala);
//
//        String idioma = jtfIdioma.getText();
//
//        String horaInicio = jtfHoraInicio.getText();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//        LocalTime horaInicioParseo = LocalTime.parse(horaInicio, formatter);
//
//        String horaFin = jtfHoraFin.getText();
//        LocalTime horaFinParseo = LocalTime.parse(horaFin, formatter);
//
//        double precio = Double.parseDouble(jtfPrecio.getText());
//        boolean es3D;
//        boolean subtitulada;
//        if (jrbSIEs3d.isSelected()) {
//            es3D = true;
//        } else {
//            es3D = false;
//        }
//        if (jrbSISubtitulada.isSelected()) {
//            subtitulada = true;
//        } else {
//            subtitulada = false;
//        }
//        Proyeccion proy = new Proyeccion();
//        proy.setIdProyeccion(idProy);
//        proy.setSala(sala);
//        proy.setPelicula(peli);
//        proy.setHoraInicio(horaFinParseo);
//        proy.setHoraFin(horaFinParseo);
//        proy.setEs3D(es3D);
//        proy.setIdioma(idioma);
//        proy.setPrecio(precio);
//        proy.setSubtitulada(subtitulada);
//        proyeccionD.actualizarProyeccion(proy);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void ComboBoxOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxOpcionesActionPerformed

        String opciones = (String) ComboBoxOpciones.getSelectedItem();
        switch (opciones) {
            case "Guardar":
                jtfIdProyeccion.setEnabled(false);
                jComboBox2idPelicula.setEnabled(true);
                jComboBox3idSala.setEnabled(true);
                jrbSIEs3d.setEnabled(true);
                jrbNoEs3d.setEnabled(true);
                jrbSISubtitulada.setEnabled(true);
                jrbNoSubtitulada.setEnabled(true);
                jtfIdioma.setEnabled(true);
                jtfHoraInicio.setEnabled(true);
                jtfHoraFin.setEnabled(true);
                jtfIdioma.setEnabled(true);
                jtfPrecio.setEnabled(true);
                jButtonBorrar.setEnabled(false);
                jButtonBuscar.setEnabled(false);
                jbGuardar.setEnabled(true);
                jbActualizar.setEnabled(false);
                jbLimpiar.setEnabled(true);
                break;
            case "Actualizar":
                jtfIdProyeccion.setEnabled(true);
                jComboBox2idPelicula.setEnabled(true);
                jComboBox3idSala.setEnabled(true);
                jrbSIEs3d.setEnabled(true);
                jrbNoEs3d.setEnabled(true);
                jrbSISubtitulada.setEnabled(true);
                jrbNoSubtitulada.setEnabled(true);
                jtfIdioma.setEnabled(true);
                jtfHoraInicio.setEnabled(true);
                jtfHoraFin.setEnabled(true);
                jtfIdioma.setEnabled(true);
                jtfPrecio.setEnabled(true);
                jButtonBorrar.setEnabled(false);
                jButtonBuscar.setEnabled(false);
                jbGuardar.setEnabled(false);
                jbActualizar.setEnabled(true);
                jbLimpiar.setEnabled(true);
                break;
            case "Eliminar":
                jtfIdProyeccion.setEnabled(true);
                jComboBox2idPelicula.setEnabled(false);
                jComboBox3idSala.setEnabled(false);
                jrbSIEs3d.setEnabled(false);
                jrbNoEs3d.setEnabled(false);
                jrbSISubtitulada.setEnabled(false);
                jrbNoSubtitulada.setEnabled(false);
                jtfIdioma.setEnabled(false);
                jtfHoraInicio.setEnabled(false);
                jtfHoraFin.setEnabled(false);
                jtfIdioma.setEnabled(false);
                jtfPrecio.setEnabled(false);
                jButtonBorrar.setEnabled(true);
                jButtonBuscar.setEnabled(false);
                jbGuardar.setEnabled(false);
                jbActualizar.setEnabled(false);
                jbLimpiar.setEnabled(true);
                break;
            case "Buscar":
                jtfIdProyeccion.setEnabled(true);
                jComboBox2idPelicula.setEnabled(false);
                jComboBox3idSala.setEnabled(false);
                jrbSIEs3d.setEnabled(false);
                jrbNoEs3d.setEnabled(false);
                jrbSISubtitulada.setEnabled(false);
                jrbNoSubtitulada.setEnabled(false);
                jtfIdioma.setEnabled(false);
                jtfHoraInicio.setEnabled(false);
                jtfHoraFin.setEnabled(false);
                jtfIdioma.setEnabled(false);
                jtfPrecio.setEnabled(false);
                jButtonBorrar.setEnabled(false);
                jButtonBuscar.setEnabled(true);
                jbGuardar.setEnabled(false);
                jbActualizar.setEnabled(false);
                jbLimpiar.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_ComboBoxOpcionesActionPerformed


    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {
       
        if (jtfIdProyeccion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un idProyeccion para buscar.");
            return;
        }

        try {
            int idProyeccion = Integer.parseInt(jtfIdProyeccion.getText());
            Proyeccion p = new Proyeccion();
            p = ProyeccionD.buscarProyeccion(idProyeccion);
            modeloTabla.addRow(new Object[]{
                p.getIdProyeccion(),
                p.getPeliculaID(),
                p.getSalaID(),
                p.getIdioma(),
                p.isEs3D(),
                p.isSubtitulada(),
                p.getHoraInicio(),
                p.getHoraFin(),
                p.getPrecio(),
            });

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID Invalido: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la proyeccion.");
        }
    }

    private void cargarComboOpcion() {
//        ComboBoxOpciones.removeAllItems();
        ComboBoxOpciones.addItem("Guardar");
        ComboBoxOpciones.addItem("Actualizar");
        ComboBoxOpciones.addItem("Eliminar");
        ComboBoxOpciones.addItem("Buscar");
    }

    private void cargarComboIdPeliculas() {
        jComboBox2idPelicula.removeAllItems();
        List<Pelicula> peliculas = peliculasD.listarPeliculasenCartelera();
        for (Pelicula aux : peliculas) {
            jComboBox2idPelicula.addItem(String.valueOf(aux.getIdPelicula()));
        }
    }

    private void cargarComboIdSalas() {
        jComboBox3idSala.removeAllItems();
        List<Sala> salas = salaD.listadoSalas();
        for (Sala aux : salas) {
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTmostrarProyecciones;
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
