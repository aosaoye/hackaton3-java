import java.util.Scanner;

public class Ej17 {

    private static void convert (String word) {
        char[] cWord = word.toCharArray();

        int value;
        for (char character : cWord) {
            value = (int) character - 64;
            System.out.printf("%d ", value);
        }

        System.out.println();
    }
    public static void execute() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Dame una palabra:");
            String word = sc.next().toUpperCase();

            convert(word);


        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
