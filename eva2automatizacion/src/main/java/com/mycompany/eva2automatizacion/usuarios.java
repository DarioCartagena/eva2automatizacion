/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eva2automatizacion;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */
public class usuarios {
    
    public String usuario;
    public String contraseña;

    
    public usuarios(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    @Override
    public String toString() {
        return "Usuarios{" + "usuario='" + usuario + '\'' + ", contraseña='" + contraseña + '\'' + '}';
    }
}


