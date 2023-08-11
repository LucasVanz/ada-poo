package Aula4;

import java.util.Scanner;

public class TesteHeranca {
    public static void main(String[] args) {
        Carro veloster = new Carro("pla-1234", "verde", "veloster", 2018, 3, "gasolina");
        Moto cb = new Moto("plc-5678", "azul", "cb-500", 2020, 500);
        Scanner scanner = new Scanner(System.in);
//        cb.exibeDados();
//        System.out.println();
//        veloster.exibeDados();

        System.out.println("Insira a placa: ");
        String placa = scanner.nextLine();
        System.out.println("Insira a cor: ");
        String cor = scanner.nextLine();
        System.out.println("Insira o modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Insira o ano: ");
        int ano = scanner.nextInt();
        System.out.println("1-carro / 2-Moto: ");
        int tipo = scanner.nextInt();
        Veiculo veiculo = null;

        switch (tipo){
            case 1:
                System.out.println("Insira o número de portas: ");
                int numPortas = scanner.nextInt();
                System.out.println("Insira o tipo de combustível: ");
                scanner.nextLine();
                String tpComb = scanner.nextLine();
                veiculo = new Carro(placa, cor, modelo, ano, numPortas, tpComb);
                break;
            case 2:
                System.out.println("Insira as cilindradas: ");
                int cilindradas = scanner.nextInt();
                veiculo = new Moto(placa, cor, modelo, ano, cilindradas);
                break;
        }
        imprimiDados(veiculo);
    }

    public static void imprimiDados(Veiculo veiculo){
        veiculo.exibeDados();
    }
}
