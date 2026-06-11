/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana1;

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
        Scanner leer = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese las horas trabajadas en la semana:");
        double horasTrabajadas = leer.nextDouble();

        System.out.println("Ingrese el pago por hora:");
        double pagoPorHora = leer.nextDouble();

        // Proceso
        double salarioBruto = horasTrabajadas * pagoPorHora;
        double descuento = salarioBruto * 0.10;
        double salarioFinal = salarioBruto - descuento;

        // Salida de resultados
        System.out.println("\n===== REPORTE DE PAGO =====");
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario bruto: S/ " + salarioBruto);
        System.out.println("Descuento por impuestos (10%): S/ " + descuento);
        System.out.println("Salario final a pagar: S/ " + salarioFinal);

        leer.close();
    }
    
}
