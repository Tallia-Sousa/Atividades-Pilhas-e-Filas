package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma equação:");
        String equacao = scanner.next();
        Stack<Character> pilha = new Stack<>();
        int parAberto = 0;
        int parFechado = 0;

        for (char caractere : equacao.toCharArray()) {
            if (caractere == '(') {
                pilha.push(caractere);
                parAberto++;
            } else if (caractere == ')') {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                    parFechado++;
                } else {
                    System.out.println("Não foram fechados todos os parênteses.");
                    return;
                }
            }
        }

        boolean todosFechados = pilha.isEmpty();

        if (todosFechados && parAberto == parFechado) {
            System.out.println("Todos os parênteses estão fechados.");
        } else {
            System.out.println("Não foram fechados todos os parênteses.");
        }

        System.out.println("Quantidade de parênteses abertos: " + parAberto);
        System.out.println("Quantidade de parênteses fechados: " + parFechado);
    }
}
