import java.util.Locale;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int opcion;

        do {
            System.out.println("\n1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Grados Celsius: ");
                    double celsius = teclado.nextDouble();
                    double resultadoF = celsius * 9.0 / 5 + 32;
                    System.out.printf("Resultado: %.2f °F%n", resultadoF);
                    break;
                case 2:
                    System.out.print("Grados Fahrenheit: ");
                    double fahrenheit = teclado.nextDouble();
                    double resultadoC = (fahrenheit - 32) * 5.0 / 9;
                    System.out.printf("Resultado: %.2f °C%n", resultadoC);
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}