package Aula4;

public class Carro extends Veiculo {
    private int numPortas;
    private String tipoCombustivel;

    public Carro(String placa, String cor, String modelo, int ano, int numPortas, String tipoCombustivel) {
        super(placa, cor, modelo, ano);
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("QUNATIDADE DE PORTAS: " + numPortas);
        System.out.println("TIPO DE COMBUSTÍVEL: " + tipoCombustivel);
    }
}
