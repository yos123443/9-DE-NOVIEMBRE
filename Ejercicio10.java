import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        BigDecimal total = BigDecimal.ZERO;
        long unidadesVendidas = 0;
        String continuar;

        do {
            System.out.print("Nombre del producto: ");
            String nombre = teclado.nextLine();

            BigDecimal precio;
            do {
                System.out.print("Precio unitario (S/): ");
                precio = teclado.nextBigDecimal();
            } while (precio.signum() < 0);

            int cantidad;
            do {
                System.out.print("Cantidad: ");
                cantidad = teclado.nextInt();
            } while (cantidad <= 0);

            BigDecimal subtotal = precio.multiply(BigDecimal.valueOf(cantidad));
            total = total.add(subtotal);
            unidadesVendidas += cantidad;

            System.out.printf("Subtotal de %s: S/ %.2f%n", nombre, subtotal);

            do {
                System.out.print("¿Registrar otra venta? (S/N): ");
                continuar = teclado.next();
            } while (!continuar.equalsIgnoreCase("S")
                    && !continuar.equalsIgnoreCase("N"));

            teclado.nextLine(); // Consume el salto de línea antes del siguiente nombre.
        } while (continuar.equalsIgnoreCase("S"));

        BigDecimal promedio = total.divide(
                BigDecimal.valueOf(unidadesVendidas), 2, RoundingMode.HALF_UP);

        System.out.printf("Monto total vendido: S/ %.2f%n", total);
        System.out.println("Cantidad total de productos vendidos: " + unidadesVendidas);
        System.out.printf("Promedio de venta por producto: S/ %.2f%n", promedio);
    }
}