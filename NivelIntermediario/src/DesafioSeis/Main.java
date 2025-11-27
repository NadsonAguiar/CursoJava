package DesafioSeis;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {

        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17,"Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        System.out.println(listaDeNinjas);

        System.out.println(listaDeNinjas.pop());
        listaDeNinjas.push(new Ninja("Obito", 25, "Konoha"));
        System.out.println(listaDeNinjas);



    }
}
