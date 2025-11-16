package FinalClassEMethod;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    // final é a palavra reservada do java para CONSTANTE
    final double altura = 1.76;

    public Ninja(String nome){
        this.nome = nome;
    }

    // Metodo publico que pode ser modificado pelo polimorfismo nas classes filhas
    public void habilidadeNinja()
    {
        System.out.println("Eu sou um ninja e usei minha habilidade");
    }


    // Metodo final, não pode ser sobrescrito por subclasses
    final void tacarKunai()
    {
        System.out.println("Takei uma kunai");
    }



}
