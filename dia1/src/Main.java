//aqui tem um pacote implicito, o java.util, ele é o pacote padrão

import java.util.Locale;
import java.util.Scanner; //importa automaticamente

//public significa que a classe pode ser acessada por outros pacotes
public class Main { //essa é minha classe
    public static void main(String[] args) { //dentro do String é onde passo os parametros
        byte minhaIdade = 28; //camel case
        short salarioMensal = 5_000;
        long idadeMilisegundos = 7_884_000_000L; //esse sufixo L é necessário para o java entender que é um long
        char initial = 'M';
        boolean eMaiorDeIdade = true;
        double altura = 1.78F; //números com virgula / fração

        System.out.println(altura);

        String firstName = "Matheus" + "Silveira"; //
        System.out.println(firstName.toUpperCase()); //strings tem vários metodos prontos

        System.out.printf("Uma frase aleatoria só \n para testar o barra n \n");
        System.out.printf("Uma frase aleatoria só \t para testar o barra t \n");

        //digitar sout e tab pra conseguir escrever isso rápido


        System.out.println(minhaIdade);
        System.out.println(salarioMensal);
        //existe alguma diferença entre println e printf (pesquisar)
        System.out.printf("Hello and welcome!\n"); //esse é meu statement
        //da linha 4 a 7, é o meu metodo

//        Scanner idadeScanner = new Scanner(System.in); //isso tá pegando o valor do usuario
//        System.out.println("Digite sua idade: ");
//        byte idadeCliente = idadeScanner.nextByte(); //captura a idade, pede no console
//        System.out.println(idadeCliente);

        Scanner valorDouble = new Scanner(System.in).useLocale(Locale.US); //isso tá pegando o valor do usuario
        System.out.println("Digite sua idade: ");
        double doubleRecebido = valorDouble.nextDouble();
        System.out.println(doubleRecebido);

    }
}