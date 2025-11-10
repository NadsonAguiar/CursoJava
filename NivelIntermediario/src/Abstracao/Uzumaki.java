package Abstracao;

class Uzumaki extends Ninja implements SensorNinja {
    @Override
    void realizarJutsu() {
        System.out.println("Uzumaki: Rasengan!");
    }
    @Override
    public void detectarChakra() {
        System.out.println("Uzumaki detecta o chakra ao redor.");
    }
}