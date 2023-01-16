/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1colecciones;

import Entidad.Perros;
import Servicio.PerrosServicio;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerrosServicio ps = new PerrosServicio();
        Perros p1 = new Perros();
        ps.crearRazas();
        
    }
    
}
