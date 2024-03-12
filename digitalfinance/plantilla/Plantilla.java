/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.digitalfinance.plantilla;

import com.digitalfinance.controller.ControllerPantallas;
import com.opencsv.exceptions.CsvException;
import java.io.IOException;

//@author Brandon Antonio Garduño Rubio
public class Plantilla {

    public static void main(String[] args) throws CsvException, IOException {
        ControllerPantallas cp= new ControllerPantallas();
//        cp.Login();
        cp.Menu();
    }
}
