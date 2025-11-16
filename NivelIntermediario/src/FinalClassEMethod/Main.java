package FinalClassEMethod;

public class Main {
    static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha");
        sasuke.habilidadeNinja();

        sasuke.tacarKunai();

        System.out.println("-----");

        // Instanciando classe final
        Anbu anbuNinja = new Anbu("Danzo");
        anbuNinja.anbu();
        System.out.println("-----");
    }

}
