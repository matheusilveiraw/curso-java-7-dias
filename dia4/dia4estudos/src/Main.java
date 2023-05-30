import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();
//        System.out.println(nomeProduto);

        switch (nomeProduto) {
            case "banana":
                System.out.println("R$10");
                break;
            case "manga":
                System.out.println("R$20");
                break;
            case "maçã":
                System.out.println("R$30");
                break;
        }

        //for normal
        for (int i = 0; i < 10; i++) {
            System.out.println("Mensagem: " + i);
        }

        //for com array
        String[] cars = {"BWM", "Tesla", "Fiat", "Ferrari"};
        for(int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();

        //nested loops, só pra mostrar como funfa um for dentro do outro
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i + " " + j);
            }
        }

        int i = 1;
        while (i <= 5)  {
            System.out.println(i);
            i++;
        }
    }
}