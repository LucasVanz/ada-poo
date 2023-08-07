package Aula2;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        boolean sair = true;
        while (sair){
            System.out.println("1-Crie uma conta");
            System.out.println("2-Depositar");
            System.out.println("3-Sacar");
            System.out.println("4-Exibir os dados da conta");
            System.out.println("5-Sair");
            System.out.printf("Opção: ");
            int opc = scanner.nextInt();
            switch (opc){
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite um nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite um cpf: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite um email: ");
                    String email = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf, email);
                    System.out.println("Número da conta");
                    int numConta = scanner.nextInt();
                    banco.criarConta(cliente, numConta);
                    break;
                case 2:
                    System.out.printf("Digite uma conta: ");
                    int contaDeposito = scanner.nextInt();
                    System.out.println("Digite um valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    if(banco.depositar(contaDeposito, deposito)){
                        System.out.println("Deposito realizado com sucesso");
                    }else {
                        System.out.println("Não foi possivel depositar");
                    }
                    break;
                case 3:
                    System.out.printf("Digite uma conta: ");
                    int contaSaque = scanner.nextInt();
                    System.out.println("Digite um valor a sacar: ");
                    double saque = scanner.nextDouble();
                    if(banco.sacar(contaSaque, saque)){
                        System.out.println("Saque realizado com sucesso");
                    }else {
                        System.out.println("Não foi possível sacar");
                    }
                    break;
                case 4:
                    System.out.println("Número da conta: ");
                    int contaDados = scanner.nextInt();
                    Conta dadosConta = banco.buscaConta(contaDados);
                    System.out.println(dadosConta.toString());
                    break;
                case 5:
                    sair = false;
            }
        }
    }
}
