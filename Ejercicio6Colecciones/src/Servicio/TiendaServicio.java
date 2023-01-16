/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tienda;
import comparator.comparadores;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TiendaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Integer> productos = new HashMap<>();

    public void crearTienda() {
        String op = "";
        do {
            Tienda t1 = new Tienda();
            System.out.println("Ingrese un producto");
            t1.setProducto(leer.next());

            System.out.println("Ingrese el precio");
            t1.setPrecio(leer.nextInt());
            productos.put(t1.getProducto(), t1.getPrecio());
            System.out.println("Desea ingresar un nuevo producto?S/N");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));
    }

    public void modificarPrecio() {

        System.out.println("Ingrese el nombre del producto a modificar el precio");
        String aux = leer.next();
        int valor;
        if (productos.containsKey(aux)) {
            System.out.println("Que precio desea para este producto?");
            valor = leer.nextInt();
            productos.replace(aux, valor);
        }
    }

    public void eliminar() {
        System.out.println("Ingrese un producto que desea eliminar");
        String prod = leer.next();
        productos.remove(prod);
    }

    public void mostrar() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " $ " + value);
            
        }
        compararP();
        ordenPrecio();
    }

    public void compararP() {
        System.out.println("------------:::LISTA DE PRODUCTOS POR NOMBRE:::------------");
        productos.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println("" + entry.getKey() + " $ " + entry.getValue()));

    }
    public void ordenPrecio(){
        System.out.println("------------:::LISTA DE PRODUCTOS POR PRECIO:::------------");
        productos.entrySet().stream().sorted(Map.Entry.comparingByValue())/// ORDENAR POR VALOR
        .forEach(entry->System.out.println(""+entry.getKey()+" $ " + entry.getValue()));
        System.out.println("................");
    }


    public void menu() {
        int opcion;
        do {
            System.out.println("");
            System.out.println("------------:::MENU:::------------");
            System.out.println("Qué desea realizar:\n"
                    + "1- Ingresar producto.\n"
                    + "2- Modificar un precio.\n"
                    + "3- Eliminar un producto.\n"
                    + "4- Mostrar lista de productos.\n"
                    + "5- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearTienda();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    System.out.println("Esta saliendo de la tienda");
                    break;
                default:
                    System.out.println("Error, ingrese una opcion valida");
            }

        } while (opcion != 5);
    }
}
