package PolimorfismoEConstructor;

public class Saiyajin extends GuerreiroDragonBall
{

    @Override // Usando a annotation Override, ativamos a polimorfia
    public void habilidadeEspecial()
    {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Saiyajin, uma Bola de Plasma!");

    }
}
