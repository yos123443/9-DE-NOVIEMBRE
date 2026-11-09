import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Base entera: ");
        BigInteger base = teclado.nextBigInteger();

        System.out.print("Exponente positivo: ");
        int exponente = teclado.nextInt();

        if (exponente <= 0) {
            System.out.println("El exponente debe ser mayor que cero.");
            return;
        }

        BigInteger resultado = BigInteger.ONE;
        int contador = 0;

        do {
            resultado = resultado.multiply(base);
            contador++;
        } while (contador < exponente);

        System.out.println("Resultado: " + resultado);
    }
}