package desafios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorNinja
{
    public static void main(String[] args)
    {
        /* Tentar criar um menu interativo que mostre
         * Exibir informações de todos os ninjas
         * Adicionar novos ninjas
         * Atualizar as habilidades especiais*/

        Scanner entrada = new Scanner(System.in);
        ArrayList<Ninja> listaNinjas = new ArrayList<>();
        int opcao = -1;


        // O loop principal do menu
        while(opcao != 4)
        {
            exibirMenu();
            try
            {
                opcao = entrada.nextInt();
                entrada.nextLine();
                switch (opcao)
                {
                    case 1:
                        exibirNinjas(listaNinjas);
                        break;
                    case 2:
                        adicionaNinjas(entrada,listaNinjas);
                        break;
                    case 3:
                        atualizarHabilidade(entrada, listaNinjas);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                entrada.nextLine(); // Limpa a entrada
                opcao = -1; // Garante que o loop continue
            }


        }

        entrada.close();
        System.out.println("Programa encerrado. Até mais");


    }

    public static void exibirMenu()
    {
        System.out.println("======== Menu De Gerenciamento Ninja ========");
        System.out.println("[1] - Exibir informações de todos os ninjas");
        System.out.println("[2] - Adicionar novos ninjas");
        System.out.println("[3] - Atualizar habilidade especial");
        System.out.println("[4] - Sair");
        System.out.println("Escolha uma opção: ");
    }

    public static void exibirNinjas(ArrayList<Ninja> listaNinjas)
    {
        if(listaNinjas.isEmpty())
        {
            System.out.println("Nenhum ninja cadastrado.");
            return;
        }
        System.out.println("===== Lista de Ninjas ======");
        for (Ninja ninja : listaNinjas)
        {
            ninja.mostrarInformacoes();
            System.out.println("=========================");
        }
    }

    public static void adicionaNinjas(Scanner scanner, ArrayList<Ninja> listaNinjas)
    {
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Missão: ");
        String missao = scanner.nextLine();
        System.out.println("Nivel da Missão: ");
        String nivelDificuldadeMissao = scanner.nextLine();
        System.out.println("Status Missão: ");
        String statusMissao = scanner.nextLine();
        System.out.println("É um Uchiha? S/N: ");
        String tipo = scanner.nextLine();

        if(tipo.equalsIgnoreCase("S"))
        {
            System.out.println("Habilidade Especial: ");
            String habilidade = scanner.nextLine();

            Uchiha novoNinja = new Uchiha(nome, idade, missao, nivelDificuldadeMissao, statusMissao, habilidade);
            listaNinjas.add(novoNinja);
            System.out.println("Ninja Uchiha " + nome + " adicionado com sucesso!");
        }
        else
        {
            Ninja novoNinja = new Ninja(nome, idade, missao, nivelDificuldadeMissao, statusMissao);
            listaNinjas.add(novoNinja);
            System.out.println("Ninja " + nome + " adicionado com sucesso!");
        }
    }

    public static void atualizarHabilidade(Scanner scanner, ArrayList<Ninja> listaNinjas)
    {
        System.out.print("Digite o nome do Uchiha para atualizar a habilidade: ");
        String nomeBusca = scanner.nextLine();

        for (Ninja ninja : listaNinjas)
        {
            if (ninja.getNome().equalsIgnoreCase(nomeBusca))
            {
                // Verifica se o objeto é um Uchiha usando instanceof
                if (ninja instanceof Uchiha)
                {
                    Uchiha uchiha = (Uchiha) ninja; // Faz o downcasting
                    System.out.print("Nova Habilidade Especial: ");
                    String novaHabilidade = scanner.nextLine();

                    uchiha.mostrarHabilidadeEspecial();

                    System.out.println("Habilidade de " + nomeBusca + " atualizada!");
                    return;
                }
                else
                {
                    System.out.println(nomeBusca + " não é um Uchiha e não possui Habilidade Especial.");
                    return;
                }
            }
        }
        System.out.println("Ninja com nome " + nomeBusca + " não encontrado.");
    }



}