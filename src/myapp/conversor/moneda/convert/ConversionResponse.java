package myapp.conversor.moneda.convert;

import java.util.Map;

public record ConversionResponse(String result, Map<String, Double> conversion_rates) {
}