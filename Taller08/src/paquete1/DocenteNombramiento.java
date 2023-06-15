/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Locale;

/**
 * 0
 *
 * @author L
 */
public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtras;
    private double sueldo;

    public void establecerValorSueldo(double n) {
        valorSueldo = n;

    }

    public void establecerValorHoraExtra(double n) {
        valorHoraExtra = n;

    }

    public void establecerNumeroHorasExtras(int n) {
        numeroHorasExtras = n;

    }

    public void establecerSueldo() {
        sueldo = valorSueldo + (valorHoraExtra * numeroHorasExtras);;

    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHorasExtras() {
        return valorHoraExtra;
    }

    public int obtenerNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String reporte = String.format(""
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Sueldo: %.2f\n"
                + "Valor Hora Extras: %.2f\n"
                + "Numero Horas Extras: %d\n"
                + "Sueldo: %.2f",
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValorHorasExtras(),
                obtenerNumeroHorasExtras(),
                obtenerSueldo());
        return reporte;

    }
}
