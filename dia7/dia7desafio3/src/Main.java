import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a conta: ");

        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble();
        char op = s.next().charAt(0);
        double n2 = s.nextDouble();

        switch (op) {
            case '+':
                System.out.println(n1 + n2);
            break;
            case '-':
                System.out.println(n1 - n2);
            break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
        }
    }
}