import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        long suma = 0;

        do {
            System.out.print("Ingrese número: ");
            numero = teclado.nextInt();

            if (numero > 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("Suma total: " + suma);
    }
}