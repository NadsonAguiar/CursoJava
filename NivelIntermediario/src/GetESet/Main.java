package GetESet;

public class Main {
    static void main(String[] args)
    {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        System.out.println("Meu nome é: " + sasuke.getNome() + " e eu tenho: " + sasuke.getIdade() + " idade");
        sasuke.setIdade(16);
        System.out.println("Meu nome é: " + sasuke.getNome() + " e minha idade real é: " + sasuke.getIdade() + " idade");




    }
}
