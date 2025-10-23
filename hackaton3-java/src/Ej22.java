public class Ej22 {
    public static void execute () {
        char[][] tablero = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = '-';
            }
        }

        tablero[2][3] = 'X';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%c ", tablero[i][j]);
            }

            System.out.println();
        }
    }
}
