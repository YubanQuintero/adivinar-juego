import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        final int MAXINTENTOS = 10;


        System.out.println("Adivina el número entre 1 y " + 100 + "Tienes 10 intentos");

        while (intentos < MAXINTENTOS) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza == numeroSecreto) {
                System.out.println("¡Correcto! Lo adivinaste en " + intentos + " intentos.");
                break;
            } else if (adivinanza < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            if (intentos == MAXINTENTOS) {
                System.out.println("Se acabaron los intentos. El número era " + numeroSecreto);
            }
        }
        scanner.close();
    }
}
