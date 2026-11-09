import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int SECRETO = 25;
        int numero;
        int intentos = 0;

        do {
            System.out.print("Adivina el número: ");
            numero = teclado.nextInt();
            intentos++;

            if (numero > SECRETO) {
                System.out.println("Muy alto");
            } else if (numero < SECRETO) {
                System.out.println("Muy bajo");
            }
        } while (numero != SECRETO);

        System.out.println("¡Correcto!");
        System.out.println("Intentos realizados: " + intentos);
    }
}