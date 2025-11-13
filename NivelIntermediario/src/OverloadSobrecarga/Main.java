package OverloadSobrecarga;

public class Main {
    static void main(String[] args) {

    //obj uchiha
    Uchiha madara = new Uchiha("Madara Uchiha","Aldeia da Folha", 48, 900, NivelNinja.KAGE);
    madara.habilidadeEspecial();

    //obj uchiha 2
    Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
    sasuke.habilidadeEspecial();



    //obj uzumaki
    Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 10,NivelNinja.JOUNIN);
    naruto.habilidadeEspecial();

    //Metodo sem sobrecarga
    sasuke.inteligenciaDeCombate();
    //Metodo com sobrecarga
    sasuke.inteligenciaDeCombate(180);


    }
}
