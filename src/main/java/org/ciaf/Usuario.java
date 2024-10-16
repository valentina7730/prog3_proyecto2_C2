package org.ciaf;

public class Usuario {
    private String nombreDeUsuario;
    private String contraseña;
    private Rol rol;

    // Constructor
    public Usuario(String nombreDeUsuario, String contraseña, Rol rol) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Getters y setters
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    // Método para verificar la contraseña
    public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }
}