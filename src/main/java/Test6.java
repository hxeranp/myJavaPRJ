import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        if (code.endsWith("_eye")) {
            System.out.println("Ophthalmology");
        } else if (code.endsWith("head")) {
            System.out.println("Neurosurgery");
        } else if (code.endsWith("infl")) {
            System.out.println("Orthopedics");
        } else if (code.endsWith("skin")) {
            System.out.println("Dermatology");
        } else {
            System.out.println("direct recommendation");
        }
    }
}
