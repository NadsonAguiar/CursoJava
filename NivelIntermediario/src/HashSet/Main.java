package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        /*O Set é uma ‘interface’ na Collections Framework do Java que representa uma coleção que não permite elementos duplicados.
        A implementação mais comum do Set é o HashSet, que utiliza uma tabela hash para armazenar elementos,
        garantindo eficiência em operações como adição, remoção e busca.*/


        // Exemplo de Uso de HashSet:
        HashSet<String> aldeias = new HashSet<>();

        // Adicionando aldeias
        aldeias.add("Konoha");
        aldeias.add("Suna");
        aldeias.add("Kiri");
        aldeias.add("Konoha"); // Tentativa de duplicata

        // Exibindo as aldeias
        System.out.println("Aldeias participantes:");
        for (String aldeia : aldeias) {
            System.out.println(aldeia);
        }

        // Verificando se uma aldeia está presente
        System.out.println("Konoha está no torneio? " + aldeias.contains("Konoha"));

        // Removendo uma aldeia
        aldeias.remove("Kiri");
        System.out.println("Após remover Kiri: " + aldeias);


        // Caso eu quissese transformar uma ArrayList num Set, poderia usar a estrutura abaixo:
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Sakura Haruno");

        System.out.println("ninjas = " + ninjas);

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println("ninjasSet = " + ninjasSet);




    }
}
