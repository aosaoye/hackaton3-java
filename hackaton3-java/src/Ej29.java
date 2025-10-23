public class Ej29 {
    public static void execute () {
        int N = 4;

        int[][] table = new int[N][N];
        int[][] inv_table = new int[N][N];

        int counter = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                counter++;
                table[i][j] = counter;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                inv_table[i][j] = table[N - 1 - i][j];
            }
        }

        // Show
        System.out.println("Tabla normal");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", table[i][j]);
            }
            System.out.println();
        }

        // Show
        System.out.println("Tabla invertida");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", inv_table[i][j]);
            }
            System.out.println();
        }

    }
}
