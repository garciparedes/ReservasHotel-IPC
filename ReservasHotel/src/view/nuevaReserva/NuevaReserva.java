/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nuevaReserva;

import view.utils.DatePicker;
import enums.TipoEstancia;
import enums.TipoHabitacion;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import main.Start;
import model.Periodo;
/**
 *
 * @author garciparedes
 */
public class NuevaReserva extends javax.swing.JFrame {

    /**
     * Creates new form NuevaReserva
     */
    //DatePicker calendarioEntrada;
    //DatePicker calendarioSalida;
    private ControllerNuevaReserva controller;
    
    public NuevaReserva() {
        
        initComponents();
        
        controller = new ControllerNuevaReserva(this);
        
        for(TipoEstancia i : TipoEstancia.values()){
            jComboBoxEstancia.addItem(i);
        }
        for(TipoHabitacion j : TipoHabitacion.values()){
            jComboBoxHabitacion.addItem(j);
        }
        
        ImageIcon icon = new ImageIcon("res/calendar.png");
        btn_fechaEntrada.setBorder(BorderFactory.createEmptyBorder());

        btn_fechaEntrada.setIcon(icon);
        
        btn_fechaSalida.setBorder(BorderFactory.createEmptyBorder());

        btn_fechaSalida.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_fechaEntrada = new javax.swing.JLabel();
        jLabelFechaEntrada = new javax.swing.JLabel();
        btn_fechaEntrada = new javax.swing.JButton();
        lbl_fechaSalida = new javax.swing.JLabel();
        jLabelFechaSalida = new javax.swing.JLabel();
        btn_fechaSalida = new javax.swing.JButton();
        lbl_habitacion = new javax.swing.JLabel();
        jComboBoxHabitacion = new javax.swing.JComboBox();
        lbl_estancia = new javax.swing.JLabel();
        jComboBoxEstancia = new javax.swing.JComboBox();
        btn_buscar_reserva = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Reserva"));

        lbl_fechaEntrada.setText("Fecha de entrada:");

        jLabelFechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaEntrada.setText("--/--/----");

        btn_fechaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechaEntradaActionPerformed(evt);
            }
        });

        lbl_fechaSalida.setText("Fecha de salida:");

        jLabelFechaSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaSalida.setText("--/--/----");

        btn_fechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechaSalidaActionPerformed(evt);
            }
        });

        lbl_habitacion.setText("Tipo de habitación:");

        jComboBoxHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera" }));
        jComboBoxHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHabitacionActionPerformed(evt);
            }
        });

        lbl_estancia.setText("Tipo de estancia:");

        jComboBoxEstancia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera" }));
        jComboBoxEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstanciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxHabitacion, 0, 212, Short.MAX_VALUE)
                    .addComponent(jComboBoxEstancia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_fechaEntrada)
                            .addComponent(lbl_fechaSalida)
                            .addComponent(lbl_habitacion)
                            .addComponent(lbl_estancia))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFechaEntrada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_fechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFechaSalida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_fechaEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_fechaSalida))
                    .addComponent(btn_fechaEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_habitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_estancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxEstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_fechaSalida)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btn_buscar_reserva.setText("Buscar");
        btn_buscar_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_reservaActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_buscar_reserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar_reserva)
                    .addComponent(btn_cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
     
        controller.cancelar();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_fechaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechaEntradaActionPerformed
        controller.setFechaEntrada();
    }//GEN-LAST:event_btn_fechaEntradaActionPerformed

    private void btn_fechaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechaSalidaActionPerformed
        controller.setFechaSalida();
    }//GEN-LAST:event_btn_fechaSalidaActionPerformed

    private void btn_buscar_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reservaActionPerformed
        controller.buscar();
    }//GEN-LAST:event_btn_buscar_reservaActionPerformed

    private void jComboBoxHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHabitacionActionPerformed
        controller.setTipoHabitacion();
    }//GEN-LAST:event_jComboBoxHabitacionActionPerformed

    private void jComboBoxEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstanciaActionPerformed
        controller.setTipoEstancia();
    }//GEN-LAST:event_jComboBoxEstanciaActionPerformed

    public void setJlabelFechaEntradaString(String value){
        jLabelFechaEntrada.setText(value);
    }
    
    public void setJlabelFechaSalidaString(String value){
        jLabelFechaSalida.setText(value);
    }
    
    public int getJComboBoxEstancia(){
        return jComboBoxEstancia.getSelectedIndex();
    }
    
    public int getJComboBoxHabitacion(){
        return jComboBoxHabitacion.getSelectedIndex();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_reserva;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_fechaEntrada;
    private javax.swing.JButton btn_fechaSalida;
    private javax.swing.JComboBox jComboBoxEstancia;
    private javax.swing.JComboBox jComboBoxHabitacion;
    private javax.swing.JLabel jLabelFechaEntrada;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_estancia;
    private javax.swing.JLabel lbl_fechaEntrada;
    private javax.swing.JLabel lbl_fechaSalida;
    private javax.swing.JLabel lbl_habitacion;
    // End of variables declaration//GEN-END:variables
}
