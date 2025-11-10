package DesafiosUmATres;

public class Uchiha extends Ninja  //USANDO HERANÇA
{
    // ATRIBUTOS (Características)
    String habilidadeEspecial;

    // Constructor
    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial)
    {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    // METODO (AÇÃO)
    public void mostrarHabilidadeEspecial()
    {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes()
    {
        System.out.println("Ninja Uchiha: " + getNome() + " - " + "Idade: " + getIdade() + " / " + "Habilidade Especial: " + habilidadeEspecial);
        System.out.println("Missão: " + getMissao() + " / " + "Nivel de Dificuldade: " +  getNivelDificuldade() +
                " / " + "Status Missão: " + getStatusMissao());
    }

    //USANDO POLIMORFISMO
    @Override
    public void ataqueBase()
    {
        System.out.println("Eu sou um ninja desafios.uchiha e taquei uma Kunai do elemento FOGO");
    }

    // Usando um 2 metodo com mesmo nome do anterior, porém com parâmetro
    public void ataqueBase(int nivelDeChakra)
    {
        if (nivelDeChakra >= 3) {
            System.out.println("Susano'o ativado");
        } else if (nivelDeChakra == 2) {
            System.out.println("Chidori ativado");
        } else {
            System.out.println("Jutsu Bola de Fogo ativado");
        }
    }
}