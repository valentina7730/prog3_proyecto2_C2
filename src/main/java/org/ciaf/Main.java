package org.ciaf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();
        Informe informe = new Informe();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Realizar Venta");
            System.out.println("3. Generar Informe de Ventas");
            System.out.println("4. Generar Informe de Inventario");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar producto
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese la descripción del producto:");
                    String descripcion = scanner.next();
                    System.out.println("Ingrese el precio del producto:");
                    double precio = scanner.nextDouble();
                    System.out.println("Ingrese la cantidad en stock del producto:");
                    int cantidadEnStock = scanner.nextInt();

                    Producto producto = new Producto(productos.size() + 1, nombre, descripcion, precio, cantidadEnStock);
                    productos.add(producto);

                    break;
                case 2:
                    // Realizar venta
                    System.out.println("Ingrese el ID del producto a vender:");
                    int idProducto = scanner.nextInt();
                    System.out.println("Ingrese la cantidad a vender:");
                    int cantidadAVender = scanner.nextInt();

                    Producto productoAVender = null;
                    for (Producto p : productos) {
                        if (p.getId() == idProducto) {
                            productoAVender = p;
                            break;
                        }
                    }

                    if (productoAVender != null) {
                        Venta venta = new Venta(ventas.size() + 1);
                        venta.agregarProducto(productoAVender);
                        ventas.add(venta);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }

                    break;
                case 3:
                    // Generar informe de ventas
                    informe.generarInformeDeVentas(ventas);
                    break;
                case 4:
                    // Generar informe de inventario
                    informe.generarInformeDeInventario(productos);
                    break;
                case 5:
                    // Salir
                    System.out.println("Adiós!");
                    return;
            }
        }
    }
}