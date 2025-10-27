import java.util.Random;
public class Eje_30 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[][] zonasSeguras = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(2);
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    zonasSeguras[i][j] = 1;
                } else {
                    zonasSeguras[i][j] = 0;
                }
            }
        }
        System.out.println("\nMapa de zonas seguras (valores invertidos):"); //\n significa salto de línea a la hora de escribir
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(zonasSeguras[i][j] + " ");
            }
            System.out.println();
        }
    }
}
