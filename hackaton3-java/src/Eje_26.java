import java.util.Random;

public class Eje_26 {
    public static void main(String[] args) {
        int [][]matriz= new int[4][4];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(9)+1;
            }
        }
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[4];

        //Calcular suma de filas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
            System.out.println("| Suma fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        // Mostrar la suma de cada columna
        System.out.println("-------------------------");
        for (int j = 0; j < 4; j++) {
            System.out.print("Suma columna " + (j + 1) + ": " + sumaColumnas[j] + "\n");
        }
        System.out.println();
    }
}
