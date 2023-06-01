package main;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo à ONG!");

        while (true) {
            System.out.println("Selecione o que você deseja:");
            System.out.println("1. Doação");
            System.out.println("2. Objetivos");
            System.out.println("3. Teste");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    realizarDoacao(scanner);
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

    public static void realizarDoacao(Scanner scanner) {
        System.out.println("Selecione o tipo de doação:");
        System.out.println("1. Pessoa");
        System.out.println("2. Empresa");

        int tipoDoacao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (tipoDoacao == 1) {
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite a quantidade que deseja doar:");
            double quantidade = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            System.out.println("Muito obrigado pela doação, " + nome + "!");
        } else if (tipoDoacao == 2) {
            System.out.println("Digite o nome da empresa:");
            String nomeEmpresa = scanner.nextLine();

            System.out.println("Digite a quantidade que a empresa deseja doar:");
            double quantidade = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            System.out.println("Muito obrigado pela doação da empresa " + nomeEmpresa + "!");
        } else {
            System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
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
            scanner.nextLine(); // Limpar o buffer

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

            int alimento = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (alimento == 0) {
                break; // Sair do loop interno e voltar ao menu principal
            }

            System.out.println("Quantos graus Celsius?");
            int celsius = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (celsius > 10 && alimento == 1) {
                System.out.println("Alimento aprovado.");
                System.exit(0); // Finalizar o programa
            } else {
                System.out.println("Alimento NÃO aprovado.");
                System.exit(0); // Finalizar o programa
            }
        }
    }
}

