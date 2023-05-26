import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            int[] a1 = {
                    1789, 2035, 1899, 1456, 2013,
                    1458, 2458, 1254, 1472, 2365,
                    1456, 2165, 1457, 2456};
            String[] a2 = {
                    "Java",
                    "Python",
                    "PHP",
                    "C#",
                    "C Programming",
                    "C++"
            };

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

            //listar array original
            //listar array ordem alfabetica e númerica

    }
}