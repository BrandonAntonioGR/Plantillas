/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.digitalfinance.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
//Link imagen icono de apk="https://www.flaticon.es/iconos-gratis/pagina" title="página iconos">Página iconos creados por Eucalyp - Flaticon

public class Principal extends javax.swing.JFrame {
    ConsultaContrato co =new ConsultaContrato();
    AdministraPlantilllas ap= new AdministraPlantilllas(this);
    Color azulFuerte= new Color(0,0,60);
    Color azulClaro= new Color(0,0,255);
    public Principal() {
//        ImageIcon icono = new ImageIcon(getClass().getResource("C:\\Users\\Brandon Garduño\\Documents\\NetBeansProjects\\Plantilla\\src\\main\\java\\com\\digitalfinance\\view\\plantilla.png"));
//        setIconImage(icono.getImage());
        initComponents();
        ShowPanel(co);
        panelAdminContrato.setBackground(azulClaro);
        btnConsultaContrato.setBackground(azulClaro);
        
    }
    public Principal(int i) {
        initComponents();
        ShowPanel(ap);
        panelAdminContrato.setBackground(azulClaro);
        btnConsultaContrato.setBackground(azulClaro);
    }
    private void ShowPanel (JPanel p) {
        content.removeAll();
        p.setSize(800, 460);
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        panelAdminPlantillas = new javax.swing.JPanel();
        btnAdministraPlantillas = new javax.swing.JLabel();
        panelAdminContrato = new javax.swing.JPanel();
        btnConsultaContrato = new javax.swing.JLabel();
        txtAgente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(200, 450));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        content.setPreferredSize(new java.awt.Dimension(800, 450));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        panelAdminPlantillas.setBackground(new java.awt.Color(0, 0, 51));
        panelAdminPlantillas.setPreferredSize(new java.awt.Dimension(140, 36));

        btnAdministraPlantillas.setBackground(new java.awt.Color(0, 0, 153));
        btnAdministraPlantillas.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnAdministraPlantillas.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministraPlantillas.setText("Administra plantillas");
        btnAdministraPlantillas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnAdministraPlantillas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministraPlantillas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdministraPlantillas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministraPlantillasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAdminPlantillasLayout = new javax.swing.GroupLayout(panelAdminPlantillas);
        panelAdminPlantillas.setLayout(panelAdminPlantillasLayout);
        panelAdminPlantillasLayout.setHorizontalGroup(
            panelAdminPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdministraPlantillas, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        panelAdminPlantillasLayout.setVerticalGroup(
            panelAdminPlantillasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminPlantillasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdministraPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelAdminContrato.setBackground(new java.awt.Color(0, 0, 51));

        btnConsultaContrato.setBackground(new java.awt.Color(0, 0, 153));
        btnConsultaContrato.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnConsultaContrato.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaContrato.setText("Consulta contrato");
        btnConsultaContrato.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnConsultaContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultaContrato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultaContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaContratoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAdminContratoLayout = new javax.swing.GroupLayout(panelAdminContrato);
        panelAdminContrato.setLayout(panelAdminContratoLayout);
        panelAdminContratoLayout.setHorizontalGroup(
            panelAdminContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        panelAdminContratoLayout.setVerticalGroup(
            panelAdminContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminContratoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConsultaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtAgente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtAgente.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(panelAdminContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAdminPlantillas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                .addComponent(txtAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAdminContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAdminPlantillas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaContratoMouseClicked
        ShowPanel(co);
        panelAdminContrato.setBackground(azulClaro);
        btnConsultaContrato.setBackground(azulClaro);
        panelAdminPlantillas.setBackground(azulFuerte);
        btnAdministraPlantillas.setBackground(azulClaro);
    }//GEN-LAST:event_btnConsultaContratoMouseClicked

    private void btnAdministraPlantillasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministraPlantillasMouseClicked
        ShowPanel(ap);
        panelAdminPlantillas.setBackground(azulClaro);
        btnAdministraPlantillas.setBackground(azulClaro);
        panelAdminContrato.setBackground(azulFuerte);
        btnConsultaContrato.setBackground(azulClaro);
    }//GEN-LAST:event_btnAdministraPlantillasMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdministraPlantillas;
    private javax.swing.JLabel btnConsultaContrato;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panelAdminContrato;
    private javax.swing.JPanel panelAdminPlantillas;
    private javax.swing.JLabel txtAgente;
    // End of variables declaration//GEN-END:variables
}
