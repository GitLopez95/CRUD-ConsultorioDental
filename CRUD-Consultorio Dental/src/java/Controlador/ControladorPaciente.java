/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Include.Paciente;
import Modelo.ModeloPaciente;

/**
 *
 * @author demon
 */
public class ControladorPaciente {
     public boolean registrarPaciente(Paciente p){
         ModeloPaciente modelop = new ModeloPaciente();
        return modelop.registrar_paciente(p);
    }
}
