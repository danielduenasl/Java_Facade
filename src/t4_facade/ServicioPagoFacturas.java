/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_facade;

/**
 *
 * @author PC
 */
public class ServicioPagoFacturas {
    
    public void pagarFactura(String idCuenta, String idFactura, double monto) {
        System.out.println("Pagando la factura " + idFactura + " desde la cuenta " + idCuenta + " con un monto de " + monto);
    }
}
