package org.ciaf;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idDeVenta;
    private List<Producto> productosVendidos;
    private double totalDeLaVenta;
    private LocalDateTime fechaYHora;


    public Venta(int idDeVenta) {
        this.idDeVenta = idDeVenta;
        this.productosVendidos = new ArrayList<>();
        this.totalDeLaVenta = 0.0;
        this.fechaYHora = LocalDateTime.now();
    }


    public int getIdDeVenta() {
        return idDeVenta;
    }

    public void setIdDeVenta(int idDeVenta) {
        this.idDeVenta = idDeVenta;
    }

    public List<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public double getTotalDeLaVenta() {
        return totalDeLaVenta;
    }

    public void setTotalDeLaVenta(double totalDeLaVenta) {
        this.totalDeLaVenta = totalDeLaVenta;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }


    public void agregarProducto(Producto producto) {
        this.productosVendidos.add(producto);
        this.totalDeLaVenta += producto.getPrecio();
    }


    public double calcularTotalDeLaVenta() {
        return this.totalDeLaVenta;
    }
}

