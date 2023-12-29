package org.example.Calcposfixa;

import java.util.Stack;

public class Calculadora {

    public static double calcularPosfixa(String[] expressao) {
        Stack<Double> pilha = new Stack<>();

        for (String token : expressao) {
            if (isNumero(token)) {
                pilha.push(Double.parseDouble(token));
            } else {
                double operand2 = pilha.pop();
                double operand1 = pilha.pop();

                switch (token) {
                    case "+":
                        pilha.push(operand1 + operand2);
                        break;
                    case "-":
                        pilha.push(operand1 - operand2);
                        break;
                    case "*":
                        pilha.push(operand1 * operand2);
                        break;
                    case "/":
                        pilha.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido: " + token);
                }
            }
        }

        return pilha.pop();
    }

    private static boolean isNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }



}
