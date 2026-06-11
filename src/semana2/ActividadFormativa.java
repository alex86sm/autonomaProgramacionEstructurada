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
public class ActividadFormativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int nota;

        System.out.println("=== SISTEMA DE EVALUACION ACADEMICA ===");

        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese la nota final (0 - 100): ");
        nota = teclado.nextInt();

        if (nota >= 0 && nota <= 100) {

            System.out.println("\nEstudiante: " + nombre);
            System.out.println("Nota final: " + nota);

            if (nota >= 90) {
                System.out.println("Condicion: Excelente");
            } else if (nota >= 70) {
                System.out.println("Condicion: Aprobado");
            } else if (nota >= 60) {
                System.out.println("Condicion: Supletorio");
            } else {
                System.out.println("Condicion: Reprobado");
            }

        } else {
            System.out.println("Error: La nota debe estar entre 0 y 100.");
        }

        teclado.close();
    }

}
