package org.example;

import org.example.Calcposfixa.Calculadora;

import java.util.Scanner;
import java.util.Stack;

import static org.example.Calcposfixa.Calculadora.calcularPosfixa;

public class AtividadePosfixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a expressão posfixa separada por espaços: ");
        String expressaoInput = scanner.nextLine();
        String[] expressaoPosfixa = expressaoInput.split("\\s+");


        double resultado = calcularPosfixa(expressaoPosfixa);
        System.out.println("Resultado da expressão posfixa: " + resultado);
        scanner.close();
    }

    }