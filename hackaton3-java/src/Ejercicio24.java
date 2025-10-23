import java.util.Random;

public class Ejercicio24 {
    /*
    * Coloca 5 enemigos aleatorios en una matriz 6x6 y muestra el tablero resultante.
    *
    */

    public static void main(String[] args) {
        char [][] tablero = new char[6][6];
        Random random = new Random();

        // Llenamos la matriz con asteriscos
        for (int i = 0; i < tablero.length; i++)  {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '*';
            }
        }

        // Colocamos 5 enemigos aleatorios en la matriz
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(6);
            int y = random.nextInt(6);
            tablero[x][y] = 'E';
        }

        // Mostramos el tablero resultante
        for (int i = 0; i < tablero.length; i++)  {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
