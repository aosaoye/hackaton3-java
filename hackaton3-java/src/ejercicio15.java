public class ejercicio15 {
    static boolean comprobar_si_exsiste(char[] palabra, char character){}
    public class Main {
        public static void main(String[] args) {
            char[] Letras = {'J', 'A', 'V', 'A'};
            char[] Espacios = {'_', '_', '_', '_'};
            char intento1 = 'A';
            char intento2 = 'V';
            for (int i = 0; i < Letras.length; i++) {
                if (Letras[i] == intento1) {
                    Espacios[i] = intento1;
                }
                if (Letras[i] == intento2) {
                    Espacios[i] = intento2;
                }
            }
            System.out.print("La palabra con los sigueintes guiones y su letras adivinadas es:   ");
            for (char ahorcado : Espacios) {
                System.out.print(ahorcado + " ");
            }
        }
    }
}







