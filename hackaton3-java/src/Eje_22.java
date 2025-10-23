import java.util.Random;

public class Eje_22 {
    public static void main(String[] args) {
        char [][] tablero= new char[5][5];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }
        int fila=new Random().nextInt(4);
        int columna=new Random().nextInt(4);
        tablero[fila][columna]= 'X';

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}

