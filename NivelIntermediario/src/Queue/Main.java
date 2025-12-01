package Queue;

import java.util.*;

public class Main {
    static void main(String[] args) {

        // Array
        // São estáticos e tem referência de memória
        String[] ninjasArray = new String[3];

        // List
        // São dinâmicas e tamanho aumenta ou diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o  primeiro a sair, estrutura LIFO (Last In, First Out)
        Stack<String> ninjasStack = new Stack<>();



        // Queue // Filas
        /*
        A Queue em Java é uma estrutura de dados que segue o princípio FIFO (First In, First Out),
        onde o primeiro elemento inserido é o primeiro a ser removido
        Em Queue existe HEAD(primeiro) e TAIL(ultimo), quando o primeiro sai, modifica o HEAD, mas o TAIL permanece,
        até ser adicionado outro elemento no final
        */
        //TODO: QUEUE é uma interface, dela implementam "LinkedList" e "PriorityQueue"

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

        Queue<String> ninjaQueue= new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Shikamaru");

        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjaQueue);

        // Tirar um ninja da fila
        ninjaQueue.poll();
        System.out.println("Ninjas na fila depois do poll(): " + ninjaQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninjas no HEAD: " + ninjaQueue.peek());

        // Verificar se a fila esta vazia
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        System.out.println("Ninjas na fila:" + ninjaQueue);
        if(ninjaQueue.isEmpty()){
            System.out.println("A fila está vazia");
        }
        // Não da para deletar o tail




    }
}
