public class Clientes {
    String firstName;
    int idade;
    int balance;

    Clientes(){
        balance = 10;
    }
    void newAccount() {
        System.out.println(firstName + " Account Created!");
        System.out.println("The new balance is " + balance);
    }
}
