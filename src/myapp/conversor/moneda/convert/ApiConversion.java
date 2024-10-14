package myapp.conversor.moneda.convert;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversion {

    public Double llamadaConversion(String monedaOrigen, String monedaDestino) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d5d4095f431c70b7771b356c/latest/" + monedaOrigen);

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            ConversionResponse conversionResponse = gson.fromJson(response.body(), ConversionResponse.class);

            // Obtener la tasa de conversión para la moneda destino
            Double tasaConversion = conversionResponse.conversion_rates().get(monedaDestino);

            if (tasaConversion != null) {
                return tasaConversion; // Devuelve la tasa de conversión
            } else {
                System.out.println("Moneda destino no encontrada.");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error ejecutado: " + e.getMessage());
            return null;
        }
    }
}
