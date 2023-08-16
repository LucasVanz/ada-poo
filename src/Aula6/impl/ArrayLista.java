package Aula6.impl;

import Aula6.contrato.Lista;

public class ArrayLista extends Lista {
    private int size;
    private Object[] array;

    public ArrayLista(){
        this.array = new Object[10];
    }

    @Override
    public void add(Object obj){
        this.array[size] = obj;
        size++;
    }



    @Override
    public Object get(int idx){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Posição inexistente");
        }
        return this.array[idx];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = idx; i < this.size - 1; i++) {
            this.array[i] = this.array[i+1];
        }
        this.array[this.size - 1] = null;
        size--;
    }

    private void resize() {
        Object[] novoArray = new Object[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            novoArray[i] = this.array[i];
        }
        this.array = novoArray;
    }
}
