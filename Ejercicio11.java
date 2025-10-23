public class Ejercicio11 {
    /* 
     Crea un array que contenga los 15 primeros números de la serie de
    Fibonacci y muéstralos en pantalla.
    */

    public static void main(String[] args) {
        int []fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;


        // Calculamos los 15 numeros
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }

        // Imprimimos por pantalla los 15 primeros numeros
        System.out.println();
        for (int i = 2; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
