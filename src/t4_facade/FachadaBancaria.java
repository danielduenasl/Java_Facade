/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_facade;

/**
 *
 * @author PC
 */
public class FachadaBancaria {
    
    private ServicioCuenta servicioCuenta;
    private ServicioTransferencia servicioTransferencia;
    private ServicioPagoFacturas servicioPagoFacturas;

    public FachadaBancaria() {
        this.servicioCuenta = new ServicioCuenta();
        this.servicioTransferencia = new ServicioTransferencia();
        this.servicioPagoFacturas = new ServicioPagoFacturas();
    }

    public void obtenerDetallesCuenta(String idCuenta) {
        servicioCuenta.obtenerDetallesCuenta(idCuenta);
    }

    public void transferirFondos(String desdeCuenta, String haciaCuenta, double monto) {
        servicioTransferencia.transferirFondos(desdeCuenta, haciaCuenta, monto);
    }

    public void pagarFactura(String idCuenta, String idFactura, double monto) {
        servicioPagoFacturas.pagarFactura(idCuenta, idFactura, monto);
    }
    
}
