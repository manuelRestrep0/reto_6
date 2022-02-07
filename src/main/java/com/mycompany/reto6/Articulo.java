package com.mycompany.reto6;

import java.util.Scanner;

public class Articulo {
    String nombreArticulo;
    String descripcionArticulo;
    double valorEstimado;

    public Articulo() {
    }

    public Articulo(String nombreArticulo, String descripcionArticulo, double valorEstimado) {
        this.nombreArticulo = nombreArticulo;
        this.descripcionArticulo = descripcionArticulo;
        this.valorEstimado = valorEstimado;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

}
