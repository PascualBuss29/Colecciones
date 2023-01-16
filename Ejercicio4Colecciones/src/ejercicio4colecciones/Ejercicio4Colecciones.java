/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4colecciones;

import Entidad.Pelicula;
import Servicio.Peliculaservicio;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio4Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Peliculaservicio ps = new Peliculaservicio();
        Pelicula p1 = new Pelicula();
        String op = "";
        do {
            System.out.println("Vamos crear la pelicula");
            ps.crearPelicula();
         
            System.out.println("Desea agregar una nueva pelicula?S/N");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));
        System.out.println("Mostrar todas las peliculas");
        ps.mostrar();
        System.out.println("Mostrar las que duren mas de 1 hs");
        ps.mostrarHora();
        System.out.println("Mostrar de forma descendente");
        ps.ordenDes();
        System.out.println("Mostrar de formas ascendente");
        ps.ordenAsc();
        System.out.println("Mostrar por director");
        ps.ordenDirector();
        System.out.println("Mostrar por titulo");
        ps.ordenTitulo();
    }

}
