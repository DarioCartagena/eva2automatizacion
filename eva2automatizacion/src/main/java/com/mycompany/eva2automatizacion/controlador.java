/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eva2automatizacion;



import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author JOSE DARIO CARTAGENA
 */
public class controlador {
    

    public boolean login(String username, String password) {
        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        try (Connection conectividad1 = conectividad.getConnection();
             PreparedStatement statment = conectividad1.prepareStatement(sql)) {

           statment.setString(1, username);
           statment.setString(2, password);

           try (ResultSet resultado = statment.executeQuery() ) {
           
                   return resultado.next ();
           }

        } catch (SQLException e) {
            System.err.println("Error al validar usuario: " + e.getMessage());
        }
            return false;
        }
    }


