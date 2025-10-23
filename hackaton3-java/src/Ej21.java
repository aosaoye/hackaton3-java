public class Ej21 {
    public static void execute() {
        int[][] table = new int[5][5];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 0;
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%d ", table[i][j]);
            }
            System.out.println();
        }
    }
}
