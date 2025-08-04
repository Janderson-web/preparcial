package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Deseamos construir un programa por consola
        //que permita la gestion de pedidos
        //de una plataforma como rapi

        //un pedido tiene:
        //1. ID
        //2. Fecha
        //3. Lista de productos
        //4. Direccion de envio
        //5. Nombre del cliente de envio
        //6. Nombre del restaurante

        //Necesitamos construir un menu
        //1. Crear pedido
        //2. Ver pedido
        //3. Eliminar pedido
        //4. Salir

        //ENTRADAS DEL PROBLEMA


        Scanner leerDato = new Scanner (System.in);
        Integer controlDelCiclo =100;


        ArrayList<Object>pedidos=new ArrayList<>();



        while(controlDelCiclo !=4){

            //Creando un arreglo en JAVA
            //ArrayList<Object>pedidos=new ArrayList<>();
            //ArrayList<Integer>numeros=new ArrayList<>();
            //ArrayList<String>nombres=new ArrayList<>();
            //ArrayList<Double>promedios=new ArrayList<>();

            //Creando un diccionario en JAVA
            //HashMap<String, Object>persona=new HashMap<>();
            //HashMap<String, Object>pelicula=new HashMap<>();


            //Llenando un arreglo
            //numeros.add(20);
            //numeros.add(100);
            //numeros.add(leerDato.nextInt());
            //nombres.add("Janderson");

            //Llenando un diccionario u objeto
            //persona.put("nombre", "Janderson Andres");
            //persona.put("edad", 20);
            //persona.put("Telefono","3104720071");
            //persona.put("HinchaDelDim", false);



            System.out.println("Apreciado Usuario, digita una opcion:");
            controlDelCiclo=leerDato.nextInt();

            if(controlDelCiclo==1){
                System.out.println("Estoy registrando un pedido");
                HashMap<String, Object>pedido=new HashMap<>();

                //llenando diccionario
                pedido.put("id","1");
                pedido.put("fecha","2025-08-04");

                //llenando el arraylist
                pedidos.add(pedido);

            }else if(controlDelCiclo==2){
                System.out.println("estoy consultando los pedidos");
            } else if(controlDelCiclo==3) {
                System.out.println("Estamos eliminando tu pedido");
            }else if (controlDelCiclo==4){
                System.out.println("Gracias, hasta pronto");
            }
            else {
                System.out.println("revise");
            }
        }
    }
}