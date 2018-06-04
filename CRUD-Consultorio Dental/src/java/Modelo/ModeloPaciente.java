/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Include.Paciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author demon
 */
public class ModeloPaciente extends Conexion {
    public boolean registrar_paciente(Paciente p){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call insertPaciente(?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getAp());
            pst.setString(3, p.getAm());
            pst.setString(4, p.getSexo());
            pst.setString(5, p.getFechaNac());
            pst.setString(6, p.getDomicilio());
            pst.setString(7, p.getTel());
            pst.setInt(8, p.getIdOcupacion());
            
            if(pst.executeUpdate() == 1){
                flag = true;
            }
        } catch (SQLException e) {
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (SQLException e) {
            }
        }        
        return flag;
    }
   /* public static void main(String[] args) throws ParseException {
        ModeloPaciente mp = new ModeloPaciente();        
        Paciente p = new Paciente(0, "nombre p", "ap", "am", "F", "2017-05-14", "domicilio","1234567891011",1);
        boolean flag = mp.registrar_paciente(p);
        System.out.println(flag);
    }*/
}
