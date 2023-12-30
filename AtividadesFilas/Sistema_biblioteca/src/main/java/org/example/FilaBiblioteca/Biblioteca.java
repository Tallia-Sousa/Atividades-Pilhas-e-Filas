package org.example.FilaBiblioteca;

import java.util.LinkedList;
import java.util.Queue;

public class Biblioteca {

    private Queue<Livro> biblioteca;

    public Biblioteca() {
        this.biblioteca = new LinkedList<>();
    }



    public void cadastrarLivro(String nomeLivro) {
        Livro livro = encontrarLivro(nomeLivro);

        if (livro != null) {
            System.out.println("Livro já existe");
        } else {
            livro = new Livro(nomeLivro);
            biblioteca.add(livro);
            System.out.println("Livro cadastrado com sucesso");
        }
    }

    public void requisitarLivro(String nomeLivro, String pessoa) {
        Livro livroRequerido = encontrarLivro(nomeLivro);
        if (livroRequerido != null) {
            if (livroRequerido.isDisponibilidade()) {
                livroRequerido.emprestarLivro(pessoa);
                System.out.println("Livro emprestado para: " + pessoa);
            } else {
                livroRequerido.entrarNaFilaEspera(pessoa);
            }
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    public void devolverLivro(String nomeLivro) {
        Livro livroDevolvido = encontrarLivro(nomeLivro);
        if (livroDevolvido != null) {
            livroDevolvido.devolverLivro();
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    private Livro encontrarLivro(String nomeLivro) {
        for (Livro livro : biblioteca) {
            if (livro.getNomeLivro().equals(nomeLivro)) {
                return livro;
            }
        }
        return null;
    }
}
