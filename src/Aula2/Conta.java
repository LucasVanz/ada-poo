package Aula2;

public class Conta {
    Cliente dono;
    int conta;
    double saldo;

    public Conta(Cliente dono, int conta, double saldo){
        this.dono = dono;
        this.conta = conta;
        this.saldo = 0;
    }


    public Cliente getDono() {
        return dono;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String depositar(double deposito){
        saldo += deposito;
        return "Seu novo saldo é de " + Double.toString(saldo) + "reais";
    }

    public String sacar(double quantia){
        if(saldo < quantia){
            return "Saldo menor que a quantidade a sacar";
        }else {
            saldo -= quantia;
            return "Você sacou" + Double.toString(quantia) + ". Restam " + Double.toString(saldo) + "reais na conta.";
        }
    }

    @Override
    public boolean equals(Object obj) {
            if (obj instanceof Conta contaComparada){
                 if(conta == contaComparada.conta){
                     return true;
                 }
            }
        return false;
    }

    @Override
    public String toString(){
        return dono.toString() + "\nNúmero da conta: " + conta + "\nSaldo da conta: " + saldo;
    }
}
