import java.util.Random;

public class Ejercicio20 {
    /**
     * @param args the command line arguments
     * Crea un array con las puntuaciones de 6 héroes y ordénalas de mayor a menor.
     */
    public static void main(String[] args) {
        int [] puntuaciones = new int[6];
        Random random = new Random();

        // Asignamos puntuaciones aleatorias
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i] = random.nextInt(100) + 1;
        }

        // Ordenamos las puntuaciones de mayor a menor
        for (int i = 0; i < puntuaciones.length; i++) {
            for (int j = i + 1; j < puntuaciones.length; j++) {
                if (puntuaciones[i] < puntuaciones[j]) {
                    int aux = puntuaciones[i];
                    puntuaciones[i] = puntuaciones[j];
                    puntuaciones[j] = aux;
                }
            }
        }

        // Imprimimos por pantalla las puntuaciones
        System.out.println("Puntuaciones: ");
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print(puntuaciones[i] + " ");
        }
    }
}
