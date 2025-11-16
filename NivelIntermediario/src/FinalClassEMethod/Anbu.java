package FinalClassEMethod;


//Classes final, não pode ser estendida, mas pode instanciar
final public class Anbu {


    // Apesar da classe ser final, não quer dizer que metodos e variaveis precisam ser tambem
    String nome;

    public Anbu(String nome){
        this.nome = nome;
    }

    public void anbu(){
        System.out.println("Sou um ninja Anbu, me chamo " + nome);
    }

}
