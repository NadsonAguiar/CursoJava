package DesafioQuatro;

public class NinjaBasico implements Ninja
{
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade)
    {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico()
    {
    }

    @Override
    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + nome + " : " + "Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade()
    {
        System.out.println("Você lançou sua habilidade " + habilidade);
    }
}
