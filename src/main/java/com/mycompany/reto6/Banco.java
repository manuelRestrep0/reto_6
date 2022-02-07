package com.mycompany.reto6;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Banco extends Cliente {
    Map<Double,Cliente> clientes;
    
    public void sumaColectiva(){
        double suma=0;
        Set<Double> claves = clientes.keySet();
        Iterator<Double> iterador = claves.iterator();
        while(iterador.hasNext())
        {
            Double clave = iterador.next();
            clientes.get(clave).sumaIndividual();
            suma += clientes.get(clave).valorEstimadoCliente;
        }
        
        System.out.println("La suma total es: "+ suma);
    }
    
    public void retirarCliente(Double clave){
        this.clientes.remove(clave);
    }
    
    public Cliente agregarCliente(double cedul){
        System.out.println("Introduzca su nombre completo");
        Scanner input = new Scanner(System.in);
        String nombre = input.nextLine();
        System.out.println("Introduzca su pais de origen");
        input = new Scanner(System.in);
        String pais = input.nextLine();
        
        return new Cliente(cedul,nombre,pais);
    } 
    
    public Articulo agregarArticulos(){
        System.out.println("Introduzca el nombre del articulo");
        Scanner input = new Scanner(System.in);
        String nombreArticulo_ = input.nextLine();
        System.out.println("Introduzca una breve descripcion");
        input = new Scanner(System.in);
        String descripcion = input.nextLine();
        System.out.println("Introduzca el valor estimado del articulo");
        input = new Scanner(System.in);
        double valor = input.nextDouble();
        return new Articulo(nombreArticulo_,descripcion,valor);   
    }
    
}
