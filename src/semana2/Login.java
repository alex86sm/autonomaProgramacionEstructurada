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
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario;
        String password;

        System.out.println("Ingrese el usuario:");
        usuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña:");
        password = scanner.nextLine();

        if (usuario.equals("admin") && password.equals("123456")) {
            System.out.println("Acceso Correcto");
        } else {
            System.out.println("Acceso Incorrecto");
        }

        scanner.close();
    }

}
