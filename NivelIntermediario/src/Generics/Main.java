package Generics;

public class Main {
    static void main(String[] args) {


        //Usamos a superclasse Object para trabalhar com diversos tipos de objeto
       BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
       bolsaNinja.adicionarEquipamentos(new Kunai("Kunai de Ferro"));
       bolsaNinja.adicionarEquipamentos(new Shuriken(3));
       bolsaNinja.adicionarEquipamentos(new Pergaminho("Invocação de Sapo"));
       bolsaNinja.adicionarEquipamentos(new Pergaminho("Invocação de Aguia"));

        System.out.println("Itens da nossa bolsa Ninja: ");
        bolsaNinja.mostrarFerramenta();

    }
}
