package Abstracao;

public class TesteClassesAbstracao
{
    public static void main(String[] args)
    {
        // Criando ninjas com diferentes habilidades
        Uzumaki naruto = new Uzumaki();
        Uchiha sasuke = new Uchiha();
        // Usando métodos das classes abstratas e ‘interfaces’
        //Obj uzumaki
        naruto.apresentar();
        naruto.realizarJutsu();
        naruto.detectarChakra();
        //Obj uchiha
        sasuke.apresentar();
        sasuke.realizarJutsu();
        sasuke.detectarChakra();
    }
}