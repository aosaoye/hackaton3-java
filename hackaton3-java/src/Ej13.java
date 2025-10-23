public class Ej13 {
    private static boolean is_vocal(char character) {
        switch (character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    private static void test(String word, int expected) {
        char[] cWord = word.toLowerCase().toCharArray();

        int counter = 0;
        for (char character : cWord) {
            if (is_vocal(character))
                counter ++;
        }

        System.out.printf("La palabra '%s' tiene %d vocales de %d esperados\n", word, counter, expected);
    }

    public static void execute() {
        test("hola",2);
        test("palabra",3);
        test("AL",1);

    }
}
