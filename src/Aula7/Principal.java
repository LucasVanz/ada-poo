package Aula7;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
    }
}
