package org.example;

import classes.Pilha;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {


      //criando pilhas de tamanhoMax= 5
        Pilha pilha1 = new Pilha(5);
        Pilha pilha2 = new Pilha(5);

        //inserindo elementos
        pilha1.inserirElemento(1);
        pilha1.inserirElemento(2);
        pilha1.inserirElemento(3);
        pilha1.inserirElemento(4);
        pilha1.inserirElemento(5);

       //inserindo elementos na pilha 2
        pilha2.inserirElemento(6);
        pilha2.inserirElemento(8);
        pilha2.inserirElemento(9);
        pilha2.inserirElemento(5);


        System.out.println("Topo da pilha: " +pilha1.top());
        System.out.println("desenpilhar o elemento topo da pilha: " +pilha1.pop());
        System.out.println("Topo da pilha: " +pilha1.top());
        System.out.println("A pilha ta vazia? " +pilha1.isEmpty());
        //nao preciso fazer essa verificaçao pq quando a pilha ta cheia nao é possivel inserir, ja que ta cheia
//        System.out.println("A pilha ta cheia? " +pilha1.isFull());
        System.out.println("As pilha são iguais? " +pilha1.verificarDuasPilhasIguais(pilha2));

        System.out.println("Pilha normal: " +pilha1.retornarPilha());
        pilha1.inverterPilha();

        ArrayDeque<Integer> pilhaInvertida = pilha1.retornarPilha();
        System.out.println("Pilha Invertida: " + pilhaInvertida);

    }
}