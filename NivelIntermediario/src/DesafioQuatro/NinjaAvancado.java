package DesafioQuatro;

public class NinjaAvancado extends NinjaBasico
{
    String habilidadeEspecial;

    public NinjaAvancado(String nome, int idade, String habilidade, String habilidadeEspecial)
    {
        super(nome, idade, habilidade);
        this.habilidadeEspecial = habilidadeEspecial;
    }


    @Override
    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + nome + " : " + "Idade: " + idade);
        System.out.println("Habilidade: " + habilidade + " : " + "Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public void executarHabilidade()
    {
        System.out.println("Você lançou sua habilidade " + habilidade + " e ativou sua habilidade especial " + habilidadeEspecial);
    }
}
