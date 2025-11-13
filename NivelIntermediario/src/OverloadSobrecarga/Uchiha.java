package OverloadSobrecarga;

public class Uchiha extends Ninja implements EstrategiaDeBatalha{


    public Uchiha()
    {
        super();
    }
    public Uchiha(String nome, String aldeia, int idade)
    {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*A anotação @Override é usada para marcar um metodo numa subclasse que está a sobrescrever um metodo da superclasse.
    Isto indica claramente a intenção de substituir um metodo existente na superclasse.*/
    @Override
    public void habilidadeEspecial()
    {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: " + numeroDeMissoesConcluidas);
    }

    // Inteligencia de combate - Metodo padrão
    @Override
    public void inteligenciaDeCombate()
    {
        System.out.println("Meu nome é: " + nome + " Essa é minha INTELIGENCIA de combate");
    }


    // Inteligencia de combate - Metodo sobrecarga
    @Override
    public void inteligenciaDeCombate(int qi)
    {
        if (qi > 150)
        {
            System.out.println("Seu QI é: " + qi + " e voce é um gênio");
        }
        else if (qi >= 130)
        {
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor");
        }
        else
        {
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais suas estratégias");
        }
    }
}
