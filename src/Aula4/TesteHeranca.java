package Aula4;

public class TesteHeranca {
    public static void main(String[] args) {
        Carro veloster = new Carro("pla-1234", "verde", "veloster", 2018, 3, "gasolina");
        Moto cb = new Moto("plc-5678", "azul", "cb-500", 2020, 500);

        cb.exibeDados();
        System.out.println();
        veloster.exibeDados();
    }
}
