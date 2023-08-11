package Aula5;

import Aula2.Conta;

import java.util.ArrayList;
import java.util.List;

public class Restaurantes {
    private int id = 0;
    private String nome;
    private String endereco;
    private Pratos pratos;
    private static int idAux = 0;
    public static ArrayList<Restaurantes> restaurantes = new ArrayList<>();

    public Restaurantes(String nome, String endereco){
        this.id = ++idAux;
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pratos getPratos() {
        return pratos;
    }

    public void setPratos(Pratos pratos) {
        this.pratos = pratos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static void criaCadastro(String nome, String endereco){
        Restaurantes restaurante = new Restaurantes(nome, endereco);
        restaurantes.add(restaurante);
    }

    public static List<Restaurantes> listaRestaurantes(){
        return new ArrayList<>(restaurantes);
    }

    @Override
    public String toString(){
        return id +"-Nome do restaurante: " + nome + "   Endereço do restaurante: " + endereco;
    }


}
