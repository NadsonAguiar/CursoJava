package PolimorfismoEConstructor;

public class GuerreiroDragonBall
{
    String nome;
    int idade;
    String raca;

    /* Um construtor é chamado automaticamente quando um objeto de uma classe é criado,
    garantindo que o objeto comece a existir num estado válido */
    public GuerreiroDragonBall()
    {
        // Construtor vazio( No-Args Constructor)
    }

    // Construtor com argumentos( All-Args Constructor)
    public GuerreiroDragonBall(String nome)
    {
        this.nome = nome;
    }
    public GuerreiroDragonBall(int idade)
    {
        this.idade = idade;
    }
    // All-Args Constructor = Construtor com todos os argumentos
    public GuerreiroDragonBall(String nome, int idade, String raca)
    {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }


    // Metodo Geral
    public void habilidadeEspecial()
    {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }

}
