/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    
   protected String nombres;
   protected String cedula;
    public void establecerNombres(String n) {
        nombres = n;
    }
     public void establecerCedula(String n) {
        cedula = n;
    }
     public String obtenerNombres() {
        return nombres;
    }
      public String obtenerCedula() {
        return cedula;
    }
    
}
