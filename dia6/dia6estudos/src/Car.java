public class Car {

    private String marca;
    private String modelo;
    private int ano;
    private int valorVenda;

    Car(String marca, String modelo, int ano, int valorVenda) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorVenda = valorVenda;
    }

    public double getValorVenda(){
        double valorFinal = (valorVenda * 0.1) + valorVenda;
        return valorFinal;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }


    public void setMarca(String modelo){
        this.modelo = modelo;
    }
}
