/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.digi.view;

import com.digitalfinance.DAO.entity.Plantilla;
import com.digitalfinance.DAO.model.ConsultarPlantilas;
import com.digitalfinance.controller.ControllerPantallas;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class AdministraPlantilllas extends javax.swing.JPanel {
    ControllerPantallas cp= new ControllerPantallas();
    DefaultTableModel modelo=new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row,int column){
             return false;
         }
    };
    public JFrame frame;
    public AdministraPlantilllas(JFrame jf) {
        initComponents();
        //centra el texto de los txtlabel
        txtExaminarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        txtAgregarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        txtModificarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        txtEliminarPlantilla.setHorizontalAlignment(SwingConstants.CENTER);
        //modifica estilo de tabla
        tblPlantilla.getTableHeader().setFont (new Font("Segoe UI", Font. BOLD, 14));
        tblPlantilla.getTableHeader().setOpaque (false);
        tblPlantilla.getTableHeader().setBackground (new Color (0,0,60));
        tblPlantilla.getTableHeader().setForeground (new Color(255,255,255));
        try {
             llenarTabla();
        } catch (CsvValidationException ex) {
             System.err.println("Error" + ex);
        }
        tblPlantilla.getColumnModel().getColumn(0).setMaxWidth(0);
        tblPlantilla.getColumnModel().getColumn(0).setMinWidth(0);
        tblPlantilla.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tblPlantilla.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
        this.frame=jf;
        
        
    }
    public void llenarTabla()throws CsvValidationException{
        ArrayList<Object> nombreColumnas=new ArrayList<>();
        nombreColumnas.add("ID");
        nombreColumnas.add("Nombre plantilla");
        nombreColumnas.add("Descripcion ");
        for(Object columnas: nombreColumnas){
            modelo.addColumn(columnas);
        }
        this.tblPlantilla.setModel(modelo);
        ArrayList<Plantilla> pl=ConsultarPlantilas.leerCSV();
        
        modelo=(DefaultTableModel)tblPlantilla.getModel();
        Object[] ob=new Object[3];
        for(int i=0;i<pl.size();i++){
            Plantilla plantilla=pl.get(i);
            ob[0]=plantilla.getIndicePlantilla();
            ob[1]=plantilla.getNombrePlantilla();
            ob[2]=plantilla.getDescPlantilla();
            modelo.addRow(ob);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelExaminar = new javax.swing.JPanel();
        txtExaminarPlantilla = new javax.swing.JLabel();
        panelAgregar = new javax.swing.JPanel();
        txtAgregarPlantilla = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        txtModificarPlantilla = new javax.swing.JLabel();
        panelEliminar = new javax.swing.JPanel();
        txtEliminarPlantilla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlantilla = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 64, 55));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar plantillas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 34, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 61, 196, 10));

        panelExaminar.setBackground(new java.awt.Color(0, 0, 60));
        panelExaminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelExaminar.setForeground(new java.awt.Color(255, 255, 255));

        txtExaminarPlantilla.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        txtExaminarPlantilla.setForeground(new java.awt.Color(204, 204, 204));
        txtExaminarPlantilla.setText("Examinar plantilla");
        txtExaminarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExaminarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExaminarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExaminarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExaminarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelExaminarLayout = new javax.swing.GroupLayout(panelExaminar);
        panelExaminar.setLayout(panelExaminarLayout);
        panelExaminarLayout.setHorizontalGroup(
            panelExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExaminarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        panelExaminarLayout.setVerticalGroup(
            panelExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExaminarPlantilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(panelExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, 60));

        panelAgregar.setBackground(new java.awt.Color(0, 0, 60));
        panelAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAgregar.setForeground(new java.awt.Color(255, 255, 255));

        txtAgregarPlantilla.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtAgregarPlantilla.setForeground(new java.awt.Color(204, 204, 204));
        txtAgregarPlantilla.setText("Agregar");
        txtAgregarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAgregarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgregarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgregarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgregarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(panelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, 60));

        panelModificar.setBackground(new java.awt.Color(0, 0, 60));
        panelModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelModificar.setForeground(new java.awt.Color(255, 255, 255));

        txtModificarPlantilla.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtModificarPlantilla.setForeground(new java.awt.Color(204, 204, 204));
        txtModificarPlantilla.setText("Modificar");
        txtModificarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtModificarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModificarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtModificarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtModificarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 300, 60));

        panelEliminar.setBackground(new java.awt.Color(0, 0, 60));
        panelEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelEliminar.setForeground(new java.awt.Color(255, 255, 255));

        txtEliminarPlantilla.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtEliminarPlantilla.setForeground(new java.awt.Color(204, 204, 204));
        txtEliminarPlantilla.setText("Eliminar");
        txtEliminarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEliminarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliminarPlantillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarPlantillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarPlantillaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminarPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 300, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 470));

        jScrollPane1.setViewportView(tblPlantilla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 410, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void txtExaminarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExaminarPlantillaMouseClicked
        int fila = tblPlantilla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para modificar");
        } else {
            int id = Integer.parseInt(tblPlantilla.getValueAt(fila, 0).toString());
            try {
                ArrayList<Plantilla> listaPlantilla=ConsultarPlantilas.leerCSV();
                Plantilla pl=listaPlantilla.get(id);
                cp.ExaminarPlantilla(pl);
            } catch (CsvValidationException ex) {
                System.err.println("Error "+ex);
            }

        }
    }//GEN-LAST:event_txtExaminarPlantillaMouseClicked

    private void txtAgregarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPlantillaMouseClicked
        AgregarPlantilla agr= new AgregarPlantilla();
        agr.setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_txtAgregarPlantillaMouseClicked

    private void txtModificarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarPlantillaMouseClicked
        int fila = tblPlantilla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para modificar");
        } else {
            int id = Integer.parseInt(tblPlantilla.getValueAt(fila, 0).toString());
            try {
                ArrayList<Plantilla> listaPlantilla=ConsultarPlantilas.leerCSV();
                Plantilla pl=listaPlantilla.get(id);
                frame.dispose();
                cp.ModificarPlantilla(pl,id);
                
            } catch (CsvValidationException ex) {
                System.err.println("Error "+ex);
            }

        }
    }//GEN-LAST:event_txtModificarPlantillaMouseClicked

    private void txtEliminarPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarPlantillaMouseClicked
        int fila = tblPlantilla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para modificar");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            // Verificar la respuesta
            if (respuesta == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(tblPlantilla.getValueAt(fila, 0).toString());
                try {
                    ArrayList<Plantilla> listaPlantilla=ConsultarPlantilas.leerCSV();
                    ConsultarPlantilas.eliminarRegistro(listaPlantilla, id);
                    frame.dispose();
                    int i=0;
                    cp.Principal2(i);
                } catch (CsvValidationException ex) {
                    System.err.println("Error "+ex);
                }
            }
        }
    }//GEN-LAST:event_txtEliminarPlantillaMouseClicked

    private void txtExaminarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExaminarPlantillaMouseEntered
        panelExaminar.setBackground(new Color(0,0,90));
    }//GEN-LAST:event_txtExaminarPlantillaMouseEntered

    private void txtExaminarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExaminarPlantillaMouseExited
        panelExaminar.setBackground(new Color(0,0,60));
    }//GEN-LAST:event_txtExaminarPlantillaMouseExited

    private void txtAgregarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPlantillaMouseEntered
        panelAgregar.setBackground(new Color(0,0,90));
    }//GEN-LAST:event_txtAgregarPlantillaMouseEntered

    private void txtAgregarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarPlantillaMouseExited
        panelAgregar.setBackground(new Color(0,0,60));
    }//GEN-LAST:event_txtAgregarPlantillaMouseExited

    private void txtModificarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarPlantillaMouseEntered
        panelModificar.setBackground(new Color(0,0,90));
    }//GEN-LAST:event_txtModificarPlantillaMouseEntered

    private void txtModificarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarPlantillaMouseExited
        panelModificar.setBackground(new Color(0,0,60));
    }//GEN-LAST:event_txtModificarPlantillaMouseExited

    private void txtEliminarPlantillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarPlantillaMouseEntered
        panelEliminar.setBackground(new Color(0,0,90));
    }//GEN-LAST:event_txtEliminarPlantillaMouseEntered

    private void txtEliminarPlantillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarPlantillaMouseExited
        panelEliminar.setBackground(new Color(0,0,60));
    }//GEN-LAST:event_txtEliminarPlantillaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelExaminar;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JTable tblPlantilla;
    private javax.swing.JLabel txtAgregarPlantilla;
    private javax.swing.JLabel txtEliminarPlantilla;
    private javax.swing.JLabel txtExaminarPlantilla;
    private javax.swing.JLabel txtModificarPlantilla;
    // End of variables declaration//GEN-END:variables
}
