import java.util.Scanner;

public class FourAndFivePowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Please insert number: ");
        n = scanner.nextInt();


        for (int j = 1; j <= n; j *= 4) {
            System.out.println("Numbers : " + j);
        }

        System.out.println("another fonction");

        for (int j = 1; j < n; j *= 5) {
            System.out.println("Another numbers: " +j);

        }
    }
}



