package Generics;

import java.util.ArrayList;
import java.util.List;

// Usando o generic não precisamos passar o tipo, apenas usamos "T"
// Sem o Generic teríamos que criar array para cada classe para conter os seus objetos
public class BolsaNinja<T> {

    //Construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Inicializando o nosso Array
    private List<T> ferramentas;

    // Colocar ferramentas no nosso array
     public void adicionarEquipamentos(T ferramenta)
     {
         ferramentas.add(ferramenta);
     }

    // Mostrar a nossa lista de ferramentas
    public void mostrarFerramenta(){
         for( T ferramenta: ferramentas)
         {
             System.out.println(ferramenta);
         }
    }


    //Getters e Setters
    public List<T> getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }

    @Override
    public String toString() {
        return "Bolsa de Equipamentos: " + ferramentas.toString();
    }
}
