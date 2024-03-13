/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.utilities;

import java.util.ArrayList; 
import java.util.List; 
import javax.swing.table.AbstractTableModel; 


public abstract class ModeloDeTabla<T> extends AbstractTableModel{
     List<T> lista = new ArrayList<T>(); 
 
    public List<T> getLista() { 
        return lista; 
    } 
 
    public void setLista(List<T> lista) { 
        this.lista = lista; 
    } 
    @Override 
    public int getRowCount(){ 
        return lista.size(); 
    } 
    public Object getValueAt(int fila,int columna){ 
        T t = lista.get(fila); 
        return getValueAt(t, columna); 
    } 
     
    public abstract Object getValueAt(T t,int columna); 
    @Override 
    public abstract String getColumnName(int columna);
}
