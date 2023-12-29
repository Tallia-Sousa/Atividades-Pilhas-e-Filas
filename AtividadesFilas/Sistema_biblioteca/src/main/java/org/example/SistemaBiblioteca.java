package org.example;

import org.example.FilaBiblioteca.Biblioteca;

import java.util.Scanner;

public class SistemaBiblioteca {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        Biblioteca biblioteca = criarBiblioteca();
        interagirComUsuario(biblioteca);



    }

    private static Biblioteca criarBiblioteca(){
        return new Biblioteca();

    }

    private static void interagirComUsuario(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("------ Menu ------");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Requisitar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarLivro(biblioteca);
                    break;
                case 2:
                    requisitarLivro(biblioteca);
                    break;
                case 3:
                    devolverLivro(biblioteca);
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }


    private static void cadastrarLivro(Biblioteca biblioteca){
        System.out.print("Digite o nome do livro: ");
        String nomeLivro = scanner.next();
        biblioteca.cadastrarLivro(nomeLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void requisitarLivro(Biblioteca biblioteca){
        System.out.print("Digite o nome do livro que que deseja requisitar: ");
        String nomeLivro = scanner.next();
        System.out.print("Digite seu nome para requisitar o livro: ");
        String nomeUsuario = scanner.next();
        biblioteca.requisitarLivro(nomeLivro, nomeUsuario);

    }
    private static void devolverLivro(Biblioteca biblioteca) {
        System.out.print("Digite o nome do livro que deseja devolver: ");
        String nomeLivro = scanner.next();
        biblioteca.devolverLivro(nomeLivro);
    }
}