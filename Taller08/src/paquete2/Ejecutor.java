/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese:\n1) Docente Nombramiento\n"
                    + "2)Docente Factura\nRespuesta: ");
            int eleccion = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese nombres");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String cedula = entrada.nextLine();

            switch (eleccion) {
                case 1: {
                    DocenteNombramiento docente = new DocenteNombramiento();
                    docente.establecerNombres(nombre);
                    docente.establecerCedula(cedula);
                    System.out.println("Ingrese el valor de su sueldo: ");
                    double valorSueldo = entrada.nextDouble();
                    docente.establecerValorSueldo(valorSueldo);
                    System.out.println("Ingrese el valor de las horas extras: ");
                    double valorHorasExtras = entrada.nextDouble();
                    docente.establecerValorHoraExtra(valorHorasExtras);
                    System.out.println("Ingrese el numero de horas extras:");
                    int numeroHorasExtras = entrada.nextInt();
                    docente.establecerNumeroHorasExtras(numeroHorasExtras);
                    docente.establecerSueldo();
                    System.out.printf("%s", docente);
                    entrada.nextLine();
                    break;
                }
                case 2: {
                    DocenteFactura docente = new DocenteFactura();
                    docente.establecerNombres(nombre);
                    docente.establecerCedula(cedula);
                    System.out.println("Ingrese el valor de la factura:");
                    double valorFactura = entrada.nextDouble();
                    docente.establecerValorFactura(valorFactura);
                    docente.estableceriIvaDescuento();
                    docente.establecervalorCancelar();
                    System.out.printf("%s",docente);
                    entrada.nextLine();
                    break;
                }
                default:
                    System.out.println("¡ Error, opción no válida !");
                    break;

            }
            System.out.println("\nExit:Ingresa si");
            String exit = entrada.nextLine();
            if (exit.equals("si")) {
                continuar = false;
            }

        }
    }
}
