package com.mycompany.reto6;

import java.util.Hashtable;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Banco miBank = new Banco();
        miBank.clientes = new Hashtable<>();
        
        Cliente e = new Cliente(1001,"juan carlos","croacia");
        miBank.clientes.put(e.cedula, e);
        e = new Cliente(10001,"maria camila","canada");
        miBank.clientes.put(e.cedula, e);
        
        miBank.clientes.get((double)1001).articulosCliente.add(new Articulo("reloj","reloj de oro",3333333));
        miBank.clientes.get((double)1001).articulosCliente.add(new Articulo("pulsera","pulsera de oro",1111333));
        
        miBank.clientes.get((double)10001).articulosCliente.add(new Articulo("reloj","reloj rolex",3444444));
        miBank.clientes.get((double)10001).articulosCliente.add(new Articulo("cadena","cadena de oro",11111111));
        
        boolean ejecucion = true;
        while(ejecucion){
            System.out.println("""
                               Introduzca una opcion:
                               1)Agregar y quitar clientes.
                               2)Agregar y quitar articulos.
                               3)Mostrar los datos de un cliente dada su cedula.
                               4)Suma de valores.""");
            Scanner input = new Scanner(System.in);
            switch(input.nextInt()){
                case 1:{
                    System.out.println("1)Para agregar.\n2)Para quitar");
                    switch(eleccion()){
                        case 1:{
                            double cedula = inputDouble();
                            if(miBank.clientes.containsKey(cedula)==false){
                                miBank.clientes.put(cedula,miBank.agregarCliente(cedula));
                            }
                            break;
                        }
                        case 2:{
                            miBank.retirarCliente(inputDouble());
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("1)Para agregar.\n2)Para quitar");
                    switch(eleccion()){
                        case 1:{
                            miBank.clientes.get(inputDouble()).articulosCliente.add(miBank.agregarArticulos());
                            break;
                        }
                        case 2:{
                            miBank.clientes.get(inputDouble()).retirarArticulo(miBank);
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    double cedula = inputDouble();
                    if(miBank.clientes.containsKey(cedula)==true){
                        System.out.println(miBank.clientes.get(cedula).toString());
                        break;
                    }
                    else
                        System.out.println("Cedula invalida");
                    break;
                }
                case 4:{
                    System.out.println("""
                                       1)Para mostrar el valor de un cliente.
                                       2)Para mostrar el valor de todoslos clientes.""");
                    switch(eleccion()){
                        case 1:{
                            miBank.clientes.get(inputDouble()).sumaIndividual();
                            break;
                        }
                        case 2:{
                            miBank.sumaColectiva();
                            break;
                        }
                    }
                    break;
                }
                default:{
                    ejecucion = false;
                }
            }
        }
    }
 public static int eleccion(){

    Scanner input = new Scanner(System.in);
    return input.nextInt(); 
 }
 public static double inputDouble(){
     System.out.println("Introduzca su cedula");
    Scanner input = new Scanner(System.in);
    return input.nextDouble(); 
 }




    
}




