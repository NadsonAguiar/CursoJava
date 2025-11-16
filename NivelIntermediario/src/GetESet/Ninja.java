package GetESet;

public class Ninja {
    private String nome;

    //Por debaixo dos panos, o Java já entende que os atributos são public
    public String aldeia;
    private int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Tirar dados ou mostrar para o usuario eu uso o GET + NOME DA VARIVAVEL
    public String getNome() {
        return nome;
    }

    // Setter recebe valores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
