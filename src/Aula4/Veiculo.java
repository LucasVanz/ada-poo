package Aula4;

public class Veiculo {

    private String placa;
    private String cor;
    private String modelo;
    private int ano;

    public Veiculo(String placa, String cor, String modelo, int ano){
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibeDados(){
        System.out.println("PLACA: " + placa);
        System.out.println("COR: " + cor);
        System.out.println("MODELO: " + modelo);
        System.out.println("ANO: " + ano);
    }
}
