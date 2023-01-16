/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3colecciones;

import Entidad.Alumnos;
import Servicio.AlumnosServicio;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumnos a1 = new Alumnos();

        AlumnosServicio as = new AlumnosServicio();

        as.crearAlumno();

        as.mostar();
    }

}
