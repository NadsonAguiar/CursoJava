package desafios;

public class Ninja
{


    // ATRIBUTOS (Características)
    private String nome;
    private int idade;
    private String missao;
    private String nivelDificuldade;
    private String statusMissao;


    // Constructor
    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao)
    {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    // METODO (AÇÃO)
    public void ataqueBase()
    {
        System.out.println("Eu sou um desafios.ninja e taquei uma Kunai");
    }

    public void mostrarInformacoes()
    {
        System.out.println("Ninja: " + getNome() + " - " + "Idade: " + getIdade());
        System.out.println("Missão: " + getMissao() + " / " + "Nivel de Dificuldade: " +  getNivelDificuldade() +
                " / " + "Status Missão: " + getStatusMissao());
    }


    //ENCAPSULAMENTO
    /* Getter - Criar getter para mostrar para o utilizador */
    public String getNome()
    {
        return nome;
    }

    /* Setter - Settar o valor da variável */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    // Aqui usamos o comando ALT+INSERT para gerar todos os Getters e Setters
    public String getMissao()
    {
        return missao;
    }

    public void setMissao(String missao)
    {
        this.missao = missao;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }
}