import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = teclado.nextInt();
        int factor = 1;

        do {
            long resultado = (long) numero * factor;
            System.out.println(numero + " x " + factor + " = " + resultado);
            factor++;
        } while (factor <= 12);
    }
}