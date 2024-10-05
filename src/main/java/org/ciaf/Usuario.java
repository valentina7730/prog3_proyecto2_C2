package org.ciaf;

import java.util.HashMap;
import java.util.Scanner;

public class Usuario {

    private HashMap<String, String> administrador;
    private HashMap<String, String> empleado;
    private HashMap<String, String> vendedor;
    private Scanner scanner;



    public Usuario() {
        administrador = new HashMap<>();
        empleado = new HashMap<>();
        vendedor = new HashMap<>();

        administrador.put("admin", "admin123");
        empleado.put("almace", "almace123");
        vendedor.put("cont", "cont123");

        scanner = new Scanner(System.in);
    }
}
