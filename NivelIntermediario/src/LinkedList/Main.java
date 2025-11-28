package LinkedList;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {


       /* Uma LinkedList é uma estrutura de dados linear onde os elementos são chamados de "nós".
        Cada nó contém um valor e uma referência (ou ponteiro) para o próximo nó da lista. Diferente de um array,
        a LinkedList não armazena os elementos em posições contíguas na memória. */

        // TODO: Podemos usar LinkedList como Pilha ou Fila, o que muda é as opções de metodos para se adequar a situação
        // PILHA (LIFO) - push() adiciona na pilha
        // PILHA (LIFO) - pop() remove do TOPO (que também é o início)
        // PILHA (LIFO) - peek() olha o topo e retorna


        //USO PARA DEQUE
        // FILA (FIFO) - add() adicionar na fila
        // FILA (FIFO) - offer() adiciona na fila - USO RECOMENDADO(NÃO LANÇA EXCEÇÃO)
        // FILA (FIFO) - offerFirst() adiciona na INICIO da fila
        // FILA (FIFO) - offerLast() adiciona na FIM da fila
        // FILA (FIFO) - poll() remove primeiro elemento da fila - USO RECOMENDADO(NÃO LANÇA EXCEÇÃO)
        // FILA (FIFO) - pollFirst() remove primeiro elemento da fila
        // FILA (FIFO) - pollLast() remove ultimo elemento da fila
        // FILA (FIFO) - remove() remove primeiro elemento da fila
        // FILA (FIFO) - peek() olha o fim da fila e retorna - USO RECOMENDADO(NÃO LANÇA EXCEÇÃO)
        // FILA (FIFO) - peekFirst() olha o inicio da fila e retorna
        // FILA (FIFO) - peekLast() olha o fim da fila e retorna
        // FILA (FIFO) - element() olha o fim da fila e retorna



        // Primeiro exemplo de LinkeList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sakura Haruno");
        linkedList.add("Sasuke Uchiha");
        System.out.println(linkedList);


        // Criando a LinkedList de ninjas, representação de como funcionaria o LinkedList na prática
        Ninja naruto = new Ninja("Naruto Uzumaki", 17, "Konoha");
        Ninja sasuke = new Ninja("Sasuke Uchiha", 17, "Konoha");
        Ninja sakura = new Ninja("Sakura Haruno", 17, "Konoha");
        Ninja kakashi = new Ninja("Kakashi Hatake", 30, "Konoha");

        // Ligando os nós
        naruto.proximo = sasuke;
        sasuke.proximo = sakura;
        sakura.proximo = kakashi;
        kakashi.proximo = null; // Último nó da lista

        Ninja atual = naruto; // Inicia no primeiro nó
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Idade: " + atual.idade + ", Vila: " + atual.vila);
            atual = atual.proximo; // Move para o próximo nó
        }




    }
}
