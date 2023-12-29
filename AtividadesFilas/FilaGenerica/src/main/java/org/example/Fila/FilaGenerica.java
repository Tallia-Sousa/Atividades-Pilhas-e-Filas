package org.example.Fila;

import java.util.LinkedList;
import java.util.Objects;

public class FilaGenerica {
    private LinkedList<Object> elementos = new LinkedList<>();


    public void entrarNaFila(Object elemento){
        elementos.addLast(elemento);
    }

    public boolean vazia(){
       return elementos.isEmpty();

    }
    public Object sairDaFila(){
        if(vazia()){
            throw new IllegalStateException("A fila está vazia");
        }
        return elementos.removeFirst();
    }

    public void limparFila(){

        elementos.clear();
    }
    public int tamanhoFila(){
        return elementos.size();
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
