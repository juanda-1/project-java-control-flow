import java.util.Scanner;

public class WeatherAdviso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Desafío FizzBuzz Personalizado");
        System.out.print("Ingresa el número inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingresa el número final: ");
        int fin = scanner.nextInt();

        // Validar que el rango sea válido
        if (inicio > fin) {
            System.out.println("El número inicial no puede ser mayor que el número final.");
            scanner.close();
            return;
        }

        System.out.println("\nResultado:\n");

        int contadorFizz = 0, contadorBuzz = 0, contadorBoom = 0, contadorFizzBuzz = 0, contadorFizzBuzzBoom = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBoom");
                contadorFizzBuzzBoom++;
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                contadorFizzBuzz++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                contadorFizz++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                contadorBuzz++;
            } else if (i % 7 == 0) {
                System.out.println("Boom");
                contadorBoom++;
            } else {
                System.out.println(i);
            }
        }

        // Mostrar resumen final
        System.out.println("\n Resumen del desafío:");
        System.out.println("Fizz: " + contadorFizz);
        System.out.println("Buzz: " + contadorBuzz);
        System.out.println("Boom: " + contadorBoom);
        System.out.println("FizzBuzz: " + contadorFizzBuzz);
        System.out.println("FizzBuzzBoom: " + contadorFizzBuzzBoom);

        System.out.println("\n¡Desafío completado con éxito!");
        scanner.close();
    }
}
