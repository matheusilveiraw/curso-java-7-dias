// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //retorna na mesma linha os números de 0 a 100 somente pares
        int contador = 0;
        while (contador <= 100) {
            if((contador % 2) == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
    }
}