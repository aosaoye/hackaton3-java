import java.util.Random;

public class Ejercicio28 {

    /*
    *Genera una matriz 6x6 con números del 1 al 9 y muestra solo el triángulo superior derecho.
    */

    public static void main(String[] args) {
        int [][] matriz = new int[6][6];
        Random random = new Random();

        // Llenamos la matriz con ceros
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }

        // Pintamos la matriz con unos en el triangulo superor derecho
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i <= j) {
                    matriz[i][j] = random.nextInt(9) + 1;
                }
            }
        }

        // Llenamos la matriz con ceros
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
