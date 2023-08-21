package Aula7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Pilha extends Lista{
    public static LinkedList<Object> fila;

    public Pilha() {
        this.fila = new LinkedList<>();
    }

    @Override
    public void push(Object obj) {
        fila.addFirst(obj);
    }

    @Override
    public Object pop() {
        Object first = fila.getLast();
        fila.removeLast();
        return first;
    }

    @Override
    public Object peek() {
        return fila.getFirst();
    }

}
