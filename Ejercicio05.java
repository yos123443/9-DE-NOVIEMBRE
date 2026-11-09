import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        BigDecimal saldo = new BigDecimal("5000.00");
        int opcion;

        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo: S/ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Monto a retirar: S/ ");
                    BigDecimal retiro = teclado.nextBigDecimal();

                    if (retiro.signum() <= 0) {
                        System.out.println("Ingresa un monto mayor que cero.");
                    } else if (retiro.compareTo(saldo) > 0) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo.subtract(retiro);
                        System.out.printf("Retiro realizado. Saldo: S/ %.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Monto a depositar: S/ ");
                    BigDecimal deposito = teclado.nextBigDecimal();

                    if (deposito.signum() <= 0) {
                        System.out.println("Ingresa un monto mayor que cero.");
                    } else {
                        saldo = saldo.add(deposito);
                        System.out.printf("Depósito realizado. Saldo: S/ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}