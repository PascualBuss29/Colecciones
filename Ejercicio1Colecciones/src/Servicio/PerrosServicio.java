/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perros;
import java.util.ArrayList;

import java.util.*;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * @author USUARIO
 */
public class PerrosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Perros ps = new Perros();
    ArrayList<String> razas = new ArrayList();

    public void crearRazas() {
        String Raza, opcion = "";
        do {
            System.out.println("Ingrese una raza de perro");
            Raza = leer.next();
            razas.add(Raza);
            System.out.println("Desea ingresar una nueva raza? S/N");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("S"));

        System.out.println(" ");

        for (String aux : razas) {
            System.out.println(aux);
        }
        Collections.sort(razas);
        ps.setRaza(razas);

        System.out.println("Ingrese una raza de perro a eliminar");
        String Raz = leer.next();

//        for (int i = 0; i < razas.size(); i++) {
//            if (razas.get(i).equals(Raz)) {
//                razas.remove(Raz);
//            } else {
//                System.out.println("No se encuentra la raza");
//            }
     //   }

        Iterator<String> it = razas.iterator();
       
        while (it.hasNext()) {
            if (it.next().equals(Raz)) {
                it.remove();
            }
        }
        Collections.sort(razas);
        ps.setRaza(razas);

        for (String aux : razas) {
            System.out.println(aux);
        }
    }

}
