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
public class SistemaCalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int promedio;

        System.out.println("Ingrese el promedio:");
        promedio = scanner.nextInt();

        if (promedio >= 18 && promedio <= 20) {
            System.out.println("Excelente");
        } else if (promedio >= 14 && promedio <= 17) {
            System.out.println("Bueno");
        } else if (promedio >= 11 && promedio <= 13) {
            System.out.println("Regular");
        } else if (promedio >= 0 && promedio < 11) {
            System.out.println("Desaprobado");
        } else {
            System.out.println("Promedio inválido");
        }
        scanner.close();
    }
    
}
