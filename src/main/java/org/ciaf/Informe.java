package org.ciaf;

import java.util.List;

public class Informe {
    // Método para generar informe de ventas
    public void generarInformeDeVentas(List<Venta> ventas) {
        System.out.println("Informe de Ventas:");
        System.out.println("------------------");
        for (Venta venta : ventas) {
            System.out.println("Venta #" + venta.getIdDeVenta());
            System.out.println("Fecha y Hora: " + venta.getFechaYHora());
            System.out.println("Productos Vendidos:");
            for (Producto producto : venta.getProductosVendidos()) {
                System.out.println("  - " + producto.getNombre() + " (Cantidad: " + producto.getCantidadEnStock() + ")");
            }
            System.out.println("Total de la Venta: " + venta.getTotalDeLaVenta());
            System.out.println();
        }
    }

    // Método para generar informe de inventario
    public void generarInformeDeInventario(List<Producto> productos) {
        System.out.println("Informe de Inventario:");
        System.out.println("------------------");
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("  - Cantidad en Stock: " + producto.getCantidadEnStock());
            System.out.println("  - Precio: " + producto.getPrecio());
            System.out.println();
        }
    }
}