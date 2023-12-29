package org.example.FilaBiblioteca;

import java.util.LinkedList;
import java.util.Queue;

public class Livro {

    private String nomeLivro;

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    private boolean disponibilidade;
    private Queue<String> filaEspera;

    public String getNomeLivro() {
        return nomeLivro;
    }

    public Livro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
        this.disponibilidade =  true;
        this.filaEspera = new LinkedList<>();
    }


    public void emprestarLivro(String pessoa) {
        if (disponibilidade) {
            disponibilidade = false;
        } else {

            entrarNaFilaEspera(pessoa);

        }
    }




    public void devolverLivro() {
        disponibilidade = true;
        if (!filaEspera.isEmpty()) {
            String proximoNaFila = filaEspera.poll();
            emprestarLivro(proximoNaFila);
            System.out.println("O Livro foi devolvido e foi emprestado para o " +proximoNaFila +" que estava na fila de espera");
        }
        else{
            System.out.println("Livro devolvido");
        }
    }

    public void entrarNaFilaEspera(String pessoa) {
        filaEspera.add(pessoa);
        System.out.println("Livro não disponível. Adicionando à fila de espera.");
    }
}



