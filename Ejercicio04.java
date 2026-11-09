import java.util.Locale;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double suma = 0;
        int cantidad = 0;
        String continuar;

        do {
            double nota;

            do {
                System.out.print("Nota (0 a 20): ");
                nota = teclado.nextDouble();
            } while (!(nota >= 0 && nota <= 20));

            suma += nota;
            cantidad++;

            do {
                System.out.print("¿Continuar? (S/N): ");
                continuar = teclado.next();
            } while (!continuar.equalsIgnoreCase("S")
                    && !continuar.equalsIgnoreCase("N"));
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Cantidad de notas: " + cantidad);
        System.out.printf("Suma total: %.2f%n", suma);
        System.out.printf("Promedio: %.2f%n", suma / cantidad);
    }
}