/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.*;
import newpackage.Utilidades.comparadores;

/**
 *
 * @author USUARIO
 */
public class Peliculaservicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> lista;

    public Peliculaservicio() {
        lista = new ArrayList<Pelicula>();
    }

    public void crearPelicula() {
        Pelicula p1 = new Pelicula();
        String op = "", titulo, director;
        double duracion;
        System.out.println("Ingrese el titulo de la pelicula");
        titulo = leer.next();
        System.out.println("Ingrese el director");
        director = leer.next();
        System.out.println("Ingrese la duracion de la pelicula");
        duracion = leer.nextDouble();
        crearPel(titulo, director, duracion);
    }

    public void crearPel(String titulo, String director, double duracion) {
        Pelicula p1 = new Pelicula();
        p1.setTitulo(titulo);
        p1.setDirector(director);
        p1.setDuracion(duracion);
        agregarPelicula(p1);
    }

    public void agregarPelicula(Pelicula p1) {
        lista.add(p1);
    }

    public void mostrar() {
        for (Pelicula pel : lista) {
            System.out.println(pel);
        }

    }

    public void mostrarHora() {
        for (Pelicula pel : lista) {
            if (pel.getDuracion() > 1) {
                System.out.println(pel);
            }
        }
    }

    public void ordenDes() {
        Collections.sort(lista, comparadores.ordenarPorDuracionDes);
        for (Pelicula pel : lista) {
            System.out.println(pel);
        }

    }

    public void ordenAsc() {
        Collections.sort(lista, comparadores.ordenarPorDuracionAsc);
        for (Pelicula pel : lista) {
            System.out.println(pel);
        }

    }

    public void ordenTitulo() {
        Collections.sort(lista, comparadores.ordenarPorTitulo);
        for (Pelicula pel : lista) {
            System.out.println(pel);
        }

    }

    public void ordenDirector() {
        Collections.sort(lista, comparadores.ordenarPorDirector);
        for (Pelicula pel : lista) {
            System.out.println(pel);
        }

    }
}
