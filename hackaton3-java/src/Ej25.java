public class Ej25 {
    public static void execute() {
        int MAX_ROWS = 5;
        int MAX_COLS = 5;

        char[][] table = new char[MAX_ROWS][MAX_COLS];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = '-';
            }
        }

        int jRow, jCol;
        jRow = 4; jCol = 4;
        table[jRow][jCol] = 'X';
        System.out.printf("El jugador está en (%d,%d)\n", jRow, jCol);

        if (jRow < 0 || jCol < 0 || jRow >=MAX_ROWS || jCol >= MAX_COLS) return;

        int start_row = (jRow > 0) ? jRow - 1 : 0;
        int start_col = (jCol > 0) ? jCol - 1 : 0;

        int end_row = (jRow < MAX_ROWS - 1) ? jRow + 1 : MAX_ROWS - 1;
        int end_col = (jCol < MAX_COLS - 1) ? jCol + 1 : MAX_COLS - 1;

        System.out.printf("Muestra las posiciones desde (%d,%d) hasta (%d,%d)\n", start_row, start_col, end_row, end_col);

        for (int i = start_row; i <= end_row; i++) {
            for (int j = start_col; j <= end_col; j++) {
                System.out.printf("%c ", table[i][j]);
                //System.out.printf("%d, %d\n", i,j);
            }
            System.out.println();
        }
    }
}
