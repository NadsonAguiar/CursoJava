package Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 19));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 28));
        ninjas.add(new Ninja("Temari", "Suna", 39));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 57));

        // para chamar "Stream" usamos basicamente.stream
        // Isso "->" se chama função, e ela fornece a ação para o metodo

        // Filtragem dos ninjas por vila
        /*ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Suna"))
                .forEach(System.out::println); // soutc*/

        // Ordenação
        ninjas.stream()
                .sorted((n1,n2) -> String.CASE_INSENSITIVE_ORDER.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);



    }
}
