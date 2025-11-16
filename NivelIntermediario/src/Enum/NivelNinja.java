package Enum;

// Exemplo de enum num contexto de Naruto
// Definição do enum para os níveis de ninja
public enum NivelNinja
{
    //Podemos aplicar argumentos dentro dos enum e usar construtores
    GENIN("Iniciante", 1),
    CHUNIN("Intermediário", 2),
    JONIN("Médio", 3),
    GENIO("Avançado", 4),
    HOKAGE("Mestre", 5);


    private String descricao;
    private int dificuldade;


    // Usamos constructor dentro do enum para aplicar os argumentos dentro do enum
    NivelNinja(String descricao, int dificuldade)
    {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

}
