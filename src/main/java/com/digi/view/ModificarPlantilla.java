/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.digi.view;

import com.digitalfinance.DAO.entity.Plantilla;
import com.digitalfinance.DAO.model.ConsultarPlantilas;
import com.digitalfinance.controller.ControllerPantallas;
import com.opencsv.exceptions.CsvValidationException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ModificarPlantilla extends javax.swing.JFrame {
    ControllerPantallas cp= new ControllerPantallas();
    Plantilla pl = new Plantilla();
    int aux;
    public ModificarPlantilla(Plantilla plantilla,int i) {
        initComponents();
        this.pl=plantilla;
        this.aux=i;
        txtPlantilla.setLineWrap(true);
        txtPlantilla.setWrapStyleWord(true);
        txtNombrePlantilla.setText(pl.getNombrePlantilla());
        txtPlantilla.setText(pl.getDescPlantilla());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarPlantilla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlantilla = new javax.swing.JTextArea();
        btnSaldoVariable = new javax.swing.JButton();
        btnAdeudoVariable = new javax.swing.JButton();
        btnCreditoVariable = new javax.swing.JButton();
        btnReferenciaSpei = new javax.swing.JButton();
        btnReferenciaOxxo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePlantilla = new javax.swing.JTextField();
        btnFechaPago = new javax.swing.JButton();
        btnNombreVariable1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarPlantilla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarPlantilla.setText("Modificar plantilla");
        btnGuardarPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPlantillaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 180, -1));

        txtPlantilla.setColumns(20);
        txtPlantilla.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtPlantilla.setRows(5);
        jScrollPane1.setViewportView(txtPlantilla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 530, 180));

        btnSaldoVariable.setText("/SALDO_VARIABLE/");
        btnSaldoVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoVariableActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaldoVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 170, 30));

        btnAdeudoVariable.setText("/ADEUDO_VARIABLE/");
        btnAdeudoVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdeudoVariableActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdeudoVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, 30));

        btnCreditoVariable.setText("/CREDITO_VARAIBLE/");
        btnCreditoVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoVariableActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreditoVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 30));

        btnReferenciaSpei.setText("/SPEI/");
        btnReferenciaSpei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferenciaSpeiActionPerformed(evt);
            }
        });
        getContentPane().add(btnReferenciaSpei, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 80, 30));

        btnReferenciaOxxo.setText("/OXXO/");
        btnReferenciaOxxo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferenciaOxxoActionPerformed(evt);
            }
        });
        getContentPane().add(btnReferenciaOxxo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 80, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 60));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre plantilla: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombrePlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombrePlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        btnFechaPago.setText("/FECHA_PAGO/");
        btnFechaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaPagoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, 30));

        btnNombreVariable1.setText("/NOMBRE_VARIABLE/");
        btnNombreVariable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreVariable1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNombreVariable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPlantillaActionPerformed
        if(txtNombrePlantilla.getText().isEmpty() || txtPlantilla.getText().isEmpty()){
            if(txtNombrePlantilla.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Es necesario llenar el campo de Nombre de plantilla", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }else if(txtPlantilla.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingresar datos a la plantilla", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(!txtNombrePlantilla.getText().isEmpty() && !txtPlantilla.getText().isEmpty()){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            // Verificar la respuesta
            if (respuesta == JOptionPane.YES_OPTION) {
                try {
                    ArrayList<Plantilla> listaPlantilla=ConsultarPlantilas.leerCSV();
                    Plantilla plantillaModificada=new Plantilla();
                    plantillaModificada.setNombrePlantilla(txtNombrePlantilla.getText());
                    plantillaModificada.setDescPlantilla(txtPlantilla.getText());
                    ConsultarPlantilas.modificarRegistro(listaPlantilla, aux, plantillaModificada);
                    this.dispose();
                    int i=0;
                    cp.Principal2(i);
                } catch (CsvValidationException ex) {
                    System.err.println("Error "+ex);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarPlantillaActionPerformed

    private void btnSaldoVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoVariableActionPerformed
        txtPlantilla.append(" $/SALDO_VARIABLE/ ");
    }//GEN-LAST:event_btnSaldoVariableActionPerformed

    private void btnAdeudoVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdeudoVariableActionPerformed
        txtPlantilla.append(" $/ADEUDO_VARIABLE/ ");
    }//GEN-LAST:event_btnAdeudoVariableActionPerformed

    private void btnCreditoVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoVariableActionPerformed
        txtPlantilla.append(" /CREDITO_VARIABLE/ ");
    }//GEN-LAST:event_btnCreditoVariableActionPerformed

    private void btnReferenciaSpeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferenciaSpeiActionPerformed
        txtPlantilla.append(" /REF_SPEI/ ");
    }//GEN-LAST:event_btnReferenciaSpeiActionPerformed

    private void btnReferenciaOxxoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferenciaOxxoActionPerformed
        txtPlantilla.append(" /REF_OXXO/ ");
    }//GEN-LAST:event_btnReferenciaOxxoActionPerformed

    private void btnFechaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaPagoActionPerformed
        txtPlantilla.append(" /FECHA_PAGO/ ");
    }//GEN-LAST:event_btnFechaPagoActionPerformed

    private void btnNombreVariable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreVariable1ActionPerformed
        txtPlantilla.append(" /NOMBRE_VARIABLE/ ");
    }//GEN-LAST:event_btnNombreVariable1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdeudoVariable;
    private javax.swing.JButton btnCreditoVariable;
    private javax.swing.JButton btnFechaPago;
    private javax.swing.JButton btnGuardarPlantilla;
    private javax.swing.JButton btnNombreVariable1;
    private javax.swing.JButton btnReferenciaOxxo;
    private javax.swing.JButton btnReferenciaSpei;
    private javax.swing.JButton btnSaldoVariable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombrePlantilla;
    private javax.swing.JTextArea txtPlantilla;
    // End of variables declaration//GEN-END:variables
}
