/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5colecciones;

import Servicio.PaisesServicio;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisesServicio ps = new PaisesServicio();
        ps.crearPais();
        ps.mostrarPaises();
        ps.ordenarPaisesAlf();
        ps.buscarPais();
    }
    
}
