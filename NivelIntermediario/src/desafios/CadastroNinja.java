package desafios;

import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args)
    {
        //Criando scanner
        Scanner entrada = new Scanner(System.in);


        //Criando contadores
        int numeroMax = 5;
        int ninjasCadastrados = 0;
        boolean deveParar = false; // Criando flag

        //Criando Array
        String[] ninjas = new String[numeroMax];
        int opcao = 0;

        while(!deveParar)
        {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Usado para corrigir o bug de "Consumo do Fim de Linha Pendente" (ou "Newline Consumption").

            // Criando switch e condicionais
            switch (opcao)
            {
                case 1:
                    if (ninjasCadastrados < numeroMax){
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = entrada.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso.");

                    } else{
                        System.out.println("A lista de ninjas esta cheia");
                    }
                    break;
                case 2:
                    System.out.println("----- Ninjas Cadastrados ------");
                    if (ninjasCadastrados == 0){
                        System.out.println("Você não tem ninjas cadastrados");
                    }
                    else
                    {
                        for (int i = 0; i < ninjasCadastrados; i++)
                        {
                            if(ninjas[i] != null)
                            {
                                System.out.println(ninjas[i]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("----- Lista Ninjas -------");
                    for (int i = 0; i < ninjasCadastrados; i++){
                        System.out.println("Ninja" + "[" + i + "]" + ": " + ninjas[i]);
                    }
                    System.out.println("Escolha o ninja a ser deletado: ");
                    int indexNinjaADeletar = entrada.nextInt();
                    ninjas[indexNinjaADeletar] = null;
                    ninjasCadastrados--;
                    break;

                case 4:
                    System.out.println("Saindo....");
                    deveParar = true;
                    break;
                default: // Criando um default caso nenhuma opção tenha sido inserida
                    System.out.println("Você escolheu uma opção invalida. Tente novamente");
                    break;

            }


        }






    }
}
