package DesafioQuatro;

public class MainDesafioQuatro
{
    public static void main(String[] args)
    {
        NinjaBasico sai = new NinjaBasico("Sai", 18,"Jutsu Rato de Tinta");
        sai.mostrarInformacoes();
        sai.executarHabilidade();

        NinjaAvancado kakashi = new NinjaAvancado("Kakashi Hatake", 45, "Chidori","Kamui");
        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();

    }
}
