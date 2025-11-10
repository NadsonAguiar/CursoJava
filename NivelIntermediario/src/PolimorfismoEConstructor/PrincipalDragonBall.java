package PolimorfismoEConstructor;

public class PrincipalDragonBall
{
    public static void main(String[] args)
    {
        Terraqueos kuririn = new Terraqueos();
        kuririn.nome = "Gohan";
        kuririn.habilidadeEspecial();

        Saiyajin goku = new Saiyajin();
        goku.nome = "Goku";
        goku.habilidadeEspecial();

        Namekuseijins picolo = new Namekuseijins();
        picolo.nome = "Picolo";
        picolo.habilidadeEspecial();

        GuerreiroDragonBall kami = new GuerreiroDragonBall("KamiSama");
        System.out.println(kami.nome);
        GuerreiroDragonBall next = new GuerreiroDragonBall(70);
        System.out.println(next.idade);
        GuerreiroDragonBall zed = new GuerreiroDragonBall("Zed", 15, "Terraqueo");


    }
}
