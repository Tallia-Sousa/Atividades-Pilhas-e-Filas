package org.example;

import org.example.Fila.FilaGenerica;

public class Main {
    public static void main(String[] args) {

       //criando fila
        FilaGenerica fila = new FilaGenerica();
        //entrada de elementos na fila
        fila.entrarNaFila(1);
        fila.entrarNaFila('a');
        fila.entrarNaFila(2);
        fila.entrarNaFila('b');
        fila.entrarNaFila('@');

       System.out.println("Fila:" +fila);
        System.out.println("A fila ta vazia? " +fila.vazia());
        int tam = fila.tamanhoFila();
        System.out.println("Qual o tamanho da fila? " +tam);

        System.out.println("Limpando fila... " );
        fila.limparFila();

        System.out.println("A fila ta vazia? " +fila.vazia());





        }

}
