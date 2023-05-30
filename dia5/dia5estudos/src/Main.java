// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        productList("Banana", 3.21);
        productList("Abacate",1.11);

        System.out.println("Listar os numeros pares de 0 a 20");
        evenNumbers(20);
    }
    //criando metodos
    public static void productList(String productName, Double preco) {
        System.out.println(productName + " custa " + preco);
    }

    //pra rodar um debugger, tem que clicar dps do número da linha pra aparecer aquelabolinha vermelha e então clicar pra debugar do lado do executar programa
    public static void evenNumbers(int numbers) {
        for (int i = 0; i <= numbers; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}

