# Challenge-Conversor-de-Monedas

## Descripción del Proyecto

**Challenge-Conversor-de-Monedas** es un programa diseñado para facilitar la conversión de monedas de manera rápida y sencilla. Este proyecto es parte del desafío de Alura y tiene como objetivo principal ayudar a los usuarios a convertir saldos entre diferentes tipos de moneda utilizando tasas de cambio actualizadas.

## Funcionalidades

- **Conversión de Monedas**: Permite a los usuarios ingresar un saldo en una moneda específica y convertirlo a otra moneda de su elección.

- **Historial de Conversiones**: Guarda todas las conversiones realizadas por el usuario en un archivo JSON, lo que permite consultar el historial de conversiones en cualquier momento.

- **Interfaz de Usuario Sencilla**: Interactúa con el usuario a través de la consola, solicitando la entrada de datos y mostrando los resultados de manera clara y formateada.

- **Actualización de Tasas de Cambio**: Utiliza una API para obtener tasas de cambio actualizadas, asegurando que las conversiones sean precisas.

## Tecnologías Utilizadas

- **Java**: El lenguaje de programación principal utilizado para desarrollar la aplicación.

- **Gson**: Biblioteca de Google para trabajar con JSON en Java, utilizada para guardar y recuperar el historial de conversiones de manera eficiente.

- **API Externa**: Se integra con una API de conversión de moneda para obtener las tasas de cambio actuales.

## Estructura del Código

- **Conversor**: Clase principal que maneja la interacción con el usuario, recibe la entrada, realiza la conversión y muestra los resultados.

- **HistorialConversiones**: Clase que gestiona el almacenamiento y la recuperación del historial de conversiones en formato JSON.

- **ConversionData**: Clase que define la estructura de datos para las conversiones, utilizando Java Records para una representación clara y concisa.

## Ejemplo de Uso

1. El usuario ingresa el saldo que desea convertir.
2. Especifica la moneda de origen y la moneda de destino.
3. El programa realiza la conversión y muestra el resultado.
4. La conversión se guarda en el historial para futuras consultas.

## Conclusión

**Challenge-Conversor-de-Monedas** es una herramienta útil para cualquier persona que necesite realizar conversiones de moneda de manera rápida y confiable. Con su diseño intuitivo y el uso de tecnología moderna, ofrece una experiencia de usuario satisfactoria.
