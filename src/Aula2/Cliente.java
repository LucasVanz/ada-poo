package Aula2;

public class Cliente {
    String nome;
    String cpf;
    String email;

    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Cliente clienteComparado){
            if(cpf.equals(clienteComparado)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nEmail: " + email;
    }

}
