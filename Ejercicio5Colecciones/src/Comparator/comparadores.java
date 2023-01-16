/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

import Entidad.Paises;
import java.util.Comparator;

/**
 *
 * @author USUARIO
 */
public class comparadores {

    public static Comparator<Paises> ordenarAlfabetica = new Comparator<Paises>() {
        @Override
        public int compare(Paises t, Paises t1) {
          return t.getPais().compareTo(t1.getPais());
        }

    };

}

