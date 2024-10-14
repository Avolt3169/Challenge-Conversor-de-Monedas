package myapp.conversor.moneda.convert;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor {
    public void conversor() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el saldo que desea convertir (sin moneda):");
        double saldo = lectura.nextDouble();
        lectura.nextLine(); // Consumir la nueva línea

        System.out.println("Escriba la moneda que va a ser convertida:");
        String monedaOrigen = lectura.nextLine().toUpperCase(); // Convertir a mayúsculas
        System.out.println("Escriba la moneda a la que desea hacer la conversión:");
        String monedaDestino = lectura.nextLine().toUpperCase(); // Convertir a mayúsculas

        ApiConversion apiConversion = new ApiConversion();
        double resultadoMoneda = apiConversion.llamadaConversion(monedaOrigen, monedaDestino);
        Conversion conversion = new Conversion();
        double saldoConvertido = conversion.conversion(saldo, resultadoMoneda);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("------------------------------------------------");
        System.out.printf("Se ha convertido %.2f %s%n", saldo, monedaOrigen);
        System.out.printf("El resultado de la conversión es: %s %s%n", df.format(saldoConvertido), monedaDestino);
        System.out.println("------------------------------------------------");

        // Crear objeto ConversionData para guardar en el historial
        ConversionData conversionData = new ConversionData(monedaOrigen, monedaDestino, saldo, saldoConvertido);
        HistorialConversiones guardar = new HistorialConversiones();
        guardar.guardarConversion(conversionData);
    }
}
