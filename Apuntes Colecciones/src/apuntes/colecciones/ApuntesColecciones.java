/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes.colecciones;

/**
 *
 * @author USUARIO
 */
public class ApuntesColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Agus
 */
public class Objeto {

    private String p1;
    private Integer n1;

    public Objeto() {
    }

    public Objeto(String p1) {
        this.p1 = p1;
    }

    public Objeto(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "Objeto{" + "p1=" + p1 + ", n1=" + n1 + '}';
    }

    public static Comparator<Objeto> compararNumeros = new Comparator<Objeto>() {
        @Override
        public int compare(Objeto ob1, Objeto ob2) {
            return ob2.getN1().compareTo(ob1.getN1());
        }

    };
}
    }
    
}
