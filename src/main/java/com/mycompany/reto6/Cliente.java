package com.mycompany.reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Articulo {
    double cedula;
    String nombreCompleto;
    String paisOrigen;
    int identificador;
    double valorEstimadoCliente;
    List<Articulo> articulosCliente = new ArrayList();

    public Cliente() {
    }

    public Cliente(double cedula, String nombreCompleto, String paisOrigen) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", paisOrigen=" + paisOrigen + ", identificador=" + identificador + ", articulosCliente=" + articulosCliente + '}';
    }

    
    public void sumaIndividual(){
        double suma=0;
        for(Articulo i : this.articulosCliente)
        {
            suma += i.getValorEstimado();
        }
        this.valorEstimadoCliente = suma;
        System.out.println("La suma total de los articulos del cliente es: "+suma);  
    }
    
    public void retirarArticulo(Articulo art){
        this.articulosCliente.remove(art);
    }
}
