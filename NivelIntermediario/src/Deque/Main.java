package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    static void main(String[] args) {


        // TODO: DEQUE é uma interface, dela implementam "ArrayDeque" e "LinkedList"
        // PODEMOS USAR DEQUE COMO PILHA(LIFO)
        // PILHA (LIFO) - push() adiciona na pilha
        // PILHA (LIFO) - pop() remove do TOPO (que também é o início)
        // PILHA (LIFO) - peek() olha o topo e retorna

        Deque<String> historicoPaginas = new ArrayDeque<>();
        historicoPaginas.push("google.com");
        historicoPaginas.push("youtube.com");
        historicoPaginas.push("github.com");

        // Voltar página (último que entrou é primeiro a sair)
        System.out.println("Voltando de: " + historicoPaginas.pop()); // github.com
        System.out.println("Voltando de: " + historicoPaginas.pop()); // youtube.com

        // PODEMOS USAR DEQUE COMO FILA(FIFO)
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

        Deque<String> filaRapida = new LinkedList<>();
        filaRapida.offer("A");
        filaRapida.offer("B");
        System.out.println(filaRapida.poll());


    }
}
