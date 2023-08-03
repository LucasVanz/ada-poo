package Aula1;

public class Contato {

    String nome;
    String numero;

    public void ligar(){
        System.out.println("Ligando para " + nome);
    }

    public void detalhar(){
        System.out.println("Nome:" + nome);
        System.out.println("Número:" + numero);
    }

    public String getNumero(){
        return numero;
    }
}
