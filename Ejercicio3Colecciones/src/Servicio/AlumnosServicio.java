/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumnos;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class AlumnosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alumnos a1 = new Alumnos();

    public void crearAlumno() {
        ArrayList<String> Alumnos = new ArrayList<>();
        String alumno;
        ArrayList<Integer> notas = new ArrayList<>();
        int nota;
        do {
            System.out.println("Ingrese el nombre del alumno");
            alumno = leer.next();
            Alumnos.add(alumno);
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la Nota N° " + (i + 1));
                nota = leer.nextInt();
                notas.add(nota);

            }
            System.out.println("Desea ingresar un nuevo alumno? S/N");
            alumno = leer.next();

        } while (alumno.equalsIgnoreCase("S"));
        for (String alu : Alumnos) {
            System.out.println(alu);

        }
        Collections.sort(Alumnos);
        a1.setNombre(alumno);
        a1.setNotas(notas);
    }

    public double notaFinal() {
        double promedio = 0;
        String nombre;
        System.out.println("Ingrese el alumno a buscar");
        nombre = leer.next();
        if (a1.getNombre().equalsIgnoreCase(nombre)) {

        }
        for (int nota : a1.getNotas()) {
            promedio += nota;
        }

        return (double) promedio / a1.getNotas().size();

    }

    public void mostar() {
        System.out.println("El promedio es: " + notaFinal());

    }
}
