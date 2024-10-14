package myapp.conversor.moneda.principal;

import myapp.conversor.moneda.convert.Conversor;
import myapp.conversor.moneda.convert.HistorialConversiones; // Punto y coma agregado

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String navegacion = "";

        while (!navegacion.equals("9")) {
            System.out.println("------------------------------------------------");
            System.out.println("¡Bienvenido al Conversor de Monedas!");
            System.out.println("------------------------------------------------\n");
            System.out.println("Escoja la opción que desea cargar:");
            System.out.println("1. Conversión de moneda");
            System.out.println("2. Historial de conversiones");
            System.out.println("9. Salir");
            navegacion = lectura.nextLine();

            switch (navegacion) {
                case "1" -> {
                    while (true) {
                        Conversor conversor = new Conversor();
                        conversor.conversor();

                        System.out.println("¿Desea realizar otra conversión? (s/n)");
                        String otraConversion = lectura.nextLine();

                        if (!otraConversion.equalsIgnoreCase("s")) {
                            break;
                        }

                    }
                }
                case "2" -> {
                    HistorialConversiones historial = new HistorialConversiones();
                    historial.imprimirHistorial();
                }
                case "9" -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida, por favor elija otra.");
            }
        }
        lectura.close(); // Cerrar el Scanner al final
    }
}
