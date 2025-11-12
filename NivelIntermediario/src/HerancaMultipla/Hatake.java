package HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, Anbu{


    public void boasVinda()
    {
        System.out.println(nome + " : Eu sou um Hatake");
    }

    // Esse metodo vem de ‘Interface’
    public void sharinganAtivado()
    {
        System.out.println(nome + " : Ativou o Sharingan");
    }

    public void ninjaDeElite()
    {
        System.out.println(nome + " : Eu sou um ninja de elite da Anbu");
    }
}
