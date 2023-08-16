package Aula6.impl;

import Aula6.contrato.Lista;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new ArrayLista();

        lista.add("prim ele");
        lista.add("seg ele");
        lista.add(1);
        lista.add(2);

        imprimirLista(lista);

        Lista lista2 = new StringArrayLista();
        lista2.add("Meu nome");
        lista2.add("Outro nome");

        imprimirLista(lista2);
    }

    public static void imprimirLista(Lista lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
