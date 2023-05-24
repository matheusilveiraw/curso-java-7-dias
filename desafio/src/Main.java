import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in); //usando a mesma var para capturar ambos os valores

        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = valores.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double segundoValor = valores.nextDouble();
        double resultado = primeiroValor + segundoValor;
        System.out.println("O resultado é: " + resultado);
    }
}