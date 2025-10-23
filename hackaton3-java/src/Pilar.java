import java.util.Scanner;

public class Pilar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadnumeros = 6;
        int[] numeros = new int[6];
        int producto=1;

        System.out.println("Por favor, dame 6 números enteros");
        for (int i = 0; i < cantidadnumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            producto *= numeros[i];
        }
        System.out.println("El valor de los números es: " + producto);
    }
}