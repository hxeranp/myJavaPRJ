import java.util.Scanner;

public class exam02 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         String a = sc.nextLine();
         String b = sc.nextLine();
         String result = (a+b).toLowerCase().replaceAll("\\s","");

         System.out.println(result);
         sc.close();
     }
}
