import java.util.Scanner;


public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String cleaned = input.toLowerCase().replaceAll(" ", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();

        System.out.println(cleaned.equals(reversed));

        scanner.close();
    }

}
