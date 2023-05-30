import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //digitar uma frase e todas as letras vão vir com um espaço entre elas
        Scanner frase = new Scanner(System.in);
        String recebeFrase = frase.nextLine();

        for(int i = 0; i < recebeFrase.length(); i++) {
            System.out.print(recebeFrase.substring(i, i + 1)+ " ");
        }
    }
}