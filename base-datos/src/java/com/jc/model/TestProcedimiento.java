/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author campitos
 */
public class TestProcedimiento {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
        try{
        CallableStatement callate=con.prepareCall("{call Insertar_usuario1(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"DAMIANN");
        callate.setString(3,"DAMIANN");
        callate.execute();
        int pk=callate.getInt(1);
        System.out.println("EBien hecho has ingresado nuevo usuario");
        }catch(Exception e){
        System.out.println(e.getMessage());}
        }
    }
    

