package org.example.classe;

import java.util.Stack;

public class Pilha {





    public Stack<Integer> convertendoDecimalParaBinario(int numDecimal){

        Stack<Integer> pilha = new Stack<>();

        if(numDecimal == 0){
            pilha.push(numDecimal);
        }
        else {
            //enquanto esse processo ocorrer
            while (numDecimal > 0) {
                int remainder = numDecimal % 2;
                pilha.push(remainder);
                numDecimal = numDecimal / 2;
            }
        }
        return pilha;
    }


    }
