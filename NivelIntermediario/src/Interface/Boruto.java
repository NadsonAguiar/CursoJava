package Interface;

import DesafiosUmATres.*;

public class Boruto extends Ninja implements HyugaUzumaki //Sempre que uso implements, devo trazer os metodos da ‘Interface’
{

    @Override
    public void AtivarKarma()
    {
        System.out.println("O Karma foi ativado! Eu sou um Hyuga Uzumaki");
    }

    @Override
    public void AtivarJougan()
    {
        System.out.println("Jougan foi ativado com sucesso! Eu sou um Hyuga Uzumaki");
    }
}

