/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.digitalfinance.view.AdminPlantillas;
import com.digitalfinance.view.AgregaPlantilla;
import com.digitalfinance.view.ExaminaPlantilla;
import com.digitalfinance.view.ModificaPlantilla;
import com.digitalfinance.view.Menu;
import com.digitalfinance.view.InicioSesion;
import com.digitalfinance.view.ViewMacro;
import com.digitalfinance.DAO.entity.Plantilla;
import com.digi.view.Principal;
import com.digi.view.ExaminarPlantilla;
import com.digi.view.AgregarPlantilla;
import com.digi.view.Login;
import com.digi.view.ModificarPlantilla;
import java.sql.SQLException;


public class ControllerPantallas {
    public void InicioSesion(){
        InicioSesion login = new InicioSesion();
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
    }
    public void Menu(){
        Menu menu=new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
    }
    public void Macro() throws SQLException{
        ViewMacro macro=new ViewMacro();
        macro.setVisible(true);
        macro.setLocationRelativeTo(null);
        macro.setResizable(false);
    }
    public void AdministraPlantilla(){
        AdminPlantillas mp= new AdminPlantillas();
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        mp.setResizable(false);
    }
    public void ExaminaPlantilla(Plantilla pl){
        ExaminaPlantilla ep= new ExaminaPlantilla(pl);
        ep.setVisible(true);
        ep.setLocationRelativeTo(null);
        ep.setResizable(false);
    }
    public void AgregaPlantilla(){
        AgregaPlantilla ap= new AgregaPlantilla();
        ap.setVisible(true);
        ap.setLocationRelativeTo(null);
        ap.setResizable(false);
    }
    public void ModificaPlantilla(Plantilla pl,int i){
        ModificaPlantilla mp= new ModificaPlantilla(pl,i);
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        mp.setResizable(false);
    }

    
    
    
    
    
    public void Login(){
        Login login = new Login();
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
    }
    public void Principal1(){
        Principal menu=new Principal();
        menu.setVisible(true);
        int nuevoAncho = 815;
        int nuevoAlto = 480;
        menu.setSize(nuevoAncho, nuevoAlto);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
    }
    public void Principal2(int aux){
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
