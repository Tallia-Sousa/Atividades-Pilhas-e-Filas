package org.example;

import org.example.classe.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        converterParaDecimal();


    }
  private static void converterParaDecimal(){

      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite um número inteiro para fazer a conversão para binário:");
      int numDecimal = scanner.nextInt();

      Pilha pilha = new Pilha();
      Stack<Integer> pilhab = pilha.convertendoDecimalParaBinario(numDecimal);

      System.out.println("Conversão para binário:");
      while (!pilhab.isEmpty()) {
          //desenpilhando
          System.out.println(pilhab.pop());
      }

      scanner.close();

  }

}