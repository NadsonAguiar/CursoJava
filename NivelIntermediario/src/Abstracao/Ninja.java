package Abstracao;

abstract class Ninja implements SensorNinja {
    //Classes abstratas não podem instanciar e as subclasses devem implementar obrigatoriamente os metodos ‘abstract’

    // Metodo abstrato que deve ser implementado pelas subclasses, não podem ter corpo
    abstract void realizarJutsu();
    // Metodo concreto que pode ser compartilhado pelas subclasses
    public void apresentar() {
        System.out.println("Sou um ninja da Vila da Folha.");
    }

    // Metodo implementado da ‘Interface’, preciso usar Polimorfismo
    @Override
    public void detectarChakra(){
        System.out.println("Estou detectando um chakra");
    };
}