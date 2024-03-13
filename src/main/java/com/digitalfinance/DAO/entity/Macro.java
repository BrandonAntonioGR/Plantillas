/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.DAO.entity;

import java.sql.Date;


public class Macro extends REF_GPT1{
    private String agente;
    private String correo;
    private String promesas;
    private String diasCCC;
    private String diasMit;
    private String diasMssb;

    public Macro() {
    }

    public Macro(String agente, String correo, String promesas, String diasCCC, String diasMit, String diasMssb, String number, String dpd, String clientFullName, String nombre, String speiClave, String oxxoReference, String adeudo, String tel, String algoritmo, String tipoCliente) {
        super(number, dpd, clientFullName, nombre, speiClave, oxxoReference, adeudo, tel, algoritmo, tipoCliente);
        this.agente = agente;
        this.correo = correo;
        this.promesas = promesas;
        this.diasCCC = diasCCC;
        this.diasMit = diasMit;
        this.diasMssb = diasMssb;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPromesas() {
        return promesas;
    }

    public void setPromesas(String promesas) {
        this.promesas = promesas;
    }

    public String getDiasCCC() {
        return diasCCC;
    }

    public void setDiasCCC(String diasCCC) {
        this.diasCCC = diasCCC;
    }

    public String getDiasMit() {
        return diasMit;
    }

    public void setDiasMit(String diasMit) {
        this.diasMit = diasMit;
    }

    public String getDiasMssb() {
        return diasMssb;
    }

    public void setDiasMssb(String diasMssb) {
        this.diasMssb = diasMssb;
    }

    
    
    
}
