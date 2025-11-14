package ToString;

public class Main {
    static void main(String[] args) {


        /* Sasuke é uma referência de memória para o objeto Uchiha
        Referência de Memória: Em objetos, a variável armazena o endereço da memória onde o objeto está localizado.
        Isso significa que duas variáveis podem apontar para o mesmo objeto.
        Valor de Memória: Quando estamos a lidar com tipos primitivos (int, double, etc.), a variável armazena diretamente o valor real,
        e não um endereço de memória.*/
        Uchiha sasuke = new Uchiha();
        System.out.println(sasuke);



        // obj itachi usando toString
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 35);
        System.out.println(itachi);

    }
}
