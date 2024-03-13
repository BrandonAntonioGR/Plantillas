/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.digitalfinance.DAO.entity.Macro;
import com.digitalfinance.DAO.model.ConsultaMacro;
import java.util.ArrayList;


public class ControllerMacro {
    public ArrayList<Macro> consultaMacro(String numeroContrato,String dpd ){
        return  ConsultaMacro.consultaMacro(numeroContrato, dpd);
    }
}
