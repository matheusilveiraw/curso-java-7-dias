import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //digitar 3 valores aleatorios e mostrar eles depois
        Scanner scValor0 = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        byte valorRecebido0 = scValor0.nextByte();

        Scanner scValor1 = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        byte valorRecebido1 = scValor1.nextByte();

        Scanner scValor2 = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        byte valorRecebido2 = scValor2.nextByte();

        System.out.println(valorRecebido0);
        System.out.println(valorRecebido1);
        System.out.println(valorRecebido2);
    }
}