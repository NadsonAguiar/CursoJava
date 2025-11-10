package Abstracao;

// Classe Uchiha que herda de Ninja e implementa SensorNinja
class Uchiha extends Ninja implements SensorNinja {
    @Override
    void realizarJutsu() {
        System.out.println("Uchiha: Amaterasu!");
    }
    @Override
    public void detectarChakra() {
        System.out.println("Uchiha usa o Sharingan para detectar chakra.");
    }
}