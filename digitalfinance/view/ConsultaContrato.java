/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.digitalfinance.view;

import com.digitalfinance.DAO.entity.REF_GPT1;
import com.digitalfinance.DAO.entity.Plantilla;
import com.digitalfinance.DAO.entity.lista_REFGPT1;
import com.digitalfinance.DAO.model.ConsultarPlantilas;
import com.digitalfinance.controller.ControllerConsultaREFGPT1;
import com.digitalfinance.controller.ControllerPantallas;
import com.digitalfinance.controller.PostNewRecord;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.net.URISyntaxException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Garduño
 */
public class ConsultaContrato extends javax.swing.JPanel implements ClipboardOwner{
    ControllerPantallas cp =new ControllerPantallas();
    ControllerConsultaREFGPT1 consultaREFGPT1= new ControllerConsultaREFGPT1();
    ConsultarPlantilas consultarPlantillas= new ConsultarPlantilas();
    lista_REFGPT1 listaContrato=new lista_REFGPT1();
    
    public ConsultaContrato() {
        initComponents();
        btnCargaCccOne.setEnabled(true);
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        txtCliente.setLineWrap(true);
        txtCliente.setWrapStyleWord(true);
        try {
            ArrayList<Plantilla> listaPlantillas=consultarPlantillas.leerCSV();
            //cmbSelec.addItem("---Seleccione la plantilla---");
            for (int i=0;i<listaPlantillas.size();i++) {
                Plantilla plantilla= new Plantilla();
                plantilla=listaPlantillas.get(i);
                cmbSelec.addItem(plantilla.getNombrePlantilla());
            }    
        }catch (CsvValidationException ex) {
            Logger.getLogger(ConsultaContrato.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContrato = new javax.swing.JTextField();
        btnBuscarContrato = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDpd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiaContrato = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCapitalMoratorio = new javax.swing.JTextField();
        btnCalcCostoMonetario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMoratorios = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiasMoratorio = new javax.swing.JTextField();
        btnLimpiaMoratorio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCapitalExt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtExt10 = new javax.swing.JTextField();
        txtExt20 = new javax.swing.JTextField();
        txtExt30 = new javax.swing.JTextField();
        btnCalcularExt = new javax.swing.JButton();
        btnLimpiaExt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCliente = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        tbl1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        cmbSelec = new javax.swing.JComboBox<>();
        btnCopiar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMacro = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCargadosCCC = new javax.swing.JTable();
        btnCargaCccOne = new javax.swing.JButton();
        btnHipervinculo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 440));
        setMinimumSize(new java.awt.Dimension(800, 440));
        setPreferredSize(new java.awt.Dimension(800, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 60));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contrato: ");

        txtContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContratoKeyTyped(evt);
            }
        });

        btnBuscarContrato.setText("Buscar");
        btnBuscarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContratoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente: ");

        txtDpd.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DPD: ");

        btnLimpiaContrato.setText("Limpiar");
        btnLimpiaContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaContratoActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 0, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capital:");

        txtCapitalMoratorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapitalMoratorioKeyTyped(evt);
            }
        });

        btnCalcCostoMonetario.setText("Calcular");
        btnCalcCostoMonetario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcCostoMonetarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Moratorios: ");

        txtMoratorios.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dias:");

        txtDiasMoratorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasMoratorioKeyTyped(evt);
            }
        });

        btnLimpiaMoratorio.setText("Limpiar");
        btnLimpiaMoratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaMoratorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCapitalMoratorio)
                            .addComponent(txtDiasMoratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnLimpiaMoratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcCostoMonetario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapitalMoratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDiasMoratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcCostoMonetario)
                    .addComponent(btnLimpiaMoratorio))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMoratorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calcular costo moratorio", jPanel4);

        jPanel2.setBackground(new java.awt.Color(0, 0, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Capital: ");

        txtCapitalExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapitalExtKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EXT 10");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EXT 20:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EXT 30:");

        txtExt10.setEditable(false);

        txtExt20.setEditable(false);

        txtExt30.setEditable(false);

        btnCalcularExt.setText("Calcular");
        btnCalcularExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularExtActionPerformed(evt);
            }
        });

        btnLimpiaExt.setText("Limpiar");
        btnLimpiaExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaExtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCapitalExt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExt20)
                                    .addComponent(txtExt30)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(15, 15, 15)
                                .addComponent(txtExt10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiaExt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcularExt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCapitalExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtExt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiaExt)
                    .addComponent(btnCalcularExt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calcular extencion", jPanel2);

        txtCliente.setEditable(false);
        txtCliente.setColumns(20);
        txtCliente.setRows(5);
        jScrollPane2.setViewportView(txtCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnLimpiaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDpd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiaContrato)
                    .addComponent(btnBuscarContrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDpd)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 302, 470));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        cmbSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelecActionPerformed(evt);
            }
        });

        btnCopiar.setText("Copiar plantilla");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(cmbSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cmbSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        tbl1.addTab("Plantilla", jPanel5);

        jScrollPane3.setViewportView(tblMacro);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        tbl1.addTab("Tabla 1", jPanel7);

        jScrollPane4.setViewportView(tblCargadosCCC);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        tbl1.addTab("Tabla 2", jPanel8);

        btnCargaCccOne.setText("CARGAR  CCCone");
        btnCargaCccOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaCccOneActionPerformed(evt);
            }
        });

        btnHipervinculo.setText("Pagina TEC");
        btnHipervinculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHipervinculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnCargaCccOne)
                .addGap(27, 27, 27)
                .addComponent(btnHipervinculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargaCccOne, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHipervinculo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 510, 450));
    }// </editor-fold>//GEN-END:initComponents
    public void setClipBoard(String texto){
        StringSelection txt=new StringSelection(texto);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(txt, (ClipboardOwner) this);
        
    }
    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        setClipBoard(txtArea.getText());
    }//GEN-LAST:event_btnCopiarActionPerformed
    public String modificarCoincidencias(String patronNombreVariable,String descPlantilla,String OBJETONOMBRE){
        Pattern patternNombreVariable=Pattern.compile(patronNombreVariable);
        Matcher similitudNombreVariable=patternNombreVariable.matcher(descPlantilla);
        String textoNuevo1=similitudNombreVariable.replaceAll(OBJETONOMBRE);
        return textoNuevo1;
    }
    private void cmbSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelecActionPerformed
        String contrato=txtContrato.getText();
        
        try {
            if(!txtContrato.getText().isEmpty()){
                ArrayList<REF_GPT1> listacliente=listaContrato.getListacliente();
                ArrayList<Plantilla> listaPlantillas=consultarPlantillas.leerCSV();
                int opc=cmbSelec.getSelectedIndex();
                Plantilla pl= listaPlantillas.get(opc);
                String descPlantilla=pl.getDescPlantilla();            
                
                //obteniendo los datos del clinete
                REF_GPT1 ObjContrato=listacliente.get(0);
                
                String patronNombreVariable="/NOMBRE_VARIABLE/";
                String oNombreCte=ObjContrato.getNombre();
                String descPlantilla1=modificarCoincidencias(patronNombreVariable,descPlantilla,oNombreCte);
                //obteniendo credito del clinete
                String patronCreditoVariable="/CREDITO_VARIABLE/";
                String oCreditoVariable=ObjContrato.getNumber();
                String descPlantilla2=modificarCoincidencias(patronCreditoVariable,descPlantilla1,oCreditoVariable);
                //obteniendo fecha de pago del clinete
                String patronFechaPagoVariable="/FECHA_PAGO/";
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
                String oFechPago = formatoFecha.format(ObjContrato.getFechaPago());
                String descPlantilla3=modificarCoincidencias(patronFechaPagoVariable,descPlantilla2,oFechPago);
                //obteniendo nombre del clinete
                String patronAdeudoVariable="/ADEUDO_VARIABLE/";
                //formatea a dos decimales 
                DecimalFormat formatoDecimal = new DecimalFormat("#.##");
                String oAdeudoVariable=ObjContrato.getAdeudo();
                double oAdeudoVariableSDouble = Double.parseDouble(oAdeudoVariable);
                double AdeudovariableRedondeado=Double.parseDouble(formatoDecimal.format(oAdeudoVariableSDouble));
                String AdeudoVariableStr=AdeudovariableRedondeado+"";
                
                
                String descPlantilla4=modificarCoincidencias(patronAdeudoVariable,descPlantilla3,AdeudoVariableStr);
                //obteniendo saldo del clinete
                String patronSaldoVariable="/SALDO_VARIABLE/";
                String oSaldoVariable=ObjContrato.getSaldoHoy();
                double oSaldoVariableSDouble = Double.parseDouble(oSaldoVariable);
                double SaldovariableRedondeado=Double.parseDouble(formatoDecimal.format(oSaldoVariableSDouble));
                String SaldoVariableStr=SaldovariableRedondeado+"";
                
                String descPlantilla5=modificarCoincidencias(patronSaldoVariable,descPlantilla4,SaldoVariableStr);
                //obteniendo ext20 del clinete
                String patronExt20NombreVariable="/EXT_20/";
                String oExt20=ObjContrato.getExtension20();
                double oExt20Double = Double.parseDouble(oExt20);
                double Ext20double=Double.parseDouble(formatoDecimal.format(oExt20Double));
                String ext20Str=Ext20double+"";
                String descPlantilla6=modificarCoincidencias(patronExt20NombreVariable,descPlantilla5,ext20Str);
                //obteniendo ext20 del clinete
                String patronExt20Variable="/EXT_30/";
                String oExt30=ObjContrato.getExtension30();
                double oExt30Double = Double.parseDouble(oExt30);
                double Ext30double=Double.parseDouble(formatoDecimal.format(oExt30Double));
                String ext30Str=Ext30double+"";
                String descPlantilla7=modificarCoincidencias(patronExt20Variable,descPlantilla6,ext30Str);
                
                String patronSpeiVariable="/REF_SPEI/";
                String oSpei=ObjContrato.getSpeiClave();
                String descPlantilla8=modificarCoincidencias(patronSpeiVariable,descPlantilla7,oSpei);
                
                String patronOxxoVariable="/REF_OXXO/";
                String oOxxo=ObjContrato.getOxxoReference();
                String descPlantilla9=modificarCoincidencias(patronOxxoVariable,descPlantilla8,oOxxo);

                txtArea.setText(descPlantilla9);
            }
            
        }catch (CsvValidationException ex) {
            Logger.getLogger(ConsultaContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSelecActionPerformed

    private void txtContratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContratoKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
        if(txtContrato.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txtContratoKeyTyped

    private void btnBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContratoActionPerformed
        ///Aqui ira la funcionalidad de buscar cliente
        //se crea variable auxiliar
        txtArea.setText("");
        String contrato=txtContrato.getText();
        if(!txtContrato.getText().isEmpty()){
            ArrayList<REF_GPT1> lista =consultaREFGPT1.consultaREFGPT1(contrato);
            listaContrato.setListacliente(lista);
            
            for (int i = 0; i < listaContrato.getListacliente().size(); i++) {
                DecimalFormat formatoDecimal = new DecimalFormat("#.##");
                REF_GPT1 datoContrato=new REF_GPT1();
                //obtener el objeto de la lista
                datoContrato = listaContrato.getListacliente().get(i);
                //asignar valores a una variable 
                String nombreCliente=datoContrato.getClientFullName();
                String dpd=datoContrato.getDpd();
                String ext20=datoContrato.getExtension20();
                Double ext2=Double.parseDouble(ext20);
                String ext30=datoContrato.getExtension30();
                Double ext3=Double.parseDouble(ext30);
                String capital=datoContrato.getOpen_principal();
                //convirtiendo string a decimal
                double capitalInt=Double.parseDouble(capital);
                //calculando el valor minimo 
                double valorminimoExt=capitalInt*0.075;
                //se agigna el valor a la variable aux con base a si es mayor de 150 o mayor
                double aux;
                if(valorminimoExt<150){
                    aux=valorminimoExt;
                }else{
                    aux=150;
                }
                double ext10=(10*0.018*capitalInt*1.16)+aux;
                double Ext10Redondeado=Double.parseDouble(formatoDecimal.format(ext10));
                String ext_10=Ext10Redondeado+"";
                txtExt10.setText(ext_10);
                txtCliente.setText(nombreCliente);
                txtDpd.setText(dpd);
                txtCapitalMoratorio.setText(capital);
                txtCapitalExt.setText(capital);
                
                
                double Ext20Redondeado=Double.parseDouble(formatoDecimal.format(ext2));
                String Ext20RedondeadoStr=Ext20Redondeado+"";
                
                txtExt20.setText(Ext20RedondeadoStr);
                double Ext30Redondeado=Double.parseDouble(formatoDecimal.format(ext3));
                String Ext30RedondeadoStr=Ext30Redondeado+"";
                txtExt30.setText(Ext30RedondeadoStr);
                btnCargaCccOne.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo de contrato requerido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        //Connection con = ModelConection.getConnection();
        
    }//GEN-LAST:event_btnBuscarContratoActionPerformed

    private void btnLimpiaContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaContratoActionPerformed
        //se limpia la caja de texto contrato
        txtContrato.setText("");
        txtCliente.setText("");
        txtDpd.setText("");
        txtCapitalMoratorio.setText("");
        txtDiasMoratorio.setText("");
        txtMoratorios.setText("");
        txtCapitalExt.setText("");
        txtExt10.setText("");
        txtExt20.setText("");
        txtExt30.setText("");
    }//GEN-LAST:event_btnLimpiaContratoActionPerformed

    private void txtCapitalMoratorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapitalMoratorioKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCapitalMoratorioKeyTyped

    private void btnCalcCostoMonetarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcCostoMonetarioActionPerformed
        if(!txtCapitalMoratorio.getText().isEmpty() || !txtDiasMoratorio.getText().isEmpty()){
            //se crea el objeto formato decimal para darle formato de dos decimales
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        //se obtiene el valor del capital ingresasdo
        double capital=Integer.parseInt(txtCapitalMoratorio.getText());
        //se obtiene el valor del dia ingresado
        double dia=Integer.parseInt(txtDiasMoratorio.getText());
        //se obtiene el costo multiplicando =dia *capital *0.0232
        double costo=capital*dia*0.0232;
        //el valor resultante se redondea a 2 decimales
        double costoMonetarioRedondeado=Double.parseDouble(formatoDecimal.format(costo));
        //se convierte el valor a texto
        String costoS=costoMonetarioRedondeado+"";
        //se añade el valor a la caja de texto moratorios
        txtMoratorios.setText(costoS);
        }    
    }//GEN-LAST:event_btnCalcCostoMonetarioActionPerformed

    private void txtDiasMoratorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasMoratorioKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDiasMoratorioKeyTyped

    private void btnLimpiaMoratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaMoratorioActionPerformed
        //se limpia la caja de texto capital moratorio
        txtCapitalMoratorio.setText("");
        txtDiasMoratorio.setText("");
        txtMoratorios.setText("");
    }//GEN-LAST:event_btnLimpiaMoratorioActionPerformed

    private void txtCapitalExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapitalExtKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCapitalExtKeyTyped

    private void btnCalcularExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularExtActionPerformed
        //Se crea el objeto formato decimal para darle formato de dos decimales
        //a el resultado de extencion
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        //se crea variable auxiliar
        double aux;
        double capital=Integer.parseInt(txtCapitalExt.getText());
        double valorminimoExt=capital*0.075;
        //se agigna el valor a la variable aux con base a si es mayor de 150 o mayor
        if(valorminimoExt<150){
            aux=valorminimoExt;
        }else{
            aux=150;
        }
        //calculos de las extenciones de 10, 20 y 30 dias
        double ext10=(10*0.018*capital*1.16)+aux;
        double ext20=(20*0.016*capital*1.16)+aux;
        double ext30=(30*0.015*capital*1.16)+aux;
        //se redondea el valor a 2 decimales a oartir del objeto formatoDecimal
        double numeroRedondeadoExt10 = Double.parseDouble(formatoDecimal.format(ext10));
        double numeroRedondeadoExt20 = Double.parseDouble(formatoDecimal.format(ext20));
        double numeroRedondeadoExt30 = Double.parseDouble(formatoDecimal.format(ext30));
        //se convierte el valor a texto para añadirlo a la caja de texto de la vista
        String ext_10=numeroRedondeadoExt10+"";
        String ext_20=numeroRedondeadoExt20+"";
        String ext_30=numeroRedondeadoExt30+"";
        //se añade el valor a la caja de texto
        txtExt10.setText(ext_10);
        txtExt20.setText(ext_20);
        txtExt30.setText(ext_30);
    }//GEN-LAST:event_btnCalcularExtActionPerformed

    private void btnLimpiaExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaExtActionPerformed
        //se limpia la caja de texto de capital y sus extenciones
        txtCapitalExt.setText("");
        txtExt10.setText("");
        txtExt20.setText("");
        txtExt30.setText("");
    }//GEN-LAST:event_btnLimpiaExtActionPerformed

    private void btnHipervinculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHipervinculoActionPerformed
        String contrato=txtContrato.getText();
        if(!txtContrato.getText().isEmpty()){
                String urlTecIncompleta="https://tk4f.mx/VIVUS/tekrecovery/wbTEKSSO.aspx?ContractNumber=";
                String urlTec=urlTecIncompleta+contrato;
                System.out.println(urlTec);
            if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop=java.awt.Desktop.getDesktop();
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try{
                        java.net.URI  url1= new java.net.URI(urlTec);
                        desktop.browse(url1);
                        System.out.print("Si entro");
                    }catch(URISyntaxException | IOException ex){
                        System.out.print(ex);
                    }
                }
            }
        }else{
                JOptionPane.showMessageDialog(null, "Campo de contrato requerido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHipervinculoActionPerformed

    private void btnCargaCccOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaCccOneActionPerformed
        String contrato=txtContrato.getText();
        ArrayList<REF_GPT1> lista =consultaREFGPT1.consultaREFGPT1(contrato);
        System.out.println("tamaño de la lista :"+lista.size());
        if(!txtContrato.getText().isEmpty()){
            ArrayList<REF_GPT1> lstcliente=lista;
            REF_GPT1 objContrato=lstcliente.get(0);
            String number=objContrato.getNumber();
            String dpd=objContrato.getDpd();
            String tipoAsignacion=objContrato.getTipoCliente();
            String adeudo=objContrato.getAdeudo();
            String tel=objContrato.getTel();
            String nameClient=objContrato.getClientFullName();
            String algoritmo=objContrato.getAlgoritmo();
            System.out.println("number"+number);
            System.out.println("dpd"+dpd);
            System.out.println("tipoAsignacion"+tipoAsignacion);
            System.out.println("adeudo"+adeudo);
            System.out.println("tel"+tel);
            System.out.println("nameClient"+nameClient);
            System.out.println("algoritmo"+algoritmo);
            try {
                PostNewRecord.PostOkHttp(number, dpd, tipoAsignacion, adeudo, tel, nameClient, algoritmo);
                btnCargaCccOne.setEnabled(false);
                JOptionPane.showMessageDialog(null, "El contrato se cargo correctamente a CCCone", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(ConsultaContrato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo de contrato requerido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCargaCccOneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarContrato;
    private javax.swing.JButton btnCalcCostoMonetario;
    private javax.swing.JButton btnCalcularExt;
    private javax.swing.JButton btnCargaCccOne;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnHipervinculo;
    private javax.swing.JButton btnLimpiaContrato;
    private javax.swing.JButton btnLimpiaExt;
    private javax.swing.JButton btnLimpiaMoratorio;
    private javax.swing.JComboBox<String> cmbSelec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane tbl1;
    private javax.swing.JTable tblCargadosCCC;
    private javax.swing.JTable tblMacro;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCapitalExt;
    private javax.swing.JTextField txtCapitalMoratorio;
    private javax.swing.JTextArea txtCliente;
    private javax.swing.JTextField txtContrato;
    private javax.swing.JTextField txtDiasMoratorio;
    private javax.swing.JTextField txtDpd;
    private javax.swing.JTextField txtExt10;
    private javax.swing.JTextField txtExt20;
    private javax.swing.JTextField txtExt30;
    private javax.swing.JTextField txtMoratorios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
