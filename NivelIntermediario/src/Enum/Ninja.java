package Enum;

public class Ninja {
    // Atributo para armazenar o nível do ninja
    private NivelNinja nivelNinja;

    // Construtor para definir o nível do ninja
    public Ninja(NivelNinja nivelNinja)
    {
        this.nivelNinja = nivelNinja;
    }

    // Metodo para exibir uma mensagem baseada no nível do ninja
    public void exibirNivel()
    {
        switch (nivelNinja)
        {
            case GENIN:
                System.out.println("Você é um Genin. O caminho ninja está apenas começando." + "(Descrição: " + nivelNinja.getDescricao() + ", Dificuldade: " + nivelNinja.getDificuldade() + ")");
                break;
            case CHUNIN:
                System.out.println("Você é um Chunin. Continue a melhorar suas habilidades." + "(Descrição: " + nivelNinja.getDescricao() + ", Dificuldade: " + nivelNinja.getDificuldade() + ")");
                break;
            case JONIN:
                System.out.println("Você é um Jonin. Um líder experiente e respeitado." + "(Descrição: " + nivelNinja.getDescricao() + ", Dificuldade: " + nivelNinja.getDificuldade() + ")");
                break;
            case GENIO:
                System.out.println("Você é um Gênio. Suas habilidades são notáveis desde jovem." + "(Descrição: " + nivelNinja.getDescricao() + ", Dificuldade: " + nivelNinja.getDificuldade() + ")");
                break;
            case HOKAGE:
                System.out.println("Você é o Hokage. O ninja mais forte e líder da vila." + "(Descrição: " + nivelNinja.getDescricao() + ", Dificuldade: " + nivelNinja.getDificuldade() + ")");
                break;
        }
    }


}
