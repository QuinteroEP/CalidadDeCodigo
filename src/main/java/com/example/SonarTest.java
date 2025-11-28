package com.example;

public class SonarTest {

    // Variable de clase nunca usada (warning seguro)
    private static int contador = 0;

    public static void main(String[] args) {
        // Duplicación de string literal (warning)
        System.out.println("Mensaje repetido");
        System.out.println("Mensaje repetido");

        // División por cero detectada como bug
        int resultado = dividir(10, 0);
        System.out.println(resultado);

        // try-catch demasiado genérico
        try {
            String texto = null;
            texto.length(); // NullPointerException
        } catch (Exception e) {
            e.printStackTrace(); // Sonar: "Do not use printStackTrace"
        }
    }

    // Método con parámetros no usados
    public static int dividir(int a, int b) {
        return a / b;
    }

    // Código muerto que nunca se usa
    public void metodoInutil() {
        int x = 0; // unused variable
    }
}
