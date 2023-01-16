/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Perros {
  
   private ArrayList<String> raza;

    public Perros() {
    }

    public Perros(ArrayList<String> raza) {
        this.raza = raza;
    }

    public ArrayList<String> getRaza() {
        return raza;
    }

    public void setRaza(ArrayList<String> raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perros{" + "raza=" + raza + '}';
    }

   

    
}
