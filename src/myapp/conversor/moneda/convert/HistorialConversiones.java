package myapp.conversor.moneda.convert;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import myapp.conversor.moneda.convert.ConversionData;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HistorialConversiones {
    private static final String ARCHIVO_JSON = "historial.json";
    private static final Gson gson = new Gson();

    // Guardar la conversión en el historial
    public void guardarConversion(ConversionData conversionData) {
        List<ConversionData> historial = leerHistorial();
        historial.add(conversionData);

        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(historial, writer);
        } catch (IOException e) {
            System.out.println("Error guardando el historial: " + e.getMessage());
        }
    }

    // Leer el historial de conversiones
    public List<ConversionData> leerHistorial() {
        try (FileReader reader = new FileReader(ARCHIVO_JSON)) {
            Type listType = new TypeToken<ArrayList<ConversionData>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    // Imprimir el historial de conversiones
    public void imprimirHistorial() {
        List<ConversionData> historial = leerHistorial();

        if (historial.isEmpty()) {
            System.out.println("No hay conversiones guardadas.");
        } else {
            System.out.println("Historial de conversiones:");
            for (ConversionData conversion : historial) {
                System.out.printf("De %s a %s: %.2f -> %.2f%n",
                        conversion.monedaOrigen(),
                        conversion.monedaDestino(),
                        conversion.saldo(),
                        conversion.resultado());
            }
        }
    }
}
