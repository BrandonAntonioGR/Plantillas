/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.DAO.model;

import com.digitalfinance.DAO.entity.REF_GPT1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConsultarREFGPT1 {
    public static ArrayList<REF_GPT1> consultaREFGPT1(String numeroContrato){
        Connection con;
        PreparedStatement ps;
        try{
            con=ModelConection.getConnection();//SELECT  number ,DPD ,client_full_name ,open_principal,NOMBRE ,SPEI_CLABE ,OXXOReference ,EXTENSION_20 ,EXTENSION_30 ,Saldo_hoy ,Adeudo ,Fecha_Pago FROM [DC REPORT].[dbo].[dm_REF_GPT1]
            ps=con.prepareStatement("SELECT top 1 r.number ,r.DPD ,r.client_full_name ,r.open_principal,\n" +
                "r.NOMBRE ,r.SPEI_CLABE ,r.OXXOReference ,r.EXTENSION_20 ,r.EXTENSION_30 ,\n" +
                "r.Saldo_hoy ,r.Adeudo ,r.Fecha_Pago  ,a.TEL,a.ALGORITMO,a.tipo_cliente \n" +
                "FROM [DC REPORT].[dbo].[dm_REF_GPT1] AS r \n" +
                "LEFT JOIN DC_HIS_ASIG AS a \n" +
                "ON  a.CONTRATO=r.number \n" +
                "where r.number='"+numeroContrato+"'");//3002644277
            ResultSet rs=ps.executeQuery();
            ArrayList<REF_GPT1> lista=new ArrayList();
            while(rs.next()){
                REF_GPT1 contrato=new REF_GPT1();
                contrato.setNumber(rs.getString("number"));
                contrato.setDpd(rs.getString("DPD"));
                contrato.setClientFullName(rs.getString("client_full_name"));
                contrato.setOpen_principal(rs.getString("open_principal"));
                contrato.setNombre(rs.getString("NOMBRE"));
                contrato.setSpeiClave(rs.getString("SPEI_CLABE"));
                contrato.setOxxoReference(rs.getString("OXXOReference"));
                contrato.setExtension20(rs.getString("EXTENSION_20"));
                contrato.setExtension30(rs.getString("EXTENSION_30"));
                contrato.setSaldoHoy(rs.getString("Saldo_hoy"));
                contrato.setAdeudo(rs.getString("Adeudo"));
                contrato.setFechaPago(rs.getDate("Fecha_Pago"));
                contrato.setTel(rs.getString("TEL"));
                contrato.setAlgoritmo(rs.getString("ALGORITMO"));
                contrato.setTipoCliente(rs.getString("tipo_cliente"));
                
                lista.add(contrato);
            }
            cerrarConexion(con, ps, rs);
            return lista;
        }catch(Exception e){
            return null;
        }
        
    }
    public static void cerrarConexion(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException{
        con.close();
        ps.close();
        rs.close();
    }
    /*
    
    DE AQUI SE OBTIENE EL HISTORICO DE LOS ASIGNADOS -
    SELECT TOP (1000) [Creation_Day]
      ,[Agente]
      ,[TEL]
      ,[CONTRATO]
      ,[DPD]
      ,[Adeudo]
      ,[MIT]
      ,[MSSB]
      ,[status]
      ,[NOMBRE]
      ,[last_name]
      ,[second_last_name]
      ,[NCOMPLETO]
      ,[PLAZO_CONT]
      ,[SPEI_CLABE]
      ,[OXXOReference]
      ,[Tipo_Cliente]
      ,[Client_Type]
      ,[latest_batch_score]
      ,[PromiseAmount]
      ,[PROMESAS]
      ,[PROTA]
      ,[DPD_MAX]
      ,[DPD_MIN]
      ,[Score_DPD_MAX]
      ,[Score_Tipo_Asignacion]
      ,[Score_Vprestamos]
      ,[Score_Adeudo]
      ,[SCORE_DPD]
      ,[SCORE_Whats]
      ,[DIAS_CCC]
      ,[DIAS_MIT]
      ,[DIAS_MESSB]
      ,[SCORE_GENERAL]
      ,[ALGORITMO]
  FROM [DC REPORT].[dbo].[DC_HIS_ASIG]
    
    ---DE AQUI OBTENGO EL CORREO
    SELECT TOP (1000) [Tel_id_Vchar]
      ,[client_id]
      ,[contract_id]
      ,[correo]
  FROM [DC REPORT].[dbo].[dm_LLAVES]
    ---ESTE QUERY ES DE LOS QUE NO HAN CERRADO 
    SELECT TOP (1000) [number]
      ,[DPD]
      ,[client_full_name]
      ,[NOMBRE]
      ,[SPEI_CLABE]
      ,[OXXOReference]
      ,[EXTENSION_20]
      ,[EXTENSION_30]
      ,[Saldo_hoy]
      ,[Adeudo]
      ,[Fecha_Pago]
      ,[term]
      ,[open_principal]
      ,[open_interest]
      ,[open_penalty]
      ,[open_initial_commission]
      ,[open_insurance]
  FROM [DC REPORT].[dbo].[dm_REF_GPT1]
    */
}
