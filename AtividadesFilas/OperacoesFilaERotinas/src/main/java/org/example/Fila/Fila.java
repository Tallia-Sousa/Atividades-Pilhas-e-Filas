package org.example.Fila;

import java.util.LinkedList;
import java.util.Stack;

public class Fila {

    private LinkedList<Integer> elementos = new LinkedList<>();
    private int capacidade;

    public Fila(int capacidade) {

        this.capacidade = capacidade;
    }
    public void criarFila(){
        elementos = new LinkedList<>();
        System.out.println("Fila criada com sucesso");

    }

   public void esvazia(){
        elementos.clear();
       System.out.println("Fila esvaziada com sucesso");
   }

   public boolean vazia(){
        if(elementos.isEmpty()){
            return true;
        }
        return false;
   }

    public boolean cheia() {
        if(elementos.size() == capacidade){
           return true ;
        }
        return false;
    }
    public void Entrar(int elemento) {

        if (cheia()) {
            System.out.println("A fila está cheia. Não é possível adicionar mais elementos.");
        } else {
            elementos.addLast(elemento);
            System.out.println("Elemento " + elemento + " adicionado à fila.");
        }
    }

    public int sair() {
        if (!vazia()) {
            return elementos.removeFirst();
        } else {
            throw new IllegalStateException("Fila vazia. Não é possível remover elementos.");
        }
    }

   public boolean verificarOrdem(){

        if(vazia()){
            return true; // Fila vazia
        }
     //obter tamanho da lista
        int capacidade = elementos.size();
        //obter primeiro elemento
        int elementoAnterior = elementos.getFirst();

        //percorrer todos os elementos
        for(int i = 1; i < capacidade; i++){
            int elementoAtual = elementos.get(i);

            if(elementoAtual < elementoAnterior){
                return false;
            }
            elementoAnterior = elementoAtual;
        }
       return true;
   }



    public Fila inverterFila() {
        Fila filaInvertida = new Fila(capacidade);
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        while (!this.vazia()) {
            pilhaAuxiliar.push(this.sair());
        }

        while (!pilhaAuxiliar.isEmpty()) {
            filaInvertida.Entrar(pilhaAuxiliar.pop());
        }

        return filaInvertida;
    }

    @Override
    public String toString() {
        return elementos.toString();
    }




}
