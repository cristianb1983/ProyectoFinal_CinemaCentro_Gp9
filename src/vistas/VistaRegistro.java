/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Comprador;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencias.CompradorData;
import persistencias.Conexion;

/**
 *
 * @author crb_p
 */
public class VistaRegistro extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaRegistro
     */
    public VistaRegistro() {
       initComponents();
       cargarComboOpcion();
       Conexion.buscarConexion();
       setearFecha();
    }

    Connection con= Conexion.buscarConexion();
    CompradorData compD = new CompradorData(con);  
 
    private boolean validarCampos() {

    if (!jtfDni.getText().matches("[\\d+]+")) {
        JOptionPane.showMessageDialog(this, "El DNI debe contener solo números.");
        jtfDni.setText("");
       return false;
    }
     if (!jtfNombre.getText().matches("[a-zA-Z ]+")) {
        JOptionPane.showMessageDialog(this, "El nombre del titular solo puede contener letras."); 
        jtfNombre.setText("");
        return false;
    }
       return true;
    }
    
    private void limpiarCampos() {
    jtfDni.setText("");
    jtfNombre.setText("");
    jPFpassword.setText("");
    jCBmedioPago.setSelectedIndex(0); // si tu combo tiene un "Seleccione..."
    jDCfechaNac.setDate(null);        // limpia la fecha
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbRegistrar = new javax.swing.JButton();
        jpDatos = new javax.swing.JPanel();
        jlDni = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlNac = new javax.swing.JLabel();
        jlPass = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDCfechaNac = new com.toedter.calendar.JDateChooser();
        jPFpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jCBmedioPago = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jBlimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FORMULARIO DE REGISTRO");

        jbRegistrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tick_ok_correct_icon_231639.png"))); // NOI18N
        jbRegistrar.setText("ENVIAR");
        jbRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbRegistrar.setIconTextGap(24);
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jpDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 51, 255)));

        jlDni.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlDni.setText("Dni:");

        jlNombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNombre.setText("Nombre:");

        jlNac.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNac.setText("Fecha de nac:");

        jlPass.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlPass.setText("Password:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Medio de Pago");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/question_help_17841.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCBmedioPago.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCBmedioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBmedioPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNombre)
                    .addComponent(jlDni)
                    .addComponent(jlNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlPass))
                .addGap(30, 30, 30)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDCfechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPFpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBmedioPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(jlDni)
                        .addGap(39, 39, 39)
                        .addComponent(jlNombre)))
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jlNac)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDCfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlPass)
                        .addComponent(jPFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCBmedioPago)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Complete con sus Datos");

        jBlimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBlimpiar.setForeground(new java.awt.Color(51, 51, 51));
        jBlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash_can_rubish_paper_bin_icon_231400.png"))); // NOI18N
        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jBlimpiar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jpDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        if((jtfDni.getText().isEmpty())|| (jtfNombre.getText().isEmpty())|| (jDCfechaNac.getDate()== null)
            || (new String(jPFpassword.getPassword()).isEmpty())){
            
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
            jtfDni.requestFocus();
            return;
        }
        if (!validarCampos()) {
    return;
}

        try{
            long dni = Long.parseLong(jtfDni.getText());
            String nombre = jtfNombre.getText();
            LocalDate fechaNacimiento = jDCfechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String password = new String(jPFpassword.getPassword());
            String medioPago = (String) jCBmedioPago.getSelectedItem();

            
             String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";
        if (!password.matches(regex)) {
            JOptionPane.showMessageDialog(this, 
                "La contraseña debe tener al menos:\n" +
                "- Una letra mayúscula\n" +
                "- Una letra minúscula\n" +
                "- Un número\n" +
                "- Un símbolo especial (@$!%*?&)\n" +
                "- Mínimo 8 caracteres");

            jPFpassword.setText("");        // Limpia el campo
            jPFpassword.requestFocus();     // Enfoca el campo
            return;
        }
            Comprador comprador = new Comprador(dni,nombre,fechaNacimiento,password,medioPago);
            if (compD.RegistrarComprador(comprador)) {
                JOptionPane.showMessageDialog(this, "Usuario registrado con exito!!!");
                 limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(this, "el Usuario ya existe.");
                limpiarCampos();
            }
            }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El dni solo debe poseer numeros.");
    }       catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error de conexion");
    }          

    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, 
                "La contraseña debe tener al menos:\n" +
                "- Una letra mayúscula\n" +
                "- Una letra minúscula\n" +
                "- Un número\n" +
                "- Un símbolo especial (@$!%*?&)\n" +
                "- Mínimo 8 caracteres");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBmedioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBmedioPagoActionPerformed
      
    }//GEN-LAST:event_jCBmedioPagoActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_jBlimpiarActionPerformed
private void cargarComboOpcion() {

        jCBmedioPago.addItem("Efectivo");
        jCBmedioPago.addItem("Debito");
        jCBmedioPago.addItem("Credito");
        
    }

private void setearFecha(){
        LocalDate fechaMinima = LocalDate.of(1940, 1, 1);
        LocalDate fechaMaxima = LocalDate.of(2008, 1, 1);
        Date fechaMin = Date.from(fechaMinima.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fechaMax = Date.from(fechaMaxima.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDCfechaNac.setMinSelectableDate(fechaMin);
        jDCfechaNac.setMaxSelectableDate(fechaMax);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBmedioPago;
    private com.toedter.calendar.JDateChooser jDCfechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPFpassword;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNac;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPass;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
