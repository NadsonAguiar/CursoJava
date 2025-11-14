package ToString;

public class Ninja {

        String nome;
        String aldeia;
        int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    /* O metodo toString() em Java é utilizado para retornar uma representação em string do objeto.
        Ele é frequentemente sobrescrito para fornecer uma descrição mais útil do objeto em vez da representação padrão,
        o endereço de memória.*/
    @Override
    public String toString() {
        return "Meu nome é " + nome +  " e sou da " + aldeia + " e tenho " + idade;
    }
}
