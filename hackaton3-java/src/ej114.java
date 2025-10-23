public class ej114 {
    public class AhorcadoBasico {
        public static void main(String[] args) {
            String palabra = "casa"; // palabra secreta
            String letrasAdivinadas = "a"; // por ejemplo, el jugador ha adivinado la letra 'a'

            // Mostramos el progreso
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                if (letrasAdivinadas.indexOf(letra) != -1) {
                    System.out.print(letra + " "); // si la letra está adivinada, la mostramos
                } else {
                    System.out.print("_ "); // si no, mostramos guion bajo
                }
            }
        }
    }

}
