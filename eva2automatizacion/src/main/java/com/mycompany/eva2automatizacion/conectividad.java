/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eva2automatizacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */
public class conectividad {

    private static final String URL = "jdbc:mysql://localhost:3306/eva2_automatizacion";
    private static final String USER = "root";
    private static final String PASSWORD = " ";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
        public static void testConnection() {
        try (Connection conexion = getConnection() ){
            
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        
    }
}
