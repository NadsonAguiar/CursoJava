package FinalClassEMethod;

public class Uchiha extends Ninja {

    public Uchiha(String nome)
    {
        super(nome);
    }


    @Override
    public void habilidadeNinja() {
        System.out.println("Eu sou um ninja Uchiha e usei minha habilidade de fogo");
    }

    // O metodo abaixo vai dar erro pois na classe mae "Takar Kunai" é final
//    @Override
//    public void tacarKunai(){}




}
