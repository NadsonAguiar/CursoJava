package OverloadSobrecargaDeConstrutores;

public class Ninja {
    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, rank
    //TODO: Gennin, Chunnin, Jounnin, Hokage
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    public Ninja()
    {

    }

    public Ninja(String nome, String aldeia,int idade)
    {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;

    }
    /* Sempre que adicionamos um novo atributo, e já tem um construtor, não mexer
    devemos criar outro construtor e usar a sobrecarga, já que o construtores entendemos como "imutável"*/
    //TODO: Sobrecarga do construtor chamando os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        // Fazemos assim o this abaixo para tornar menos redundante o código
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void habilidadeEspecial()
    {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Ninja");
    }
}
