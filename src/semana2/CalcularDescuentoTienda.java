/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class CalcularDescuentoTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double montoCompra;
        double descuento = 0;
        double totalPagar;

        System.out.println("Ingrese el monto de la compra:");
        montoCompra = scanner.nextDouble();

        if (montoCompra > 500) {
            descuento = montoCompra * 0.20;
        }

        totalPagar = montoCompra - descuento;

        System.out.println("Monto de la compra: S/ " + montoCompra);
        System.out.println("Descuento aplicado: S/ " + descuento);
        System.out.println("Total a pagar: S/ " + totalPagar);

        scanner.close();
    }

}
