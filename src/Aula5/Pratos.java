package Aula5;

import java.util.ArrayList;
import java.util.List;

public class Pratos {

    private int id = 0;
    private String prato;
    private double preco;
    private String descricao;
    private static int idAux = 0;

    public Pratos(String prato, double preco, String descricao) {
        this.id = ++idAux;
        this.prato = prato;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static List<Pratos> listaPratos(Restaurantes restaurante){
        return new ArrayList<>(restaurante.getPratos());
    }

    public static void addPrato(Restaurantes restaurante, Pratos pratos){
        restaurante.getPratos().add(pratos);
    }
@Override
    public String toString(){
        return prato;
    }
}
