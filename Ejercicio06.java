import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int numero;

        do {
            System.out.print("Ingrese número (0 para terminar): ");
            numero = teclado.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (numero != 0);

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}