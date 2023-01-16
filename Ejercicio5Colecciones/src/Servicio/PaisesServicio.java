/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Comparator.comparadores;
import Entidad.Paises;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author USUARIO
 */
public class PaisesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    TreeSet<Paises> paises = new TreeSet(comparadores.ordenarAlfabetica);

    public void crearPais() {
        String  op = "";
        do {
            Paises p1 = new Paises();
            System.out.println("Ingrese un pais");
            p1.setPais(leer.next());
            paises.add(p1);
            System.out.println("Desea ingresar un nuevo pais?S/N");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));

    }

    public void mostrarPaises() {
        for (Paises p : paises) {
            System.out.println(p);
        }
        System.out.println(" ");
    }

    public void ordenarPaisesAlf() {

        for (Paises p : paises) {
            System.out.println(p);
        }
        System.out.println(" ");
    }

    public void buscarPais() {
        String paisb;
        System.out.println("Ingrese un pis a buscar");
        paisb = leer.next();
        Iterator<Paises> it = paises.iterator();

        while (it.hasNext()) {
            String aux = it.next().getPais();
            if (aux.equals(paisb)) {
                it.remove();
            } else {
                System.out.println("El pais no se encuentra");

                System.out.println(" ");
            }
            for (Paises p : paises) {
                System.out.println(p);
            }
        }
    }
}
