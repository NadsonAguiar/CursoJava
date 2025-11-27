package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        // Arrays são estáticos, não alteram de tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("NinjasArray[i] = " + ninjasArray[i]);
        }

        System.out.println("=============================");

        // Listas não são estáticas, podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();

        // Usando "add" podemos adicionar na lista
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add(1,"Boruto Uzumaki");
        ninjasList.add("Tobirama Senju");
        System.out.println("NinjasList = " + ninjasList);
        System.out.println("=============================");

        // Usando "remove" podemos remover da lista
        ninjasList.remove("Boruto Uzumaki");
        System.out.println("NinjaList = " + ninjasList);
        System.out.println("============================");

        // Usando "set"  podemos trocar elementos
        ninjasList.set(3,"Hashirama Senju");
        System.out.println("NinjaList = " + ninjasList + " elementos");
        System.out.println("=============================");

        // Usando "size" podemos ver o tamanho da lista
        System.out.println(" Tamanho da lista = " + ninjasList.size());
        System.out.println("==============================");










    }
}
