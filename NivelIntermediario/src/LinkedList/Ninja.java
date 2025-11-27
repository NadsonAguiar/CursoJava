package LinkedList;

public class Ninja {
        String nome;
        int idade;
        String vila;
        Ninja proximo;

        Ninja(String nome, int idade, String vila) {
            this.nome = nome;
            this.idade = idade;
            this.vila = vila;
        }

    @Override
    public String
    toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", vila='" + vila + '\'' +
                ", proximo=" + proximo +
                '}';
    }
}
