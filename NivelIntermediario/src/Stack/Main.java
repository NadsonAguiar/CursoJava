package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        // Array
        // São estaticos e tem referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // List
        // São dinâmicas e tamanho aumenta ou diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o  primeiro a sair, estrutura LIFO (Last In, First Out)
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hashirama Senju");
        System.out.println("Minha Stack atual: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha Stack atualizada com pop(): " + ninjasStack);
        System.out.println("Minha Stack com o proximo elemento do topo, usando peek(): " + ninjasStack.peek());
        System.out.println("Mostrando a quantidade de elementos da minha Stack usando size(): " + ninjasStack.size());






    }
}
