package classes;

import java.util.ArrayDeque;

public class Pilha {

    private int tamanhoMaximo;
    private ArrayDeque<Integer> arrayDeque;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.arrayDeque = new ArrayDeque<>(tamanhoMaximo);

    }

    public void inverterPilha() {
        ArrayDeque<Integer> novaPilha = new ArrayDeque<>(tamanhoMaximo);

        // Desempilhar elementos da pilha original e empilhar na nova pilha
        while (!isEmpty()) {
            novaPilha.push(pop());
        }

        // Atualizar a referência da pilha original para a nova pilha invertida
        arrayDeque = novaPilha;
    }



    //verifica se a pilha ta vazia
    public boolean isEmpty() {
        if (arrayDeque.isEmpty()) {
            return true;
        }
        return false;
    }
//verifica se a pilha ta cheia
    public boolean isFull(){
        if(arrayDeque.size() == tamanhoMaximo){
            return true;
        }
        return false;
    }
//inserir elemento
    public void inserirElemento(int elemento){
        boolean resposta = isFull();

        if(resposta == false){
            arrayDeque.push(elemento);
        }
        else {
            System.out.println("Pilha cheia, não da pra fazer inserções");
        }
    }

// desenpilha
    public int  pop(){
        boolean resposta = isEmpty();
        if(resposta == true){
            System.out.println("A pilha está vazia. Não há elementos para desenpilhar.");
            return -1;
        }
        else{
            return arrayDeque.pop();
        }
    }
    //retorna topo
    public int top(){
        boolean resposta = isEmpty();
        if(resposta == true){
            System.out.println("A pilha está vazia. Não há elementos para retornar do topo.");
            return -1;
        }
        else {
            return arrayDeque.peek();
        }

    }
// retorna a pilha
    public ArrayDeque<Integer> retornarPilha(){
        return arrayDeque;
    }
//verifica se as pilhas sao iguais
    public boolean verificarDuasPilhasIguais(Pilha outraPilha){
        if(this.arrayDeque.equals(outraPilha.arrayDeque)){
            return true;
        }
        else{
            return false;
        }
    }



}
