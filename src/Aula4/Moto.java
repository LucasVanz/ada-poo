package Aula4;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String cor, String modelo, int ano, int cilindradas) {
        super(placa, cor, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("CILINDRADAS: " + cilindradas);
    }
}
