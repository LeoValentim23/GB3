package main;

import java.util.Scanner;
import doaçao.DPessoa;
import doaçao.DEmpresa;
import teste.Alface;
import teste.Alimento;
import teste.Morango;
import teste.Uva;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Aplicacao aplicacao = new Aplicacao();

        System.out.println("Bem-vindo à Urban farm! Espero que voce goste da experiencia com nossa comunidade .");

        while (true) {
            System.out.println("Selecione o que você deseja saber ou realizar:");
            System.out.println("1. Doação");
            System.out.println("2. Objetivos");
            System.out.println("3. Teste");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    aplicacao.realizarDoacao(scanner);
                    break;
                case 2:
                    exibirObjetivos(scanner);
                    break;
                case 3:
                    teste(scanner);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o sistema da ONG!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        }
    }



    public static void exibirObjetivos(Scanner scanner) {
        int opcao;

        while (true) {
            System.out.println("Selecione uma opção que você deseja saber:");
            System.out.println("1. Otimização do ambiente");
            System.out.println("2. Gerenciamento de recursos");
            System.out.println("3. Monitoramento");
            System.out.println("4. Planejamento e tomada de decisão");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("A otimização do ambiente na agricultura vertical envolve o controle de luz, temperatura, umidade e outros fatores para criar condições ideais de crescimento das plantas.");
                    break;

                case 2:
                    System.out.println("O gerenciamento de recursos na agricultura vertical inclui a gestão eficiente de água, nutrientes e energia para garantir a sustentabilidade e maximizar a produção.");
                    break;

                case 3:
                    System.out.println("O monitoramento na agricultura vertical é realizado por meio de sensores e algoritmos de IA para identificar problemas de saúde das plantas e tomar medidas corretivas.");
                    break;

                case 4:
                    System.out.println("O planejamento e a tomada de decisão na agricultura vertical podem ser aprimorados com a IA, que analisa dados e fornece insights para otimizar a produção e tomar decisões mais informadas.");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        }
    }

    public static void teste(Scanner scanner) {
        System.out.println("Qual alimento você deseja:");
        while (true) {
            System.out.println("1. Morango");
            System.out.println("2. Uva");
            System.out.println("3. Alface");
            System.out.println("0. Voltar");

            int selecaoAlimento = scanner.nextInt();
            scanner.nextLine();

            Alimento alimento = null;

            if (selecaoAlimento == 0) {
                break;
            }

            if (selecaoAlimento == 1) {
                alimento = new Morango();
            } else if (selecaoAlimento == 2) {
                alimento = new Uva();
            } else if (selecaoAlimento == 3) {
                alimento = new Alface();
            } else {
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                continue;
            }

            System.out.println("Quantos graus Celsius?");
            int celsius = scanner.nextInt();
            scanner.nextLine();

            if (alimento.temperaturaAdequada(celsius)) {
                System.out.println("Alimento aprovado.");
            } else {
                System.out.println("Alimento NÃO aprovado.");
            }
        }
    }
}

