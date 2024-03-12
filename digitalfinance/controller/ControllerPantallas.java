/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.digitalfinance.DAO.entity.Plantilla;
import com.digitalfinance.view.Principal;
import com.digitalfinance.view.ExaminarPlantilla;
import com.digitalfinance.view.AgregarPlantilla;
import com.digitalfinance.view.Login;
import com.digitalfinance.view.ModificarPlantilla;


public class ControllerPantallas {
    public void Login(){
        Login login = new Login();
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
    }
    public void Menu(){
        Principal menu=new Principal();
        menu.setVisible(true);
        int nuevoAncho = 815;
        int nuevoAlto = 480;
        menu.setSize(nuevoAncho, nuevoAlto);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
    }
    public void Menu(int aux){
        Principal menu=new Principal(aux);
        menu.setVisible(true);
        int nuevoAncho = 815;
        int nuevoAlto = 480;
        menu.setSize(nuevoAncho, nuevoAlto);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
    }
    public void ExaminarPlantilla(Plantilla pl){
        ExaminarPlantilla ep= new ExaminarPlantilla(pl);
        ep.setVisible(true);
        ep.setLocationRelativeTo(null);
        ep.setResizable(false);
    }
    public void AgregarPlantilla(){
        AgregarPlantilla ap= new AgregarPlantilla();
        ap.setVisible(true);
        ap.setLocationRelativeTo(null);
        ap.setResizable(false);
    }
    public void ModificarPlantilla(Plantilla pl,int i){
        ModificarPlantilla mp= new ModificarPlantilla(pl,i);
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        mp.setResizable(false);
    }
}
