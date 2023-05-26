import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 22, 15, 30, 40}; //array int declarada
        Arrays.sort(valores); //organiza os valores, por alguma razão não da pra por dentro de um println
        System.out.println(valores); //printa a array de um jeito bizarro (printa a referencia do valor na memória)
        System.out.println(Arrays.toString(valores)); //usando a biblioteca arrays e essa função, funfa certinho
        System.out.println(valores.length); //tamanho da array

        String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"}; //array string declarada
        System.out.println(Arrays.toString(cars)); //para imrpimir a array string
        System.out.println(cars[1]); //pegar a segunda posição da array
        cars[2] = "Ferrari"; //substituir jeep por ferraria
        System.out.println(Arrays.toString(cars));

        String cars2[][] = {{"BMW", "Tesla"}, { "Jeep", "Fiat"}}; //array multidimensional
        System.out.println(Arrays.deepToString(cars2)); //para conseguir imprimir a array multidimensionla precisa desse deeptostring

        final double taxaJuros = 11.92; //isso faz com que a var seja uma constante
        System.out.println(taxaJuros);
        //taxaJuros = 11.52; //essa linha agora da um erro pq o taxaJuros é constante
        System.out.println(taxaJuros);

        // operadores aritiméticos + - * /
        // ordem dos operadores aritiméticos () > / > * > - > +
        double a = (double)4 / (double)3; //tem que por esse double na frente (chama casting) pra conseguir trazer o resultado certo com virugla
        System.out.println(a);
        a++; //incremento
        System.out.println(a);
        a--; //decremento
        System.out.println(a);

        //converter tipos String p/ int

        String valor = "10";
        System.out.println(valor + 2); //vai dar errado pq valor é string
        int valorTotal = Integer.parseInt(valor) + 2;
        System.out.println(valorTotal); //como foi convertido na linha de cima é possivel usar pra uma conta

        //classe math
        double value = 10.2;
        System.out.println(Math.round(value)); //arredonda pro 0 masi próximo
        System.out.println(Math.ceil(value)); //arredonda sempre pra cima
        System.out.println(Math.floor(value)); //arredonda sempre pra baixo
        System.out.println(Math.random()); //randomiza um número
        System.out.println(Math.random() * 100); //randomiza um número dentro de 100
        System.out.println(Math.round(Math.random() * 100)); //randomiza um número dentro de 100 e arredonda
    }
}