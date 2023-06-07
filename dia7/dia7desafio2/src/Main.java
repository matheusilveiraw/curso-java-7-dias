import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scValor = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        byte valorRecebido = scValor.nextByte();

        if(valorRecebido % 2 == 1) {
            System.out.println("O valor é impar!");
        } else if (valorRecebido >= 2 && valorRecebido <= 5) {
            System.out.println("O valor está entre 2 e 5 e é par!");
        } else if (valorRecebido >= 6 && valorRecebido <= 20) {
            System.out.println("O valor está entre 6 e 20 e é par!");
        } else if (valorRecebido > 20) {
            System.out.println("O valor é superior a 20 e é par!");
        }

    }
}