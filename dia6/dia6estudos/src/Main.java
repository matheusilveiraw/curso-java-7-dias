// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Clientes c001 = new Clientes();
        c001.firstName = "Andre";
        c001.idade = 28;

        Clientes c002 = new Clientes();
        c002.firstName = "Mariana";
        c002.idade = 35;

        c002.newAccount();

        Car car = new Car("BWM", "X6", 2024, 125_000);
        car.setMarca("Fiat");

//        int valorVendaTemp = (int) (car.getValorVenda() * 0.1 + car.getValorVenda());
//        car.setValorVenda(valorVendaTemp);

        System.out.println(car.getValorVenda());
        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
    }
}