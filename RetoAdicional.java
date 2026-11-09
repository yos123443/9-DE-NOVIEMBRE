import java.util.Scanner;

public class RetoAdicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        long sumaEdades = 0;
        int edadMayor = 0;
        int edadMenor = Integer.MAX_VALUE;
        int mayoresDeEdad = 0;
        String continuar;

        do {
            int edad;

            do {
                System.out.print("Ingrese la edad: ");
                edad = teclado.nextInt();

                if (edad < 0) {
                    System.out.println("La edad debe ser 0 o más.");
                }
            } while (edad < 0);

            cantidad++;
            sumaEdades += edad;

            if (edad > edadMayor) {
                edadMayor = edad;
            }

            if (edad < edadMenor) {
                edadMenor = edad;
            }

            if (edad >= 18) {
                mayoresDeEdad++;
            }

            do {
                System.out.print("¿Registrar otra persona? (S/N): ");
                continuar = teclado.next();
            } while (!continuar.equalsIgnoreCase("S")
                    && !continuar.equalsIgnoreCase("N"));

        } while (continuar.equalsIgnoreCase("S"));

        double promedio = (double) sumaEdades / cantidad;

        System.out.println("\nResultados de la encuesta");
        System.out.println("Personas encuestadas: " + cantidad);
        System.out.printf("Promedio de edad: %.2f años%n", promedio);
        System.out.println("Edad mayor: " + edadMayor + " años");
        System.out.println("Edad menor: " + edadMenor + " años");
        System.out.println("Mayores de edad: " + mayoresDeEdad);

        teclado.close();
    }
}