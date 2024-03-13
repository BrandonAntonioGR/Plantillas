/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.utilities;

import java.util.List; 

public interface  ProveedorDatosPaginacion<T> {
    int getTotalRowCount(); 
    List<T> getRows(int starIndex,int endIndex);
}
