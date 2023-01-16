/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import Entidad.Tienda;
import java.util.Comparator;

/**
 *
 * @author USUARIO
 */
public class comparadores {
     public static Comparator<Tienda> ordenarProducto = new Comparator<Tienda>() {
         @Override
         public int compare(Tienda t, Tienda t1) {
            return t.getProducto().compareTo(t1.getProducto());
         }
     };
     public static Comparator<Tienda> ordenarPrecio = new Comparator<Tienda>() {
         @Override
         public int compare(Tienda t, Tienda t1) {
            return t.getPrecio().compareTo(t1.getPrecio());
         }
     };
}
