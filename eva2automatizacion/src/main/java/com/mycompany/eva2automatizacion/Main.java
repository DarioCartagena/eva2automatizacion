/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eva2automatizacion;

import java.util.Scanner;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */
public class Main {
    

    public static void main(String[] args) {
        controlador controlador = new controlador();
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Inicio de sesión ***");
        System.out.println("Ingrese el usuario: ");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();

        
        if (controlador.login(usuario, contraseña)) {
            System.out.println("Login exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}

