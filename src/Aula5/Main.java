package Aula5;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        while (continua == true) {
            System.out.println();
            System.out.println("1-Inserir um restaurante ");
            System.out.println("2-Listar os restaurantes ");
            System.out.println("3-Adicionar pratos ao restaurante");
            System.out.printf("Opção:");
            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Insira o nome do restaurante:");
                    String nomeRestaurante = scanner.nextLine();
                    System.out.println("Insira o endereço do restaurante:");
                    String enderecoRestaurante = scanner.nextLine();
                    Restaurantes.criaCadastro(nomeRestaurante, enderecoRestaurante);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                case 2:
                    List<Restaurantes> restaurante = Restaurantes.listaRestaurantes();
                    for (Restaurantes x : restaurante) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    boolean adicionar = true;
                    System.out.println("Digite o número do restaurante na lista: ");
                    int id = scanner.nextInt();
                    // busco o restaurante
                    while (adicionar == true) {
                        System.out.println("1-Novo prato");
                        System.out.println("2-Sair");
                        System.out.printf("Opção:");
                        int opcAdd = scanner.nextInt();
                        if (opcAdd == 1){
                            System.out.println("Digite um prato:");

                            //aceita um prato
                        } else if (opcAdd == 2) {
                            adicionar = false;
                        }
                    }
                    break;
            }
        }
    }
}
