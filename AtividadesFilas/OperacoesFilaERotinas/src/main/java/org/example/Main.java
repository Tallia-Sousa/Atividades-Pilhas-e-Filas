package org.example;

import org.example.Fila.Fila;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//Implementaçao das seguintes atividades:
         //•  Implementar as operações
          //• Cria
          //• Esvazia
          //• EstaVazia --> é verificado quando usa a funçao de sair
          //• EstaCheia --> é verificado quando se tenta inserir uma quantidade maior qua a capacidade da fila
          //• Entra
          //• Sai
       // Faça uma rotina que inverta uma fila F1, criando-se uma nova fila F2
        //• Faça uma rotina para verificar se os elementos de uma fila estão ordenados de forma crescente


        Fila fila = new Fila(4);
        //criando a fila
        fila.criarFila();

        //entranda de elementos na fila
        fila.Entrar(3);
        fila.Entrar(2);
        fila.Entrar(1);

        //retornar elementos que estão na fila
        System.out.println("Fila:" +fila);

        //sair da fila
        System.out.println("Elemento retirado da fila: " +fila.sair());
        //verificar ordem da fila
        System.out.println("Os elementos da fila estão em ordem crescente? " +fila.verificarOrdem());
        //ver elementos da fila normal
        System.out.println("Fila:" +fila);
        //inverter a fila
        Fila filaInvertida = fila.inverterFila();
        //ver elementos da fila invertida
        System.out.println("Fila Invertida: " + filaInvertida);
         //limpar  fila inversa
        filaInvertida.esvazia();





    }
}