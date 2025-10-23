import java.util.Random;

public class Ejercicio16 {
    /*
     Genera un array de 10 números aleatorios y determina si alguno se repite.
     */

     public static void main(String[] args) {
        int [] datos = new int[10];
         Random random = new Random();

         // Llenamos el array con datos aleatorios
         for (int i = 0; i < datos.length; i++) {
             datos[i] = random.nextInt(100) + 1;
         }

         // Buscamos si hay datos repetidos
         for (int i = 0; i < datos.length; i++) {
             for (int j = i + 1; j < datos.length; j++) {
                 if (datos[i] == datos[j]) {
                     System.out.println("El dato " + datos[i] + " se repite");
                 }
             }
         }
     }
}
