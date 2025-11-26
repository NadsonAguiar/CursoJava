package LinkedHashsetXTreeSet;

import java.util.*;

public class Main {
    static void main(String[] args) {
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

        /* Exemplos de uso de HashSet, TreeSet, LinkedHashSet */

        /*
        Não ira aparecer itens duplicados, mas a ordem é aleatória
        Set<String> ninjasSet = new HashSet<>();
        */

        /*
        Não ira aparecer itens duplicados, a ordem é alfabética ou alfanumérica
        Set<String> ninjasSet = new TreeSet<>();
        */

        /*
        Não ira aparecer itens duplicados, mas a ordem é conforme colocação na lista
        Set<String> ninjasSet = new LinkedHashSet<>();
        */






    }
}
