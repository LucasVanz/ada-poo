package Aula2;

import java.util.ArrayList;

public class Banco {
    public ArrayList<Conta> contas;
    public Banco(){
            contas = new ArrayList<>();
    }

    public ArrayList<Conta> getConta() {
        return contas;
    }

    public void setConta(ArrayList<Conta> conta) {
        this.contas = conta;
    }

    public void criarConta(Cliente dono, int numeroConta){
        Conta conta = new Conta(dono, numeroConta, 0.0);
        contas.add(conta);
    }

    public Conta buscaConta(int contaMetodo){
        for (Conta x:contas) {
            if (x.getConta() == contaMetodo){
                return x;
            }
        }
    return null;
    }

    public boolean depositar(int numConta, double deposito){
        Conta conta = buscaConta(numConta);
        if (conta == null){
            return false;
        }
        conta.depositar(deposito);
        return true;
    }

    public boolean sacar(int numConta, double quantia){
        Conta conta = buscaConta(numConta);
        if (conta == null){
            return false;
        }
        conta.sacar(quantia);
        return true;
    }


}
