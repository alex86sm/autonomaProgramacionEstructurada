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
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo;
        double retiro;

        System.out.println("Ingrese el saldo disponible:");
        saldo = scanner.nextDouble();

        System.out.println("Ingrese el monto a retirar:");
        retiro = scanner.nextDouble();

        if (retiro <= saldo) {
            saldo = saldo - retiro;
            System.out.println("Retiro realizado con éxito.");
            System.out.println("Nuevo saldo disponible: S/ " + saldo);
        } else {
            System.out.println("No cuenta con saldo suficiente.");
            System.out.println("Saldo disponible: S/ " + saldo);
        }

        scanner.close();
    }

}
