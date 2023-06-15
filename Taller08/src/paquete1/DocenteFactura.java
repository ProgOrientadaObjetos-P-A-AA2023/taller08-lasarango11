/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author L
 */
public class DocenteFactura extends Docente {

    protected double valorFactura;
    protected double ivaDescuento;
    protected double valorCancelar;

    public void establecerValorFactura(double n) {
        valorFactura = n;
    }

    public void estableceriIvaDescuento() {
        ivaDescuento = 0.12;
    }
    //calculo valor a cancelar 

    public void establecervalorCancelar() {
        valorCancelar = valorFactura - (valorFactura * ivaDescuento);
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obteneriVaDescuento() {
        return ivaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format(""
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Factura: %.2f\n"
                + "Iva Descuento: %.2f\n"
                + "Valor Cancelar %.2f",
                 obtenerNombres(),
                obtenerCedula(),
                obtenerValorFactura(),
                obteneriVaDescuento(),
                obtenerValorCancelar());
        return reporte;
    }

}
