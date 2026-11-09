import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String claveCorrecta = "Java2026";
        String clave;

        do {
            System.out.print("Ingrese contraseña: ");
            clave = teclado.nextLine();

            if (!clave.equals(claveCorrecta)) {
                System.out.println("Contraseña incorrecta");
            }
        } while (!clave.equals(claveCorrecta));

        System.out.println("Acceso permitido");
    }
}