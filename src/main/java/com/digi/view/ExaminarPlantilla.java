/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.digi.view;

import com.digitalfinance.DAO.entity.Plantilla;
import com.digitalfinance.controller.ControllerPantallas;
import javax.swing.JOptionPane;


public class ExaminarPlantilla extends javax.swing.JFrame {
    ControllerPantallas cp= new ControllerPantallas();
    Plantilla plantilla = new Plantilla();
    public ExaminarPlantilla(Plantilla pl) {
        initComponents();
        this.plantilla=pl;
        txtPlantilla.setLineWrap(true);
        txtPlantilla.setWrapStyleWord(true);
        txtNombrePlantilla.setText(plantilla.getNombrePlantilla());
        txtPlantilla.setText(plantilla.getDescPlantilla());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarPlantilla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlantilla = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePlantilla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarPlantilla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardarPlantilla.setText("Regresar");
        btnGuardarPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPlantillaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 150, -1));

        txtPlantilla.setColumns(20);
        txtPlantilla.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtPlantilla.setRows(5);
        jScrollPane1.setViewportView(txtPlantilla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 460, 180));

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
                .addContainerGap(62, Short.MAX_VALUE))
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPlantillaActionPerformed
        int i=0;
        //cp.Principal1(i);
        this.dispose();
    }//GEN-LAST:event_btnGuardarPlantillaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarPlantilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombrePlantilla;
    private javax.swing.JTextArea txtPlantilla;
    // End of variables declaration//GEN-END:variables
}
