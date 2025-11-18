package Enum;

public class Main {
    static void main(String[] args) {

        // Criando ninjas com diferentes níveis
        Ninja naruto = new Ninja(NivelNinja.HOKAGE);
        Ninja sasuke = new Ninja(NivelNinja.GENIO);
        Ninja sakura = new Ninja(NivelNinja.JONIN);
        Ninja boruto = new Ninja(NivelNinja.GENIN);

        // Exibindo o nível de cada ninja
        naruto.exibirNivel();
        sasuke.exibirNivel();
        sakura.exibirNivel();
        boruto.exibirNivel();


    }
}
