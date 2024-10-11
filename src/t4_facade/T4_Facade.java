/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_facade;

/**
 *
 * @author PC
 */
public class T4_Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FachadaBancaria fachadaBancaria = new FachadaBancaria();
        fachadaBancaria.obtenerDetallesCuenta("123456");
        fachadaBancaria.transferirFondos("123456", "654321", 100.0);
        fachadaBancaria.pagarFactura("123456", "FACTURA001", 50.0);


    }
    
}
